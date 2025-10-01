package org.simol.examples.design_patterns.bridge;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Contracts;


@Abstraction
public class Blue implements @Contracts Color {
	@Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
