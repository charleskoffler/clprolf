package org.simol.examples.design_patterns.decorator;

import org.clprolf.framework.java.Simu_real_obj;
import org.clprolf.framework.java.Version_inh;


@Version_inh
@Simu_real_obj
public interface CoffeeWithAdditional {
    public double getCost();
    public String getDescription();
}
