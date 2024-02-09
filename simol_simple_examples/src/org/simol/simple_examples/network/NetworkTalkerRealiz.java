package org.simol.simple_examples.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import org.simol.simolframework.java.Simu_comp_worker;

/**
 * The worker for handling computer lower level tasks, associated with a NetworkTalker!
 * @author Charles Koffler
 *
 */
@Simu_comp_worker
public class NetworkTalkerRealiz {
	/**
	 * In some cases, owner could be useful, especially to access fields to display, and this kind of stuff.
	 */
	protected NetworkTalker owner;

	private Socket theSocket;
	private PrintWriter writer;
	private BufferedReader reader;
	
	/**
	 * The socket dependency have to be injected later, with setSocket().
	 * @param theOwner
	 */
	public NetworkTalkerRealiz(NetworkTalker theOwner) {
		this.owner = theOwner;
	}
	
	/**
	 * The way to inject this dependency.
	 * @param socket
	 * @throws IOException
	 */
	public void setSocket(Socket socket) throws IOException {
		this.theSocket = socket;
		//the writer
		//First we obtain a stream. A stream could be viewed as a real-world stream.
		OutputStream theOutputStream = this.theSocket.getOutputStream();
		//A writer could be viewed as a @Simu_real_world_obj(Role.HUMAN_EXPERT), a real-world writer.
		writer = new PrintWriter(theOutputStream);
		
		//The reader
		reader = new BufferedReader(new InputStreamReader(this.theSocket.getInputStream()));
	}
	
	public void writeLine(String message) throws IOException {
		writer.println(message);
		writer.flush();
	}
	
	public String readLine() throws IOException {
		return reader.readLine();
	}
	
	public void display(String theString) {
		System.out.println(this.owner.getName() + ": " + theString); //Here, an example of the need to have the owner in the technical class.
	}
	
	public void close() throws IOException {
		theSocket.close();
	}
}
