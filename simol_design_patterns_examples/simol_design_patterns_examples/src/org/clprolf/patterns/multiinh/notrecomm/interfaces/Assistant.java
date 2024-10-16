package org.clprolf.patterns.multiinh.notrecomm.interfaces;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Forced_int_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Version_inh;

//The implementation-less world: the interfaces hierarchy is ideal and intuitive

@Agent //Optional for the interfaces!
@Forced_int_inh // We enforce this because, in Clprolf, a version typically does not inherit from another version.
@Version_inh
public interface Assistant extends @Nature Teacher, Student { //@Nature is optional. When used, Teacher and Student has to be exactly of the same role.
	
}