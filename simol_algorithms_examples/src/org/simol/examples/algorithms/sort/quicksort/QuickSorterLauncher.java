package org.simol.examples.algorithms.sort.quicksort;

import org.simol.simolframework.java.Simu_comp_as_worker;

@Simu_comp_as_worker
public class QuickSorterLauncher {

	public static void main(String[] args) {
		int[] array = {56, 34, 87, 15, 52, 9};
		
		QuickSorter sorter = new QuickSorter();
		sorter.sort(array);
		
		//Display the sorted array!
		for (int element: array) {
			System.out.print(element + ";");
		}
		System.out.println();
	}

}
