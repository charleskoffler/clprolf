package org.simol.simple_examples.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.simol.simolframework.java.Role;
import org.simol.simolframework.java.Simu_real_world_obj;
import org.simol.simolframework.java.With_compat;

/**
 * A talker who could discuss with someone, threw a network. Here, it is seen as a human talker!
 * @author Charles Koffler
 *
 */
@Simu_real_world_obj(Role.HUMAN_EXPERT)
public class NetworkTalker {
	public static enum MSG_DIRECTION {
		SAID, HEARD
	}
	public static class Message {
		public String sentence;
		public MSG_DIRECTION direction;
		
		public Message(String theMsg, MSG_DIRECTION theDirect) {
			this.sentence = theMsg;
			this.direction = theDirect;
		}
	}
	
	private String name;
	private @With_compat List<Message> conversation; 
	
	/* Our talker has a state. He keeps his conversation. */
	public List<Message> getConversation() {
		return conversation;
	}

	public String getName() {
		return name;
	}

	//Associated realization worker.
	protected NetworkTalkerRealiz realiz;
	
	private void commonInits(String theName) {
		this.name = theName;
		this.conversation = new ArrayList<Message>();
	}
	/**
	 * Constructor for a client-side network talker. Creates a client socket.
	 * @param theName
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public NetworkTalker(String theName) throws UnknownHostException, IOException {
		this.realiz = new ClientSideNetworkTalkerRealiz(this);
		this.commonInits(theName);
	}
	
	/**
	 * Used for the case of a server-side socket, so it is created by the server of sockets.
	 * @param theName
	 * @param givenSocket
	 * @throws IOException
	 */
	public NetworkTalker(String theName, Socket givenSocket) throws IOException {
		this.commonInits(theName);
		this.realiz = new NetworkTalkerRealiz(this);
		this.realiz.setSocket(givenSocket);
	}
	
	/**
	 * The talker is talking!
	 * @param sentence
	 */
	public void saySentence(String sentence) {
		try {
			Message msg = new Message(sentence, MSG_DIRECTION.SAID);
			this.conversation.add(msg);
			
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
			
			Message msg = new Message(sentence, MSG_DIRECTION.HEARD);
			this.conversation.add(msg);
			
			return sentence;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public void stopTalking() throws IOException {
		this.realiz.display("Stop talking");
		this.realiz.close();
		
		this.realiz.displayConversation();
	}
}
