### An Hello world example, the simple way to do this:

```java
//Launch an application is a computer worker job!
public comp_as_worker Main {
	
	public static void main(String[] args){
		System.out.println("Hello world!"); //Notice that System should be viewed as a simu_comp_as_worker, and the stream out, a simu_real_world_obj
	}

}
```

In the java framework:

```java
//Launch an application is a computer worker job!
@Comp_as_worker
public class Main {

	public static void main(String[] args){
		System.out.println("Hello world!"); //Notice that System should be viewed as a simu_comp_as_worker, and the stream out, a simu_real_world_obj
	}
}
```

### Another way to do this, perhaps a bit more elegant, in clprolf:

```java
//Another way //We could use "abstraction" instead of "simu_real_world_obj"
public simu_real_world_obj SimolWorld {
	private SimolWorldTechnRealiz ourTechnRealiz;

	public SimolWorld(){
		this.ourTechnRealiz = new SimolWorldTechnRealiz(this);
	}

	public void say(String message){
		ourTechnRealiz.display("A message from clprolf's world: " + message);
	}

}

public simu_comp_as_worker SimolWorldTechnRealiz { //We could use "comp_as_worker" instead.
	//The associated simu_real_world object. It could be useful to have it, especially for fields.
	private SimolWorld owner;
	
	public SimolWorldTechnRealiz(SimolWorld theOwner){
		this.owner = theOwner;
	}

	public void display(String message){
		//(...) A complicated display here.
		// But I do it simple for the example
		System.out.println(message);  //System could represent the operating system, so it's the computer worker who play this job!
	}
}

//Launch an application is a computer worker job!
public simu_comp_as_worker HelloMain {
	
	public static void main(String[] args){
		SimolWorld world = new SimolWorld();
		world.say("Hello world!");
	}

}
```

In the java framework:

```java
//Another way
@Simu_real_world_obj  //We could use "@Abstraction" instead of "@Simu_real_world_obj"
public class SimolWorld {
	private SimolWorldTechnRealiz ourTechnRealiz;

	public SimolWorld(){
		this.ourTechnRealiz = new SimolWorldTechnRealiz(this);
	}

	public void say(String message){
		ourTechnRealiz.display("A message from clprolf's world: " + message);
	}

}

@Simu_comp_as_worker //We could use "@Comp_as_worker" instead.
public  class SimolWorldTechnRealiz {
	//The associated simu_real_world object. It could be useful to have it, especially for fields.
	private SimolWorld owner;
	
	public SimolWorldTechnRealiz(SimolWorld theOwner){
		this.owner = theOwner;
	}

	public void display(String message){
		//(...) A complicated display here.
		// But I do it simple for the example
		System.out.println(message); //System could represent the operating system, so it's the computer worker who play this job!
	}
}

//Launch an application is a computer worker job!
@Simu_comp_as_worker
public class HelloMain {
	
	public static void main(String[] args){
		SimolWorld world = new SimolWorld();
		world.say("Hello world!");
	}

}
```