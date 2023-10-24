package simol.simple_examples.dog;

/*
 * A first simple example of simol. It's simulate a dog, using a simu_real_world_obj class
 */
// public simu_comp_worker DogQuickExample
public class DogQuickExample {

	public static void main(String[] args) {
        Dog myDog = new Dog("Lassie", 3);

        myDog.bark();
        myDog.fetch();

	}

}
