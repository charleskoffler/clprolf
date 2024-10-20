package org.clprolf.patterns.optfeaturesinterf.simpleintinh.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Version_inh;

@Agent
@Version_inh
public interface Animal {
	public void eat(String foodName);
}
