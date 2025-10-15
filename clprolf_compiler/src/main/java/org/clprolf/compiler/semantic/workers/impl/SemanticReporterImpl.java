package org.clprolf.compiler.semantic.workers.impl;


import java.util.*;

import org.clprolf.compiler.semantic.agents.impl.SemanticCheckerImpl;
import org.clprolf.framework.java.Worker_agent;

/**
 * 🪶 SemanticReporterImpl
 * -------------------
 * 
 */
@Worker_agent
public class SemanticReporterImpl {

    private static final String RED    = "\u001B[31m";
    private static final String GREEN  = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String CYAN   = "\u001B[36m";
    
    protected SemanticCheckerImpl semanticChecker;
    protected List<String> errors;

    public SemanticReporterImpl(SemanticCheckerImpl checker) {
    	this.semanticChecker = checker;
    }
    
    public void printReport() {
    	List<String> errors = semanticChecker.getErrors();
    	
        System.out.println();
        System.out.println(CYAN + "|--------------------------------------------------------|" );
        System.out.println(CYAN + "|                Clprolf Semantic Report                 |" );
        System.out.println(CYAN + "|--------------------------------------------------------|" );

        if (errors == null || errors.isEmpty()) {
            System.out.println(GREEN + " No semantic errors found." );
            System.out.println();
            return;
        }

        System.out.println(RED + " " + errors.size() + " semantic error(s) found :" );
        System.out.println();

        for (String err : errors) {
            String[] parts = err.split(":", 2);
            String code = parts.length > 0 ? parts[0].trim() : "ARCH-???";
            String message = parts.length > 1 ? parts[1].trim() : err;

            System.out.println(YELLOW + "* " + code + " => " + message);

            System.out.println();
        }

        System.out.println(CYAN + "|--------------------------------------------------------|" );
        System.out.println(GREEN + " End of semantic checks." );
        System.out.println();
    }
}
