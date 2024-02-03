package simol.simple_examples.parallelism.hypermarket;


import org.simol.simolframework.java.Simu_comp_worker;

/* An example for parallelism, @One_at_a_time, @Turn_monitor, @For_every_thread
 * v1.0		20240203
 * 
 * Log:
 * 
 * "
2024/02/03 14:32:06: Hey, it's John: I'm beginning the wait in the first main queue! 
2024/02/03 14:32:08: Hey, it's John: I'm ending the wait in the first main queue  - Great, I'm going to a free checkout! 
2024/02/03 14:32:08: Hey, it's Robert: I'm beginning the wait in the first main queue! => We can see that John was blocking Robert in the first main queue. It's ok!
2024/02/03 14:32:09: Hey, it's John: I'm beginning the wait in the second main queue! 
2024/02/03 14:32:10: Hey, it's Robert: I'm ending the wait in the first main queue  - Great, I'm going to a free checkout! 
2024/02/03 14:32:10: Hey, it's Ryan: I'm beginning the wait in the first main queue! => Ryan was waiting for Robert. The system has not chosen him before, although he was waiting first.
2024/02/03 14:32:11: Hey, it's John: I'm ending the wait in the second main queue - Great, I'm going to a free checkout! 
2024/02/03 14:32:11: Hey, it's Robert: I'm beginning the wait in the second main queue! 
2024/02/03 14:32:12: Hey, it's Ryan: I'm ending the wait in the first main queue  - Great, I'm going to a free checkout! 
2024/02/03 14:32:12: Hey, it's John: I'm beginning the wait in the first main queue! 
2024/02/03 14:32:13: Hey, it's Robert: I'm ending the wait in the second main queue - Great, I'm going to a free checkout! 
2024/02/03 14:32:13: Hey, it's Ryan: I'm beginning the wait in the second main queue! => Ryan was waiting after Robert for the second main queue. It's ok!
2024/02/03 14:32:14: Hey, it's John: I'm ending the wait in the first main queue  - Great, I'm going to a free checkout! 
2024/02/03 14:32:14: Hey, it's Robert: I'm beginning the wait in the first main queue!
2024/02/03 14:32:15: Hey, it's Ryan: I'm ending the wait in the second main queue - Great, I'm going to a free checkout! => Ryan was in the second queue while Robert was in the first, it's ok!
2024/02/03 14:32:15: Hey, it's John: I'm beginning the wait in the second main queue! 
2024/02/03 14:32:16: Hey, it's Robert: I'm ending the wait in the first main queue  - Great, I'm going to a free checkout! 
2024/02/03 14:32:16: Hey, it's Ryan: I'm beginning the wait in the first main queue! 
2024/02/03 14:32:17: Hey, it's John: I'm ending the wait in the second main queue - Great, I'm going to a free checkout! 
"
 */
@Simu_comp_worker
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
