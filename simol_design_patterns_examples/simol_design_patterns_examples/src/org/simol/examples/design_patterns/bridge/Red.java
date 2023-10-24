package org.simol.examples.design_patterns.bridge;

//public simu_real_world_obj Red contracts Color
public class Red implements Color {
	 @Override
	    public void applyColor() {
	        System.out.println("Applying red color");
	    }
}
