package org.simol.examples.design_patterns.bridge;

import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Simu_real_obj;

// public simu_real_obj Green contracts Color
@Simu_real_obj
public class Green implements @Contracts Color {
	@Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
