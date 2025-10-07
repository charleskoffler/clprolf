package org.clprolf.examples.design_patterns.bridge;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.With_compat;


@Abstraction
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
