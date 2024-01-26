package simol.simple_examples.hello_world;

import org.simol.simolframework.java.Simu_real_world_obj;

//public simu_real_world_obj World
@Simu_real_world_obj
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
