package org.simol.examples.design_patterns.bridge;

import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.With_compat;


@Abstraction
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
