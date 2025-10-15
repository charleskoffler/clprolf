package org.clprolf.compiler.semantic.agents.impl;

import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import org.clprolf.framework.java.Agent;
import org.clprolf.compiler.semantic.abstractions.impl.SemanticSymbol;
import org.clprolf.compiler.semantic.enums.CompatInterfaceDeclSynonym;
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
    }
    
    private long countVersionExtensions(SemanticInterfaceSymbol i) {
	    return i.getExtendedInterfaces().stream()
	    .map(symbols::get)
	    .filter(sym -> sym instanceof SemanticInterfaceSymbol
	            && ((SemanticInterfaceSymbol) sym).getCompatRole().isVersion())
	    .count();
    }
   
    private void verifyInterfaceRules(SemanticInterfaceSymbol i) {
        String name = i.getName();
        CompatInterfaceDeclSynonym role = i.getCompatRole();

        long versionExtends = this.countVersionExtensions(i);
        
        // ARCH-BB2 : A `capacity` interface cannot inherit (`nature`) from a `version`.
        //`capacity_inh` and `compat_interf_capacity` are treated identically in all semantic checks.
        if (role.isCapacity()) {
            if (versionExtends > 0) {
                errors.add("ARCH-BB2: " + name
                        + " A `capacity` interface cannot inherit (`nature`) from a `version`.");
            }
        }

        //**ARCH BB1 (interfaces):A `compat_interf_version` interface cannot inherit multiple `version` interfaces.
        //A `version_inh` may do so.
        if (role == CompatInterfaceDeclSynonym.COMPAT_INTERF_VERSION) {
        	if (versionExtends > 1) {
                errors.add("ARCH-BB1: " + name
                        + " A `compat_interf_version` interface cannot inherit multiple `version` interfaces. A `version_inh` may do so.");
            }
        }

        /* TODO 
        if (interfaceSymbol.getCompatRole() == CompatInterfaceDeclSynonym.CAPACITY_INH) {
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


