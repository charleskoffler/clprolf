package org.simol.examples.design_patterns.decorator;

import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.With_compat;

// public simu_real_world_obj CoffeeWithMilk nature CoffeeWithAdditional
@Simu_real_world_obj
public class CoffeeWithMilk extends CoffeeWithAdditional {
	    public CoffeeWithMilk(@With_compat Coffee parentCoffee) {
	        super(parentCoffee);
	    }

	    @Override
	    public double getCost() {
	        return super.getCost() + 0.5; // Add cost of milk
	    }

	    @Override
	    public String getDescription() {
	        return super.getDescription() + ", with Milk";
	    }
}
