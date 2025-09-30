package org.simol.examples.design_patterns.adapter;

import org.clprolf.framework.java.With_compat;
import org.clprolf.framework.java.Worker_agent;

/* Example of adapter design pattern in simol. 2023/09/21
 * (c) Sabri Koffler MIT License */

//public simu_comp_as_worker MainAdapterExample
@Worker_agent
public class MainAdapterExample {

	public static void main(String[] args) {
		 // Create an instance of the OldSystem
        OldSystem oldSystem = new OldSystem();

        @With_compat NewSystem newSystemFromOld = new NewSystemFromOld(oldSystem);

        // Call the newMethod
        newSystemFromOld.newMethod();

	}

}
