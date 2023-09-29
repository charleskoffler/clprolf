package simol_simple_examples;

// public simu_rewo
public class Dog {
	String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println("The dog " + name + " is barking.");
    }

    void fetch() {
    	System.out.println("The dog " + name + " is fetching the ball.");
    }
}
