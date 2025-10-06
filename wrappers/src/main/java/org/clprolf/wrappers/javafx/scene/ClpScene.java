package org.clprolf.wrappers.javafx.scene;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Forced_inh;
import org.clprolf.framework.java.Nature;

import javafx.scene.Parent;
import javafx.scene.Scene;


@Forced_inh
@Abstraction
public class ClpScene extends @Nature Scene {

	public ClpScene(Parent root, double width, double height, boolean depthBuffer) {
		super(root, width, height, depthBuffer);
	}
}