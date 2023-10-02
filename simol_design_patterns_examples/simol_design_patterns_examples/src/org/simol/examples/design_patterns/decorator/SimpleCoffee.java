package org.simol.examples.design_patterns.decorator;

//public simu_rewo SimpleCoffee contracts Coffee
public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 2.0; // Base cost of simple coffee
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
