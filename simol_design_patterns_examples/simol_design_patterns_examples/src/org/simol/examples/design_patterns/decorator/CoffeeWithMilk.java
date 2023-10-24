package org.simol.examples.design_patterns.decorator;

// public simu_real_world_obj CoffeeWithMilk nature CoffeeWithAdditional
public class CoffeeWithMilk extends CoffeeWithAdditional {
	    public CoffeeWithMilk(/* with_compat */Coffee parentCoffee) {
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
