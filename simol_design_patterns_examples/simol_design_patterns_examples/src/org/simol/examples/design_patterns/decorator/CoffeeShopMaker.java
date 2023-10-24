package org.simol.examples.design_patterns.decorator;

//2023/10/02 Example of CoffeShopMaker in simol. I started from the java example in the text file
//public simu_comp_worker CoffeeShopMaker
public class CoffeeShopMaker {

    public static void main(String[] args) {
        // Order a simple coffee
        /*with_compat */Coffee coffee = new SimpleCoffee();
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
