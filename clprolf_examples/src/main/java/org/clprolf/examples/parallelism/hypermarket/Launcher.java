package org.clprolf.examples.parallelism.hypermarket;

import org.clprolf.framework.java.Worker_agent;

/* An example for parallelism, @One_at_a_time, @Turn_monitor, @For_every_thread
 * v1.0		20240203
 *
 */
@Worker_agent
public class Launcher {

	public static void main(String[] args) throws InterruptedException {
		Object firstMonitor, secondMonitor;
		firstMonitor = new Object();
		secondMonitor = new Object();
		
		Customer john = new Customer("John", firstMonitor, secondMonitor);
		Customer ryan = new Customer("Ryan", firstMonitor, secondMonitor);
		Customer robert = new Customer("Robert", firstMonitor, secondMonitor);
		
		Thread johnThread = new Thread(john); //Customer's life!
		johnThread.start();
		Thread.sleep(500); // Just to have a gap
		Thread ryanThread = new Thread(ryan); //Customer's life!
		ryanThread.start();
		Thread.sleep(500); // Just to have a gap
		Thread robertThread = new Thread(robert); //Customer's life!
		robertThread.start();
		
		Thread.sleep(30000);
		john.setBlnContinue(false); //Example of usage of @For_every_thread.
		ryan.setBlnContinue(false);
		robert.setBlnContinue(false);
	}

}
