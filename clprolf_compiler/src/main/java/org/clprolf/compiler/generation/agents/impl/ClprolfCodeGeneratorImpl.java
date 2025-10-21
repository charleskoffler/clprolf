package org.clprolf.compiler.generation.agents.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.clprolf.compiler.ClprolfJava8Parser;
import org.clprolf.compiler.ClprolfJava8ParserBaseVisitor;
import org.clprolf.framework.java.Abstraction;

/**
 * --------------------------------------------------------------------
 * ClprolfCodeGeneratorImpl
 * --------------------------------------------------------------------
 * Generates clean, compilable Java code from a parsed Clprolf source.
 * 
 * - Translates Clprolf roles into Java (class/interface)
 * - Converts "contracts" -> "implements", "nature" -> "extends"
 * - Removes Clprolf-specific keywords (agent, version_inh, etc.)
 * - Inserts missing spaces for readability
 * 
 * Java 8 compatible – no var, no isBlank.
 * --------------------------------------------------------------------
 */

@Abstraction
public class ClprolfCodeGeneratorImpl extends ClprolfJava8ParserBaseVisitor<String> {

    private final StringBuilder output = new StringBuilder();
    
    protected final String[] javaKeywords = {
    	    "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
    	    "class", "const", "continue", "default", "do", "double", "else", "enum",
    	    "extends", "final", "finally", "float", "for", "if", "goto", "implements",
    	    "import", "instanceof", "int", "interface", "long", "native", "new",
    	    "package", "private", "protected", "public", "return", "short", "static",
    	    "strictfp", "super", "switch", "synchronized", "this", "throw", "throws",
    	    "transient", "try", "void", "volatile", "while"
    	};

    protected CommonTokenStream tokenStream;
    
    public String getGeneratedCode() {
        return output.toString().trim();
    }
    
    public ClprolfCodeGeneratorImpl(CommonTokenStream tokenStream) {
    	this.tokenStream = tokenStream;
    }

    // ===============================================================
    //  COMPILATION UNIT
    // ===============================================================
    @Override
    public String visitCompilationUnit(ClprolfJava8Parser.CompilationUnitContext ctx) {

        if (ctx.packageDeclaration() != null) {
            output.append(visit(ctx.packageDeclaration())).append("\n\n");
        }

        List<ClprolfJava8Parser.ImportDeclarationContext> imports = ctx.importDeclaration();
        for (int i = 0; i < imports.size(); i++) {
            String result = visit(imports.get(i));
            if (result != null && result.trim().length() > 0)
                output.append(result).append("\n");
        }

        List<ClprolfJava8Parser.TypeDeclarationContext> types = ctx.typeDeclaration();
        for (int i = 0; i < types.size(); i++) {
            String code = visit(types.get(i));
            if (code != null && code.trim().length() > 0)
                output.append(code).append("\n\n");
        }

        return getGeneratedCode();
    }

    // ===============================================================
    //  PACKAGE DECLARATION
    // ===============================================================
    @Override
    public String visitPackageDeclaration(ClprolfJava8Parser.PackageDeclarationContext ctx) {
        return "package " + ctx.packageName().getText() + ";";
    }

    // ===============================================================
    //  IMPORT DECLARATION
    // ===============================================================
    @Override
    public String visitImportDeclaration(ClprolfJava8Parser.ImportDeclarationContext ctx) {
    	
    	/* importDeclaration
	:	singleTypeImportDeclaration
	|	singleStaticImportDeclaration
	; */
    	return this.visitChildren(ctx);
    }
    
    @Override
    public String visitSingleTypeImportDeclaration(ClprolfJava8Parser.SingleTypeImportDeclarationContext ctx) {
    	
    /* singleTypeImportDeclaration
	:	importModifier* 'import' clprolfInformationForJava* typeName ';'
	;
    */
    	
    	String infoJava = ctx.clprolfInformationForJava().stream()
    	        .map(this::visit)
    	        .collect(Collectors.joining(" "));
    	
        String typeName = ctx.typeName().getText();

        return "import " + infoJava + " " + typeName + ";";
    }
      
    @Override
    public String visitClprolfInformationForJava(ClprolfJava8Parser.ClprolfInformationForJavaContext ctx) {
    	/* clprolfInformationForJava
	:	clprolfClassInformationForJava
	|	clprolfInterfaceInformationForJava
	; */
    	List<Token> tokens = tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex());
        StringBuilder builder = new StringBuilder();
       
