package org.simol.simple_examples.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import org.simol.simolframework.java.Simu_comp_as_worker;

/**
 * Simol simple example for network programming, here with sockets.
 * Example of a single chat between two applications, and a server waiting for a single connection.
 * 
 * v1.1	2024/02/09
 * @author Charles Koffler.
 *
 */
@Simu_comp_as_worker
public class NetworkExampleServerLauncher {
	
	public static void main(String[] args) throws IOException {
		/* We could see the Java class ServerSocket as a server of sockets ! */
		ServerSocket socketServer = new ServerSocket(SocketServerConfig.PORT);
		
		System.out.println("Server started, waiting for a demand of connection");
		//The server is doing his job, he is waiting for a request of connection.
		Socket serverSocket = socketServer.accept();
		
		System.out.println("A connection has been established, sockets are plugged in");
		
		//We now need one of the talker, in this chat. Two sockets have been plugged in.
		NetworkTalker serverSideTalker = new NetworkTalker("The server", serverSocket);
		
		Scanner scanner = new Scanner(System.in);
		String wantedSentence;
		
		do {
			System.out.println("Enter a sentence, 'q' to stop");
			wantedSentence = scanner.nextLine();
			serverSideTalker.saySentence(wantedSentence);
			serverSideTalker.hearSentence();
		}while ( !wantedSentence.equals("q"));
		
		serverSideTalker.stopTalking();
		scanner.close();
	}
}
