# TALKING IN JAVA VERSUS TALKING IN CLPROLF EXAMPLE

Java is great, but in clprolf we can say the same thing differently!
Let's take an example of a quick sort implementation, the famous and efficient sorting algorithm.
These examples are present in the source code examples of the GitHub repository.

## The Java version of our quick sort

```java
public class QuickSort {

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
        QuickSort sorter = new QuickSort();
        int[] array = {34, 7, 23, 32, 5, 62, 32, 6};
        
        System.out.println("Unsorted array:");
        sorter.printArray(array);

        sorter.sort(array);

        System.out.println("Sorted array:");
        sorter.printArray(array);
    }
}
```

Execution:
Unsorted array:
34 7 23 32 5 62 32 6 
Sorted array:
5 6 7 23 32 32 34 62

Here we chose to have a single class, QuickSort, acting both as a launcher, and as an instance object. The main method has to call the sort method, then the printArray(). printArray() is just a public method integrated in the QuickSort class. The object can sort, and partition. It looks like pure Java-style.

## The clprolf Framework version of the same algorithm

It is a nice example of clprolf Framework in action. QuickSort is an agent, here, a component acting as a sorter agent. This component has a knowledge, is autonomous. The class contains a worker agent, obtained by dependency injection. We could have chosen "@With_compat PrinterVersion" and rather pass a @Compat_interf_version object.
The agent is able to sort, and uses its worker agent to display the results, before and after. It is quite like a technical agent, for secondary tasks.
The quickSort method is quite intuitive, but the partition method is qualified @Underst. The quick sort algorithm takes advantage of the computer's specific features. This is why we prefer to explicitly give an example of the job, before and after.

The launcher is an independent class, and don't have to call a printArray() method. It just asks the quick sorter to sort the array. It is a launcher, so its role could be @Comp_as_worker, even if the launching method is static.
The clprolf components respect the single responsability principle, are quite easy to master, and the readability of the code seems nice.

```java
// QuickSort implementation in Clprolf with worker_agent for printing

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
```

Execution:

Unsorted array:
34 7 23 32 5 62 32 6 
Sorted array:
5 6 7 23 32 32 34 62 

## Conclusion

This is two ways of doing the same thing. The execution results are identical. The Java source is organized, in pure object-oriented programming style. It does the job. But we can like the clprolf version when thinking at the moment where our system will have much components, and if many people have to work on it together.
It is sometimes hard to understand others code. And this is interesting to have inherent guarantees that the code will remain clear, even despite future inheritance.
In both versions we have components, but in clprolf we have SRP-like components. The clprolf components are always close to real-world counterparts, if we need to think with metaphors.
Are you convince or not? Sure a good Java programmer would apply the OOP design patterns and principles, I agree! But clprolf is fun by allowing to apply them without too much care about this.

Thank you to chatGPT4o for QuickSort example, and working with me on that example.