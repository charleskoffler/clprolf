package org.clprolf.wrappers.java.util;

import java.util.Scanner;

import org.clprolf.framework.java.Agent;


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
