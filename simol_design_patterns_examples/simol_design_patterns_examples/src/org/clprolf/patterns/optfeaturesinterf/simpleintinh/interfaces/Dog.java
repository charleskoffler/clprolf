package org.clprolf.patterns.optfeaturesinterf.simpleintinh.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Version_inh;

@Agent
@Version_inh
public interface Dog extends @Nature Animal {
	void bark(int duration);
}
