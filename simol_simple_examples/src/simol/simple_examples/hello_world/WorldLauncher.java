package simol.simple_examples.hello_world;

//Simple launch job for the computer!
//public simu_alfoc WorldLauncher
public class WorldLauncher {
	public static void main(String[] args) {
		World myWorld;
		myWorld = new World("MINE");
	
		myWorld.hello();
	}
}
