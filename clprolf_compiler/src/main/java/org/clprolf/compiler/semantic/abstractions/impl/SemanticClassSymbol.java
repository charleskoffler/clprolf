package org.clprolf.compiler.semantic.abstractions.impl;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import org.clprolf.compiler.semantic.enums.Declension;
import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Nature;

@Abstraction
public class SemanticClassSymbol extends @Nature SemanticSymbol {
    private final Declension declension;
    private final String parentName;
    private final List<String> contracts;

    public SemanticClassSymbol(
        String name,
        String packageName,
        Declension declension,
        String parentName,
        List<String> contracts
    ) {
        super(name, packageName);
        this.declension = declension;
        this.parentName = parentName;
        this.contracts = contracts != null ? contracts : new ArrayList<>();
    }

    public Declension getDeclension() { return declension; }
    public String getParentName() { return parentName; }
    public List<String> getContracts() { return Collections.unmodifiableList(contracts); }
}