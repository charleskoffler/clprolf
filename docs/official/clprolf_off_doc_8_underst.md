# "underst" method modifier

This chapter is about the "underst" method modifier, or "@Underst" in the clprolf framework
It intends to mark particular methods of classes. "underst" means "understanding". It is placed to precise in the code that the algorithm is not intuitive, not straightforward, because of differences between computers abilities and human abilities. It can concerned simu_real_world_obj, as well as simu_comp_as_worker classes. Even with human-like algorithms, such we are using in algol-like languages, it can be tricky to write some jobs. For example, sorting algorithms, are often a bit different than the human way.
Let's take the bubble sort, as an example, and imagine we mimic the bubble sort with a human expert. So the human reverses two by two the elements, and pass many times the array until there is no change to make. You know, a real-world human, when sorting, would directly pull the higher elements up. But we can not do this to a computer, and so we have to find an algorithm to explain that to him. This algorithm here is to reverse two by two the elements to pull up the higher, and this is quite efficient. So we teach the computer with a non direct algorithm, how to do. This non trivial algorithm should be marked "underst" (or @Underst) in clprolf, so we can see at a glance the more complicated code. This is true for all kind of classes, simu_real_world_obj, as well as simu_comp_as_worker.
So not forget that "understanding" here, aims to mean "make the computer understand", and nothing more.

In clprolf:

```java

public simu_real_worl_obj BubbleSorter {
	private int[] theElements;
	public int[] getElements(){
		return this.theElements;
	}

	public BubbleSorter(int[] theArray){
		this.theElements = theArray;
	}

	public underst void sort(){
	//(...)
	}

}
```

In the clprolf java framework:

```java

@Simu_real_worl_obj
public class BubbleSorter {
	private int[] theElements;
	public int[] getElements(){
		return this.theElements;
	}

	public BubbleSorter(int[] theArray){
		this.theElements = theArray;
	}

	@Underst
	public void sort(){
	//(...)
	}

}
```

"underst", or @Underst, permits to ensure that all clprolf code remains understandable. Even the less intuitive code has a simple goal, just make understand the job to the computer. So in clprolf, all methods implementations should be quite straightforward, because either they are not "underst", either they are "underst".
There is often an idea of being aware of keeping simple about implementations, behind clprolf code and designs.