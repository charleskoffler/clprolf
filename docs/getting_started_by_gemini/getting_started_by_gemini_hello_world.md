# Simol in Action: Hello World!

This section showcases two ways to write a "Hello World" program in Simol, demonstrating the language's concepts:

## Simple "Hello World" (Java Framework):

```java

// Launch an application is a computer worker job!
@Simu_comp_as_worker
public class Main {
  
  public static void main(String[] args) {
    System.out.println("Hello world!"); // System is a simu_comp_as_worker, stream out is a simu_real_world_obj
  }
}
```

## Simol's World Example:

This example introduces two Simol classes: SimolWorld and SimolWorldTechnRealiz.

   SimolWorld (simu_real_world_obj): Represents the application itself.
    
   SimolWorldTechnRealiz (simu_comp_as_worker): Handles the technical aspects of displaying messages, acting as the computer worker.

Simol Code:

```java

public simu_real_world_obj SimolWorld {
  private SimolWorldTechnRealiz ourTechnRealiz;

  public SimolWorld() {
    this.ourTechnRealiz = new SimolWorldTechnRealiz(this);
  }

  public void say(String message) {
    ourTechnRealiz.display("A message from Simol's world: " + message);
  }
}

public simu_comp_as_worker SimolWorldTechnRealiz {
  // The associated simu_real_world object
  private SimolWorld owner;

  public SimolWorldTechnRealiz(SimolWorld theOwner) {
    this.owner = theOwner;
  }

  public void display(String message) {
    // (...) A complicated display here (simplified for example)
    System.out.println(message); // System could represent the operating system (computer worker)
  }
}

// Launch an application is a computer worker job!
public simu_comp_as_worker HelloMain {
  
  public static void main(String[] args) {
    SimolWorld world = new SimolWorld();
    world.say("Hello world!");
  }
}
```

Java Framework Code (Equivalent):

```java

// Simol's world is a real-world object
@Simu_real_world_obj
public class SimolWorld {
  private SimolWorldTechnRealiz ourTechnRealiz;

  public SimolWorld() {
    this.ourTechnRealiz = new SimolWorldTechnRealiz(this);
  }

  public void say(String message) {
    ourTechnRealiz.display("A message from Simol's world: " + message);
  }
}

// Technical realization is a computer worker
@Simu_comp_as_worker
public class SimolWorldTechnRealiz {
  // The associated simu_real_world object
  private SimolWorld owner;

  public SimolWorldTechnRealiz(SimolWorld theOwner) {
    this.owner = theOwner;
  }

  public void display(String message) {
    // (...) A complicated display here (simplified for example)
    System.out.println(message); // System could represent the operating system (computer worker)
  }
}

// Launch an application is a computer worker job!
@Simu_comp_as_worker
public class HelloMain {
  
  public static void main(String[] args) {
    SimolWorld world = new SimolWorld();
    world.say("Hello world!");
  }
}
```

This example highlights Simol's approach:

   Objects represent real-world entities or functionalities.
   
   Methods model object behavior.
   
   simu_comp_as_worker objects handle computational tasks.
   
   The System class can be seen as a worker performing the display.

By separating the application logic (SimolWorld) from the technical details (SimolWorldTechnRealiz), Simol promotes code clarity and maintainability.
