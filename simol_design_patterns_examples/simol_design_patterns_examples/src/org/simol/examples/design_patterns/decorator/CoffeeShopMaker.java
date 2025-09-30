package org.simol.examples.design_patterns.decorator;

import org.clprolf.framework.java.Worker_agent;
import org.clprolf.framework.java.With_compat;


@Worker_agent
public class CoffeeShopMaker {

    public static void main(String[] args) {
        // Order a simple coffee
        @With_compat CoffeeWithAdditional coffee = new SimpleCoffee();
        System.out.println("Cost: $" + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());

        // Decorate it with Milk
        coffee = new CoffeeWithMilk(coffee);
        System.out.println("Cost: $" + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());

        // Decorate it with Sugar
        coffee = new CoffeeWithSugar(coffee);
        System.out.println("Cost: $" + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());
    }

}
