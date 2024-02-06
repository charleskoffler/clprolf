package org.simol.simple_examples.parallelism.dependent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.For_every_thread;

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
