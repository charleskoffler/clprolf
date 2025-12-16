package org.simol.examples.algorithms.sort.quicksort;

import org.clprolf.framework.java.Worker_agent;

@Worker_agent
public class QuickSorterLauncher {
	/* Here, the low-level, non-intuitive operation is placed in a worker */
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
