package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Forced_int_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Version_inh;

@Agent
@Forced_int_inh
@Version_inh
public interface Student extends @Nature Person {  //Nature is optional for the interfaces.
	void learn();
}
