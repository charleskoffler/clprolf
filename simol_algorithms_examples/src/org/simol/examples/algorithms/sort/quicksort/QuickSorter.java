package org.simol.examples.algorithms.sort.quicksort;

import org.clprolf.framework.java.Agent;

@Agent
public class QuickSorter {
	protected QuickSorterWorker worker;
	
	public QuickSorter() {
		worker = new QuickSorterWorker();
	}
	
	public void sort(int[] arrElements) {
		this.sortSubArray(arrElements, 0, arrElements.length-1);
	}
	
	private void sortSubArray(int[] arrElements, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pivotIndex;
			//To sort an array, we are first placing an element.
			pivotIndex = worker.sortOneElement(arrElements, startIndex, endIndex);
			//Sort the elements on the left.
			sortSubArray(arrElements, 0, pivotIndex - 1);
			//Sort the other elements, on the right.
			sortSubArray(arrElements, pivotIndex + 1, endIndex);
		}
	}
}
