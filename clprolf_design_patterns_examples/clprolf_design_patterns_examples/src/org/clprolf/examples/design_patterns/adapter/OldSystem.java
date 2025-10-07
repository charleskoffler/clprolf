package org.clprolf.examples.design_patterns.adapter;

import org.clprolf.framework.java.Worker_agent;

//public simu_comp_as_worker OldSystem
//Existing class
@Worker_agent
public class OldSystem {
 public void oldMethod() {
     System.out.println("This is the old method from the OldSystem.");
 }
}
