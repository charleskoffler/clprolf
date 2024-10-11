package clprolf.wrappers.java.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;

import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Role;
import org.simol.simolframework.java.Simu_real_obj;

/*
 * The initial Java name has been changed to "SocketServer", instead of "ServerSocket".
 */

@Forced_inh
@Simu_real_obj(Role.EXPERT_COMPONENT) //An expert component in serving sockets
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
