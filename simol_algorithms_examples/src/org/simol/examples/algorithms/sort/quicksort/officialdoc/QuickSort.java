package org.simol.examples.algorithms.sort.quicksort.officialdoc;

import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Underst;

//QuickSort implementation in Clprolf with worker_agent for printing
//Example of the official documentation of clprolf.

@Agent // Declaring QuickSort as an active agent performing the sorting
public class QuickSort {

 // Attribute to hold the worker_agent (Printer)
 private Printer workerAgent;

 // Constructor to initialize the workerAgent
 public QuickSort(Printer workerAgent) {
     this.workerAgent = workerAgent;
 }

 public void sort(int[] array) {
     workerAgent.printArray("Unsorted array:", array); // Print before sorting
     quickSort(array, 0, array.length - 1);
     workerAgent.printArray("Sorted array:", array); // Print after sorting
 }

 // The actual quicksort recursive method
 private void quickSort(int[] array, int low, int high) {
     if (low < high) {
         int pivotIndex = partition(array, low, high); // Partitioning the array
         quickSort(array, low, pivotIndex - 1);  // Recursively sort the left side
         quickSort(array, pivotIndex + 1, high); // Recursively sort the right side
     }
 }

 // Partitioning method, marked with underst to show its complexity
 @Underst
 private int partition(int[] array, int low, int high) {
     int pivot = array[high]; // Choose the last element as the pivot (array[high] = 6)
     int i = (low - 1); // Index of the smaller element

     // EXAMPLE(it is an "underst" method, so we could give a before and after example.
     // Before partitioning, array: [34, 7, 23, 32, 5, 62, 32, 6]
     // Pivot = 6

     // Loop through elements between low and high
     for (int j = low; j < high; j++) {
         // If the current element is smaller than the pivot
         if (array[j] < pivot) {
             i++; // Move the boundary of smaller elements
             // Swap array[i] and array[j] to ensure smaller elements come before larger ones
             int temp = array[i];
             array[i] = array[j];
             array[j] = temp;
         }
     }

     // Swap the pivot element (array[high]) with array[i+1]
     // This puts the pivot in its correct sorted position
     int temp = array[i + 1];
     array[i + 1] = array[high];
     array[high] = temp;

     // After partitioning, array: [5, 7, 6, 32, 34, 62, 32, 23]
     // Pivot (6) is now at index 2
     // Elements to the left of pivot (5, 7) are smaller, and elements to the right are larger or equal

     // Return the index of the pivot element, which is now in the correct position
     return i + 1;
 }
}
