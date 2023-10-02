package org.simol.examples.design_patterns.decorator;

// public simu_rewo CoffeeWithSugar nature CoffeeWithAdditional
public class CoffeeWithSugar extends CoffeeWithAdditional {
	    public CoffeeWithSugar(/* with_compat*/Coffee parentCoffee) {
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
