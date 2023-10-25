package org.simol.examples.design_patterns.adapter;

import org.simol.simolframework.java.Simu_comp_worker;
import org.simol.simolframework.java.With_compat;

/* Example of adapter design pattern in simol. 2023/09/21
 * (c) Sabri Koffler MIT License */

//public simu_comp_worker MainAdapterExample
@Simu_comp_worker
public class MainAdapterExample {

	public static void main(String[] args) {
		 // Create an instance of the OldSystem
        OldSystem oldSystem = new OldSystem();

        @With_compat NewSystem newSystemFromOld = new NewSystemFromOld(oldSystem);

        // Call the newMethod
        newSystemFromOld.newMethod();

	}

}
