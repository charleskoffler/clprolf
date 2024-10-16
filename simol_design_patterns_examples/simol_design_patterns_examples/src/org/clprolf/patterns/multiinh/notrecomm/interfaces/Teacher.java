package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Forced_int_inh;
import org.simol.simolframework.java.Nature;

@Agent
@Forced_int_inh// We enforce this because, in Clprolf, a version typically does not inherit from another version.
@Version_inh
public interface Teacher extends @Nature Person { //Nature is optional for the interfaces.
	void teach();
}