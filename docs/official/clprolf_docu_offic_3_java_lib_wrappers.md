# LEARNING THE CLASS ROLES THROUGH JAVA WRAPPERS

## The Java wrappers project

A project exists, in the clprolf sources, in the package clprolf.wrappers.java.
It shows examples of class roles, in writing wrappers for the Java Standard Library. The wrappers are truly easily usable directly, thanks to the polymorphism, to replace the equivalent Java classes or interfaces.

## The examples

### The ClpSocket wrapper example

The ClpSocket class is an "@Abstraction" here. We use "@Forced_inh" in case of Java inheritance by a clprolf class, because it is not natural nor allowed.
We prefer an abstraction role, because the socket is an object with an abstract concept. We could have chose equivalent roles, but the best fit for such system abstractions is this.

```java
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
```

### The ClpSocketServer wrapper

In this clprolf wrapper, we have to change the name of the class, considering in clprolf that it is quite a server of sockets.
That said, we chose the @Simu_real_obj(Role.EXPERT_COMPONENT), because it is an expert component in serving sockets.
We can notice that we could have used an "Agent", but as it is an independent element, perhaps it is better with that.

```java
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
```

### The Swing JButton example

For this wrapper, it is evident that it has a GUI_ROLE sub-role. For the main role, a JButton is close to a concrete button, so we can choose a @Simu_real_obj qualifier. An abstraction is possible too, depending on the perspective we prefer. Even an agent is possible, for those with a full agent vision.

```java

package clprolf.wrappers.javax.swing;

import javax.swing.JButton;

import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Role;
import org.simol.simolframework.java.Simu_real_obj;

@Forced_inh
@Simu_real_obj(Role.GUI_ROLE) //Could have been @Abstraction!
public class ClpJButton extends @Nature JButton {

}
```

### The java.util.Scanner example

The clpScanner is a great example to show that @Agent can be useful even for system abstractions. A scanner here is considered as having a active and autonomous role, and instanciated especially for a precise job of an application. He is an active part of the application. EXPERT_COMPONENT is facultative.

```java
package clprolf.wrappers.java.util;

import java.util.Scanner;

import org.simol.simolframework.java.Agent;

/**
 * We use an agent here, but we could have used an @Abstraction.
 * Agent is appropriate here, because it is an instance and active object in
 * the user application. It's an agent for scanning. No need to precise a EXPERT_COMPONENT,
 * because it is quite already said with agent.
 * 
 * @author Charles Koffler
 *
 */

@Agent
public final class ClpScanner { //No inheritance, because it is a Java final class.

	private final Scanner internal;
	
	public ClpScanner(Scanner javaScanner) {
		this.internal = javaScanner;
	}
	
	public String nextLine() {
		return this.internal.nextLine();
	}
	
}
```

### The System wrapper

Here, the case is not common, because few Java classes of the standard Library are final. And it is a class with only static methods.
So it is a perfect class for @Role.STATIC sub-role, which considers the class as a singleton. It is an abstraction of the operating system, an abstract concept, but we could have a different vision with different roles.

```java
package clprolf.wrappers.java.lang;

import java.io.Console;
import java.io.InputStream;
import java.io.PrintStream;

import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Role;

/**
 * Wrapper of the java.lang.System class.
 * It is a final class, with only static members, so the wrapper is just there as an example.
 * But we could add wrapper members!
 * 
 * @author Charles Koffler
 *
 */
@Abstraction(Role.STATIC) //Abstraction of the operating system. The methods are statics, and act like a singleton for a System object.
public final class ClpSystem { //final as the Java System class.
	public static final PrintStream getOut() {
		return System.out;
	}
	
	public static final InputStream getIn() {
		return System.in;
	}
	
	public static final PrintStream getErr() {
		return System.err;
	}
	
	public static Console console() {
		return System.console();
	}
	//Feel free to add(or not) the methods you like!
}

```

### The String wrapper

The String class is also final, so the wrapper is less practical, but remains a good example. It is a case where the class has two aspects.
For the string objects, we consider that it is an abstraction of the string concept(thus @Abstraction).
For the static aspect, a great role seems, @Simu_real_obj(Role.EXPERT_COMPONENT_STATIC), an expert component in strings.
About the wrapper, we can unfortunately use polymorphism in usage, because we can not inherit from java.lang.String. We have to use composition.

```java
package clprolf.wrappers.java.lang;


import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Role;
import org.simol.simolframework.java.Simu_real_obj;

//This class has two aspects, static and instance.

@Simu_real_obj(Role.EXPERT_COMPONENT_STATIC) //A expert component in strings!
@Abstraction //Abstraction of the concept of string.
public final class ClpString { //The String class is final.
	private final String internal;
	
	/**
	 * To access methods.
	 * @return
	 */
    public String getInternal() {
		return internal;
	}

	public ClpString(String internalString) {
        // Creates an empty string
    	internal = internalString;
    }

	//The static methods, belonging to the static simu_real_obj aspect.
    //Put here what you want, or nothing!
    public static String valueOf​(int i) {
    	return String.valueOf(i);
    }
    
}
```

## Conclusion

Clprolf wrappers are both useful and educative. They are excellent class and interface roles examples. Contributors are welcome to add more wrappers! They fill the gap between Java and Clprolf world!

