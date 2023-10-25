package org.simol.examples.design_patterns.bridge;

import org.simol.simolframework.java.Simu_real_world_obj;

// public simu_real_world_obj Green contracts Color
@Simu_real_world_obj
public class Green implements Color {
	@Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
