package simol.simple_examples.dog;

// public simu_rewo
public class Dog {
	private String name;
	private int age;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    // Constructor
    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods
    public void bark() {
        System.out.println("The dog " + name + " is barking.");
    }

    public void fetch() {
    	System.out.println("The dog " + name + " fetches the ball.");
    }
}
