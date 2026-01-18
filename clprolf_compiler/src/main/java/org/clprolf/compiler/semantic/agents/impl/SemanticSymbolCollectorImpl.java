package org.clprolf.compiler.semantic.agents.impl;

import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.With_compat;
import org.clprolf.compiler.ClprolfJava8Parser;
import org.clprolf.compiler.ClprolfJava8Parser.AnnotationContext;
import org.clprolf.compiler.ClprolfJava8ParserBaseVisitor;

import org.clprolf.compiler.semantic.abstractions.impl.SemanticSymbol;
import org.clprolf.compiler.semantic.enums.AgentLikeAdviceKind;
import org.clprolf.compiler.semantic.enums.InterfaceDeclension;
import org.clprolf.compiler.semantic.enums.Declension;
import org.clprolf.compiler.semantic.abstractions.impl.SemanticClassSymbol;
import org.clprolf.compiler.semantic.abstractions.impl.SemanticInterfaceSymbol;

@Agent
public class SemanticSymbolCollectorImpl extends ClprolfJava8ParserBaseVisitor<Void> {

    private final Map<String, SemanticSymbol> symbols = new LinkedHashMap<>();
    private String currentPackage = ""; // TODO

    public Map<String, SemanticSymbol> getSymbols() {
        return symbols;
    }

    @Override
    public Void visitNormalClassDeclaration(ClprolfJava8Parser.NormalClassDeclarationContext ctx) {

        String name = ctx.Identifier().getText();
        String packageName = currentPackage;

        String declensionText = ctx.clprolfDeclension().getText();
        Declension declension = Declension.fromKeyword(declensionText)
                                          .orElseThrow(() ->
                                              new IllegalArgumentException("Unknown declension: " + declensionText));

        String parentName = null;
        if (ctx.superclass() != null) {
            parentName = ctx.superclass().classType().getText();
        }

        List<String> contracts = new ArrayList<>();
        if (ctx.superinterfaces() != null) {
            ctx.superinterfaces().interfaceTypeList().interfaceType()
               .forEach(i -> contracts.add(i.getText()));
        }

        SemanticClassSymbol symbol = new SemanticClassSymbol(
            name,
            packageName,
            declension,
            parentName,
            contracts
        );

        symbols.put(name, symbol);

        return super.visitNormalClassDeclaration(ctx);
    }

    @Override
    public Void visitNormalInterfaceDeclaration(ClprolfJava8Parser.NormalInterfaceDeclarationContext ctx) {

        String name = ctx.Identifier().getText();
        String packageName = currentPackage;

        String compatText = ctx.clprolfInterfaceDeclension().getText();
        InterfaceDeclension compatRole = InterfaceDeclension.fromKeyword(compatText)
            .orElseThrow(() -> new IllegalArgumentException("Unknown compat role: " + compatText));

        Declension declension = null;
        if (ctx.clprolfDeclension() != null) {
            declension = Declension.fromKeyword(ctx.clprolfDeclension().getText()).orElse(null);
        }

        List<String> extended = new ArrayList<>();
        if (ctx.extendsInterfaces() != null) {
            ctx.extendsInterfaces().interfaceTypeList().interfaceType()
               .forEach(i -> extended.add(i.getText()));
        }
        
    /*    AgentLikeAdviceKind advice = AgentLikeAdviceKind.AGENT_LIKE_ADVICE; // default
        if (ctx.annotation() != null) {
            for (AnnotationContext ann : ctx.annotation()) {
                String annName = ann.getText();
                advice = AgentLikeAdviceKind.fromAnnotation(annName);
            }
        } //TODO  */

        SemanticInterfaceSymbol symbol = new SemanticInterfaceSymbol(
            name,
            packageName,
            compatRole,
            declension,
            extended
        );

        symbols.put(name, symbol);

        return super.visitNormalInterfaceDeclaration(ctx);
    }

    @Override
    public Void visitPackageDeclaration(ClprolfJava8Parser.PackageDeclarationContext ctx) {
        // Example: package org.example.test;
        currentPackage = extractPackageName(ctx.packageName());
        return super.visitPackageDeclaration(ctx);
    }

    /**
     * Recursively reconstructs the package name from a left-recursive rule.
     */
    private String extractPackageName(ClprolfJava8Parser.PackageNameContext ctx) {
        if (ctx == null) return "";
        
        // Base case: single Identifier
        if (ctx.packageName() == null) {
            return ctx.Identifier().getText();
        }

        // Recursive case: packageName '.' Identifier
        return extractPackageName(ctx.packageName()) + "." + ctx.Identifier().getText();
    }


}