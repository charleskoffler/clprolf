package org.clprolf.examples.design_patterns.decorator;

import org.clprolf.framework.java.Contracts;
import org.clprolf.framework.java.Simu_real_obj;
import org.clprolf.framework.java.With_compat;


@Simu_real_obj
public abstract class CoffeeWithAdditionalImpl implements @Contracts CoffeeWithAdditional {
    private final @With_compat CoffeeWithAdditional parentCoffee;

    public CoffeeWithAdditionalImpl(@With_compat CoffeeWithAdditional decoratedCoffee) {
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
