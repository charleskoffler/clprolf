package clprolf.wrappers.javafx.application;

import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Role;

import javafx.application.Application;

@Forced_inh //We can not inherit from Java, unless enforced!
@Abstraction(Role.STATIC) //Both pure abtraction and static abstraction
public abstract class ClpFXApplication extends @Nature Application {

}