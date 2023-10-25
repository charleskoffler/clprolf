package org.simol.examples.design_patterns.decorator;

import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.With_compat;

// public simu_real_world_obj CoffeeWithSugar nature CoffeeWithAdditional
@Simu_real_world_obj
public class CoffeeWithSugar extends CoffeeWithAdditional {
	    public CoffeeWithSugar(@With_compat Coffee parentCoffee) {
	        super(parentCoffee);
	    }

	    @Override
	    public double getCost() {
	        return super.getCost() + 0.2; // Add cost of sugar
	    }

	    @Override
	    public String getDescription() {
	        return super.getDescription() + ", with Sugar";
	    }

}
