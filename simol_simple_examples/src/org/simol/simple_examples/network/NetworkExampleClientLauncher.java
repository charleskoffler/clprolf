package org.simol.simple_examples.network;

import java.io.IOException;
import java.net.UnknownHostException;

import org.simol.simolframework.java.Simu_comp_worker;

/**
 * The client application. They are talking together, in the two directions.
 * @author Charles Koffler
 *
 */
@Simu_comp_worker
public class NetworkExampleClientLauncher {
	public static void main(String[] args) throws UnknownHostException, IOException {
		NetworkTalker clientTalker = new NetworkTalker("The client");
		
		while (!(clientTalker.hearSentence().equals("q"))) {
			clientTalker.saySentence("Well done!");
		}
		clientTalker.saySentence("Good bye!"); //Just for answer.
		clientTalker.stopTalking();
	}
}
