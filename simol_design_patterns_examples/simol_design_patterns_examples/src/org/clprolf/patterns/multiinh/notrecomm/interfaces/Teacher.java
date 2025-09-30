package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Forced_int_inh;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Version_inh;

@Agent
@Forced_int_inh// We enforce this because, in Clprolf, a version typically does not inherit from another version.
@Version_inh
public interface Teacher extends @Nature Person { //Nature is optional for the interfaces.
	void teach();
}