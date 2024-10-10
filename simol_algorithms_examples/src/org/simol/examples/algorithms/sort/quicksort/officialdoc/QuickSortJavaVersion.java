package org.simol.examples.algorithms.sort.quicksort.officialdoc;

////Example of the official documentation of clprolf.
public class QuickSortJavaVersion {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // The actual quicksort recursive method
    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high); // Partitioning the array
            quickSort(array, low, pivotIndex - 1);  // Recursively sort the left side
            quickSort(array, pivotIndex + 1, high); // Recursively sort the right side
        }
    }

    // Partitioning method, returns the index of the pivot element
    private int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot
        int i = (low - 1); // Index of the smaller element

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) { // If the current element is smaller than the pivot
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element to the correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // A method to print the array, to see the sorted result
    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Main method to run the sorting process
    public static void main(String[] args) {
        QuickSortJavaVersion sorter = new QuickSortJavaVersion();
        int[] array = {34, 7, 23, 32, 5, 62, 32, 6};
        
        System.out.println("Unsorted array:");
        sorter.printArray(array);

        sorter.sort(array);

        System.out.println("Sorted array:");
        sorter.printArray(array);
    }
}
