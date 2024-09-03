package simol.simple_examples.hello_world.first_way;

import org.simol.simolframework.java.Comp_as_worker;
import org.simol.simolframework.java.Simu_comp_as_worker;

/* The simple way to do this! */
//Launch an application is a computer worker job!
@Comp_as_worker
public class Main {

	public static void main(String[] args){
		System.out.println("Hello world!"); //Notice that System should be viewed as a simu_comp_as_worker, and the stream out, a simu_real_world_obj
	}
}
