# Simol's "@Underst" for Beginners: Understanding the Non-Obvious

This explanation dives into the "@Underst" method modifier in Simol, a helpful tool for marking code that deals with non-intuitive algorithms.

## What is "@Underst"?

   It's a flag placed on methods to indicate the algorithm might not be immediately clear.
    
   This can be due to differences between human problem-solving and computer capabilities.

## Why Use "@Underst"?

   It helps developers identify potentially complex code sections at a glance.
    
   It promotes code maintainability by highlighting areas that might require more explanation.

## Examples:

   Sorting algorithms like bubble sort are a classic example.
   Humans can directly move elements, but computers need step-by-step instructions.
   Bubble sort's "swapping two elements at a time" approach, while efficient, isn't as direct as human sorting.

## Where is "@Underst" Used?

   It applies to both simu_real_world_obj (modeling real-world objects) and simu_comp_worker (computational worker) classes.
   It emphasizes that the complexity lies in making the computer understand, not necessarily in the core goal itself.

## Simol Code Example:

The provided example showcases a BubbleSorter class with:

   getElements (straightforward method)
    
   sort (marked with @Underst as the sorting algorithm might not be obvious)

## Key Takeaways:

   "@Underst" promotes code clarity and maintainability.
    
   Simol encourages keeping implementations straightforward, with "@Underst" highlighting exceptions.

## Overall:

Simol's "@Underst" helps developers identify and potentially document less intuitive code sections, making the codebase easier to understand and maintain for everyone.
