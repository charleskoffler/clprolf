package org.clprolf.patterns.optfeaturesinterf.simpleintinh.interfaces;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Version_inh;

@Agent
@Version_inh
public interface Dog extends @Nature Animal {
	void bark(int duration);
}
