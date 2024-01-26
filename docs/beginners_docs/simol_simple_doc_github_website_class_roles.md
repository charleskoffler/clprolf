Differences between simol and java or any usual object-oriented language:

The classes

First, in simol you don't have the class keyword. We still define classes, but we talk rather about an object that we describe. So we define either real-world object simulation, in simol, or simulation or computer workers. In fact, there are too other possible objects in simol, without methods, and simpler, the real-world objects, and the information objects. Let's talk about them later.

What is a simulation of a real-world object?

The keyword simu_real_world_obj is used instead of classes, that's all, in that case. Or you can use the @Simu_real_world_obj annotation in the java framework. This kind of object describes the objects used for simulate a real-world-object. There's nothing else. "Simulation" in simol means methods, because methods are action. Without methods, it is only a modeling object, and it is a "real_world_obj". Ideally, this class should not contain other stuff than pure simulation code.

```java
public simu_real_world_obj Human {
	public string name; //We don't have time for this example to put getters/setters!
	public void cleanTeeth(Brush brush){
		//We are taking the brush with our hand.
		this.takeObject(brush);
		//We are brushing our teeth
		this.makeMovements(brush);
		//When finished, we put away the toothbrush
		this.placeObject(brush);
	}
}
```

Java version(with framework), it is quite the same!

```java
@Simu_real_world_obj
public class Human {
	public string name; //We don't have time for this example to put getters/setters!
	public void cleanTeeth(Brush brush){
		//We are taking the brush with our hand.
		this.takeObject(brush);
		//We are brushing our teeth
		this.makeMovements(brush);
		//When finished, we put away the toothbrush
		this.placeObject(brush);
	}

}
```

We notice that there is only pure emulation code. It is the code to describe the process, in the real-world. We don't matter in this class about displaying an animation to user. No, we matter only to emulate the behavior we see in the reality.
In other words, pure technical code, which is often more complex, for handle a technical aspect regarding the computer itself, is not here.
Why are we doing that? First, such pure simulation code is often straightforward. It's quite the "business" code, in other more classical words. And we don't want to mix two concerns, two responsabilities.

Be aware that sometimes, some people would see the class as being a computer job, not a simulation of a real-world object! But no problem, in simol, you are free to perceive your objects as you want, as long as you are coherent. It is considered as important to indicate the role of the class, for the programmer, but for the other readers two.

What is a simulation of a computer worker?

Sometimes, we can have classes that don't aim to emulate. It's just a work for the computer, as find objects in a database, or launch a program. The worker is not a real-world object, but the action is executed by the computer.
Why do we call it a worker? Because, to simplify our problem, we want to see it as a worker, someone who do his job, as well as us when we work!
So to mimic a real worker, we use a human-like algorithm to describe the job. In fact, the computer is running maching code! This is why we're talking here of a simulation of a worker. Seeing the computer as a worker is frequently used, in fact, it is not so new! When we're saying a "server", it's quite like our worker. When we're saying "the computer is executing my application", it is rather the same thing.

```java
public simu_comp_worker {

	public static void main(String[] args) {
		Human myHuman = new Human();
		myHuman.cleanTeeth();
	}

}
```

Or, in pure java:

```java
@Simu_comp_worker
public class Launcher {

	public static void main(String[] args) {
		Human myHuman = new Human();
		myHuman.cleanTeeth();
	}

}
```

In this example, we need an object to execute the application, and the simulation of a human.
A class with a static method is quite like an singleton object, isn't it? The static attributes and methods are unique for a given class.
So this class, in simol, in a simu_comp_worker. The object is more a computer job, the computer worker will do his job. And this work is to create a Human object, and to clean his Teeth. Be aware that a computer worker can, as this is frequent, use simu_real_world_obj. But who is doing the job? The computer, not the human.
So we will often have a simu_comp_worker as a launcher of the application.
A great use case of the simu_comp_worker can be to put the code for display on screen, or playing animations or sounds, to realize technically a simulation of real-world object on the computer! If you have only a simu_real_world_obj, without technical reflection on screen , keyboard, music, and so on, the simulation would be only a memory simulation! So it seems great to separate this code which is frequently technical, and computer-dependent. In this kind of code, we have to know the computer libraries, for example.
Notice that even a computer worker class should be quite intuitive, because it is like a human worker, except that we know that it is a computer. So we know that some things would become a bit less intuitive, and less straightforward, than a pure real-world simulation. But it is still simulation, and the simu_comp_worker classes could, theoritically, be placed only on a sheet of paper, and verbally explained without a physical computer. All this stuff is obviously to simplify the programs, and make programming less daunting, and perhaps more mathematical.

