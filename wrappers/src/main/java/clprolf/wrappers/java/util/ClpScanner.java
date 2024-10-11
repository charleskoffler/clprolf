package clprolf.wrappers.java.util;

import java.util.Scanner;

import org.simol.simolframework.java.Agent;

/**
 * We use an agent here, but we could have used an @Abstraction.
 * Agent is appropriate here, because it is an instance and active object in
 * the user application. It's an agent for scanning. No need to precise a EXPERT_COMPONENT,
 * because it is quite already said with agent.
 * 
 * @author Charles Koffler
 *
 */

@Agent
public final class ClpScanner { //No inheritance, because it is a Java final class.

	private final Scanner internal;
	
	public ClpScanner(Scanner javaScanner) {
		this.internal = javaScanner;
	}
	
	public String nextLine() {
		return this.internal.nextLine();
	}
	
}
