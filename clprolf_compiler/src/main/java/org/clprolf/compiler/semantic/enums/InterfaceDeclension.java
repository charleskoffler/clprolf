package org.clprolf.compiler.semantic.enums;

import java.util.Arrays;
import java.util.Optional;

public enum InterfaceDeclension {
    COMPAT_INTERF_VERSION("compat_interf_version"),
    COMPAT_INTERF_CAPACITY("compat_interf_capacity"),
    VERSION_INH("version_inh"),
    CAPACITY_INH("capacity_inh"),
    COMPAT_INTERF("compat_interf");

    private final String keyword;

    InterfaceDeclension(String keyword) {
        this.keyword = keyword;
    }

    public String keyword() {
        return keyword;
    }
    
    public boolean isCapacity() {
    	return this == InterfaceDeclension.CAPACITY_INH ||
    				this == InterfaceDeclension.COMPAT_INTERF_CAPACITY;
    }
    
    public boolean isVersion() {
    	return this == InterfaceDeclension.VERSION_INH ||
    				this == InterfaceDeclension.COMPAT_INTERF_VERSION;
    }

    public static Optional<InterfaceDeclension> fromKeyword(String text) {
        return Arrays.stream(values())
                     .filter(c -> c.keyword.equals(text))
                     .findFirst();
    }
   
}