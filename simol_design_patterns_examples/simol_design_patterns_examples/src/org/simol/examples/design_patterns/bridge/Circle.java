package org.simol.examples.design_patterns.bridge;

//Concrete implementation for Circle
/* public simu_rewo Circle nature Shape */
public class Circle extends Shape {
	private int radius;

    public Circle(int radius, /* with_compat */Color color) {
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
