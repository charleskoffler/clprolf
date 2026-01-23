package org.clprolf.compiler.semantic.agents.impl;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.clprolf.framework.java.Agent;
import org.clprolf.compiler.semantic.abstractions.impl.SemanticSymbol;
import org.clprolf.compiler.semantic.enums.InterfaceDeclension;
import org.clprolf.compiler.semantic.enums.Declension;
import org.clprolf.compiler.semantic.abstractions.impl.SemanticInterfaceSymbol;
import org.clprolf.compiler.semantic.abstractions.impl.SemanticClassSymbol;

/**
 * 🧩 SemanticCheckerImpl (Java 8 compatible)
 * -------------------------------------
 * Clprolf semantic verification agent.
 * 
 * This agent walks through the symbol table and applies a set of
 * architectural validation rules (ARCH-X) to ensure semantic coherence
 * between classes, declensions, and interface roles.
 * 
 * Each rule corresponds to a design constraint directly derived
 * from Clprolf’s clarity-oriented architecture principles.
 */
@Agent
public class SemanticCheckerImpl {

    private final Map<String, SemanticSymbol> symbols;
    private final List<String> errors = new ArrayList<>();

    public SemanticCheckerImpl(Map<String, SemanticSymbol> symbols) {
        this.symbols = symbols;
    }

    public List<String> getErrors() {
        return errors;
    }

    // -------------------------------------------------------------
    // 🧠 Entry point
    // -------------------------------------------------------------
    public void verify() {
        for (SemanticSymbol s : symbols.values()) {
            if (s instanceof SemanticClassSymbol) {
                verifyClassRules((SemanticClassSymbol) s);
            } else if (s instanceof SemanticInterfaceSymbol) {
                verifyInterfaceRules((SemanticInterfaceSymbol) s);
            }
        }
    }

    // -------------------------------------------------------------
    // ⚙️ ARCH-X Rules for classes
    // -------------------------------------------------------------
   
    private void verifyClassRules(SemanticClassSymbol c) {
        String name = c.getName();
        Declension decl = c.getDeclension();
        
       /* **ARCH A1 (classes):**
        Declensions must match between parent and child classes.
        Synonyms are considered equivalent. */
        
        SemanticClassSymbol motherClass = null;
        if (c.getParentName() != null) {
        	String beginningOfError = "ARCH-A1: Class " + c.getName() + ": ";
        	String endOfError = "(" + c.getParentName() + ")";
    		
        	if (symbols.get(c.getParentName()) instanceof SemanticClassSymbol){
        				
        		SemanticClassSymbol parentClass = (SemanticClassSymbol)symbols.get(c.getParentName());
        		if (c.getDeclension().isAgent() && !parentClass.getDeclension().isAgent()) {
        			errors.add(beginningOfError + " the mother Class should be an agent " + endOfError);
        		}
        		else if (c.getDeclension().isWorkerAgent() && !parentClass.getDeclension().isWorkerAgent()) {
        			errors.add(beginningOfError + " the mother Class should be a worker agent " + endOfError);
        		}
        		else if (c.getDeclension() == Declension.MODEL && parentClass.getDeclension() != Declension.MODEL) {
        			errors.add(beginningOfError + " the mother Class should be a model " + endOfError);
        		}
        		else if (c.getDeclension() == Declension.INFORMATION && parentClass.getDeclension() != Declension.INFORMATION) {
        			errors.add(beginningOfError + " the mother Class should be an information " + endOfError);
        		}
        		else if (c.getDeclension() == Declension.INDEF_OBJ) {
        			// All inheritance is allowed in the case of Indef_obj, even Java class inheritance.
        		}
        	}
        	else {
        		errors.add(beginningOfError + " the mother class of " + c.getName() + " doesn't exist (" + c.getParentName() + ")");
        	}
        }
        
       /*  **ARCH BA3 (interfaces, usage):**
        A class cannot `contracts` a `capacity`. */
        
        long capacityContracts = c.getContracts().stream()
                .map(symbols::get)
                .filter(sym -> sym instanceof SemanticInterfaceSymbol
                        && ((SemanticInterfaceSymbol) sym).getCompatRole().isCapacity())
                .count();
        
        if (capacityContracts > 0) {
            errors.add("ARCH-BA3: " + name
                    + " contracts a capacity (forbidden).");
        }

        /* **ARCH BA4 (interfaces, usage):**
        A class cannot `contracts` multiple `version` interfaces simultaneously. */
        long versionContracts = c.getContracts().stream()
                .map(symbols::get)
                .filter(sym -> sym instanceof SemanticInterfaceSymbol
                        && ((SemanticInterfaceSymbol) sym).getCompatRole().isVersion())
                .count();

        if (versionContracts > 1) {
            errors.add("ARCH-BA4: " + name
                    + " contracts multiple version_inh interfaces (forbidden).");
        }
        
        if (versionContracts == 1  ) {
        	SemanticInterfaceSymbol contractedInterface = 
        			(SemanticInterfaceSymbol) c.getContracts().stream().map(symbols::get).filter(sym -> sym instanceof SemanticInterfaceSymbol
        				&& ((SemanticInterfaceSymbol) sym).getCompatRole().isVersion()).findFirst().get();
        	// A declension is mandatory for the version_inh, we do the test in case of semantic error.
        	if ( (contractedInterface.getCompatRole() == InterfaceDeclension.VERSION_INH && contractedInterface.getDeclension() != null ) ||
        			(contractedInterface.getCompatRole() == InterfaceDeclension.COMPAT_INTERF_VERSION && contractedInterface.getDeclension() != null)) {
        		/***ARCH BA5 (interfaces, usage):**
When a class `contracts` a `version_inh`, it must have the **same declension and synonym** as that `version_inh`.
For a `compat_interf_version`, if a class role is defined, the implementing class must **match it exactly** —
reflecting a **stricter compatibility contract rather than a natural hierarchy**.

> 💡 *This rule ensures structural coherence between classes and their version interfaces,
> whether the relationship is hierarchical (`version_inh`) or strictly contractual (`compat_interf_version`).*

---*/
        		if (contractedInterface.getDeclension() != c.getDeclension()) {
        			errors.add("ARCH BA5 (interfaces, usage): " + c.getName() + " (" + c.getDeclension() + ") does not match the target declension of " + contractedInterface.getName() +" ( " + contractedInterface.getDeclension()+ " )"+ " \r\n");
        			
        		}
        	}
        }
        		
      /*  **ARCH BA2 (interfaces, usage):**
        A class using `contracts` must refer to a `version` interface, not to a class */
        
        long classesContracts = c.getContracts().stream()
        		.map(symbols::get)
        		.filter(sym -> sym instanceof SemanticClassSymbol)
        		.count();

        if (classesContracts > 0) {
        	errors.add("ARCH-BA2: " + name
        			+ " contracts a class instead of a version interface (forbidden).");
        }
        
    }
   
