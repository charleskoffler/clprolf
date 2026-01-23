package org.clprolf.compiler.agents.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;

import org.clprolf.compiler.ClprolfJava8Lexer;
import org.clprolf.compiler.ClprolfJava8Parser;
import org.clprolf.compiler.generation.agents.impl.ClprolfCodeGeneratorImpl;
import org.clprolf.compiler.semantic.agents.impl.SemanticCheckerImpl;
import org.clprolf.compiler.semantic.agents.impl.SemanticSymbolCollectorImpl;
import org.clprolf.compiler.semantic.workers.impl.SemanticReporterImpl;
import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.With_compat;

/*
 * 
 *  */
@Agent
public class ClprolfCompilerImpl {
	
	public void compile(String fileName) throws URISyntaxException, IOException {
		String totalSourceCode;
		
		ByteArrayOutputStream errorStream;
		
        PrintStream originalErrorStream ;
		
		totalSourceCode = this.readClprolfSourceAsString(fileName);
	   
	    @With_compat TokenSource tokenSource = new ClprolfJava8Lexer(CharStreams.fromString(totalSourceCode.toString()));
	    CommonTokenStream tokensStream = new CommonTokenStream(tokenSource);
	    ClprolfJava8Parser inputParser = new ClprolfJava8Parser(tokensStream);
	
	    //ClprolfJava8Parser.CompilationUnitContext context = inputParser.compilationUnit();
			
		// Calling the parsor while keeping the standard errors output.
		// Create a ByteArrayOutputStream to capture error output
        errorStream = new ByteArrayOutputStream();

        // Redirect the standard error to the ByteArrayOutputStream, for capture errors output.
        originalErrorStream = System.err;
        System.setErr(new PrintStream(errorStream));

        //produces error output
        //ParseTree of the input text
    	@With_compat ParseTree parseTree = inputParser.compilationUnit();
    	
        // Restore the original error stream
        System.setErr(originalErrorStream);

        // Get the captured error output as a string
        String errorOutput = errorStream.toString();
        
        if (errorOutput.isEmpty()) {
        	System.err.println("No syntax errors.");
        			
        	SemanticSymbolCollectorImpl collector = new SemanticSymbolCollectorImpl();
            collector.visit(parseTree);

            SemanticCheckerImpl checker = new SemanticCheckerImpl(collector.getSymbols());
            checker.verify();

            SemanticReporterImpl reporter = new SemanticReporterImpl(checker);
            reporter.printReport();
            
            ClprolfCodeGeneratorImpl generator = new ClprolfCodeGeneratorImpl(tokensStream);
            generator.visit(parseTree);
            
        	System.out.println("The CST is: \n\n" + parseTree.toStringTree(inputParser) + "\n");
        	System.out.println("Generated code: " + "\n");
			System.out.println(generator.getGeneratedCode());
			this.writeClprolfAsStringToSourceFile(fileName, generator.getGeneratedCode());
		}
		else {
			System.err.println("Syntax error: \n\n" + errorOutput);
		}
		
	}
	
	/**
	 * Just read a simol source file, and put it in a string
	 * @param filePath
	 * @return The string containing the source code of the file.
	 * @throws IOException
	 * @throws URISyntaxException 
	 */
	private String readClprolfSourceAsString(String filePath) throws IOException {
	
		Path path = Paths.get(filePath);
		byte[] bytes = Files.readAllBytes(path);
		String content = new String(bytes, StandardCharsets.UTF_8);
		return content;
		
	}
	
	private void writeClprolfAsStringToSourceFile(
	        String filePath,
	        String totalClprolfSourceString
	) throws IOException {

	    Path inputPath = Paths.get(filePath);
	    String fileName = inputPath.getFileName().toString();

	    String javaFileName = fileName.replaceFirst("\\.clp$", ".java");

	    Path outputPath = inputPath.resolveSibling(javaFileName);
	    Files.write(outputPath, totalClprolfSourceString.getBytes(StandardCharsets.UTF_8));
	}
}
