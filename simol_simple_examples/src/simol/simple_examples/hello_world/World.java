package simol.simple_examples.hello_world;

//public simu_rewo World
public class World {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public World(String name) {
		this.name = name;
	}
	
	public void hello() {
		System.out.println("Hello world " + this.name);
	}
}
