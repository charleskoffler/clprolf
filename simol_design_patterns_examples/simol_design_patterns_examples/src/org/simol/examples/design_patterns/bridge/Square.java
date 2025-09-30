package org.simol.examples.design_patterns.bridge;

import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Simu_real_obj;
import org.clprolf.framework.java.With_compat;

//Concrete implementation for Square
// public simu_real_obj Square nature Shape
@Simu_real_obj
public class Square extends @Nature Shape {
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
