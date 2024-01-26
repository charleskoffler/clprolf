package org.simol.examples.design_patterns.bridge;

import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.With_compat;
import org.simol.simolframework.java.Nature;

//Concrete implementation for Circle
/* public simu_real_world_obj Circle nature Shape */
@Simu_real_world_obj
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
