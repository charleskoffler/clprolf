Simol compiler. 2023/10/16
Author Charles Koffler, M.I.T License
https://github.com/charleskoffler/simol-language

- Command line simol compiler, based on Antlr4.

Fo execute the compiler, use
mvn exec:java -Dexec.args="org/simol/examples/concurrency/DonkeyForLongAction.simo", for example.
Or you can use the windows batch: simolCompiler.bat simolFileName (or the java command inside for Linux, or other operating systems).

To compile simol code, place the simol sources files in target/classes, or in src/main/java/resources, if mvn resources:resources is executed
Pass relative path as an argument, for example simolCompiler Car.simo
This will create a Car.java(compiled version), in the same place.

simol sources editor:
simol sources can be open with eclipse and choosing open with java editor, or with notepad+++->java language, and so on.

You can format the java code with Eclipse, for example, right clic on the java generated file, source, format.

- Maven project org.simol.simol_compiler, for generate antlr4 simol grammar compiler.
Custom files of the compiler: SimolCompiler, SimolJava8CustomListener.
Actually the simol antlr4 compiler is based on java 8 grammar of antlr4-grammars-v4
(https://github.com/antlr/grammars-v4/tree/master/java/java8)

mvn antlr4:antlr4 to regenerate the antlr4 parser, based on the simol grammar, at the moment started from Java 8 grammar of antlr4-grammars.
Grammar files: src/main/antlr4/org/simol/compiler, SimolJava8Lexer.g4 and SimolJava8Parser.g4

mvn compile doesn't compile generated sources, so you have to execute compileGeneratedSources.bat( or execute the javac command inside, for Linux), for them.
Then you can use mvn compile.

- The simol compiler parse simol code(.simo source files), and java code included(java 8). He stops when a syntax error is met, simol or java.
It does not, actually, deal with semantic analysis of simol, nor java. Semantic analysis of simol is not so important, it's only about:
rewo and information, checking is there are no methods.
simu_rewo and simu_alfoc, it have to contain methods.
with_compat, check if the type is an interface, and checks about presence of with_compat when needed

The compiler generates java code, if all is ok.

Then you have to use javac on the generated java code, in order to obtain executables with bytecode.