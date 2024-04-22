# Explaining clprolf language for beginners - concurrency and parallelism aids

## How do we handle concurrency in clprolf in details?

We have two modifiers, in clprolf, "long_action", and "prevent_missing_collision", for concurrency. It has been added to clarify this point in clprolf. These aids concern especially simu_real_world_obj, but are made for both simu_comp_as_worker or simu_real_world_obj.

### "long_action" or "@Long_action"
Some methods of simu_real_world_obj, like jumping, have duration, in time, and don't consist in just a states changing. For a video game and a class Player, the "jump" method would be a long action. Because the player is moving towards up, then falls. And this action could take some seconds, or almost one second. We want just to trigger it, like saying to the player object to jump, and that's all. We don't want to matter about the fact it takes some time, to keep simple and stay like in the real-world life. So the idea is to cut in steps the action, and to execute it step by step. It is not a new idea to do that, because we can find it in video game programming.

Let's take a simpler example with "fall()":

In clprolf:

```java
public simu_real_world_obj Player {
	//A field to manage a long action, is marked with the @Long_action annotation, in the clprolf language
	@Long_action
	private boolean isFalling = false;

	public prevent_missing_collision void place(int xWanted, int yWanted, MovementKind kindWantedMvt) {
		
		//Case where we quite the ladder too early
		if (isSettingUpLadder && checkPlayerInLadder()==null) {
			this.isSettingUpLadder = false;
		}
		
		//checking if xWanted and yWanted are not in collision, that's why it' s a "prevent_missing_collision" method.
		if (!checkIfInEnemyPosition(int xWanted, int yWanted)){ // We do not accept the movement, if it is not permit!
				//It's important to detect this now, because we could miss a collision,
				// if the player and the enemy are passing each other at the same time!
			this.x = xWanted;
			this.y = yWanted;
		}
	}

	//Trigger the fall action. We use the method as any other methods!
	public long_action void fallIfHole() {
		// Do not make him jump, if he is jumping at the moment
		if (!this.isFalling && !isJumping && !isSettingUpLadder &&!checkIfNoPlatformBehind()) {
			this.isFalling = true;
			this.continueFallIfHole();
		}
	}
	
	public long_action void continueFallIfHole() {
		if (this.isFalling && !this.isSettingUpLadder) {
			if (!isJumping && !checkIfNoPlatformBehind()) {
				this.place(x, y+1 true); //We're trying to move the player, if possible without collision.
			}
			else {
				this.isFalling = false; //The falling is ended when the player decides to jump, or he met a platform ground.
			}
		}
	}

	//The "long_action" "endLongActions()" method of each class, is called when we want to execute the next step of the long action!
	public long_action void endLongActions() {
		if (this.game.realiz.waitPaintCount(2)) { //does not wait, but it's quite like that! We have a counter of paint cycles, which increase at each repaint() calling, in a refresh loop in a cycles thread!
			continueJump();
		}
		if (this.game.realiz.waitPaintCount(2)) {
			continueFallIfHole(); //Notice that when the fall is ended, this call becomes useless, until a new fall is triggered by a fallIfHole() calling.
		}
		
	}
}
```

In the clprolf framework:

```java
@Simu_real_world_obj
public class Player {
	//A field to manage a long action, is marked with the @Long_action annotation, in the clprolf language
	@Long_action
	private boolean isFalling = false;

	@Prevent_missing_collision
	public void place(int xWanted, int yWanted, MovementKind kindWantedMvt) {
		
		//Case where we quite the ladder too early
		if (isSettingUpLadder && checkPlayerInLadder()==null) {
			this.isSettingUpLadder = false;
		}
		
		//checking if xWanted and yWanted are not in collision, that's why it' s a "prevent_missing_collision" method.
		if (!checkIfInEnemyPosition(int xWanted, int yWanted)){ // We do not accept the movement, if it is not permit!
				//It's important to detect this now, because we could miss a collision,
				// if the player and the enemy are passing each other at the same time!
			this.x = xWanted;
			this.y = yWanted;
		}
	}

	//Trigger the fall action. We use the method as any other methods!
	@Long_action
	public void fallIfHole() {
		// Do not make him jump, if he is jumping at the moment
		if (!this.isFalling && !isJumping && !isSettingUpLadder &&!checkIfNoPlatformBehind()) {
			this.isFalling = true;
			this.continueFallIfHole();
		}
	}
	
	@Long_action
	public void continueFallIfHole() {
		if (this.isFalling && !this.isSettingUpLadder) {
			if (!isJumping && !checkIfNoPlatformBehind()) {
				this.place(x, y+1 true); //We're trying to move the player, if possible without collision.
			}
			else {
				this.isFalling = false; //The falling is ended when the player decides to jump, or he met a platform ground.
			}
		}
	}

	//The "@Long_action" like "endLongActions()" method of each class, is called when we want to execute the next step of the long action!
	@Long_action
	public void endLongActions() {
		if (this.game.realiz.waitPaintCount(2)) { //does not wait, but it's quite like that! We have a counter of paint cycles, which increase at each repaint() calling, in a refresh loop in a cycles thread!
			continueJump();
		}
		if (this.game.realiz.waitPaintCount(2)) {
			continueFallIfHole(); //Notice that when the fall is ended, this call becomes useless, until a new fall is triggered by a fallIfHole() calling.
		}
		
	}
}
```

