package org.simol.examples.algorithms.sort.quicksort;
import org.clprolf.framework.java.Worker_agent;

@Worker_agent
public class QuickSorterWorker {
	/**
	 * Place one element, the pivot, at the correct place.
	 * Once placed, the element is greater than all elements on the left, and
	 * smaller than all elements on the right.
	 * 
	 * @param arrElements
	 * @param startIndex Beginning index
	 * @param endIndex	Ending index
	 * @return Return the index of the pivot.
	 */
	public int sortOneElement(int[] arrElements, int startIndex, int endIndex) {
		int writer; /* The writer always points to the next index to write a value. The 
						writer moves forward each time a value is written.
				 */
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
