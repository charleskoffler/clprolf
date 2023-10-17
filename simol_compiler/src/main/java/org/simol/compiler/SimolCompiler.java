package org.simol.compiler;

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
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/*
 * 
 *  */
// public simu_rewo SimolCompiler
public class SimolCompiler {
	public void compile(String fileName) throws URISyntaxException, IOException {
		String totalSourceCode;
		//simu_rewo
		ByteArrayOutputStream errorStream;
		//simu_rewo
        PrintStream originalErrorStream ;
		
		//simu_rewo
		totalSourceCode = this.readSimolSourceAsString(fileName);
	   
	    SimolJava8Lexer lexer = new SimolJava8Lexer(CharStreams.fromString(totalSourceCode.toString()));
	    CommonTokenStream tokens = new CommonTokenStream(lexer);
	    SimolJava8Parser parser = new SimolJava8Parser(tokens);
	
	    /* SimolJava8Parser.CompilationUnitContext context = parser.compilationUnit(); */
	
		// You can now work with the parse tree or AST
		SimolJava8CustomListener listener = new SimolJava8CustomListener();
		
		// Calling the parsor while keeping the standard errors output.
		// Create a ByteArrayOutputStream to capture error output
        errorStream = new ByteArrayOutputStream();

        // Redirect the standard error to the ByteArrayOutputStream, for capture errors output.
        originalErrorStream = System.err;
        System.setErr(new PrintStream(errorStream));

        //produces error output
    	ParseTree parseTree = parser.compilationUnit();
		
        // Restore the original error stream
        System.setErr(originalErrorStream);

        // Get the captured error output as a string
        String errorOutput = errorStream.toString();
        
		//Travel of the tree
        ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(listener, parseTree);
		String generatedOutput = listener.getOutput();
		
		if (errorOutput.isEmpty()) {
			//System.out.println(generatedOutput);
			this.writeSimolAsStringToSourceFile(fileName, generatedOutput);
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
	private String readSimolSourceAsString(String simolResourceName) throws IOException, URISyntaxException {
		String strInputSourceLine;
		//simu_rewo of a string, with more capacities
		StringBuffer totalSourceCode = new StringBuffer();
		
		//simu_rewo
	   File inputFile;
	   //simu_rewo of a reader
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
	
	private void writeSimolAsStringToSourceFile(String simolResourceName, String totalSimolSourceString) throws URISyntaxException, IOException {
		//simu_rewo
		File outputFile;
		//simu_rewo
		BufferedWriter writer;
		String path, newPath;
		
		URL resourceUrl = getClass().getClassLoader().getResource(simolResourceName);
		
		//Change of the extension name.
		path = resourceUrl.getPath();
		newPath = path.replaceAll("\\.simo$", ".java");

		outputFile = new File(newPath);
		writer = new BufferedWriter(new FileWriter(outputFile));
		
		writer.write(totalSimolSourceString);
		
		writer.close();
	}
}
