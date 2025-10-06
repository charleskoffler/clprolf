package org.clprolf.wrappers;

import org.clprolf.framework.java.Gender;
import org.clprolf.framework.java.Worker_agent;

import clprolf.wrappers.java.lang.ClpSystem;

/**
 * Hello world!
 */
@Worker_agent(Gender.STATIC)
public class App {
    public static void main(String[] args) {
       ClpSystem.getOut().println("Hello World!");
    }
}
