package org.simol.simple_examples.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.simol.simolframework.java.Role;
import org.simol.simolframework.java.Simu_real_world_obj;

/**
 * A talker who could discuss with someone, threw a network. Here, it is seen as a human talker!
 * @author Charles Koffler
 *
 */
@Simu_real_world_obj(Role.HUMAN_EXPERT)
public class NetworkTalker {
	private String name;
	
	public String getName() {
		return name;
	}

	//Associated realization worker.
	protected NetworkTalkerRealiz realiz;
	
	/**
	 * Constructor for a client-side network talker. Creates a client socket.
	 * @param theName
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public NetworkTalker(String theName) throws UnknownHostException, IOException {
		this.realiz = new ClientSideNetworkTalkerRealiz(this);
		this.name = theName;
	}
	
	/**
	 * Used for the case of a server-side socket, so it is created by the server of sockets.
	 * @param theName
	 * @param givenSocket
	 * @throws IOException
	 */
	public NetworkTalker(String theName, Socket givenSocket) throws IOException {
		this.name = theName;
		this.realiz = new NetworkTalkerRealiz(this);
		this.realiz.setSocket(givenSocket);
	}
	
	/**
	 * The talker is talking!
	 * @param sentence
	 */
	public void saySentence(String sentence) {
		try {
			this.realiz.display("Message said: " + sentence); //This server sends lines, terminated by "\n".
			this.realiz.writeLine(sentence);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The talker listen to a sentence from the other talker.
	 * @return
	 */
	public String hearSentence() {
		try {
			String sentence =  this.realiz.readLine();
			this.realiz.display("Message heard: " + sentence);
			return sentence;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public void stopTalking() throws IOException {
		this.realiz.display("Stop talking");
		this.realiz.close();
	}
}
