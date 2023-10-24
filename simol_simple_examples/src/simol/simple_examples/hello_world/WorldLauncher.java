package simol.simple_examples.hello_world;

//Simple launch job for the computer!
//public simu_comp_worker WorldLauncher
public class WorldLauncher {
	public static void main(String[] args) {
		World myWorld;
		myWorld = new World("MINE");
	
		myWorld.hello();
	}
}
