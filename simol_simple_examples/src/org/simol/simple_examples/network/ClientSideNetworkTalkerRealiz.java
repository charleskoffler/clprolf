package org.simol.simple_examples.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Simu_comp_worker;

@Simu_comp_as_worker
public class ClientSideNetworkTalkerRealiz extends @Nature NetworkTalkerRealiz {

	public ClientSideNetworkTalkerRealiz(NetworkTalker theOwner) throws UnknownHostException, IOException  {
		super(theOwner);
		this.createSocket();
	}
	
	/**
	 * A method for create a client-side socket!
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	private void createSocket() throws UnknownHostException, IOException {
		Socket clientSideSocket = new Socket(SocketServerConfig.HOST, SocketServerConfig.PORT);
		this.setSocket(clientSideSocket);
	}
}
