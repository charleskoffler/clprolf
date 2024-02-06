package org.simol.simple_examples.parallelism.dependent;

import org.simol.simolframework.java.Dependent_activity;
import org.simol.simolframework.java.For_every_thread;
import org.simol.simolframework.java.One_at_a_time;
import org.simol.simolframework.java.Prevent_missing_collision;
import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.Turn_monitor;

/* A class with two dependent activities */
@Simu_real_world_obj
public class OneMessageMailBox {

		private String message;
		@For_every_thread //Notice that we can signal it, although we are not using volatile!
		private boolean full; //Not volatile here, because used in a synchronized block
		
		@Turn_monitor
		private Object mailBoxMonitor; //For not writing and reading at the same time!
										//But for manage dependency consequence too, so for the wait() and notify() calls.
			
		public OneMessageMailBox() {
			mailBoxMonitor = new Object();

		}
		
		@Dependent_activity  /* read() is considered as a dependent activity, because his execution could depend of the write() method. */
		@One_at_a_time
		public String read() {
			synchronized(mailBoxMonitor) {
				while (!this.full) {
					try {
						this.mailBoxMonitor.wait(); // A classical guarded block, important for two reasons:
						// - Multiple readers might be awoken simultaneously, but only one can re-obtain the lock at a time. Another reader might read first, requiring re-checking the condition.
						// - We use a single monitor (mailBoxMonitor) due to Java's synchronization constraints. Notifications could wake up any waiting threads (readers or writers), so each must verify if their condition is met after waking.

					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
				
				this.full = false; //We just emptied the box.
				this.mailBoxMonitor.notifyAll(); //We need mails.
				
				return this.message;
			}
		}
		
		@Dependent_activity
		@One_at_a_time
		public void write(String message) {
			synchronized(mailBoxMonitor) {
				while (this.full) {
					try {
						this.mailBoxMonitor.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
				this.message = message;
				this.full = true; //The box is now full!
				this.mailBoxMonitor.notifyAll(); //We notify the waiting readers!
			}
		}
}
