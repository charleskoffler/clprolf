package org.simol.examples.design_patterns.bridge;

//public simu_rewo Blue contracts Color
public class Blue implements Color {
	@Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