        for (Token t : tokens) {
            String text = t.getText();
           
            String generatedText;

            switch (text) {
	            case "java_class":
	            case "java_interface":
            	//
                case "agent":
                case "abstraction":
                case "simu_real_obj":
                case "indef_obj":
                case "model":
                case "information":
                	
                case "worker_agent":
                case "comp_as_worker":
                	
                case "compat_interf_version":
                case "compat_interf_capacity":
                case "version_inh":
                case "capacity_inh":
                case "compat_interf":
                
                // 
                generatedText = "";
                break;
                
                default:
                	generatedText = text; //We have to keep the Java keywords
                    break;
            }
        
            if (!generatedText.isEmpty()) {
            	if (generatedText.equals(";")) {
            		builder.append(generatedText).append("\n");
            	}
            	else {
            		builder.append(generatedText).append(" ");
            	}
            }
        }
        String totalGeneratedText = builder.toString().trim();

        return totalGeneratedText;
    }
    

    // ===============================================================
    //  CLASS DECLARATION
    // ===============================================================
    @Override
    public String visitNormalClassDeclaration(ClprolfJava8Parser.NormalClassDeclarationContext ctx) {
    	List<Token> tokens = tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex());
        StringBuilder builder = new StringBuilder();
       
        for (Token t : tokens) {
            String text = t.getText();
           
            String generatedText;

            switch (text) {
                case "agent":
                case "abstraction":
                case "simu_real_obj":
                case "indef_obj":
                case "model":
                	
                case "worker_agent":
                case "comp_as_worker":
                case "information":
                	generatedText = "class";
                break;
                
                case "class_for":
                	generatedText = "";
                	break;
                
            //other Clprolf keywords in a class
             
                case "nature":
                	generatedText = "extends";
                    break;
                    
                case "contracts":
                	generatedText = "implements";
                    break;
                    
                /* variable or field modifier */
                case "with_compat":
                	/* method modifiers */
                case "underst":
                case "long_action":
                case "prevent_missing_collision":
                case "one_at_a_time":
                case "turn_monitor":
                case "for_every_thread":
                case "dependent_activity":
                	/* */
                	generatedText = "";
                    break;

                default:
                	generatedText = text; //We have to keep the Java keywords
                    break;
            }

            if (!generatedText.isEmpty()) {
            	if (generatedText.equals("{") || generatedText.equals("}") || generatedText.equals(";")) {
            		builder.append(generatedText).append("\n");
            	}
            	else {
            		builder.append(generatedText).append(" ");
            	}
            }
        }
        
        String totalGeneratedText = builder.toString().trim();

        return totalGeneratedText;
    }

    // ===============================================================
    //  INTERFACE DECLARATION
    // ===============================================================
    @Override
    public String visitNormalInterfaceDeclaration(ClprolfJava8Parser.NormalInterfaceDeclarationContext ctx) {
    	List<Token> tokens = tokenStream.getTokens(ctx.getStart().getTokenIndex(), ctx.getStop().getTokenIndex());
        StringBuilder builder = new StringBuilder();
       
        for (Token t : tokens) {
            String text = t.getText();
           
            String generatedText;

           switch (text) {
                case "compat_interf_version":
                case "compat_interf_capacity":
                case "version_inh":
                case "capacity_inh":
                case "compat_interf":
                	generatedText = "interface";
                break;
                
                // interface role
                case "agent":
                case "abstraction":
                case "simu_real_obj":
                case "indef_obj":
                case "model":
                	
                case "worker_agent":
                case "comp_as_worker":
                case "information":
                	generatedText = "";
                break;
                
            //other Clprolf keywords in an interface
             
                case "nature":
                	generatedText = "extends";
                    break;
                     
                /* variable or field modifier */
                case "with_compat":
                	/* method modifiers */
                case "underst":
                case "long_action":
                case "prevent_missing_collision":
                case "one_at_a_time":
                case "for_every_thread":
                case "dependent_activity":
                	/* */
                	generatedText = "";
                    break;

                default:
                	generatedText = text; //We have to keep the Java keywords
                    break;
            }

            if (!generatedText.isEmpty()) {
            	if (generatedText.equals("{") || generatedText.equals("}") || generatedText.equals(";")) {
            		builder.append(generatedText).append("\n");
            	}
            	else {
            		builder.append(generatedText).append(" ");
            	}
            }
        }
        
        String totalGeneratedText = builder.toString().trim();

        return totalGeneratedText;
    }

    // ===============================================================
    //  DEFAULTS
    // ===============================================================
    @Override
    protected String defaultResult() {
        return "";
    }

   /* @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) aggregate = "";
        if (nextResult == null) nextResult = "";
        return (aggregate + "\n" + nextResult).trim();
    }*/
}