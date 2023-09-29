package simol.simple_examples;

/*
 * A first simple example of simol. It's simulate a dog, using a simu_rewo class
 */
// public simu_alfoc DogQuickExample
public class DogQuickExample {

	public static void main(String[] args) {
        Dog myDog = new Dog("Lassie", 3);

        myDog.bark();
        myDog.fetch();

	}

}
