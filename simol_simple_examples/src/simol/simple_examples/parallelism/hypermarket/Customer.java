package simol.simple_examples.parallelism.hypermarket;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.For_every_thread;
import org.simol.simolframework.java.One_at_a_time;
import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.Turn_monitor;

/* To simplify the example, we are supposing that it takes two seconds for one checkout to be free to take one customer, in the first main queue. */
@Simu_real_world_obj
public class Customer implements @Contracts Runnable {
	
	private String name;
	@For_every_thread
	private volatile boolean blnContinue; //The main thread would say to stop!
	
	public void setBlnContinue(boolean blnContinue) {
		this.blnContinue = blnContinue;
	}

	public String getName() {
		return name;
	}
	
	public void run() {
		this.blnContinue = true;
		while (blnContinue) {
			//He is crazy: He is passing in loop in checkouts, first in the firstMainQueue, then in the second!
			this.waitToFirstMainQueue();
			try {
				Thread.sleep(200); //Time to pass to a checkout.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.waitToSecondMainQueue();
			try {
				Thread.sleep(200); //Time to pass to a checkout.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Turn_monitor
	private Object firstQueueMonitor;

	@Turn_monitor
	private Object secondQueueMonitor;

	public Customer(String name, Object theFirstQueueMonitor, Object theSecondQueueMonitor){
		this.name = name;
		this.firstQueueMonitor = theFirstQueueMonitor;
		this.secondQueueMonitor = theSecondQueueMonitor;
	}

	public void chooseProducts(){
	}

	/**
	 * The main queue is a unique queue to wait after a checkout to become free, among many checkouts.
	 */
	@One_at_a_time
	public void waitToFirstMainQueue(){
		synchronized(firstQueueMonitor){
			displayLog("I'm beginning the wait in the first main queue! ");
		//(...)It takes 2 seconds for a checkout to become free, once we are in head on the main queue.
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayLog("I'm ending the wait in the first main queue  - Great, I'm going to a free checkout! ");
		}
	}

	@One_at_a_time
	public void waitToSecondMainQueue(){
		synchronized(secondQueueMonitor){
			displayLog("I'm beginning the wait in the second main queue! ");
		//(...)It takes 1 seconds for a checkout to become free, once we are in head on the main queue.
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayLog("I'm ending the wait in the second main queue - Great, I'm going to a free checkout! ");
		}
	}

	/* To simplify, we handle display directly in the simu_real_world_obj! */
	private void displayLog(String message) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		  
		System.out.println( dtf.format(now) + ": Hey, it's " + name + ": " + message);
	}
}
