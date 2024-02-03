package org.simol.examples.algorithms.sort.quicksort;

import org.simol.simolframework.java.Role;
import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.Underst;

@Simu_real_world_obj(Role.HUMAN_EXPERT)
public class QuickSorter {

	public void sort(int[] arrElements) {
		this.sortSubArray(arrElements, 0, arrElements.length-1);
	}
	
	@Underst //@Underst because it is a algorithm adapted to the computer abilities, and hard to understand.
	private void sortSubArray(int[] arrElements, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int pivotIndex;
			//To sort an array, we are first placing an element.
			pivotIndex = sortOneElement(arrElements, startIndex, endIndex);
			//Sort the elements on the left.
			sortSubArray(arrElements, 0, pivotIndex - 1);
			//Sort the other elements, on the right.
			sortSubArray(arrElements, pivotIndex + 1, endIndex);
		}
	}
	
	/**
	 * Place one element, the pivot, at the correct place, and place all lesser elements
	 * on the left side, and the bigger elements on the right side.
	 * Every elements in a sorted array have this property.
	 * @param arrElements
	 * @param startIndex Beginning index
	 * @param endIndex	Ending index
	 * @return Return the index of the pivot.
	 */
	@Underst
	private int sortOneElement(int[] arrElements, int startIndex, int endIndex) {
		int writer; /* The writer always points to the next index to write a value. The 
						writer moves forward each time a value is written.
						The swap is between the pointed value of the writer, which is
						a big value to move house, and the value of the reader, which
						is a small value. The writer never overtakes the reader. */
		int reader; //The reader loops on each element of the given array.
		int pivotValue;
		
		writer = startIndex;
		pivotValue = arrElements[endIndex]; //We decide arbitrarily to take the last value.
		
		for (reader = startIndex; reader <= endIndex-1; reader++) {
			if (arrElements[reader] < pivotValue) {
				swapElements(arrElements, writer, reader);
				writer++;
			}
		}
		//Treatment of the pivot
		//We swap the pivot, because the writer is pointed to the next place to be written
		swapElements(arrElements, writer, reader);
		return writer;
	}
	
	private void swapElements(int[] arrElements, int firstIndex, int secondIndex) {
		int lowerValue;
		
		lowerValue = arrElements[firstIndex];
		arrElements[firstIndex] = arrElements[secondIndex];
		arrElements[secondIndex] = lowerValue;
	}
}
