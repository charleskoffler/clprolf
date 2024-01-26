package org.simol.examples.design_patterns.bridge;

import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.Contracts;

//public simu_real_world_obj Red contracts Color
@Simu_real_world_obj
public class Red implements @Contracts Color {
	 @Override
	    public void applyColor() {
	        System.out.println("Applying red color");
	    }
}
