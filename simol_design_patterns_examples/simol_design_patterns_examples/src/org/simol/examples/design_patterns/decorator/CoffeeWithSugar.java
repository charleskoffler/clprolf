package org.simol.examples.design_patterns.decorator;

import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Simu_real_obj;
import org.clprolf.framework.java.With_compat;


@Simu_real_obj
public class CoffeeWithSugar extends @Nature CoffeeWithAdditionalImpl {
	    public CoffeeWithSugar(@With_compat CoffeeWithAdditional decoratedCoffee) {
	        super(decoratedCoffee);
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
