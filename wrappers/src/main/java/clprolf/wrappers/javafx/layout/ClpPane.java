package clprolf.wrappers.javafx.layout;

import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Role;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

//In Clprolf, it would be used by the worker agent of Scene(SceneWorker, for example), not directly in Scene.
@Forced_inh //We can not inherit from Java, unless enforced!
@Abstraction(Role.GUI_ROLE) // The GUI containers are also with a GUI-role, to simplify, in Clprolf!
public class ClpPane extends @Nature Pane {
	public ClpPane(Node... children) {
		super(children);
	}

}