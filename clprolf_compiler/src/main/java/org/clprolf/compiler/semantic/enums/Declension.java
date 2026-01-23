package org.clprolf.compiler.semantic.enums;

import java.util.Arrays;
import java.util.Optional;

public enum Declension {
    AGENT("agent"),
    WORKER_AGENT("worker_agent"),
    MODEL("model"),
    INFORMATION("information"),
    ABSTRACTION("abstraction"),
    SIMU_REAL_OBJ("simu_real_obj"),
    COMP_AS_WORKER("comp_as_worker"),
    INDEF_OBJ("indef_obj");

    private final String keyword;

    Declension(String keyword) {
        this.keyword = keyword;
    }

    public String keyword() {
        return keyword;
    }
    
    public static Optional<Declension> fromKeyword(String text) {
        return Arrays.stream(values())
                     .filter(d -> d.keyword.equals(text))
                     .findFirst();
    }
    
    public boolean isAgent() {
    	return this == Declension.AGENT || this == Declension.ABSTRACTION ||
    			this == Declension.SIMU_REAL_OBJ;
    }
    
    public boolean isWorkerAgent() {
    	return this == Declension.WORKER_AGENT || this == Declension.COMP_AS_WORKER;
    }
}