package org.clprolf.wrappers.javafx.layout;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Forced_inh;
import org.clprolf.framework.java.Nature;

import javafx.scene.Node;
import javafx.scene.layout.Pane;


@Forced_inh //We can not inherit from Java, unless enforced!
@Abstraction
public class ClpPane extends @Nature Pane {
	public ClpPane(Node... children) {
		super(children);
	}

}