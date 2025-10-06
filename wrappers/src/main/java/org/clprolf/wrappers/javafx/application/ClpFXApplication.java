package org.clprolf.wrappers.javafx.application;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Forced_inh;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Gender;

import javafx.application.Application;

@Forced_inh //We can not inherit from Java, unless enforced!
@Abstraction(Gender.STATIC) //Both pure abtraction and static abstraction
public abstract class ClpFXApplication extends @Nature Application {

}