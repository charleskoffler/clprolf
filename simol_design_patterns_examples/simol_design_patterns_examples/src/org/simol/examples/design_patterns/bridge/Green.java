package org.simol.examples.design_patterns.bridge;

// public simu_real_world_obj Green contracts Color
public class Green implements Color {
	@Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
