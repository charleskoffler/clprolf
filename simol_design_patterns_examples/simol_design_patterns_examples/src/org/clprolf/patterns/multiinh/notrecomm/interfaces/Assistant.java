package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Compat_interf_version;
import org.simol.simolframework.java.Forced_int_inh;

//The implementation-less world: the interfaces hierarchy is ideal and intuitive

@Forced_int_inh // We enforce this because, in Clprolf, a version typically does not inherit from another version.
@Compat_interf_version
public interface Assistant extends Teacher, Student {
	
}