With this example of a quite simple 2D-platform game, we realize that things can quickly become tricky.
	
## Are they some aid for parallelism in clprolf ? "one_at_a_time", "turn_monitor", "for_every_thread"

Parallelism aids in clprolf does not replace the classical and robust implementation support in java. But it complements it with some features with a goal of clarity.

### What is "one_at_a_time"?
"one_at_a_time" is a method modifier (@One_at_a_time in the framework). It marks synchronized methods, or methods containing synchronized blocks. It emphasizes that only one thread a a time is doing the job, so we almost mimic a single thread application! And it's here the important point, many threads in turn for parts of code, it's like having a single thread application for these parts.

### And what is a "turn_monitor"?
Many "one_at_at_time" parts can work together, with a "turn_monitor" object which manages the turns of each one. A "turn_monitor"(@Turn_monitor in the framework), is a field modifier, for the lock objects. We can have the same turn_monitor for two methods of two different classes, in Enemy and Player classes. These monitor controls that one player and his enemies are executed quite like a single-threaded application, for the critical parts. So yes, the implementation of "one_at_a_time" requires "synchronized" keyword in java, and yes "turn_monitor" is a java lock object. Here, we are trying to abstract the programming to ease such difficult code writing.
The critical parts are often the "prevent_missing_collision" parts, so the place() method in the last example. The getPosition()-like methods also could need to be "one_at_a_time" with the same "turn_monitor".

### What does "for_evey_thread" mean?
"for_every_thread" marks the fields that are not cached inside the threads, so we can read their values from different threads, without worrying about cache problems.
So it is the "volatile" fields in java.It highlights the fact that the field is usable directly for multi-threading programming, being sure that we are reading the last value of the field.

## Are these aids valuable?
Parallelism is such a complex topic, perhaps even more than class designing, so the more support we have, the better. Imagine if you could just think that some parts of the software must work like in a single-thread stuff, and the other parts not. That's it! To achieve this goal, we introduced both "one_at_a_time", and "turn_monitor" that aims to simplify the way we have to manage many "one_at_a_time" parts working together.
The "for_every_thread" is the icing on the cake, and is not used is all cases. It reminds us that some stuff like caching variables could be used by compilers without being aware of this. So that's a way to indicate clearly this in the language, in a top-level manner. It does not aim to compete with "volatile", which is quite like the used implementation to achieve our goal.
We still have to write the java keywords, because clprolf doesn't want to replace here the existing java keywords, which are great and well-known.

### Is there a link between concurrency and parallelism aids?
Yeah. It is recommended, in clprolf, to first write a single-thread code handling concurrency, and to then think about if it needs more than that. So if we decide that yes, we then use the parallelism keywords. Remember too that the "prevent_missing_collision" part, which are often about setter methods, have, in multi-threading case, to be in "one_at_a_time", and sometimes the associated getters.

## What about the "dependent activities"? Is it a complex topic?

* Let's explain about the dependent_activity method modifier, or @Dependent_activity in the framework. This keyword is used in case of multithreaded applications. It shows that a method, thus an activity, depends on the execution of another activity, to be able to continue. So it is the other activity which emits the event indicating that the sleeping action can continue. This feature was first designed for the simu_real_world_obj, but it could be applied evidently for the simu_comp_as_worker!

* Let's take an example, of a mail box, of a unique mail. The mailbox can only contain one mail. So the threads which would want to read a mail, are blocked until someone has put a mail inside. The activity of reading is dependent of the activity of writing. When this happens, the reader have to send a notification, for the writer to act. And the writer would wait when the mailbox is still full. So reading and writing are depending activities, because we want here the thread to wait until the action could be performed. If we would want a non-blocking read, or write, it would not be the same.

Another class, a MailCustomer, uses the MailBox class. The sendMessage() and readMail() methods call the dependent_activity methods of MailBox. We can notice that only the dependent_activity methods are synchronized, and we add "@One_at_a_time" too. Read() and write() methods of MailBox, can not be called at the same time, so they have the same "turn_monitor". This monitor have to be used for the "notifyAll()" and "wait()" calls, because Java enforces to use the same monitor as the synchronization.

```java
package org.clprolf.simple_examples.parallelism.dependent;

import org.clprolf.simolframework.java.Simu_comp_as_worker;

/* An example of clprolf dependent activities (@Dependent_activity).
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
```

