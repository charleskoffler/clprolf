package clprolf.wrappers.java.net;

import java.net.Socket;

import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;

/**
 * The wrapper classes based on inheritance, can replace Java equivalent thanks to polymorphism.
 * 
 * An abstraction of the socket notion, using Java class Socket.
 * @author Charles Koffler
 *
 */
@Forced_inh //We can not inherit from a Java class, except with this!
@Abstraction
public class ClpSocket extends @Nature Socket {

}
