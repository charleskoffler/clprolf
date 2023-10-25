package org.simol.examples.design_patterns.decorator;

import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.With_compat;

//public abstract simu_real_world_obj CoffeeWithAdditional contracts Coffee
@Simu_real_world_obj
public abstract class CoffeeWithAdditional implements Coffee {
    private final @With_compat Coffee parentCoffee;

    public CoffeeWithAdditional(@With_compat Coffee decoratedCoffee) {
        this.parentCoffee = decoratedCoffee;
    }

    @Override
    public double getCost() {
        return parentCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return parentCoffee.getDescription();
    }
}
