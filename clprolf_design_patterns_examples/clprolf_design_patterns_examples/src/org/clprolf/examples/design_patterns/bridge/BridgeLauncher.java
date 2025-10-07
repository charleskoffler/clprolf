package org.clprolf.examples.design_patterns.bridge;

import org.clprolf.framework.java.Worker_agent;
import org.clprolf.framework.java.With_compat;


@Worker_agent
public class BridgeLauncher {

	public static void main(String[] args) {
		@With_compat Color red = new Red();
		@With_compat Color green = new Green();

        Shape redCircle = new Circle(5, red);
        Shape greenSquare = new Square(7, green);

        redCircle.applyColor();    // Circle with radius 5 filled with red color
        greenSquare.applyColor();  // Square with side length 7 filled with green color

	}

}
