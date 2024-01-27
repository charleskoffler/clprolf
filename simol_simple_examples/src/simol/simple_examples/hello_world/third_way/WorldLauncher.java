package simol.simple_examples.hello_world.third_way;

import org.simol.simolframework.java.Simu_comp_worker;

//Another way to do an hello 

//Simple launch job for the computer!
//public simu_comp_worker WorldLauncher
@Simu_comp_worker
public class WorldLauncher {
	public static void main(String[] args) {
		World myWorld;
		myWorld = new World("MINE");
	
		myWorld.hello();
	}
}
