package org.simol.examples.algorithms.sort.insertion;

import org.simol.simolframework.java.Simu_comp_worker;

@Simu_comp_as_worker
public class InsertionSorterLauncher {

	public static void main(String[] args) {
		int[] array = {56, 34, 87, 15, 52, 9};
		
	/*	InsertionSorter sorter = new InsertionSorter(array);
		array = sorter.sort();*/
		
		InsertionSorterWorker sorter = new InsertionSorterWorker(array);
		array = sorter.sort();
		
		//Display the sorted array!
		for (int element: array) {
			System.out.print(element + ";");
		}
		System.out.println();
	}

}
