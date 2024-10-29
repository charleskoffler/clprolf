package clprolf.wrappers.javafx.application;

import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;

import javafx.application.Application;

@Forced_inh //We can not inherit from Java, unless enforced!
@Abstraction
public abstract class ClpFXApplication extends @Nature Application {

}