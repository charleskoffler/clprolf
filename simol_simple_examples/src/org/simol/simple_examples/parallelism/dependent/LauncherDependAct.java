package org.simol.simple_examples.parallelism.dependent;

import org.simol.simolframework.java.Simu_comp_as_worker;

/* An example of simol dependent activities (@Dependent_activity).
 * Example of a producer/consumer, with a mail box.
 * Charles Koffler. 20240206
 */
@Simu_comp_as_worker //A program for execute our tests!
public class LauncherDependAct {

	public static void main(String[] args) {
		MailCustomer jenny, henry, mary;
		OneMessageMailBox mailBox = new OneMessageMailBox();
		
		//Here girls send first!
		jenny = new MailCustomer("Jenny", mailBox, true, 1000);
		henry = new MailCustomer("Henry", mailBox, false, 2000);
		mary = new MailCustomer("Mary", mailBox, true, 3000);
		
		Thread jennyThread  = new Thread(jenny);
		Thread henryThread = new Thread(henry);
		Thread maryThread = new Thread(mary);
		
		//To simplify, the threads are starting together.
		jennyThread.start();
		
		henryThread.start();
		
		maryThread.start();
		
		try {
			Thread.sleep(30000); //30s.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		jenny.setBlnContinue(false);
		henry.setBlnContinue(false);
		mary.setBlnContinue(false);
	}
}
