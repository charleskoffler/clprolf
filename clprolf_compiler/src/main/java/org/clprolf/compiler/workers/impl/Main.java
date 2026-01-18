package org.clprolf.compiler.workers.impl;

import org.clprolf.compiler.agents.impl.ClprolfCompilerImpl;
import org.clprolf.framework.java.Worker_agent;

/* 
 * Clprolf compiler, made with the maven project clprolf_compiler, to generate antlr4 clprolf grammar compiler.
 *
 * Actually the clprolf antlr4 compiler is based on java 8 grammer of antlr4-grammars-v4
 * (https://github.com/antlr/grammars-v4/tree/master/java/java8) 
 
 5.3.0 (20260118)
 
 mvn clean package compile all the sources. Execution works with java -jar, and the .clp path is a file system path.
 
 BA1: done by grammar.
 
 Already done: BB2, BB1, BA3, BA4, BA2, BA5
 
 Usage example: 
 
 java -jar clprolfcompiler-5.3.jar "clprolfsources/org/clprolf/compiler/semantic/tests/SemanticTests.clp"
 or
 mvn exec:java -Dexec.mainClass="org.clprolf.compiler.workers.impl.Main" -Dexec.args="target/classes/org/clprolf/compiler/semantic/tests/SemanticTests.clp"
 
	Clprolf compiler
	Author Charles Koffler, M.I.T License. 2023/10/16
	https://github.com/charleskoffler/simol-language

	
*/
 
// public simu_comp_as_worker Main

@Worker_agent
public class Main {
    public static void main(String[] args) throws Exception {
    	ClprolfCompilerImpl compiler = new ClprolfCompilerImpl();
    	
    	compiler.compile(/*"resources/" + */args[0]);
    }
}
