package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Compat_interf_version;
import org.simol.simolframework.java.Forced_int_inh;

@Forced_int_inh// We enforce this because, in Clprolf, a version typically does not inherit from another version.
@Compat_interf_version
public interface Teacher extends Person {
	void teach();
}