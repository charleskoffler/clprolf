package simol.simple_examples.hello_world.second_way;

import org.simol.simolframework.java.Simu_real_world_obj;

//Another way to do this, perhaps a bit more elegant, in simol:

@Simu_real_world_obj
public class SimolWorld {
	private SimolWorldTechnRealiz ourTechnRealiz;

	public SimolWorld(){
		this.ourTechnRealiz = new SimolWorldTechnRealiz(this);
	}

	public void say(String message){
		ourTechnRealiz.display("A message from Simol's world: " + message);
	}

}