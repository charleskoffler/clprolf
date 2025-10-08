package org.clprolf.compiler;

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

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.With_compat;

/*
 * 
 *  */
@Agent
public class ClprolfCompiler {
	
	public void compile(String fileName) throws URISyntaxException, IOException {
		String totalSourceCode;
		
		ByteArrayOutputStream errorStream;
		
        PrintStream originalErrorStream ;
		
		totalSourceCode = this.readClprolfSourceAsString(fileName);
	   
	    @With_compat TokenSource tokenSource = new ClprolfJava8Lexer(CharStreams.fromString(totalSourceCode.toString()));
	    CommonTokenStream tokensStream = new CommonTokenStream(tokenSource);
	    ClprolfJava8Parser inputParser = new ClprolfJava8Parser(tokensStream);
	
	    /* ClprolfJava8Parser.CompilationUnitContext context = parser.compilationUnit(); */
	
		// You can now work with the parse tree or AST
		ClprolfWalkerObserver walkerObserver = new ClprolfWalkerObserver();
		
		// Calling the parsor while keeping the standard errors output.
		// Create a ByteArrayOutputStream to capture error output
        errorStream = new ByteArrayOutputStream();

        // Redirect the standard error to the ByteArrayOutputStream, for capture errors output.
        originalErrorStream = System.err;
        System.setErr(new PrintStream(errorStream));

        //produces error output
        //ParseTree of the input text
    	@With_compat ParseTree parseTree = inputParser.compilationUnit();
    	System.out.println(parseTree.toStringTree(inputParser));
    	
        // Restore the original error stream
        System.setErr(originalErrorStream);

        // Get the captured error output as a string
        String errorOutput = errorStream.toString();
        
		//Agent to browse the parse tree.
        ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(walkerObserver, parseTree);
		String generatedOutput = walkerObserver.getOutput();
		
		if (errorOutput.isEmpty()) {
			//System.out.println(generatedOutput);
			this.writeClprolfAsStringToSourceFile(fileName, generatedOutput);
		}
		else {
			System.err.print(errorOutput);
		}
	}
	
	/**
	 * Just read a simol source file, and put it in a string
	 * @param simolResourceName
	 * @return The string containing the source code of the file.
	 * @throws IOException
	 * @throws URISyntaxException 
	 */
	private String readClprolfSourceAsString(String simolResourceName) throws IOException, URISyntaxException {
		String strInputSourceLine;
	
		StringBuffer totalSourceCode = new StringBuffer();
		
	
	   File inputFile;

	   BufferedReader sourceReader;
	   
		/*String input = "public compat_interf_capacity ClientDAOFile {"
		+ "Client getClient(int id);"
	+ "}";*/
		   
		// get the file url
	   URL resourceUrl = getClass().getClassLoader().getResource(simolResourceName);
	   if (resourceUrl == null) {
	       throw new IllegalArgumentException("file not found!");
	   } else {
		   inputFile = new File(resourceUrl.toURI());
	   }
	   sourceReader = new BufferedReader(new FileReader(inputFile));
	   
	   strInputSourceLine = sourceReader.readLine();
	   while (strInputSourceLine != null) {
		   totalSourceCode.append(strInputSourceLine+"\n"); //Don't forget to add the "\n"!!
		   
		   strInputSourceLine = sourceReader.readLine();
	   }
	   sourceReader.close();
	   
	   return totalSourceCode.toString();
	}
	
	private void writeClprolfAsStringToSourceFile(String simolResourceName, String totalSimolSourceString) throws URISyntaxException, IOException {
		
		File outputFile;
		
		BufferedWriter writer;
		String path, newPath;
		
		URL resourceUrl = getClass().getClassLoader().getResource(simolResourceName);
		
		//Change of the extension name.
		path = resourceUrl.getPath();
		newPath = path.replaceAll("\\.clp$", ".java");

		outputFile = new File(newPath);
		writer = new BufferedWriter(new FileWriter(outputFile));
		
		writer.write(totalSimolSourceString);
		
		writer.close();
	}
}
