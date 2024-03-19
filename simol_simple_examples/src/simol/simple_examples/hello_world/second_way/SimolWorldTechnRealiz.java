package simol.simple_examples.hello_world.second_way;

import org.simol.simolframework.java.Simu_comp_as_worker;

/*
 * A worker to do displays, and so on, for render the simulation on computer.
 * Without it, it would be a simulation only in memory, not directly visible!
 * If things are very simple, you can do technical stuff directly in the simulation class!
 */
@Simu_comp_as_worker
public class SimolWorldTechnRealiz {
	//The associated simu_real_world object. It could be useful to have it, especially for fields.
	private SimolWorld owner;
	
	public SimolWorldTechnRealiz(SimolWorld theOwner){
		this.owner = theOwner;
	}

	public void display(String message){
		//(...) A complicated display here.
		// But I do it simple for the example
		System.out.println(message); //System could represent the operating system, so it's the computer worker who play this job!
	}
}
