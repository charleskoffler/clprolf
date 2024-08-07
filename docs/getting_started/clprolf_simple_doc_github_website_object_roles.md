# Differences between clprolf and java or any usual object-oriented language - The classes

## Introduction

clprolf go further than traditional object-oriented programming, by introducting roles (or responsabilities) for objects.

## The classes

First, in clprolf you don't have the class keyword. We still define classes, but we talk rather about an object that we describe. And we have to choose a role for the objects. So we define either objects for real-world object simulation, in clprolf, or for a simulation of computer workers. In fact, there are too other possible objects in clprolf, without methods, and simpler, the models of real-world objects, and the information objects. Let's talk about them later.
The simulation of real-world object is also called "abstraction", as well as the simulation of a computer worker can also be called "comp_as_worker". And the model of real-world object can be named "model".
In object-oriented programming, we have to create objects. In clprolf, we still create objects, but we have to precise his responsability. It would be either a real-world object, either a computer worker. So the obtained system is a system where real-world objects works together, or works with computer workers, and vice versa. It looks natural and human.

### What is a simulation of a real-world object (or "abstraction")?

The keyword simu_real_world_obj is used instead of classes, that's all, in that case. Or you can use the @Simu_real_world_obj annotation in the java framework. This kind of object describes the objects used for simulate a real-world-object. There's nothing else. "Simulation" in clprolf means methods, because methods are action. Without methods, it is only a modeling object, and it is a "model_real_world_obj". Ideally, this class should not contain other stuff than pure simulation code.

```java
public class_for simu_real_world_obj Human {
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

We notice that there is only pure emulation code. It is the code to describe the process, in the real-world. We don't matter in this class about displaying an animation to the user. No, we matter only to emulate the behavior we see in the reality.
In other words, pure technical code, which is often more complex, for handling a technical aspect regarding the computer itself, is not here.
Why are we doing that? First, such pure simulation code is often straightforward. It's quite the "business" code, in other more classical words. And we don't want to mix two concerns, two responsabilities.

Be aware that sometimes, some people would see the class as being a computer job, not a simulation of a real-world object! But no problem, in clprolf, you are free to perceive your objects as you want, as long as you are coherent. It is considered as important to indicate the role of the object, for the programmer, but for the other readers too.
It is clear that the part "real-world" doesn't imply only concrete real-world objects. A Vehicule suits well, it's evident, but we can also use it for abstract notions, like a Connection, a Color, or any abstract idea of the real-world.
In other words, as soon as you take as a reference a real-world thing, you have to use a simu_real_world_obj. It is true for the pure "model_real_world_obj" too, of course.

### What does 'class_for' mean?

'class_for' is an optional keyword, that can be placed just before a class role. It replaces 'class' of Java, and means "class for a simu_real_world_obj"(or class for another class role).
It could be great for people who prefer have a more classical way of speaking about objects and classes. It does not exist, obviously, in the annotation frameworks.

### What is a simulation of a computer worker(or "comp_as_worker")?

Sometimes, we can have objects that don't aim to emulate. It's just a work for the computer, as finding objects in a database, or launching a program. The worker is not a real-world object, and the action is executed by the computer.
Why do we call it a worker? Because, to simplify our problem, we want to see it as a worker, someone who do his job, as well as us when we work!
So to mimic a real worker, we use a human-like algorithm to describe the job. In fact, the computer is running maching code! This is why we're talking here of a simulation of a worker. Seeing the computer as a worker is frequently used, in fact, it is not so new! When we're saying a "server", it's quite like our worker. When we're saying "the computer is executing my application", it is rather the same thing.

```java
public simu_comp_as_worker {

	public static void main(String[] args) {
		Human myHuman = new Human();
		myHuman.cleanTeeth();
	}

}
```

Or, in pure java:

```java
@Simu_comp_as_worker
public class Launcher {

