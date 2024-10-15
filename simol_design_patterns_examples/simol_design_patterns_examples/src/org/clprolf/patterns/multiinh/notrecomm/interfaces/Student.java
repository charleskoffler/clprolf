package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Compat_interf_version;
import org.simol.simolframework.java.Forced_int_inh;

@Forced_int_inh
@Compat_interf_version //
public interface Student extends Person {
	void learn();
}
