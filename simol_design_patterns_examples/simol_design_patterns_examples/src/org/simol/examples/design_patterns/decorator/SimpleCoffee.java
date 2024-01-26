package org.simol.examples.design_patterns.decorator;

import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.Simu_real_world_obj;

//public simu_real_world_obj SimpleCoffee contracts Coffee
@Simu_real_world_obj
public class SimpleCoffee implements @Contracts Coffee {
    @Override
    public double getCost() {
        return 2.0; // Base cost of simple coffee
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
