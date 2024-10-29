package clprolf.wrappers.javafx.scene;

import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Simu_real_obj;

import javafx.scene.Parent;
import javafx.scene.Scene;

// A simulation of a real-world scene. Could have been "abstraction".
// Definitely not a GUI role element.
@Forced_inh //We can not inherit from Java, unless enforced!
@Simu_real_obj
public class ClpScene extends @Nature Scene {

	public ClpScene(Parent root, double width, double height, boolean depthBuffer) {
		super(root, width, height, depthBuffer);
	}
}