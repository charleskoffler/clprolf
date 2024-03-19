package simol.simple_examples.dog;

import org.simol.simolframework.java.Simu_comp_worker;

/*
 * A first simple example of simol. It's simulate a dog, using a simu_real_world_obj class
 */
// public simu_comp_as_worker DogQuickExample
@Simu_comp_as_worker
public class DogQuickExample {

	public static void main(String[] args) {
        Dog myDog = new Dog("Lassie", 3);

        myDog.bark();
        myDog.fetch();

	}

}
