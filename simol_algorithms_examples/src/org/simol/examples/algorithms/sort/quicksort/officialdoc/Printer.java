package org.simol.examples.algorithms.sort.quicksort.officialdoc;

import org.simol.simolframework.java.Worker_agent;

@Worker_agent // Declaring a worker agent
public class Printer {

    // The worker agent that handles printing the array
    public void printArray(String message, int[] array) {
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