	public static void main(String[] args) {
		Human myHuman = new Human();
		myHuman.cleanTeeth();
	}

}
```

In this example, we need an object to execute the application, and the simulation of a human.
A class with a static method is quite like a singleton object, isn't it? The static attributes and methods are unique for a given class.
So this Launcher, in clprolf, is a simu_comp_as_worker. The object is more a computer job, the computer worker will do his job. And this work is to create a Human object, and to clean his Teeth. Be aware that a computer worker can, and this is frequent, use simu_real_world_obj. But who is doing the job? The computer, not a real-world object.
So we will often have a simu_comp_as_worker as a launcher of the application.
A great use case of the simu_comp_as_worker can be to put the code for display on screen, or playing animations or sounds, to realize technically a simulation of real-world object on the computer! If you have only a simu_real_world_obj, without technical reflection on screen , keyboard, music, and so on, the simulation would be only a memory simulation! So it seems great to separate this code which is frequently technical, and computer-dependent. In this kind of code, we have to know the computer libraries, for example.
Notice that even a computer worker class should be quite intuitive, because it is like a human worker, except that we know that it is a computer. So we know that some things would become a bit less intuitive, and less straightforward, than a pure real-world simulation. But it is still simulation, and the simu_comp_as_worker classes could, theoritically, be placed only on a sheet of paper, and verbally explained without a physical computer. All this stuff is obviously to simplify the programs, and make programming less daunting, and perhaps more mathematical.
When we talk about a computer worker, we talk about a worker who is just able to obey, and do the job we've entrusted to it. We are not talking about an AI worker, who could take initiatives and have creativity.

### What is a "model_real_world_obj"(or "model")?

A model of real-world object(model_real_world_obj) is easy to perceive. It's really like an entity in oop. It could be compared too to a DTO, Data Transfert Object.  In other words, it's an object without methods, used only to modelize an equivalent real-world object.
We often use model_real_world_obj for databases, to get our datas into java objects. Let's take an example, a Client object, with only attributes and getters/setters and constructors, should be placed in a model_real_world_obj class.
We know that the object wouldn't evolve by adding methods, otherwise a simu_real_world_obj is required. The nature of these objects are only to modelize the relative real-world object and his datas.
As for its equivalent with methods, the model_real_world_obj is free to represent any notion of the real-world, including abstract concepts. We are free to create an "Idea" model_real_world_obj, if we want!

```java
public model_real_world_obj Client {
	public int age; //Not a good idea, it would be better the date of birth!
	public String firstName;
	public String familyName;
	public String address;
}

```

In Java:

```java
@Model_real_world_obj
public class Client {
	public int age; //Not a good idea, it would be better the date of birth!
	public String firstName;
	public String familyName;
	public String address;
}

```

### What is an "Information"?

The second kind of objects without methods, is the Information, or @Information in the framework. It's the same thing as a data structure in C, approximately. The nuance with a C struct, is that for us, it's an element of datas for an algorithm.
So we call it an "information", because it suits with our "computer worker" vision. So as soon as we need a set of informations, which does not represent the real-world, but only for assemble some variables, we have to use it.
Classically, it should be used rather by a simu_comp_as_worker, it is quite made for him. And you know, an "Information" is obviously allowed to be contained by a simu_real_world_obj too, but it should be rare.
An Information could be used, for example, in a simu_comp_as_worker, to return many different objects, but perhaps we'd rather create an Response object instead!
"Information" should be rarely used, except perhaps some kind of programs, like system programming.
You know, by the way, that you can, in an "Information" class, have attributes that can be simu_real_world_obj objects, or what you want. 

```java
public class_for information myInformation {
	Socket theConnection; //A simu_real_world_obj, it is allowed.
	int myMysteriousNumberForMyWorker;
}
```

```java
@Information
public class myInformation {
	Socket theConnection; //A simu_real_world_obj, it is allowed.
	int myMysteriousNumberForMyWorker;
}
```

So it is only that, clprolf? Is it useful that I add all that stuff to my Java code?

Yeah, I would say you'd gain a lot. Much reasons could be given. First, it a guarantee to stay with well-designed and clear objects. Remember yourself reading the java code of something else, it's often tricky to understand what are the precise goals of a class.
Then it allows to think to many different interpretations, and to stay compatible with much design principles, like SRP(Single Responsability Principle). The MVC is also not far.
And we will then ensure, by compiler, that our classes are staying always great, verifying that a new inherited class, is compatible with our role. A simu_comp_as_worker class can not inherit of a simu_real_world_obj, that is not possible in clprolf, except if you really want to do that.
There is a way to force an unauthorized inheritance, with @Forced_inh annotation, in clprolf language and framework. If it is more practical to inherit of a simu_comp_as_worker, to stay compatible with legacy code, then you can do that.
But it is not recommended by the language, and you have to explicitly ask it. So it is a conscious thing done, marked by the annotation.

### What is the meaning of "nature"?

"nature" keyword, or "@Nature" annotation, replaces "extends" in java. In fact, in the framework, we still keep the "extends", and we add "@Nature".
So "nature" indicates an inheritance. We precise "nature" because we not only see the inheritance as a copy of class members, but as a compatibility of meaning too.
So a Stone should not inherit of a Monkey, except in particular cases, on in your dreams! There is no control at that by the compiler, but we can imagine that it could have warnings or errors on this.
It acts as a reminder that an inheritance is significant, and is not only a composition. We do not want to mix inheritance and composition. An inheritance is a key topic in the object-oriented paradigm, and it implies polymorphism.
So when a method asks for a Monkey, is it normal that we can pass it a Stone?
With such concept, there would not have diamond inheritance problems, because in clprolf, we can have only one nature. In clprolf, a tutor would be rather a student, because his first nature is to be a student, even if it gives some courses in addition.
Even in the Simu_comp_as_worker, "nature" is active, and we must think about the right inheritances, in such a way that the inherited worker has the same nature of work as us.
For example, a Launcher class should not inherit from a DAO class.

```java
public abstraction Dog nature Animal {
	private String name;
	
	public getName(){
		return this.name;
	}

	public Dog(String name){
		this.name = name;
	}

	public void bark(int duration){
		if (duration>3){
			this.owner.shout('Stop barking');
		}
	}
} 

