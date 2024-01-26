package org.simol.examples.design_patterns.bridge;

import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.Simu_real_world_obj;

//public simu_real_world_obj Blue contracts Color
@Simu_real_world_obj
public class Blue implements @Contracts Color {
	@Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
