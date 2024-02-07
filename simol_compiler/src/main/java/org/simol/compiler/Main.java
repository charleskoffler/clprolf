package org.simol.compiler;

/* 
 * Simol compiler, made with the maven project simol_compiler, for generate antlr4 simol grammar compiler.
 * Custom files of the compiler: SimolCompiler, SimolJava8CustomListener.
 * Actually the simol antlr4 compiler is based on java 8 grammer of antlr4-grammars-v4
 * (https://github.com/antlr/grammars-v4/tree/master/java/java8) 
 
	Simol compiler
	Author Charles Koffler, M.I.T License. 2023/10/16
	https://github.com/charleskoffler/simol-language

	2.0.0 2024/02/07	Added all the new keywords ("long_action", "prevent_missing_collision",
					,"one_at_a_time","tour_monitor",
					"for_every_thread","dependent_activity").
	
*/
 
// public simu_comp_worker Main
public class Main {
    public static void main(String[] args) throws Exception {
    	SimolCompiler compiler = new SimolCompiler();
    	
    	compiler.compile(/*"resources/" + */args[0]);
    }
}