```

In the java framework:

```java
@Abstraction
public class Dog extends @Nature Animal {
	private String name;
	
	public getName(){
		return this.name;
	}

	public Dog(String name){
		this.name = name;
	}

	public void bark(int duration){
		if (duration>3){
			this.owner.shout('Stop barking');
		}
	}
} 

```

### What are the sub-roles for a simu_real_world_obj?

Specifying the sub-role of the simu_real_world_obj objects is absolutely not mandatory. The sub-roles can be, currently, @Human_expert, @Expert_component, @Machine_tool, @GUI_role, @Design_role, in the clprolf language. For the framework, we indicate it as @Simu_real_world_obj(Role.HUMAN_EXPERT), or @Simu_real_world_obj(Role.Design_role), for example, a value of the Role enumeration.
A human expert specifies that we emulate a real-world human expert. This could remind us the expert systems, except that all the expert rules are given by an algorithm. For example, we could see a controller as a business expert, in his speciality.

```java
@Human_expert
public simu_real_world_obj WeatherForecastController {

	public void getForecasts() { //The meteorologist is doing his job!
	}

}

```

In the framework:

```java
@Simu_real_world_obj(Role.HUMAN_EXPERT)
public class WeatherForecastController {

	public void getForecasts() { //The meteorologist is doing his job!
	}

}

```

The @Design_role(or Role.DESIGN_ROLE) annotation, can be used instead of @Human_expert, if we prefer the more traditional vision in term of role in the design of the application. A controller, a service, and so on, are considered design roles in clprolf. So we can use the same example, with another vision:

```java
@Design_role
public simu_real_world_obj WeatherForecastController {

	public void getForecasts() { //This time, the controller is doing his job!
	}

}

```

In the framework:

```java
@Simu_real_world_obj(Role.DESIGN_ROLE)
public class WeatherForecastController {

	public void getForecasts() { //This time, the controller is doing his job!
	}

}

```

There is another interesting sub-role, @Expert_component(or Role.EXPERT_COMPONENT), that can always replace, if we prefer, the @Human_expert sub-role. It's a kind of @Design_role, where we call the object a component, so it's a true design role. But this component is an expert in a job, defined in a quite general way. And it keeps a simulation because it's an ideal role.

```java
@Expert_component
public simu_real_world_obj WeatherForecastController {

	public void getForecasts() { //This time, the controller is doing his job!
	}

}

```

In the framework:

```java
@Simu_real_world_obj(Role.EXPERT_COMPONENT)
public class WeatherForecastController {

	public void getForecasts() { //This time, the controller is doing his job!
	}

}

```

But what is a machine tool and a GUI_role ?

These are compensation in term of GUI, of such different visions. The GUI_role is the more classical view, of a graphical interface. A button is a component, or a control, of a window, and the whole is a graphical interface. Yeah. But some people could see that it is quite an emulation of a real-world machine tool, with buttons, displays, and so on. So the window is viewed like a real-world machine tool, nothing more. So the abstraction becomes more direct and imaginative. When we execute a graphical application, it is just as if we had obtained a specialized machine tool, to do a particular work. Notice that much metaphors used in graphical interfaces, like buttons, or window, suit well to this vision.

Remember that indicating the sub-roles are not mandatory in clprolf. We could just specify the object role, "simu_real_world_obj", and nothing more. It's enough, if we want.

In clprolf language:

```java
@Machine_tool
public simu_real_world_obj MyBeautifulButton nature JButton {


}
```

The same in the clprolf java framework:

```java
@Simu_real_world_obj(Role.MACHINE_TOOL)
public class MyBeautifulButton nature JButton {


}
```

Another example, with GUI_Role, this time:

```java
@GUI_role
public simu_real_world_obj MyBeautifulButton nature JButton {


}
```

The same in the clprolf java framework:

```java
@Simu_real_world_obj(Role.GUI_ROLE)
public class MyBeautifulButton nature JButton {


}
```

Remember that an equivalent framework exists in C# and PHP 8. The PHP 8 version doesn't currently support the parallelism aids.

### "abstraction", "comp_as_worker", and "model" keywords

"simu_real_world_obj" can be replaced by "abstraction" keyword (or @Abstraction in the framework), if wanted. "Abstraction" could be preferred by some people. Here we mean that the object, with its methods and attributes, is an abstraction.

"simu_comp_as_worker" can be called "comp_as_worker"(or @Comp_as_worker in the framework), to remain coherent.
"model_real_world_obj" can be replaced by "model" as well.
The "nature" keyword is still functional on such classes, as well as the roles annotation of the simu_real_world_objs(like @Expert_component).

### "indef_obj"(indefinite object) object role
We are not obliged to define an object role, in case where we desire to stay compatible with traditional OOP.So the "indef_obj" modifier(indefinite object) can be used instead of the other object role modifiers.
In the framework, there are no equivalent, and simply don't use a role annotation for the class.
