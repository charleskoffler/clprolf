package org.simol.examples.design_patterns.bridge;

import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Simu_real_obj;
import org.clprolf.framework.java.With_compat;

//Concrete implementation for Circle
/* public simu_real_obj Circle nature Shape */
@Simu_real_obj
public class Circle extends @Nature Shape {
	private int radius;

    public Circle(int radius, @With_compat Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void applyColor() {
        System.out.print("Circle with radius " + radius + " filled with ");
        color.applyColor();
    }
    
    // Other Circle-specific properties and methods can go here
}
