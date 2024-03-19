package org.simol.examples.design_patterns.adapter;

import org.simol.simolframework.java.Simu_comp_worker;

//public simu_comp_as_worker OldSystem
//Existing class
@Simu_comp_as_worker
public class OldSystem {
 public void oldMethod() {
     System.out.println("This is the old method from the OldSystem.");
 }
}
