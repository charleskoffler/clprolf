package org.simol.examples.design_patterns.bridge;

import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.With_compat;

//Concrete implementation for Square
// public simu_real_world_obj Square nature Shape
@Simu_real_world_obj
public class Square extends Shape {
	private int sideLength;

    public Square(int sideLength, @With_compat Color color) {
        super(color);
        this.sideLength = sideLength;
    }

    @Override
    public void applyColor() {
        System.out.print("Square with side length " + sideLength + " filled with ");
        color.applyColor();
    }
    
    // Other Square-specific properties and methods can go here
}
