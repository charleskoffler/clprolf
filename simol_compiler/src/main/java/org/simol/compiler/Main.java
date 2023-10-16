package org.simol.compiler;

/* 
 * Simol compiler, made with the maven project simol_compiler, for generate antlr4 simol grammar compiler.
 * Custom files of the compiler: SimolCompiler, SimolJava8CustomListener.
 * Actually the simol antlr4 compiler is based on java 8 grammer of antlr4-grammars-v4
 * (https://github.com/antlr/grammars-v4/tree/master/java/java8) 
 
	Simol compiler
	Author Charles Koffler, M.I.T License. 2023/10/16
	https://github.com/charleskoffler/simol-language

	v1.0 2023/10/16 Simol compiler compiles in java a simol file passed in argument. Maven project. The grammar is based on a java 8 grammar(antlr4-grammars). The parser is generated from antlr4.
	
*/
 
// public simu_alfoc Main
public class Main {
    public static void main(String[] args) throws Exception {
    	SimolCompiler compiler = new SimolCompiler();
    	
    	compiler.compile(/*"resources/" + */args[0]);
    }
}
