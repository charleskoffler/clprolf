# LEARNING THE CLASS ROLES THROUGH JAVA WRAPPERS

---

## Learning the Class Roles Through Java Wrappers

One of the easiest ways to understand **Clprolf class roles** is to look at **wrappers** of well-known Java classes.
By re-expressing familiar components like `Socket`, `Scanner`, or `System`, we can immediately see how Clprolf’s declensions clarify their **nature** and **responsibility**.
Each wrapper highlights a specific situation: abstract concepts, expert components, GUI elements, active agents, or static utilities.
This makes wrappers both **practical** (they can replace Java classes through polymorphism) and **educational** (they illustrate how to apply Clprolf roles consistently).

---

## The Java Wrappers Project

A project exists in the Clprolf sources, under the package `clprolf.wrappers.java`.
It shows concrete **examples of class roles**, by writing wrappers for the Java Standard Library.

Thanks to polymorphism, these wrappers can directly replace the equivalent Java classes or interfaces. They also serve as **educational examples** of how to apply Clprolf declensions.

---

## Examples

### ClpSocket Wrapper

Here, `ClpSocket` is declared as an `@Abstraction`.
Since inheritance from Java classes is not natural in Clprolf, we use `@Forced_inh`.

We choose **Abstraction** because a socket is an abstract system concept. Equivalent roles could work, but abstraction fits best.

```java
package clprolf.wrappers.java.net;

import java.net.Socket;
import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;

@Forced_inh // Not allowed except with this
@Abstraction
public class ClpSocket extends @Nature Socket {

}
```

---

### ClpSocketServer Wrapper

Here, the name is slightly adapted: `SocketServer` instead of Java’s `ServerSocket`.
We declare it as `@Agent(Role.EXPERT_COMPONENT)` because it is an **expert component** for serving sockets.

```java
package clprolf.wrappers.java.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Nature;
import org.simol.simolframework.java.Role;
import org.simol.simolframework.java.Agent;

@Forced_inh
@Agent(Role.EXPERT_COMPONENT)
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

---

### Swing JButton Wrapper

For `JButton`, it is natural to use `@Abstraction(Role.GUI_ROLE)`.

* As a GUI element, it clearly has a GUI role.
* Depending on perspective, it could also be `@Simu_real_obj` or even `@Agent`.

```java
package clprolf.wrappers.javax.swing;

import javax.swing.JButton;
import org.simol.simolframework.java.Forced_inh;
import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Role;

@Forced_inh
@Abstraction(Role.GUI_ROLE)
public class ClpJButton extends @Nature JButton {

}
```

---

### Scanner Wrapper

`ClpScanner` shows that even system abstractions can be modeled as `@Agent`.
It plays an active role in applications — scanning is its autonomous responsibility.
We don’t need to add `EXPERT_COMPONENT` here, as `Agent` is already explicit enough.

```java
package clprolf.wrappers.java.util;

import java.util.Scanner;
import org.simol.simolframework.java.Agent;

@Agent
public final class ClpScanner { // Java Scanner is final, so we use composition

    private final Scanner internal;

    public ClpScanner(Scanner javaScanner) {
        this.internal = javaScanner;
    }

    public String nextLine() {
        return this.internal.nextLine();
    }
}
```

---

### System Wrapper

`System` is unusual:

* It is `final`.
* It only has **static methods**.

This makes it a perfect fit for `@Abstraction(Role.STATIC)`.
We see it as a **singleton abstraction of the operating system**.

```java
package clprolf.wrappers.java.lang;

import java.io.Console;
import java.io.InputStream;
import java.io.PrintStream;
import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Role;

@Abstraction(Role.STATIC)
public final class ClpSystem {

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
}
```

---

### String Wrapper

`String` is also `final`, so the wrapper must use composition.

Here, the class has **two aspects**:

* For **string objects**, it is an abstraction of the concept → `@Abstraction`.
* For **static methods**, it can be seen as an expert component → `@Abstraction(Role.EXPERT_COMPONENT_STATIC)`.

```java
package clprolf.wrappers.java.lang;

import org.simol.simolframework.java.Abstraction;
import org.simol.simolframework.java.Role;

@Abstraction(Role.EXPERT_COMPONENT_STATIC)
public final class ClpString {

    private final String internal;

    public ClpString(String internalString) {
        this.internal = internalString;
    }

    public String getInternal() {
        return internal;
    }

    // Static methods belong to the static aspect
    public static String valueOf(int i) {
        return String.valueOf(i);
    }
}
```

**Notice**
For the **abstraction** role, both static and non-static aspects may be important (as an exception).
In most other cases, the `Static` gender only applies when **most methods are static**.

---

## Conclusion

Clprolf wrappers are both **useful and educational**:

* They illustrate class and interface roles clearly.
* They allow Clprolf to bridge naturally with Java’s standard library.
* They are excellent examples for contributors who want to extend the framework.

👉 Wrappers fill the gap between the **Java world** and the **Clprolf world**!

---