```java
package org.clprolf.simple_examples.parallelism.dependent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.clprolf.simolframework.java.Contracts;
import org.clprolf.simolframework.java.For_every_thread;

public class MailCustomer implements @Contracts Runnable {
	@For_every_thread
	private volatile boolean blnContinue;
	/**
	 * Time in ms, between the send and the read.
	 */
	private int waitingTime;
	private boolean sendFirst;
	
	public void setBlnContinue(boolean blnContinue) {
		this.blnContinue = blnContinue;
	}

	private String name;
	
	private OneMessageMailBox mailBox;
	
	public MailCustomer( String theName, OneMessageMailBox theBox, boolean blnSendFirst, int theWaitingTime) {
		this.blnContinue = true;
		this.name = theName;
		this.mailBox = theBox;
		this.waitingTime = theWaitingTime;
		this.sendFirst = blnSendFirst;
	}
	
	public void sendMessage(String theMessage) {
		this.displayLog("Trying to send a message from "+ name + ": " + theMessage);
		this.mailBox.write("Message from " + name + ": " + theMessage);
	}
	
	public String readMail() {
		String readMessage = mailBox.read();
		this.displayLog(name + " has read this mail: " + readMessage);
		return readMessage;
	}

	@Override
	public void run() {
		while (this.blnContinue) {
			String sentMessage = "Hello, it's " + name;
			
			if (sendFirst) {
				this.sendMessage(sentMessage);
			}
			else {
				String readMail = this.readMail();
			}
			
			try {
				Thread.sleep(waitingTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (!sendFirst) {
				this.sendMessage(sentMessage);
			}
			else {
				String readMail = this.readMail();
			}
			
		}
		
	}
	
	/* To simplify, we handle display directly in the simu_real_world_obj! */
	private void displayLog(String message) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");  
		   LocalDateTime now = LocalDateTime.now();  
		  
		System.out.println( dtf.format(now) + " " + message);
	}
}
```

```java
package org.clprolf.simple_examples.parallelism.dependent;

import org.clprolf.simolframework.java.Dependent_activity;
import org.clprolf.simolframework.java.For_every_thread;
import org.clprolf.simolframework.java.One_at_a_time;
import org.clprolf.simolframework.java.Prevent_missing_collision;
import org.clprolf.simolframework.java.Simu_real_world_obj;
import org.clprolf.simolframework.java.Turn_monitor;

/* A class with two dependent activities */
@Simu_real_world_obj
public class OneMessageMailBox {

		private String message;
		@For_every_thread //Notice that we can signal it, although we are not using volatile!
		private boolean full; //Not volatile here, because used in a synchronized block
		
		@Turn_monitor
		private Object mailBoxMonitor; //For not writing and reading at the same time!
										//But for manage dependent consequence too, so for the wait() and notify() calls.
			
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
```

Output:

Output: "
2024/02/06 21:21:22.911 Trying to send a message from Jenny: Hello, it's Jenny => Ok, received by Henry
2024/02/06 21:21:22.911 Trying to send a message from Mary: Hello, it's Mary	=> Ok, received by Jenny. The message has been sent after Henry reading.
2024/02/06 21:21:22.914 Henry has read this mail: Message from Jenny: Hello, it's Jenny => Ok. A proof of mail correctly sent.
2024/02/06 21:21:23.920 Jenny has read this mail: Message from Mary: Hello, it's Mary => Ok.
2024/02/06 21:21:23.920 Trying to send a message from Jenny: Hello, it's Jenny
2024/02/06 21:21:24.917 Trying to send a message from Henry: Hello, it's Henry
2024/02/06 21:21:24.932 Henry has read this mail: Message from Henry: Hello, it's Henry
2024/02/06 21:21:24.932 Jenny has read this mail: Message from Jenny: Hello, it's Jenny => Ok. Sent just as Henry received his own email.
2024/02/06 21:21:24.932 Trying to send a message from Jenny: Hello, it's Jenny
2024/02/06 21:21:25.916 Mary has read this mail: Message from Jenny: Hello, it's Jenny => Ok. Received without problem.
2024/02/06 21:21:25.916 Trying to send a message from Mary: Hello, it's Mary
2024/02/06 21:21:25.946 Jenny has read this mail: Message from Mary: Hello, it's Mary => Ok. Received without problem.
2024/02/06 21:21:25.946 Trying to send a message from Jenny: Hello, it's Jenny
2024/02/06 21:21:26.943 Trying to send a message from Henry: Hello, it's Henry
2024/02/06 21:21:26.959 Jenny has read this mail: Message from Jenny: Hello, it's Jenny => Ok, received the first sent, normal, the second was sleeping.
2024/02/06 21:21:26.959 Henry has read this mail: Message from Henry: Hello, it's Henry => Ok, the message has been sent just after the previous reading, which has unblocked the queue.
2024/02/06 21:21:26.959 Trying to send a message from Jenny: Hello, it's Jenny
2024/02/06 21:21:27.965 Jenny has read this mail: Message from Jenny: Hello, it's Jenny
2024/02/06 21:21:27.965 Trying to send a message from Jenny: Hello, it's Jenny
"

* The reasoning in these cases in much simplified, and we don't have to qualify the writer as a producer, or the read as consumer. We focuses on what are the more interesting for us, and we know immediately if we need such implementation or not.

So a clprolf dependent activity is a method that is dependent of another method, and a method which want to wait until the action could end.

* Performance consideration

"dependency_activity" should not impact at all performance results. It does not currently have semantic checking of a particular implementation, but it was designed to work with the low level library of java (as the example). So it should not impact the performance, because we did dependent activities without knowing it, while implementing stuff like producer-consumer.
