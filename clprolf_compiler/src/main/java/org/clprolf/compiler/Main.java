package org.clprolf.compiler;

/* 
 * Clprolf compiler, made with the maven project clprolf_compiler, to generate antlr4 clprolf grammar compiler.
 * Custom files of the compiler: ClprolfCompiler, ClprolfJava8CustomListener.
 * Actually the clprolf antlr4 compiler is based on java 8 grammer of antlr4-grammars-v4
 * (https://github.com/antlr/grammars-v4/tree/master/java/java8) 
 
	Clprolf compiler
	Author Charles Koffler, M.I.T License. 2023/10/16
	https://github.com/charleskoffler/simol-language

	3.0 2025/09/28	Clprolf instead of deprecated name "simol". Cleanup synonyms.
	
*/
 
// public simu_comp_as_worker Main
public class Main {
    public static void main(String[] args) throws Exception {
    	ClprolfCompiler compiler = new ClprolfCompiler();
    	
    	compiler.compile(/*"resources/" + */args[0]);
    }
}
