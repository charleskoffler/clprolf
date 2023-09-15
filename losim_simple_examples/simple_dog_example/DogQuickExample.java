package losim_simple_examples;

/*
 * A first simple example of losim. It's simulate a dog, using a simu_or class.
 */
// public simu_lapo DogQuickExample
public class DogQuickExample {

	public static void main(String[] args) {
        Dog myDog = new Dog("Lassie", 3);

        myDog.bark();
        myDog.fetch();

	}

}
