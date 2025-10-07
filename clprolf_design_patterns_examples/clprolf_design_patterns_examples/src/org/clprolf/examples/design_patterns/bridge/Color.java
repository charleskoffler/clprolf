package org.clprolf.examples.design_patterns.bridge;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Version_inh;

@Abstraction
@Version_inh
public interface Color {
	 void applyColor();
}
