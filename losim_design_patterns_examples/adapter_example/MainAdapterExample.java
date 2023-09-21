package org.losim.examples.design_patterns;

/* Example of adapter design pattern in losim. 2023/09/21
 * (c) Sabri Koffler MIT License */

//public simu_lapo MainAdapterExample
public class MainAdapterExample {

	public static void main(String[] args) {
		 // Create an instance of the OldSystem
        OldSystem oldSystem = new OldSystem();

        /* avec_compat */ NewSystem newSystemFromOld = new NewSystemFromOld(oldSystem);

        // Call the newMethod
        newSystemFromOld.newMethod();

	}

}
