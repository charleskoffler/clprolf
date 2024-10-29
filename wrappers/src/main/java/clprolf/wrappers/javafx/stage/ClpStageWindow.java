package clprolf.wrappers.javafx.stage;

import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Role;

import javafx.stage.Stage;

@Forced_inh //We can not inherit from Java, unless enforced!
@Abstraction(Role.GUI_ROLE) // The Stage is seen as a GUI Window, here! In Clprolf, it would be used by the worker agent of Scene(SceneWorker, for example). So the SceneWorker would do the stage.setScene()
public class ClpStageWindow extends @Nature Stage {


}