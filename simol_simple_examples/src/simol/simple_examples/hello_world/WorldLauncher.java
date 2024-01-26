package simol.simple_examples.hello_world;

import org.simol.simolframework.java.Simu_comp_worker;

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
