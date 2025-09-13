---

# TALKING IN JAVA VERSUS TALKING IN CLPROLF – EXAMPLE

Java is great — but in Clprolf, we can say the same thing differently.
Let’s take an example with **QuickSort**, the famous and efficient sorting algorithm.

Both versions below (Java and Clprolf) produce the **same execution result**.
The difference lies in **design style** and **component responsibilities**.

---

## Java Version of QuickSort

```java
public class QuickSort {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

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

**Execution**

```
Unsorted array:
34 7 23 32 5 62 32 6 
Sorted array:
5 6 7 23 32 32 34 62
```

Here, we chose a **single class** (`QuickSort`) that:

* launches the program (contains `main`),
* sorts the array,
* partitions it,
* and even prints it.

This is **pure Java-style**: one class, multiple responsibilities.

---

## Clprolf Framework Version

In Clprolf, we separate these roles into **distinct components**:

* `@Agent` → QuickSort, the active sorting component.
* `@Worker_agent` → Printer, the worker that handles display.
* `@Worker_agent` → Launcher, the independent entry point (could also be `@Worker_agent(Role.STATIC)`).

This separation makes each component respect the **Single Responsibility Principle (SRP)**.

```java
@Agent // QuickSort is an active agent performing the sorting
public class QuickSort {

    private Printer workerAgent;

    public QuickSort(Printer workerAgent) {
        this.workerAgent = workerAgent;
    }

    public void sort(int[] array) {
        workerAgent.printArray("Unsorted array:", array);
        quickSort(array, 0, array.length - 1);
        workerAgent.printArray("Sorted array:", array);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    @Underst // Highlighting complexity
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        // Example: before partitioning, [34, 7, 23, 32, 5, 62, 32, 6] (pivot = 6)
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Example: after partitioning, pivot (6) is at index 2
        return i + 1;
    }
}

@Worker_agent // Worker agent dedicated to printing
public class Printer {

    public void printArray(String message, int[] array) {
        System.out.println(message);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

@Worker_agent // Independent launcher
public class Launcher {
    public static void main(String[] args) {
        Printer worker = new Printer();
        QuickSort sorter = new QuickSort(worker);

        int[] array = {34, 7, 23, 32, 5, 62, 32, 6};
        sorter.sort(array);
    }
}
```

**Execution**

```
Unsorted array:
34 7 23 32 5 62 32 6 
Sorted array:
5 6 7 23 32 32 34 62
```

---

## Conclusion

Both versions do the same job.

* The **Java version** is compact and traditional: one class, many responsibilities.
* The **Clprolf version** separates roles into components:

  * QuickSort (agent),
  * Printer (worker agent),
  * Launcher (worker agent).

This clarity makes systems easier to maintain, especially when they grow large and involve multiple developers.
Clprolf ensures that code remains **SRP-compliant** and closer to real-world metaphors, even as inheritance chains evolve.

A good Java programmer can of course enforce SRP and design patterns manually.
But with Clprolf, these principles are **built into the language** — making clean design feel natural and even fun.

---
