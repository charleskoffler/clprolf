package org.simol.examples.design_patterns.decorator;

//public abstract simu_real_world_obj CoffeeWithAdditional contracts Coffee
public abstract class CoffeeWithAdditional implements Coffee {
    private final /*with_compat*/ Coffee parentCoffee;

    public CoffeeWithAdditional(/* with_compat */Coffee decoratedCoffee) {
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
