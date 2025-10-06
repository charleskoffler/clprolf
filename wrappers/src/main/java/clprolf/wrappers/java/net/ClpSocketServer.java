package clprolf.wrappers.java.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

import org.clprolf.framework.java.Agent;
import org.clprolf.framework.java.Forced_inh;
import org.clprolf.framework.java.Nature;
import org.clprolf.framework.java.Simu_real_obj;

/*
 * The initial Java name has been changed to "SocketServer", instead of "ServerSocket".
 */

@Forced_inh
@Agent
public class ClpSocketServer extends @Nature ServerSocket {

	public ClpSocketServer() throws IOException {
        super();
    }

    public ClpSocketServer(int port) throws IOException {
        super(port);
    }

    public ClpSocketServer(int port, int backlog) throws IOException {
        super(port, backlog);
    }

    public ClpSocketServer(int port, int backlog, InetAddress bindAddr) throws IOException {
        super(port, backlog, bindAddr);
    }

}
