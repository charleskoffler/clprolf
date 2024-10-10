package org.simol.examples.algorithms.sort.quicksort.officialdoc;

import org.simol.simolframework.java.Comp_as_worker;

@Comp_as_worker
public class Launcher {
// Main method to run the sorting process
    public static void main(String[] args) {
        Printer worker = new Printer(); // Create the worker_agent (Printer)
        QuickSort sorter = new QuickSort(worker); // Inject the worker_agent into QuickSort agent

        int[] array = {34, 7, 23, 32, 5, 62, 32, 6};

        sorter.sort(array); // The QuickSort agent sorts the array with the help of worker_agent
    }
}
