package org.clprolf.compiler.semantic.abstractions.impl;

import org.clprolf.framework.java.Abstraction;

@Abstraction
public abstract class SemanticSymbol {
    protected final String name;
    protected final String packageName;

    protected SemanticSymbol(String name, String packageName) {
        this.name = name;
        this.packageName = packageName;
    }

    public String getName() { return name; }
    public String getPackageName() { return packageName; }
}
