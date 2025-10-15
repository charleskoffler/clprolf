package org.clprolf.compiler.semantic.abstractions.impl;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import org.clprolf.compiler.semantic.enums.CompatInterfaceDeclSynonym;
import org.clprolf.compiler.semantic.enums.Declension;
import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Nature;

@Abstraction
public class SemanticInterfaceSymbol extends  @Nature SemanticSymbol {
    private final CompatInterfaceDeclSynonym compatRole;
    private final Declension declension;
    private final List<String> extendedInterfaces;
    //private AgentLikeAdviceKind agentLikeAdvice; //TODO
    
    public SemanticInterfaceSymbol(
        String name,
        String packageName,
        CompatInterfaceDeclSynonym compatRole,
        Declension declension,
        List<String> extendedInterfaces
    ) {
        super(name, packageName);
        this.compatRole = compatRole;
        this.declension = declension;
        this.extendedInterfaces = extendedInterfaces != null ? extendedInterfaces : new ArrayList<>();
    }

    public CompatInterfaceDeclSynonym getCompatRole() { return compatRole; }
    public Declension getDeclension() { return declension; }
    public List<String> getExtendedInterfaces() { return Collections.unmodifiableList(extendedInterfaces); }
}
