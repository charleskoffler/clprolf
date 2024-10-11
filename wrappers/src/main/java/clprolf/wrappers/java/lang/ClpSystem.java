package clprolf.wrappers.java.lang;

import java.io.Console;
import java.io.InputStream;
import java.io.PrintStream;

import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Role;

/**
 * Wrapper of the java.lang.System class.
 * It is a final class, with only static members, so the wrapper is just there as an example.
 * But we could add wrapper members!
 * 
 * @author Charles Koffler
 *
 */
@Abstraction(Role.STATIC) //Abstraction of the operating system. The methods are statics, and act like a singleton for a System object.
public final class ClpSystem { //final as the Java System class.
	public static final PrintStream getOut() {
		return System.out;
	}
	
	public static final InputStream getIn() {
		return System.in;
	}
	
	public static final PrintStream getErr() {
		return System.err;
	}
	
	public static Console console() {
		return System.console();
	}
	//Feel free to add(or not) the methods you like!
}