    private void verifyInterfaceRules(SemanticInterfaceSymbol i) {
        String name = i.getName();
        InterfaceDeclension role = i.getCompatRole();

        long versionExtends = i.getExtendedInterfaces().stream()
        	    .map(symbols::get)
        	    .filter(sym -> sym instanceof SemanticInterfaceSymbol
        	            && ((SemanticInterfaceSymbol) sym).getCompatRole().isVersion())
        	    .count();
        
        // ARCH-BB2 : A `capacity` interface cannot inherit (`nature`) from a `version`.
        //`capacity_inh` and `compat_interf_capacity` are treated identically in all semantic checks.
        if (role.isCapacity()) {
            if (versionExtends > 0) {
                errors.add("ARCH-BB2: " + name
                        + " A `capacity` interface cannot inherit (`nature`) from a `version`.");
            }
        }

        //**ARCH BB1 (interfaces):By default, a `compat_interf_version` **cannot inherit from another `compat_interf_version`**.
        if (role == InterfaceDeclension.COMPAT_INTERF_VERSION) {
        	if (versionExtends > 0) {
                errors.add("ARCH-BB1: " + name
                        + " By default, a `compat_interf_version` cannot inherit from another `compat_interf_version`.");
            }
        }

        /* TODO 
        if (interfaceSymbol.getCompatRole() == InterfaceDeclension.CAPACITY_INH) {
            for (String extendedName : interfaceSymbol.getExtendedInterfaces()) {
                SemanticSymbol extended = symbols.get(extendedName);
                if (extended instanceof SemanticInterfaceSymbol) {
                    SemanticInterfaceSymbol extendedInterface = (SemanticInterfaceSymbol) extended;
                    if (!isCompatibleAdvice(interfaceSymbol, extendedInterface)) {
                        reporter.error("ARCH-",
                            interfaceSymbol.getName() + " capacity_inh advice mismatch with " + extendedName);
                    }
                }
            }
        }
		*/
    }

    // -------------------------------------------------------------
    // 🧾 Helper
    // -------------------------------------------------------------
    private void addError(String code, String msg) {
        errors.add(code + ": " + msg);
    }
}


