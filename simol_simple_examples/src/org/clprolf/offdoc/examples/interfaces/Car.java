package org.clprolf.offdoc.examples.interfaces;
import org.simol.simolframework.java.Agent;
import clprolf.wrappers.java.lang.ClpComparable;

@Agent //Agent is compatible with the Advice of ClpComparable(FOR_ADGENT_LIKE)
public interface Car extends ClpComparable<Car> {
	
	public int getYear();
	
	public String getName();
}