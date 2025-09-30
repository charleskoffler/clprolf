package org.simol.examples.design_patterns.decorator;

import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Simu_real_obj;


@Simu_real_obj
public class SimpleCoffee implements @Contracts CoffeeWithAdditional {
    @Override
    public double getCost() {
        return 2.0; // Base cost of simple coffee
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
