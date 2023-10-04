package org.simol.examples.design_patterns.bridge;

//Concrete implementation for Square
// public simu_rewo Square nature Shape
public class Square extends Shape {
	private int sideLength;

    public Square(int sideLength, /* with_compat */ Color color) {
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
