package losim_simple_examples;

// public simu_or
public class Dog {
	String name;
    int age;

    // Constructor
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    void bark() {
        System.out.println("The dog " + name + " is barking.");
    }

    void fetch() {
    	System.out.println("The dog " + name + " fetches the ball.");
    }
}
