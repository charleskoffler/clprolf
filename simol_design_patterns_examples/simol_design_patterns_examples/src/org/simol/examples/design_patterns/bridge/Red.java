package org.simol.examples.design_patterns.bridge;

import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Simu_real_obj;

//public simu_real_world_obj Red contracts Color
@Simu_real_obj
public class Red implements @Contracts Color {
	 @Override
	    public void applyColor() {
	        System.out.println("Applying red color");
	    }
}
