package simol.simple_examples.hello_world.second_way;

import org.simol.simolframework.java.Simu_comp_worker;

//An elegant way to do this.

//Launch an application is a computer worker job!
@Simu_comp_worker
public class HelloMain {
	
	public static void main(String[] args){
		SimolWorld world = new SimolWorld();
		world.say("Hello world!");
	}

}