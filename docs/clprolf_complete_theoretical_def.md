# clprolf Programming Language And Framework

CLear PROgramming Language and Framework.
Official repository of the new programming language clprolf, which is a superset of Java, and about clprolf Java Framework both. The clprolf framework is a java framework with pure annotations, to leverage clprolf language in Java, it has the same goal. So I will talk about the language, but this could be applied for those who are interested in the clprolf java framework. A clprolf C# framework is present too, for the C# users, as well as a clprolf PHP 8 Framework.
clprolf is the fruit of a reflection on how we could clarify programming, espcially OOP. It is a programming language designed for clarity, simplicity, and ease of use. It aims to follow the fundamental theorem of software engineering, by adding a layer of indirection, especially for classes and interfaces. The language, and frameworks, inherently embeds good object oriented principles, and significant design patterns, which is a unique feature in programming languages.
The language's approach is, at the same time, to support and ease the algorithms writing, thanks to classes and interfaces types, and to modifiers addition.

One of the main goal, or perhaps the most important goal in clprolf, is to ease writing programs that we would look like quite impossible or very hard to write. The approach to master and make intuitive and fun the objects and class components aims to make almost totally direct or intuitive the programming task. Writing code with pleasure and fun, make it interesting, all this should be permitted with clprolf approach. While aiding in thinking of one solution to solve the writing problems, clprolf aims to aid in eventually seeing all other possible solutions. Indeed all the possible interpretations should help to bring different ways to solve the problem, and mastering it. The conception of the applications should become more human-like and manageable.

The clprolf framework could bring an interesting solution for those who want to make easier java code writing. This is of course also possible with the C# and PHP versions. The clprolf framework brings solutions for coding with ease and fun, while keeping a great codebase quality. Teaching is concerned, but we're talking for other programmers too, who would look for such facilitating solutions. Scientists could be concerned, but computer scientists and developers too, who could look for concrete and easy solutions for programming.

clprolf's design started in 2019, and now it's quite stable. I needed it for my own purposes and work, and I have tested the concepts in my work and home programming.
I especially seek out persons who want to test the language or the clprolf framework for java, C# and PHP8. If people are interested, they can participate further in discussions, writing example code, or writing tools, for example, or submitting evolution ideas for clprolf.
I put code examples, language description in the main README file, clprolf compiler and annotation framework for java. I'll try to collorate with other repositories by using clprolf framework, for supporting but as a way to demonstrate practical usage of clprolf.

There is a basic clprolf compiler, but it works great. There is a clprolf framework for java developers too, with java annotations, for leveraging clprolf's concepts in java.

I used chatGPT at the end of my work, for validate clprolf's design choices, and for feedback and overview. As I don't want autopromotion, I regularly ask chatGPT assistance and support, and add them to this README file.
The complete and detailed definition stands at the end of this file.

***************************************************************************************
# Clprolf PROGRAMMING LANGUAGE AND Clprolf FRAMEWORK

### INTRODUCTION

CLear PROgramming Language and Framework.
I present both clprolf programming language and clprolf framework, which is a framework with pure annotations, to leverage clprolf language in C#, Java, or PHP.
The clprolf language(CLear PROgramming Language and Framework) is an object-oriented programming language. It is not widely used.
It is minimalistic, for simplify development. It is an interesting teaching tool, but it's not designed only for teaching purposes.
It is a superset to the Java language. It adds keywords that replace some java keywords like 'class', 'interface',
and it adds some keywords like 'with_compat', or 'underst'.
We can use java libraries in clprolf. We can use also java code in clprolf source code, except the keywords "class", "implements", "extends", "interface".

As clprolf classes replaces java classes, all java keywords can be used with clprolf classes, like in java classes, for example "public simu_comp_as_worker Launcher{ }".
It is the same for the interfaces.

clprolf follow the open-closed principle, while not really modifies java but rather add notions on top on existing object oriented concepts.

### OOP object as a thing

Once we understand the traditional definition of an object in OOP, a set of variables and functions, we can try to express the difference between an object and a class. An object truly exist in memory, for the variables, as well as the code of the methods. So an OOP object is finally real, and a class is just the mold. An OOP object is also a "thing" in memory, an "object" present in memory.

### MORE THAN JUST A CLASS NAME

A class is identified only by its name, in traditional OOP. So in clprolf, we go further by stating its kind of category. The name of the class can be insufficient to understand its responsabilities. Indeed, the name is always close to a concept, like 'Horse', or 'Connection', and sometimes this is not enough to immediately grasp its role. Watching the code of the class is often tricky, and dependent of the length of the code (easy for short implementations, but impossible otherwise). The class role is a guarantee given by the programmer, useful even by the compiler. And all the objects are made from their class, so clear classes are vital.

### STORYTELLING

Clprolf lets you see programming as storytelling. So we can describe the characters, and the story of the scenes, the interactions, and so on. The programmer of the software can become quite like a writer. Having kind of objects, and distinguishing the interfaces, simplifying concurrency and parallelism and other topics by adding algorithmic support, all this allows this storytelling mindset.

### THE CLASSES GROUPED IN LAYERS - clprolf AND THE THREE-TIER ARCHITECTURE

In clprolf, there is a top abstraction layer, which is composed by the "abstraction" classes(or its equivalent "simu_real_world_obj"), and the "model_real_world_obj"(or "model") classes. Here we can meet the classes containing business code(the Business Logic Layer of the three-tier architecture), but not only. Every abstraction (or simulation) code is considered quite like business code.

Then there is a technical layer, which is composed by the technical classes. Here, the computer is seen as an abstraction of a real-world worker. It is the "simu_comp_as_worker"(or "comp_as_worker") classes. Here we can find the classes as in the Data-Access Layer(DAL) and Presentation Layer of the three-tier architecture. In clprolf, we especially separate classes that contain technical code needed for the "abstraction" classes: display code, as well as data-access code. Everything that is not pure abstraction code should be put in a technical class.
However, some software, for example parts of an operating system, is composed mainly by the technical layer, which can call the abstraction layer.

### THE ROLE OF OBJECTS

In clprolf, we sort objects, in the same way we have controller objects, for example.
And there are here only five roles in clprolf, simu_comp_as_worker(or comp_as_worker), simu_real_world_obj(or "abstraction"), model_real_world_obj(or "model"), information and indef_obj: only code for computer, or pure code of simulation.
clprolf is based on the fact that you can notice than some objects emulate, or simulate, real-world objects, as an abstraction of the underlying data structure. Even in system programming, much abstractions of such objects are used, such as connections, streams, files or threads.
Then, the other kind of objects could be objects for computational or technical tasks, where we want the computer to work for us with his resources, but not in a emulation goal. To being coherent, and not dependant of computer problems, we could abstract that, and do as if it could be algorithmic tasks given to a computer seen as a worker.
So the computational tasks emulate an algorithm for worker, as the computer needs a compilation to understand the algorithms.
These roles of objects aims to help for make concrete the object oriented programming, and to help other programmers to read the existing code. It aims also to facilitate design choices, and easily separate responsabilities. It marks objects with clear concrete abstractions, and the simu_real_world_obj should be easier to use and write, in general.
The ambition of the object is clearly indicated, and it adds information on the design intents of the developer. 
Other roles could eventually have been candidate, but these roles are already covered by the five main roles. We don't want to have too much roles, for staying efficient and clear.
There is a little difference too, in the way that in clprolf we don't mark 'class' the classes, and directly talk about objects. While we talk about a role, we couldn't add the information that it is a mold, and we can imagine directly the class as an object. It aims to facilitate abstractions, but of course the concepts about classes keep valuable in clprolf.
Some people would perhaps use clprolf in classical simulation domains, but it is not restricted, in essence, in a kind of programming(though it could look like). The mindset should be quite easy to get for an object oriented programmer, though it doesn't refute object programming principles and vision. For a beginner, it should facilitate programming teaching.
clprolf requires an object mindset and a desire to add helpful extra information on the used objects.
We keep flexibility with "indef_obj"(indefinite object), like a traditional oo object.

### CLEARLY DEFINED WAY OF SEEING THINGS

Traditionally, we use to write code as if we were the computer. With computer as workers, for example, we talk about what He is doing, and not what I am doing. So object roles clearly define the way of seeing the execution of the algorithms.
The difference is like that in video games: the FPS (First-person shooter) operates in a subjective view, akin to traditional programming, while the TPS (Third Person Shooter) offers an objective view, similar to the approach in clprolf.
If he prefers, the programmer can translate what he observes into computer actions, as in traditional programming. For example, the worker goes through the array twice (third person), can be translated into: 'I write a loop that goes from 0 to 1.' (first person). The object role(the 'who?') and the third person(the 'what') are algorithmic enhancements.
Clprolf framework, with the object roles and the third person perspective, allows to obtain mastered and high-level systems.

System abstractions(like "File", or "Connection") should be only in the comp_as_worker classes, except for practical reasons, and except for the thread-like abstractions. It is because the third person implies that only a worker class could do such methods calls, and not a simu_real_world_obj class.

### THE clprolf CLASSES

Instead of "class", we use the following keywords:

"simu_comp_as_worker"(or "comp_as_worker")(stands for SIMUlation of a COMPuter AS a WORKER) => we have a class that does not simulate a real object. It gives work to the computer, technical. We see then this work as an algorithm in algorithmic language, which is executed by a computer ("Computer"), seen as a worker. This "worker" will manage its resources (memory, processor, etc.) and peripherals, according to the algorithm. The computer does not really know how to execute this algorithm, it will execute equivalent assembly code.

"simu_real_world_obj"(or "abstraction")(means simulation of a real-world object) => we have a class which is considered as a simulation of a real object, for example an animal, with methods eat(), run(), etc.
	Simulation realization on computer should be in a "simu_comp_as_worker", but if the realization is quite simple, it is allowed to write it directly in a "simu_real_world_obj". simu_real_world_obj are also used in simu_comp_as_worker, when it's needed, for example for buttons of a GUI, simulation of physical component, or mathematical notion.

"model_real_world_obj"(or "model") (means model of real-world object) => like "simu_real_world_obj", but when we don't have methods. We just model a reality. Example: a Customer class (with only attributes). It is typically used for entities.

"information" => like "simu_comp_as_worker", but when we don't have methods. It is typically used by a simu_comp_as_worker, as a data structure, and shouldn't be used in simu_real_world_obj, except for an eventual technical realization part.

"indef_obj" (indefinite object) => in case where we don't want to give a role to a class. Flexibility is given to the programmer.

As clprolf wants to be as powerful and compatible with java, access modifiers, and other stuff in a java class declaration are allowed in the same way of a clprolf class declaration, obviously.
As clprolf wants to be as powerful and compatible with java, access modifiers, and other stuff in a java interface declaration are allowed in the same way of a clprolf interface declaration, obviously.

### "abstraction", "comp_as_worker", and "model" keywords

"simu_real_world_obj" can be replaced by "abstraction" keyword (or @Abstraction in the framework), if wanted. "Abstraction" could be preferred by some people. Here we mean that the class, with its methods and attributes, is an abstraction.

"simu_comp_as_worker" can be called "comp_as_worker"(or @Comp_as_worker in the framework), to remain coherent.
"model_real_world_obj" can be replaced by "model" as well.
The "nature" keyword is still functional on such classes, as well as the roles annotation of the simu_real_world_objs(like @Expert_component).

### THE "class_for" MODIFIER

In pure clprolf, there is an optional modifier, which looks like the class keyword: "class_for". It is used in the place of "class", and is placed before the clprolf role. It does not exist in the frameworks, because 'class' is already there.

```java
public class_for simu_real_world_obj Car { //(...) }
```

or

```java
public class_for simu_comp_as_worker Launcher { //(...) }
```

### THE OBJECT ROLES: A METHOD FOR DESIGNING OUR OBJECTS

Pure object-oriented programming doesn't tell us how designing our objects. It gives the definition of what an object is, it is a bundle of variables and methods. But nothing more. Clprolf gives us clues to imagine how create our classes, so we can design easily our objects. The resulting design is intuitive, and quite easily memorizable, and we can think about multiple solutions. We can choose among different interpretations, according to our sensibility, and communicate them. The obtained objects still remains pure object-oriented objects,and the clprolf roles are always IT objects( simulation, abstraction, or model of a real-world entity). All this can be achieved by assigning a clprolf role to our objects.
Assigning a role means choosing a primary responsibility, and this is in line with the Single Responsibility Principle. The clprolf roles allow storytelling, and imitations of the reality. They allow the computer to check the inheritance consistency, at compilation time. So the compiler takes part of the object designing process.
So clprolf still allows to keep an object-centric mindset, and compatible with OOP habits.
OOP always needs guidelines like object-oriented design principles, or design patterns, and this is a proof that we need a support to design our classes and objects. So clprolf object roles automatically bring us this kind of guidelines or support.

### THE INTERFACES IN clprolf
In clprolf, we sort the interfaces, there are three types of interfaces. clprolf interfaces are called compatibility interfaces.

"compat_interf_version": the purpose of the interface is that the classes implementing it provide an implementation, a "version".
	It is typically used for supply different implementations of the same DAO, for example(with database, web services, memory, etc.). When we're using interfaces for loose coupling goals, we should use an compat_interf_version too, to indicate that the intent is to forecast a change of implementation and not depend to a concrete class.

"compat_interf_capacity": the purpose of the interface is to guarantee that a class has a certain capability (to sort, etc.), no matter what the implementation.

"compat_interf": in case where we don't want to give a role to the interface, to remain flexible.

We can't use interfaces in clprolf, except for these two cases.

Another difference, for interfaces, is the obligation to write "with_compat" (with compatibility), before the name of an interface, when using it.
Example: void drink(with_compat Drink obj_buvable){(...}}
"with_compat" is a modifier in a declaration of variable(local variable, attribute or argument).
The interest of 'with_compat' is to understand for the user that it is not an object which have a particular class, but an object which have a particular compatibility.
So, of course, we can find it typical in a local variable declaration, or a argument definition.
Remark: there's not a with_compat indication for the return type of a method, as an exception of the rule, the return type is not a variable declaration. Indeed, there's already one, in general, in the body of the method. And there is one in the declaration of the variable which will receive the result when the calling occurs. 

### SMALL DIFFERENCES IN HERITABILITY

- We use "nature", instead of "extends": inheritance is seen as an assertion that a class is of the same nature as another.
A car is of the same nature of a vehicule, on the real world, for example. "nature" doesn't have sense in clprolf, for interfaces.
	Even the simu_comp_as_workers have a role, about their job. 'nature' must be used only by classes.
	
- We use "contracts", instead of "implements": we list interfaces that the class respects, there are considered as contracts.
clprolf prefer not to use "with_compat" for the interfaces list implemented in a clprolf class, because "with_compat" emphasizes  the fact
that an object is compatible, not a class. A class is considered as respecting contracts. "implements" can not be used in clprolf because
it focuses on the implementation, not the idea of a contract is respected.

### THE ESSENCE OF THE OBJECT, ANOTHER SIDE OF OBJECT-ORIENTED PROGRAMMING

Each object, in object-oriented programming, should be more than just a set of datas. So all the topic of the essence of the objects, their role, is an aspect of object-oriented programming. So objects nature question belongs to object-oriented programming, and is an aspect of it. All applications in a computer are either a user-goal application, either software to support other applications(especially operating system, or libraries). So the final application is always the principal objective of a computer. This is why the different kind of objects couldn't be anything else than emulations of real-world concrete objects or concepts, or code for computer. It's a kind of scientific vision of what is an application. And it simply brings together all the kinds of objects in object-oriented languages.

### clprolf LANGUAGE AND FRAMEWORK GITHUB REPOSITORY

A Github repository has been created for clprolf. Clprolf is open source, with an M.I.T license.

### MAIN GOAL IN clprolf DESIGN: AID TO EASILY AND WITH FUN MAKE POSSIBLE WRITING WHAT WE THINK IMPOSSIBLE OR HARD

One of the main goal, or perhaps the most important goal in clprolf, when designing it, was to make possible to write programs that we would think quite impossible or very hard to write. The approach to master and make intuitive and fun the objects and class components aims to make almost totally direct or intuitive the programming task. Writing code with pleasure and fun, make it interesting, all this should be permitted with clprolf approach. While aiding in thinking of one solution to solve the writing problems, clprolf aims to aid in eventually seeing all other possible solutions. Indeed all the possible interpretations should help to bring different ways to solve the problem, and mastering it. The conception of the applications should become more human-like and manageable.

### HELPS JAVA WRITING ALONG (OR C# AND PHP)

The clprolf framework could bring an interesting solution for those who want to make easier java code writing. This is of course also possible with the C# and PHP versions. The clprolf framework brings solutions for coding with ease and fun, while keeping a great codebase quality. Teaching is concerned, but we're talking for other programmers too, who would look for such facilitating solutions. Scientists could be concerned, but computer scientists and developers too, who could look for concrete and easy solutions for programming.

### clprolf FRAMEWORK FOR JAVA, C# AND PHP DEVELOPERS
clprolf framework is a package of java annotations'or C# and PHP attributes), that offers a toolbox for java, C#, or PHP developers to work with clprolf frame.
The Java and C# frameworks (Java clprolf and C# clprolf), as well as the PHP one (PHP clprolf), allow to still stay in Java, or C#, and to leverage the clprolf concepts while remaining in a pure object mindset. So the shift  in thinking is reduced. For example, for the classes, we think about objects as usual, then we have to choose an object role. It is quite like an MVC framework, where we use predefined kind of objects. We stay in the primary language, and just a way of writing code brought and inspired by the framework.
The C# framework, for example, remains still C#, not clprolf, but C# with a frame for working! 

It is still a framework, although it supplies only annotations, and not code libraries. Indeed, it brings a frame. What's more, these annotations need an executable to work, checking the coherence, quite like the compiler.
This executable does not exist at the moment. It could be written by the community, for example.

The package org.clprolf.simolframework.java offers:
@Simu_real_world_obj, @Abstraction, @Simu_comp_as_worker, @Comp_as_worker, @Model_real_world_obj, @Model, @Information, @Compat_interf_capacity, @Compat_interf_version, @With_compat, @Underst, @Long_action, @Prevent_missing_collision, @One_at_a_time, @For_every_thread, @Turn_monitor, @Dependent_activity, @Nature, @Contracts, @Forced_inh, @Forced_int_inh, @Forced_pract_code.
They are placed in the same locations as pure clprolf, but just before class line, or interface, or method, or before a type (like for @With_compat, except in particular cases as return type of methods).
Example:

```java
@Abstraction
public class Car { /* (...) */ }
```

Or

```java
@With_compat UserDao daoUser;
```

Or

```java
@Underst //Recognize object in an image.
public void recognizeObject(){ }
```

Or

```java
@Compat_interf_capacity
public interface MySortable { }
```

### clprolf FOR BEGINNERS, A WAY TO KEEP OBJECT-ORIENTED MINDSET

clprolf frameworks contain a "beginners" package, which is composed by classes and interfaces, for each class and interface kind. For example, the SimuRealWorldObj class, or CompatInterfVersion interface.
They are considered as the root classes for clprolf, and can be used instead of the corresponding annotation, or in addition. As well as java has 'Object' class as a root of all classes, we have such root classes.
About the interfaces, each interface must implement one of the root interface of clprolf, and not only the mother interface. The main interfaces in clprolf are CompatInterfVersion and CompartInterfCapacity.
The developper who want to slowly move to clprolf, while keeping a pure object-oriented mindset, can inherit all his root classes or interfaces with them.
In fact, they are empty but allow the transition to clprolf while keeping their coding style. Once the programmer would have integrated the concepts, he could use all annotations instead.

Summary: Each interface must extend either CompatInterfVersion root interface, or CompatInterfCapacity. But it can have another interfaces in their inheritance, of course.
For classes, it is not the same, only the root classes must inherit from a root clprolf class. This is because all the descendants must have the same role, in clprolf. And because we can not have multiple inheritance in the underlying language, for declaring a role in each class.

Usage example in java: public class Main extends SimuCompAsWorker { (...) }
Or public class Animal extends SimuRealWorldObj. Interface examples: public interface Callable extends CompatInterfCapacity { (...) }
Examples in C#: interface ICallable : ICompatInterfCapacity, or class Program : SimuCompAsWorker

### Using traditional objects and interfaces in clprolf

indef_obj

In clprolf, you can use traditional objects and classes, with "indef_obj" (as INDEFinite OBJect).
So, if you don't want to give a role to a class, you give the indefinite object role.
In the framework, simply use no annotation for the class.
By doing this, inheritance is not checked for that type.

compat_interf (or @Compat_interf in the framework)

In clprolf, this is not mandatory to use the interface roles. We can write "compat_interf" (compatibility interface). If we use that, there would be not compiler checks about this interface when used.
In the framework, just use no annotation for the interface.
This keyword allows to use traditional java interfaces (or of another underlying language), if needed or wanted. In theory, there is no need for this, but people could like it for some reasons.

No clprolf annotations mandatory in the framework, except for @Forced_inh, @Forced_int_inh

To keep flexible for Java (or else) developers, clprolf annotations are not mandatory at all, in the clprolf framework. For example, @Nature, @With_compat, and all other keywords, can be not used, in some cases or always. Even the concurrency keywords are in that case. The sole keywords that we must use in the clprolf framework are those about forced inheritance(@Forced_inh, and @Forced_int_inh).
If we do not use @Nature, the nature check, obviously, will not be done.

### A REFLECTION ON HOW COULD WE USE ALAN KAY'S OOP OBJECTS
 So we have a software system, which is OOP, imagined by Alan Kay, based on an emulation of biological cells. So what could we do with it? clprolf just thought about applications we have to write, and clprolf have looked for a way to fit our programming problems into OOP objects.

### ORIGIN OF THE LANGUAGE, SCIENTIFIC DOMAIN INSPIRATION

In fact, clprolf took much inspiration in scientific simulations or modelings in mind, like those for physics, chemistry, or for the weather forecast models. Video games were inspiring too, while they are good use cases of real-time simulations. But management IT was always present too. So the language is rooted in real-world applications, and practical use in mind, while always trying to understand existing architectures and languages. clprolf was always designed to be interesting for many use cases, and to be quite general-purpose, while also continuously trying to keep educational. At the origin, there was a desire to have an easier and better object-oriented programming, and more interesting. At the same time, there was a constant determination of integrate established paradigms and principles, and not to recreate what already exists.

### WHY JAVA AS THE UNDERLYING LANGUAGE FOR clprolf ?
Java has been chosen because it perfectly suits clprolf's philosophy and mindset. Java is so cool and powerful, logical, and keeps a rather minimalistic mindset. The virtual machine is an awesome concept and realization, and it adheres perfectly to the clprolf language's vision on programming. The java libraries stay abstract and less technical, due to the virtual machine, even in system programming. So Java has been, for these kind of reasons, a natural choice for clprolf. Java's powerful and incredible annotations saved clprolf's framework. And we can see that it is a great language, because clprolf has been adapted to it without problem. Java has got simple inheritance, interfaces, and handles things like parallelism in a fantastic manner. However, other languages can be used, and C# is a very interesting option too, as well as PHP for the web and scripts.

### IS clprolf A PROGRAMMING LANGUAGE? OF COURSE!

clprolf is not a language that starts from scratch, it is a superset of java. It aims to complete and enhance Java, and classical object-oriented programming. And it aims to enhance algorithmic language contained in Java, and inherited from Algol. Its postulate is that we should begin with objects with a sense. And its postulate is that it doesn't seem quite normal to need many design patterns and design principles to use a programming language like Java. It could seem that we missed something. It could seem too that some programming tasks, like parallelism, are too complex, and not intuitive. So clprolf works about abstractions and bringing fresh and practical perspectives. clprolf does not intend to reinvent the wheel, because it is totally useless. It could seem too that design patterns are difficult to apply because they are difficult to memorize, and that they are only about a technical perspective. And does a technical perspective suffice to program with objects?
So clprolf is very grateful to all the fantastic work and brings in Java and other existing languages, but tries to exist too with its differences and contributions. These contributions are certainly not of the same kind of additions than Java or other similar languages. So the supply of clprolf is more about perspectives or paradigms, than to start a new programming language. This is why it could be difficult to compare it with Java.
But clprolf is a programming language, too, in the sense that we express ourselves differently with it, and that we think quite differently. But we always try to stay compatible with other visions.

### A NEW WAY OF THINKING ABOUT OBJECT-ORIENTED PROGRAMMING

clprolf introduces a new way of thinking about OOP, because we are used to creating directly pure objects. But all clprolf's object are still defined as computer objects, as well as OOP. So the habit seems light compared to think constantly at a ton of design patterns and principles. We could add that "object", in object-oriented programming, means "having a meaning", and not being only a data structure, so is it so new to precise a bit the meaning of our objects?

There is also something new, in the way of thinking about the interfaces. We have to choose about two interfaces, instead of directly using an interface. That isn't a big changing, because we know almost by heart concepts of capacity, for interfaces, or version.

### THE clprolf OBJECTS - ANOTHER PERSPECTIVE ABOUT OBJECT-ORIENTED OBJECTS - "SHEET OBJECTS"

What could be the difference between the vision of an object-oriented object in Java, and clprolf? Of course, it is the same thing. But in clprolf, an object is rather defined as a set of human-like algorithms and datas, and it could exist on a sheet of paper. We could almost call them "sheet objects". It's quite like a mathematical, or theoretical object. So with those clprolf objects what could we do? We could emulate real-world objects, with their actions and states, and we can emulate a computer as a quite-human worker.
It especially serves to prove that clprolf's object roles are natural, and root objects.

### A LANGUAGE FOCUSED ON ALGORITHMIC TOO - ALGORITHMIC LANGUAGE ENHANCEMENTS

* If we want to clearly understand clprolf's approach, let's talk about algorithms. clprolf is algorithmic-centric too, beyond being specialized in object-oriented features. The roles are well adapted to ease code writing at the implementation level. So kind of classes and interfaces should greatly help in algorithms writing and in obtaining system mastering and memorization. In addition of that, and in the same mindset, clprolf try to add tools for much painless code writing, with keywords like "underst", or those for concurrency and parallelism. The implementations writing is a continuously focused problem in clprolf.
Indeed, added features could look like algorithmic language enhancements, in a goal of better express algorithms, for example in concurrency and parallelism situations, the "underst" concept, or well-designed objects and interfaces.
clprolf aims to provide practical objects and interfaces, that are aligned with the process of intuitive algorithms writing. So it became algorithm-compatible to say, "I want an object with the capacity of eat", or "I just need an object who is a version of a ClientDAO". Or "I need two simulations of animal, a Giraffe simulation, and a Horse simulation. Then I need two workers to animate on screen these animations".

clprolf was built in a direction of never forget algorithmic programming facilitation. Including features that enhance algorithmic language is significant, as well as recursion helped in Quick Sort algorithm recognition. In the same manner, clprolf leverages of all existing algorithmic and object features of java. So new features like qualify computer-cognition specific methods, with "underst", for example, could permit to add power to the existing algorithmic language. And there could be a lack about concurrency and parallelism subject, in pure algorithmic language, as express that some parts of code should be in single-thread("one_at_a_time"). This is quite like handling the problem at the algorithmic level, because we can then focus on the fact that's matter for the algorithm.

* Let's take an example to illustrate this:

Imagine a hypermarket, where there is a unique queue, that dispatches people to many checkouts. Each people waiting to the main queue, have to read on a screen the number of the checkout to go, when it is their turn to pass. The waiting for the screen is due to the time needed for a checkout to become free. So in clprolf, the people have to read "one at a time" the screen for their checkout number. clprolf handles this as if there was a single thread, but doesn't matter that it is equivalent to synchronize all threads of each people. Each people are waiting for their turn, as a method locked by a "synchronized" keyword. But in clprolf, we could focus on the active flow having his turn, and not on the waiting processes. In the real life, in such examples, we see the main queue quite as a unique thread, but we see people as many threads as soon as they live their lives independently. Another problem is added to parallelism, it is the locks problem. Here, all the customers would have the same lock object, because all customers are blocking each other. In clprolf, we're talking about a monitor of turn, quite like if they would a person who would survey that all people in the main queue are obeying. If they'd have two main queues, they would need to different turn monitors. 

In the Java framework: 

```java
package clprolf.simple_examples.parallelism.hypermarket;


import org.clprolf.simolframework.java.Simu_comp_as_worker;

/* An example for parallelism, @One_at_a_time, @Turn_monitor, @For_every_thread
 * v1.0		20240203
 *
 */
@Simu_comp_as_worker
public class Launcher {

	public static void main(String[] args) throws InterruptedException {
		Object firstMonitor, secondMonitor;
		firstMonitor = new Object();
		secondMonitor = new Object();
		
		Customer john = new Customer("John", firstMonitor, secondMonitor);
		Customer ryan = new Customer("Ryan", firstMonitor, secondMonitor);
		Customer robert = new Customer("Robert", firstMonitor, secondMonitor);
		
		Thread johnThread = new Thread(john); //Customer's life!
		johnThread.start();
		Thread.sleep(500); // Just to have a gap
		Thread ryanThread = new Thread(ryan); //Customer's life!
		ryanThread.start();
		Thread.sleep(500); // Just to have a gap
		Thread robertThread = new Thread(robert); //Customer's life!
		robertThread.start();
		
		Thread.sleep(30000);
		john.setBlnContinue(false); //Example of usage of @For_every_thread.
		ryan.setBlnContinue(false);
		robert.setBlnContinue(false);
	}

}
```

```java
package clprolf.simple_examples.parallelism.hypermarket;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.clprolf.simolframework.java.Contracts;
import org.clprolf.simolframework.java.For_every_thread;
import org.clprolf.simolframework.java.One_at_a_time;
import org.clprolf.simolframework.java.Simu_real_world_obj;
import org.clprolf.simolframework.java.Turn_monitor;

/* To simplify the example, we are supposing that it takes two seconds for one checkout to be free to take one customer, in the first main queue. */
@Simu_real_world_obj
public class Customer implements @Contracts Runnable {
	
	private String name;
	@For_every_thread
	private volatile boolean blnContinue; //The main thread would say to stop!
	
	public void setBlnContinue(boolean blnContinue) {
		this.blnContinue = blnContinue;
	}

	public String getName() {
		return name;
	}
	
	public void run() {
		this.blnContinue = true;
		while (blnContinue) {
			//He is crazy: He is passing in loop in checkouts, first in the firstMainQueue, then in the second!
			this.waitToFirstMainQueue();
			try {
				Thread.sleep(200); //Time to pass to a checkout.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.waitToSecondMainQueue();
			try {
				Thread.sleep(200); //Time to pass to a checkout.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Turn_monitor
	private Object firstQueueMonitor;

	@Turn_monitor
	private Object secondQueueMonitor;

	public Customer(String name, Object theFirstQueueMonitor, Object theSecondQueueMonitor){
		this.name = name;
		this.firstQueueMonitor = theFirstQueueMonitor;
		this.secondQueueMonitor = theSecondQueueMonitor;
	}

	public void chooseProducts(){
	}

	/**
	 * The main queue is a unique queue to wait after a checkout to become free, among many checkouts.
	 */
	@One_at_a_time
	public void waitToFirstMainQueue(){
		synchronized(firstQueueMonitor){
			displayLog("I'm beginning the wait in the first main queue! ");
		//(...)It takes 2 seconds for a checkout to become free, once we are in head on the main queue.
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayLog("I'm ending the wait in the first main queue  - Great, I'm going to a free checkout! ");
		}
	}

	@One_at_a_time
	public void waitToSecondMainQueue(){
		synchronized(secondQueueMonitor){
			displayLog("I'm beginning the wait in the second main queue! ");
		//(...)It takes 1 seconds for a checkout to become free, once we are in head on the main queue.
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			displayLog("I'm ending the wait in the second main queue - Great, I'm going to a free checkout! ");
		}
	}

	/* To simplify, we handle display directly in the simu_real_world_obj! */
	private void displayLog(String message) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		  
		System.out.println( dtf.format(now) + ": Hey, it's " + name + ": " + message);
	}
}
```

In clprolf, it is fastly visible and understandable, that there is two main queues, and each Customer objects blocks the other customer waiting in the same queue.

### clprolf AND THE FUNDAMENTAL THEOREM OF SOFTWARE ENGINEERING

clprolf follows the guidelines of the Fundamental theorem of software engineering, by trying to add an abstraction layer on top of classes and interfaces. It aims to decrease complexity through the indirection of classes and interfaces roles.
	"We can solve any problem by introducing an extra level of indirection."

### ALIGNED WITH DOMAIN-DRIVEN DESIGN(DDD)

clprolf language and framework seem completely be in step with Domain-driven design(DDD).
Indeed, the definition of DDD in wikipedia is
	"Domain-driven design (DDD) is a major software design approach, focusing on modeling software to match a domain according to input from that domain's experts.

Under domain-driven design, the structure and language of software code (class names, class methods, class variables) should match the business domain. For example: if software processes loan applications, it might have classes like "loan application", "customers", and methods such as "accept offer" and "withdraw".(...)"

So clprolf appears to intrinsically embed DDD.

### clprolf AND THE DIFFERENT INTERPRETATIONS

clprolf allows to have our free interpretation of our class design and class meaning. For example, you could see business logic as the work of a business expert, so use a simu_real_world_obj. Other people could use comp_as_worker.

### God objects or God objects-like prevention
A classical OOP class, would be equivalent to a "class_for object" in clprolf. So it opens the door to God objects, or similar. That's why clprolf enables classes for more precise objects.

### A JUSTIFICATION OF THE TWO MAIN OBJECT ROLES - THE TWO BASIC OBJECTS IN clprolf

* They are not only roles, they are objects, basic objects in clprolf. But of course, they are compatible with OOP concepts, and are themselves OOP objects
* The first reason of object roles, is that in clprolf, there are only two root objects. Each object is either a simulation of a real-world object, either a simulation of a computer as worker. In OOP, all is object, but in clprolf, all objects are simu_real_world_obj or simu_comp_as_worker.
* In the clprolf programming language, there are only two kind of objects, without talking of the objects containing only datas. There are objects that can be considered as computers which would be workers, knowing of course that all that workers are also part of a sole computer. It's the simu_comp_as_worker classes. And there are objects which are simulations of real-world objects, containing simulation code which mimics reality. It's the simu_real_world_obj objects. In general, simu_real_world_obj are easier to write and handle because the code emulate the real-world behavior, and we have just to reproduce the real-world object. So this is the basic classes of clprolf programming language and framework. In view of existing applications, we can notice that all classes could be sort in a clprolf class, or otherwise contain these two kind of code. The principle is to have classes with coherence, and a single responsability, and to not mix pure computer code, and business or real-world emulation code.
* The object role are especially justified by the fact that objects should represents something, by definition. Otherwise, this is not objects. Ai-based tool quotation: "The principle that in OOP, and by extension in clprolf, objects are more than just collections of data and functions; they are representations of real-world or conceptual entities".
* Each kind of classes are based on the notion of algorithm, that's an important point in clprolf. Each role, simu_comp_as_worker, or simu_real_world_obj are both mimic real_world reality, even the simu_comp_as_worker which mimic a real-world worker(seeing the computer as a worker).
Algorithms permit to easily emulate realities, intuitively.
* The choice between either one kind or another is a matter of who is doing the responsability. If it's a computer job, then we consider that we need a computer as worker class. If it's a pure simulation class, as a "Horse" class emulating a real-world horse, there is no question about that.
* The goal is mainly to keep the simulation of real_world objects pure, because the pure simulation code is often straightforward, and regarding real-world emulation. So we have to separate the code that is not pure simulation, that's all. And we have to ensure, with "nature", that the responsability remains pure and unique.
* For the existing OOP classes, either the classes are inherently compliant, or otherwise we could imagine the best fit for clprolf, the main role, even if the class keeps multiple responsabilities.
* We can notice that we could have multiple interpretations and multiple design choices, but the most important, in clprolf's philosophy, is not to have a single way of think, but to clearly indicate how we see the world!
* It exists, in clprolf, pure data objects, "Information" and "Model_real_world_obj" classes. Theses classes are objects without methods. "Model_real_world_obj" are the same as "entities" in classical OOP. They are not a simulation, but for modeling. It is not simulation, in clprolf, because it has not behaviors. "Information" is for the cases where we need to have, for example, a set of variables for computer as worker usage. It is pure data structures, and they are considered as "Information", to keep an algorithmic way of work. It should be rarely used, in fact. But "Model_real_world_obj" could be frequently used, for example for database entities. The choice between "Information" or "Model_real_world_obj" is always intuitive, and evident. We know when we need a "Client" object, for example for database usage (it's like an entity, or a dto!).
* Although it is permitted, simu_comp_as_worker should not be destined for pure calculation classes. Because calculations are often part of pure business and real-world simulation code. It's evident that we always start, except in particular cases as system programming or some libraries, by writing simu_real_world classes. Then the simu_comp_as_worker are often used by the simulation classes. So the calculations are already done in the simulation classes. For example, calculations of a human-expert are part of the simulation code. A physics expert would have much simulation code with physics calculations. It's obviously simulation code. So generally, we always should put the calculation code in the simulation classes.
* object roles permit to check that we keep coherence despite inheritance.

### THE WAYS TO ENSURE CONSISTENCY IN CLASS AND INTERFACE DESIGN - THE GROWTH BY INHERITANCE
1) object roles ensure separation of distinct code and well-designed classes. The same is valuable for the interfaces, the roles guarantees sense and goal to the interfaces.

2) "NATURE" ensures consistency in inheritance, inside a same role inheritance - only for classes, not for interfaces
There is no way currently to ensure that by the compiler, but basic AI-like controls could be done by the compiler. For example, a error could be generated by the compiler if "TIGER" inherits from "Vehicule". There is a way to enforce inheritance in clprolf, in case of we still want to inherit and pass the semantic error. In fact, a error could have been done by the AI-like control, or not, and we could want to enforce the control. Having a compiler with AI-like control of "nature" is not mandatory, "nature" could be there just for programmers.

3) object roles permit to control the growth by inheritance, guaranteeing that the inherited part is consistent.

Inheritance is a way to grow a class, finally, and a well-designed class can be muddled with inheritance addition. That's why the inheritance control done by semantic rules of the compiler is crucial in clprolf. Semantic checks are possible thanks to object roles, because the rules are about the role of the inherited class. The same reasoning is valuable for the interfaces. Semantic control of the compiler ensures that an interface keep its meaning. And this is possible thanks to interface roles.

### ROLES ADDITION FOR CLASSES AND INTERFACES: GUIDELINES FOR COMPONENTS DESIGN
The addition of roles in classes and interfaces constitutes an equivalent as giving assistance, or guidelines in the process of class and interfaces design. Imagining what objects could be necessary to solve a given problem, and to write an application, is often a challenge. It can be a struggle to try to add on this all well-known object-oriented patterns and guidelines. So class and interfaces roles often shows the possible ways of class design and interfaces.

### THE UNDERST MODIFIER
The modifier "underst"("understanding") can be added to the methods of simu_real_world_obj( or even simu_comp_as_worker) classes. It marks the methods that have a role of "understanding" by the computer (recognition of objects in an image, for example). "underst" can also be used on simu_comp_as_worker.
	"underst" indicates code that is non intuitive, for example complex sorts implementations. Even the famous and widely used algorithms can be marked as "underst".
	It is placed before the result type of a method declaration. It can not be used for the methods of an compatibility interface.

### THE SUB-ROLE ANNOTATIONS OF SIMU_REAL_WORLD_OBJ
A simu_real_world_obj can be various things, include abstract realities. Don't believe simu_real_world_obj, in clprolf, could only represents concrete objects like car. Everything that is not a computer as worker job, and has methods, is, in clprolf, a simulation of a real_world object.
So, abstract notions, should be in such kind of clprolf classes.
To ease understanding and smart compatibility with classical object oriented used classes, clprolf has introduced annotations. These annotations are designed to be used on a simu_real_world_obj declaration. Thus, @Design_role, @GUI_role, @Human_expert, etc, are precisions you can add in your simu_real_world_obj, for better understanding of your interpretation and vision. But they are not mandatory. And these annotations don't enforce the reader to use the same interpretation.
These annotations are also available as a optional enum value "role", in @Simu_real_world_obj clprolf framework for java.

@Design_role : controllers, services, and so on, are understood, in clprolf, as design roles. A controller is supposed to control the job between several entities, services are supposed to supply or design a service, and so on. These objects are designed to have a role in a software architecture, and are comparison with the abstract function they play. But they stay abstractions, and do not precisely give a job at the computer as worker, they don't precise inherently the underlying algorithm.  So you can add @Design_role annotation, but these classes could be seen as another abstraction, for example a human expert for an MVC controller.
@Human_expert: Many of business job can be viewed as a human expert simulation. Business logic is a computer as worker-like interpretation at the basis, but could also be understood as a human-expert simulation.
@Expert_component: quite like a @Human_expert, but seeing it like a component expert in a job. A @Expert_component is simply an accurate @Design_role. It is perfect for people who stick with a technical and computational vision. This class is still a simulation, because it's quite like an ideal component, which would be able to be perfect on this role.

@GUI_role: software developers who prefer a GUI interpretation, can use @GUI_role for the buttons, windows, and other classes like that. This does not enforce people to have the same vision, and a window could also be seen of the simulation of a real-world machine, with his real buttons, etc.
@Machine_tool: A machine tool vision of a GUI, where a window is interpreted as a simulation of a machine tool, with concrete buttons, a little display for a text, and so on.

Examples:

```java
@GUI_role
public simu_real_world_obj Window { /*(...)*/ }
```

```java
@Design_role
public simu_real_world_obj Controller { /*(...)*/ }
```

```java
@Human_expert /* or @Expert_component */
public simu_real_world_obj MeteoExpert { /*(...)*/ }
```

```java
@Machine_tool
public simu_real_world_obj Window { /*(...)*/ }
```

Sometimes, some classes are especially made to be used for their static methods, by example the File class in .net. For the "File" case, static methods are surely used because there haven't kept states. The methods are independent. So the File class could be considered as an equivalent of a "global singleton", and can be marked with a @Human_expert_static(or Expert_component_static) role. The class could be called "FileExpert", because it could be compared to an expert about Files(ReadAllText(string path), etc).
In the case of Environnement class in .net, we are free to mark it with a "@Static" sub-role, if we don't want an expert interpretation( @Simu_real_world_obj(Role.STATIC)).

In the clprolf framework for java, as annotations are already used, the sub-role annotations are available through a optional role attribute of @Simu_real_world_obj. For instance:
@Simu_real_world_obj(Role.DESIGN_ROLE)
The roles are Role.DESIGN_ROLE, Role.HUMAN_EXPERT, Role.EXPERT_COMPONENT, Role.GUI_ROLE, Role.MACHINE_TOOL, Role.STATIC, Role.HUMAN_EXPERT_STATIC, Role.EXPERT_COMPONENT_STATIC

### COMPATIBILITY OF THE SUB-ROLES OF SIMU_REAL_WORLD_OBJ

* @Expert_component / @Human_expert / @Design_role (or @Human_expert_static / @Expert_component_static)

@Expert_component is interchangeable with @Human_expert. All simulation of human expert can be understood as a component doing this responsability.
From our example of network programming:

```java
@Human_expert
public simu_real_world_obj NetworkTalker {
//(...)
}
```

is equivalent to

```java

// A component which has the job to talk through a network
@Expert_component
public simu_real_world_obj NetworkTalker {
//(...)
}
```

Of course, @Expert_component is a design role too, and could be annotated @Design_role. So all @Human_expert can be transformed in a @Design_role too. But to transform a pure @Design_role to a @Human_expert (or @Expert_component), we often have to imagine a more precise role. For example, a controller could be viewed as an expert of the concerned domain.

* @GUI_role / @Machine_tool

These roles are easily interchangeable. It's a matter of preference.

### COMPATIBILITY WITH OTHER PARADIGMS

clprolf contains role annotations, in order to stay accessible with common interpretations and usage of classes, and for good understanding of the simu_real_world_obj use.
The kind of objects simu_real_world_obj and simu_comp_as_worker can be seen as only simu_comp_as_worker, as simu_real_world_obj is finally a specialized simu_comp_as_worker in goal of simulation of the real-world. The same reasoning is valid for model_real_world_obj, which are first a kind of "information" object, but an "information" as well.
So with this observation, we can say that there is only, finally, only simu_comp_as_worker classes(and only "information"), and this aligns with paradigms that do not differenciate classes. So we could see that even in clprolf, there is one sort of class or structures, like in classical object oriented programming(as well in procedural paradigm). In summary, it's quite like simu_real_world_obj would inherit of simu_comp_as_worker, and as model_real_world_obj would inherit from information, which is quite like regular object vision. These precisions aims to make a bridge with objects existing paradigms and code.

### clprolf IN GENERAL PURPOSE PROGRAMMING

clprolf could be interesting too for general-purpose, for those who are interested on a simulation vision. Indeed, even in system programming, we can easily find simu_real_world_obj as connections, sockets, file, threads, memory and so on.

### RELATIONSHIPS WITH EXISTING INTERFACES

Finally, java and other oriented objects programmers often uses "-able" interfaces, which has a marked meaning of capacity. And existing interfaces like Factory are well known as being version purpose interfaces. Interfaces are famous to be as a contract.

### NATURE VERSUS CLASS

The class keyword emphasizes mold and inheritance. Nature keyword limits a bit inheritance, and it's more restrictive, but keep behind the idea of inheritance, as well as having the same nature implies an inheritance. Nature aims to avoid pure technical inheritance, and promote composition in other cases. It could give arguments to limit multiple inheritance for simu_real_world_obj, as well as for simu_comp_as_worker, if it would exist in java, it could bring a solution to diamond problem.

### THE LONG_ACTION MODIFIER

As well as "underst", it exists a method modifier called "long_action". This modifier indicates that a method(especially in a simu_real_world_object), lasts during some times. It typically performs a loop, such for a movement of a video game enemy. All this methods would be called "long_action", in clprolf. These actions will be handled at the same time, for a single object, with an unique thread. This is especially used for video-game development, but not only. So the long action would be executed step by step, by calling the "continue" associated method. For example, a walk long action, would be associated with "continueWalk()". Then there will be an unique endLongActions() method, with call all sub-continue methods. The user would just first call the long action, as usual("walk()"), for example, and then he would just call endLongActions(), for the next steps of the action. This could suit, for example, for a video game, which would call endLongAction in the paint() method of the graphical container. "long_action" aims to keep an "action-oriented" perspective, even if we emulate threads behind. A boolean should be needed, and will be marked "@Long_action". The three associated methods are marked with the "long_action" modifier. In the clprolf framework for java, we introduce a "@Long_action" unique annotation, for all the cases. 
We can have a natural perpective on the long actions, and naturally permit to execute all actions of an object in the same time.

### PREVENT_MISSING_COLLISION

prevent_missing_collision is a method modifier(or @Prevent_missing_collision annotation in clprolf framework).
It is used especially for simu_real_world_object. It's a tool for simplify concurrency(especially with "long_action") and parallelism(multi-threading) for these objects. It can be used for any concurrency simulations, as real-time simulations.
These methods guarantees that theses actions, within or not in multiple threads, for simu_real_world_objects, such as in a video game, with the player and enemies, we don't have to worry about the missed collisions or interactions. For example, a setPosition method, marked prevent_missing_collision. All the involved parts have to be marked prevent_missing_collision, for example the getPosition. These parts have to be synchronized between them in case of parallelism(multi-threading).

### PARALLELISM AID
To simplify parallelism managing, four modifiers has been added.
one_at_a_time(method modifier): for synchronized methods, or containing synchronized blocks, to indicate that one thread at a time executes the job.
tour_monitor : attribute modifier on a synchronization lock object declaration, to ease understanding of the synchronization.
for_every_thread : attribute modifier on a volatile attribute declaration, highlightning the usability of the attribute in parallelism conditions.
dependent_activity: method modifier for synchronized methods containing a wait() call on a monitor object.
Four equivalent annotations have been added for the framework.

* Dependent activity in details

The methods having a call to the wait() method of a monitor, are dependent of another method from another thread. The behavior is like the well-known producer/consumer pattern, or similar use cases.
We don't talk much of consumer-producer, although it is compatible. The vision of clprolf is rather algorithmic here. We don't much matter of the producer, while writing the consumer, for example. We just have to know that we depend of another thread, for our execution.
In clprolf, we emphasize that the running of this code is linked to the running of the code of another thread, another action. The advantages are too simplify algorithms and programming, and tests.
So the use cases of classical synchronization, like those with @One_at_a_time, are clearly distinguished from our special ones.
Thinking only about wait() or notify() stuff focus us only on technical way to obtain a synchronization, but could disturb us from our final goals.

Imagine the example of the hypermarket, if we would want to add dependent activities only by thinking of the wait() and notify() things, it would be so hard!
The checkout of a main unique queue of the hypermarket, would need a new customer to come, after finishing a client. And the main unique physical queue monitor would have to know when a checkout becomes free. So do you think they are producers and consumers?
I think, however, that it seems more easy and natural to talk about having different activities, or different business. So clprolf adds quite abstraction on this, to simplify parallelism writing, because parallelism quickly become a brain-teaser, and the tests are very hard, and almost impossible. 

Let's take an example, in the Java framework:

```java
package org.clprolf.simple_examples.parallelism.dependent;

import org.clprolf.simolframework.java.Dependent_activity;
import org.clprolf.simolframework.java.For_every_thread;
import org.clprolf.simolframework.java.One_at_a_time;
import org.clprolf.simolframework.java.Prevent_missing_collision;
import org.clprolf.simolframework.java.Simu_real_world_obj;
import org.clprolf.simolframework.java.Turn_monitor;

/* A class with two dependent activities */
@Simu_real_world_obj
public class OneMessageMailBox {

		private String message;
		@For_every_thread //Notice that we can signal it, although we are not using volatile!
		private boolean full; //Not volatile here, because used in a synchronized block
		
		@Turn_monitor
		private Object mailBoxMonitor; //For not writing and reading at the same time!
										//But for manage dependent consequence too, so for the wait() and notify() calls.
			
		public OneMessageMailBox() {
			mailBoxMonitor = new Object();

		}
		
		@Dependent_activity /* read() is considered as a dependent activity, because his execution could depend of the write() method. */
		@One_at_a_time
		public String read() {
			synchronized(mailBoxMonitor) {
				while (!this.full) {
					try {
						this.mailBoxMonitor.wait(); // A classical guarded block, important for two reasons:
						// - Multiple readers might be awoken simultaneously, but only one can re-obtain the lock at a time. Another reader might read first, requiring re-checking the condition.
						// - We use a single monitor (mailBoxMonitor) due to Java's synchronization constraints. Notifications could wake up any waiting threads (readers or writers), so each must verify if their condition is met after waking.

					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
				
				this.full = false; //We just emptied the box.
				this.mailBoxMonitor.notifyAll(); //We need mails.
				
				return this.message;
			}
		}
		
		@Dependent_activity
		@One_at_a_time
		public void write(String message) {
			synchronized(mailBoxMonitor) {
				while (this.full) {
					try {
						this.mailBoxMonitor.wait();
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
				this.message = message;
				this.full = true; //The box is now full!
				this.mailBoxMonitor.notifyAll(); //We notify the waiting readers!
			}
		}
}
```

### PARALLELISM: "TURN SYNCHRONIZATION", VERSUS "APPOINTMENT SYNCHRONIZATION"
Clprolf introduced two keywords, "one_at_a_time", and "dependent_activity", to differenciate the two existing cases of synchronization.
"synchronized" is confusing, because synchronization could be about turn synchronization, and about appointment synchronization too (mais one thread wait after another finishes). 

Another reason, is that in clprolf, we are talking about kind of scenario, not how we implement this. The scenario implies that we would use a "synchronized" implementation, or a "wait()/notify()" implementation. So we still are in an algorithm mindset and reasoning.

### ABOUT CONCURRENCY AND PARALLELISM, IN clprolf
In clprolf, it is recommended to first handle pure concurrency, with a single thread, and then, if still wanted, adding parallelism. Some simulation actions take time to run, and are not just a simple change of states. That's why we introduced the "long_action"(or @Long_action, in the framework) modifier, to execute the action step by step. So the sole remainding problem, is to handle soon collisions, to not miss them, and "prevent_missing_collision"(or @Prevent_missing_collision) exists for that case. Finally, it could suffice in much cases, especially in real-time simulations, but we could try to add threads. But threads must sometimes be synchronized, and the synchronized parts are executed quite like there was an unique thread. So we have to evaluate if it is relevant to make more complex code, or not. If we have to do, the parts which have to be synchronized are often the "prevent_missing_collision" parts, and "one_at_a_time"(@One_at_a_time) is for parallelism. "one_at_a_time" is just worried of having quite like a single thread application for the concerned piece of code. And "turn_monitor" is here to assemble these parts, while using the same monitor object. The notions here agree with existing java notions like "synchronized", and "lock", but emphasize different and less technical aspects, that could help in such hard topics.
The purely parallelism problems, especially the "dependent activities", however, could be write directly, with multiple threads.

### LEARNING CURVE

Several weeks average might be necessary to become proficient in clprolf, for a experienced Java programmer, while he would be familiar with clprolf which is not so far from Java. Java programmers are used to manipulate concepts. clprolf's concepts are relatively easy to understand, for a experienced java programmer, and the reduced number of new keywords.

### clprolf GRAMMAR FROM JAVA SE 7 GRAMMAR(BNF-style from Oracle Site):

NormalClassDeclaration: 
    [class_for] SimolRole Identifier [TypeParameters]
                                [nature Type] [contracts TypeList] ClassBody

SimolRole:
	simu_real_world_obj
	abstraction
	simu_comp_as_worker
	comp_as_worker
	model_real_world_obj
	model
	information
	indef_obj
	
NormalInterfaceDeclaration: 
    SimolInterfaceRole Identifier [TypeParameters] [extends TypeList] InterfaceBody

SimolInterfaceRole:
	compat_interf_version
	compat_interf_capacity
	compat_interf
	
Modifier: 
    Annotation
    public
    protected
    private
    static 
    abstract
    final
    native
	synchronized
    transient
	volatile
	for_every_thread
	turn_monitor
    strictfp
    
VariableModifier:
    final
    Annotation
    with_compat
	
MethodOrFieldDecl:
	MethodDecl
	FieldDecl

SimolMethodModifier:
	underst
	long_action
	prevent_missing_collision
	one_at_a_time
	dependent_activity

MethodDecl:
	[SimolMethodModifier] Type Identifier MethodOrFieldRest

FieldDecl:
	Type Identifier MethodOrFieldRest

### TO COMPILE

The clprolf compiler is the more direct way to use clprolf. But we have the clprolf framework for java developers too.

"simu_comp_as_worker", "comp_as_worker", "simu_real_world_obj", "abstraction", "model_real_world_obj", "model", "information", "indef_obj" => replace with "class"
"class_for", "underst", "with_compat", "long_action", "prevent_missing_collision", "turn_monitor", "one_at_a_time", "for_every_thread", "dependent_activity" => replace with ""(empty string)
"compat_interf_version", "compat_interf_capacity", "compat_interf" => replace with "interface"
"nature" => replace with "extends"
"contracts" => replace with "implements"

clprolf annotations are ignored(@Design_role, @Human_expert, @Expert_component, @Human_expert_static, @Expert_component_static, @Static, @Machine_tool, @GUI_role, @LongAction, @Forced_inh, @Forced_int_inh, @Forced_pract_code)
EVERYTHING ELSE IS IDENTICAL TO JAVA

### THE clprolf COMPILER

A compiler exists, written with Antlr4 in java, which start from a java 8 grammar(antlr4-grammars).
The clprolf compiler parse clprolf code(.simo source files), and java code included(java 8). He stops when a syntax error is met, clprolf or java.
It does not, at the moment, deal with semantic analysis of clprolf, nor java. Semantic analysis in clprolf is not so important.
The compiler generates java code, if all is ok.
Then you have to use javac on the generated java code, in order to obtain executables with bytecode.

### clprolf CODE EDITORS

clprolf sources can be opened with Eclipse, choosing open with java editor, or with notepad+++->java language, and so on.
You can format the generated java code with Eclipse, for example, right clic on the java generated file, source, format.
clprolf framework for Java permit to use java's IDE and tools, and autocompletion on annotations, and is completely integrated with java.

### clprolf AND JAVA LIBRARIES

In order to help users who would want to use existing java libraries as clprolf, a classification proposal of java usual language libraries exists and will grow.
For example, "@Simu_real_world_obj JPanel extends JComponent implements java.awt.ImageObserver, java.awt.MenuContainer", or "@Compat_interf_capacity (java.awt.)MenuContainer". This help is not intended to contain compulsorily all the libraries.
clprolf framework annotations are used, while it is existing java code, in order to show that existing java code could be updated, and to help clprolf users.

### ALGOL AND clprolf

ALGOL("Algorithmic Language"), was designed with a strong emphasis on algorithmic and mathematical computation. It aimed to provide a language for expressing algorithms clearly and efficiently.  ALGOL 60, in particular, was influential in introducing features for structured programming and became a foundation for modern programming language design. clprolf, with its "simu_comp_as_worker" (Simulation of a computer as worker) role, shares a similarity with ALGOL's focus on algorithmic programming.  The "simu_comp_as_worker" role in clprolf is explicitly dedicated to the simulation of algorithmic language for a computer( as it is a simulation of a computer as worker). It's similar to ALGOL's original goal of serving as an algorithmic language.
Semantic Clarity: Both languages strive for semantic clarity. ALGOL's design encouraged developers to write code that closely mirrored the problem-solving process, and clprolf's class and interface roles provide clear semantics for the different types of components.
Minimalistic Approach: ALGOL's creators aimed to keep the language minimalistic, and clprolf also follows a minimalistic approach, focusing on a limited number of roles and concepts.

### SIMULA AND clprolf

Simulation Focus: Both Simula and clprolf have a strong emphasis on simulation. Simula was specifically designed for simulation, and clprolf also talks about simulation and modeling.
Object-Oriented Programming: Simula is often credited as one of the earliest object-oriented programming languages. clprolf also embraces object-oriented concepts by introducing roles for classes and interfaces, which is a fundamental aspect of object-oriented design.
Abstraction: Both languages encourage clear abstractions in code. Simula introduced the concept of classes and objects as a way to model real-world entities, while clprolf defines distinct roles for classes and interfaces to indicate their purpose and responsibilities.
Real-World Modeling: Simula's object-oriented approach was aimed at modeling real-world entities and their interactions. clprolf's "simu_real_world_obj" is designed to represent real-world objects. Principles of Simplicity: Simula was designed with simplicity in mind, focusing on providing a clear and efficient way to model complex systems. clprolf also follows a minimalistic approach to language design, promoting clarity and simplicity.

### SIMU_COMP_AS_WORKER, COMPUTER AS A WORKER

simu_comp_as_worker not only wants to separate simu_real_world_obj and pure computer tasks, but aims to see computer as a worker. The "simu" of "simu_comp_as_worker" emphasizes that, almost of we were talking of a real-world worker. So the computer's job would be to manage his peripherals and resources, and doing all job purely relative to him. The algorithm is intended to be executed for a worker, and that worker is a computer, but it could have been a human, except in the subject of the nature of the tasks. So simu_comp_as_worker really joins to ALGO 60 vision of the computer, in the sense of the algorithms using, as for abstract the worker, and for being quite human-like.

Simu_comp_as_worker, in fact, aims to reduce the impact of technical code, and transforme it in just a job done by a worker. It is almost as if the worker could be anyone, even a human worker. The distinction is just that the kind of job to be done have to be worked by the computer. So we ensure that we always know what kind of role to choose, because we can just answer to the question of who is doing the job! In a simu_real_world_obj, it would be an animal who would eat(), when calling the eat() method. The difference with a launcher class, for example, is that it is the computer who does the job, but he executes an algorithm in algorithmic language, as for the simu_real_world classes.
So it is effectively a simulation of a computer as worker, as well as the simu_real_word_obj simulations.

A comp_as_worker can use system abstraction(File, Connection, etc). And only a worker can use such system abstractions, for keeping the third person perspective. So it is a testament that each time a system abstraction is used, a comp_as_worker class is useful.
Compiler checkings check that point. There is an exception, for the factories of system abstractions, like connection factories, because the factory just instanciante the object, and doesn't use it. So a factory of a system abstraction can be an "abstraction" class.
We can enforced that with "@Forced_pract_code" annotation, for the simu_real_world_obj classes which need to right a little of technical code, for practical reasons.
The 'View' and the 'Model' of the MVC pattern can't be viewed as simu_real_world_obj in clprolf, because they use system abstractions. 

### INHERENTLY INCLUDE GOOD OBJECT-ORIENTED PRATICES AND PATTERNS

While object oriented languages does not mention directly design patterns and best oo pratices and principles, clprolf inherently includes good object oriented design principles and guidelines. Classical object oriented languages not supplies in the language itself such patterns or guidelines. clprolf can also benefit of design patterns or principles, of course, but number of guidelines and good principles are already embedded. So the programmer can focus directly on his first programming problem and goals.

### COMPUTE OR NOT COMPUTE

The calculations themselves, can be considered or not as a basic task of a computer. The English naming "computer" takes sense, of course. That said, complex computing task could be viewed as being in the role of a mathematical expert. ALGOL 60 includes much mathematical aspects in term of calculations, perhaps, as clprolf disposes of simu_real_world_obj to complete the job.

### clprolf AND THE SOLID PRINCIPLES

clprolf naturally adheres closely to well-know S.O.L.I.D principles. Single responsabilty is directly implemented with the class roles.
Open closed principle is encouraged when useful, with a understanding and clear design and design goals, and by separating roles of compatibility interfaces. Dependency injection is much easy and direct to implement and to be used and viewed. Interface Segregation principle, the "I" talks about "role interfaces", that immediatly joins the role of interfaces of clprolf. Liskov substitution principle("L") takes sense in clprolf, while clear understanding of "nature" of objects and classes, and with clprolf concepts in general.

### MACHINE TOOLS, EXPERT ROLES, COMPUTER AS WORKER, ETC., WELL ESTABLISHED PERSPECTIVES

simu_real_world_obj can have a more precised role, which can have an interpretation as machine tools, for graphical interfaces, or human-expert roles, for classes which could have a design role too(especially controllers).
"Human expert" is quite similar in the intent, as expert system goals.
And metaphors with real-world objects, like "Button", or "Window", are famous too. 
About the computer as worker vision, we already use such vocabulary, when talking about a "server", or a "worker thread" for a system thread, which are well-established terms.

### TEACHING PROGRAMMING OR JAVA TO CHILDREN

Teaching advanced programming to children seems possible to children, while difficult with Java. clprolf, or clprolf framework, can be a way to learn easily java too. Human expert or machine tools roles, as well as computer as worker, which are intrinsically part of clprolf or clprolf framework, can be a way to explain complex topics to young children, and render object oriented programming accessible to children.

### WEB PROGRAMMING

clprolf framework can be useful too in web programming. Servlet could be annotated like @Simu_real_world_obj(Role.HUMAN_EXPERT), of an expert in serving, which work is to call the right (business) expert(for example, a weather forecast expert).
The hidden servlet generated for a .jsp page for the view, could be interpreted as a simu_comp_as_worker associated with the business expert, for display and user inputs.

### COMPATIBLE WITH EXISTING CONCEPTS

Some clprolf concepts used can be compared finally with some existing concepts, like the concept of business logic.

* Near from business logic idea:

The idea of separating business logic code and low level code which handles managing a database, and so on, looks like the simu_real_world_obj and simu_comp_as_worker. It would be a simu_real_world_obj which would simulate an human expert work, and simu_comp_as_worker would manage low-level details.
clprolf goes further while considering simulation code, like business logic for this real-world object. But the reasoning can be compared.

* Adheres naturally to SRP
Single Responsability Principle(SRP): clprolf encourages naturally the SRP, with the kind of class separation, and also with the "nature" keyword.

* clprolf is natively well adapted with the MVC pattern, with his simulation focus, well made for the controller(simu_real_world_obj), the model(simu_comp_as_worker), and the view(simu_comp_as_worker), for example.

* Adheres closely to the DAO Design Pattern. simu_comp_as_worker, and compat_interf_version suits closely for implementing the DAO pattern in clprolf.

* Compatible with loose coupling principle, bridge pattern, "program to an interface not an implementation" principle, with the compat_interf_version interfaces, and "with_compat" keyword. As well aligned with Dependency Injection(DI) pattern(with with_compat keyword).

* Well suited for design patterns and object oriented principles in general(composite, and so on), as clprolf brings accuracy and clear intents. For example adapter design pattern, with especially compat_interf_version.

* About interface inheritance:
For the interfaces, clprolf not directly talks about interface inheritance(nor java, anyway). But if we want we can use it as a capacity, it would show that this inheritance is not of the same nature.

### RULES ABOUT INHERITANCE CHECKING OF CLASSES AND INTERFACES

Classes and interfaces roles allow some semantic checks, done by the compiler or semantic checking tools. Those checks can be ignored, by using "@Forced_inh", "@Forced_int_inh", and "@Forced_pract_code" annotations(in clprolf language as well as in the java framework).
The semantic control permit the compilation to find contradictions that can imply that the roles indicated on classes or interfaces are not coherent and have a problem. A fruit class which would be declared as simu_comp_as_worker could not be the mother class of a Apple class declared in simu_real_world_obj.
Thanks to the semantic control about contradictions, we can automatically detect a misuse of class or interface roles, and enforce the user to respect the language definition and philosophy.
These compiler controls still permit to have a free interpretation of our classes and interfaces.

* Summary of the semantic rules for inheritance
In order for the users to easily learn and master the rules, it's quite easy to explain their intent in few words.
A synopsis of the semantic inheritance rule could be that we must sort out the sheep from the goats, in clprolf. But the imposed rules are the behavior that we intuitively have while programming clprolf, and we are free to them with "forced" keywords.

* The semantic checks made by the compiler are all in four kind of rules:

All the rules about semantics are only on the direct level of the class(the single level), and not at multiple level. This simplifies the rules applications and understanding.

class inheritance contradiction:
	The direct inheritance of a class, his nature in clprolf, should  be coherent with the role of this class. The role of the mother class should be the same of the role of the class itself. For example, the nature of a simu_real_world_obj have to be a simu_real_world_obj. Or a simu_comp_as_worker class must inherit of a simu_comp_as_worker_class.

Contracts contradictions
	A class should implement only one compat_interf_version. It's quite evident, because of the definition of a compatibility interface version. A class should be only the version of one thing. But a class can have multiple capacities, or can be the version of something and have capacities in addition.

Inheritance of interfaces contradictions
	A single rule in this topic: the direct inheritance of an interface can be only capacities. We can increase an interface only in terms of capacities. This is for coherence with the compatibility interfaces roles

Reasons: A compat_interf_version stands for a unique version, and can not be composed by another compat_interf_version (in particular case, such for particular cases of evolutivity, we could use @Forced annotations). And a compat_interf_capacity can not be composed by a compat_interf_version.

Impact of the classes and contracts contradictions:
	 Thanks to inheritance and contracts declarations, the compiler can find contradictions in the chosen roles for classes and interfaces. This leads to enforce the code to have coherent and correct, while allowing all types of interpretations. And the programmer is enforced to respect the class and interface roles. This is a way for the compiler to ensure the correct utilization of the roles.

Examples: The programmer can not declare a Fruit as simu_real_word_obj, a Banana as simu_comp_as_worker, because the compiler would forbid this when seeing the class inheritance contradiction. But the multiple interpretations are still allowed. For the interfaces, having a "Sortable" interface declared as a compat_interf_version would be detected by the compiler when trying to establish a contract with Sortable and Measurable(a compat_interf_capacity). The checker would see the problem with the contracts contradictions test, and will understand that there is something incoherent. The problem here was that the programmer declared Sortable as a version, and he betrayed his incoherence while trying to use it with a class which implement a capacity interface.

System abstractions usage contradictions
	Semantic checkings is made by the compiler, to ensure that system abstractions(like "File", "Socket") are only used by simu_real_world_obj classes(or "abstraction" classes), except for the case of @Forced_pract_code marked classes.

* Ignoring inheritance checking
These checks can be ignored, by using "@Forced_inh" and "@Forced_int_inh" keywords, on the class or the interface, or directly before the name of the inherited class or interface. @Forced_inh means "forced inheritance", and is for class inheritance. "@Forced_int_inh", is for interface inheritance(included interface to interface inheritance). So all the existing java code can be used and accepted, and we can program as we want to do it. Applied to a class or interface, these keywords concerns all the inherited types of the concerned class or interface. In the C# and PHP8 frameworks, there are only "forced" attributes upon the class or the interface, because of C# and PHP8 attributes limitations.

In the clprolf framework:

```java
/*All the inherited class are in forced inheritance, they are all accepted in inheritance(even if they are incompatible by being a Simu_comp_as_worker) */
@Forced_inh
@Simu_real_world_obj
public class Car extends CarRealization {
//(...)
}
```

OR

```java
@Simu_real_world_obj
public class Car extends @Forced_inh CarRealization {
//(...)
}
```

With

```java
/* CarRealization is the technical class for displays or inputs handling, of the Car simulation */
@Simu_comp_as_worker
public class CarRealization {
//(...)
}
```

* The clprolf compiler doesn't currently proceed clprolf semantic checks, nor these rules. And the framemworks haven't currently tools for checking this either.

### INSIGHTS ABOUT INHERITANCE AND clprolf

What is inheritance in OO programming? Inheritance could not be only a copy of attributes and methods, which we could call abusive inheritance when alone. In that case, composition should be used instead of inheritance, and everyone describe by the way composition as a "has-a" relationship. This aligns with the common principle of "composition over inheritance". Inheritance has a meaning of being of the same family too, and is a "is-a" relationship, by definition. In the beginners package of the clprolf frameworks, we meet empty classes and interfaces, but their job is yet crucial. It's because the children classes and interfaces inherits of their sense, and not only of properties and methods. 
clprolf allows to secure inheritance and avoid having only a technical inheritance. Having roles, added with semantic inheritance control on roles, are a guarantee that we think about a meaning too. So a business class can not inherit from a computational class.
But this could be not enough, and inheritance might be still incoherent. A Human class could inherit of a Heart class, because there are both real-world objects simulation. That's why the "nature" keyword prevents of having inheritance without being really the same kind of thing.
So we can see clprolf roles as a securing of object oriented programming, nothing more, and as if we would proceed the same way as a programmer who would respect good practice rules in OOP.
That said, clprolf let us choose the role and interpretation, and clprolf let us enforce inheritance in case we want to not respect the semantic rules(with "Forced_inh" and "Forced_int_inh"). So we are sure of flexibility in practical situations, and that clprolf is as powerful as classical OO Languages.

### clprolf FRAMEWORK FOR C# DEVELOPPERS

As C# is close to Java, a clprolf C# framework provide attributes like the java annotations, despite Java is the main language in clprolf. It permits to leverage clprolf in C# too, for the C# users. It acts as the java annotations, except for some details. The interface and class attributes are more precise by targetting a class or an interface. But there is no 'Nature' or 'Contracts', nor 'With_compat' on a local variable, due to C# attributes limitations. It is not very important the lack of 'Nature' and 'Contracts', because of the existing ":" in C#, and once the users know the philosophy of clprolf about this. For the "With_compat", the most important is about field and parameters, not about local variables. And interfaces names begin by 'I', in C#, they are remarkable.
"Forced" attributes are only upon the class or the interface definition, because of C# attributes limitations.
Like in the java framework, there is a beginners package too, which permit to keep object-oriented habits in clprolf, using inheritance instead annotations.

### clprolf FRAMEWORK FOR PHP 8

A PHP 8 clprolf Framework is available too, as well as for C# and Java.
Nature and Contracts are not present due to PHP attributes limitations, and With_compat is not on local variables.
TurnMonitor, For_every_thread, One_at_a_time, Dependent_activity, are deleted too because thread support is not supplied.

### THE COMPAT_INTERF_VERSION AND LOOSE COUPLING

What does loose coupling mean? It means that we should be dependent on interfaces and not on implementations. That said, we still depend on the signature of the methods, and so on, of the interface. We still depend on the chosen implementation, but we can choose it as we want. So it could mean that we can have multiple implementations for a given interface. Not all the use cases, and not all the real-world examples need that. A great need is in collections of public libraries, for example, but there could have other interesting use cases. But loose coupling with interfaces brings complexity too, and we shouldn't abuse of it, if the need of choosing the implementation is not so important. For example, debugging on an IDE can become impossible, because we can not enter in the implementation methods, code becomes less clear, and so on.
Another inconvenient of the interfaces, is that we lose the inheritance of the concrete classes, and the associated polymorphism and meaning. We can have inheritance of interfaces, but usually we don't use it here. And we can notice that in clprolf a version can not inherit of another version interface.

The compat_interf_version was designed just to know what we're doing with interfaces. But it is evident that it can help about loose coupling usage. Be aware that a compat_interf_version is the sole choice for loose coupling, and it brings security and clarity to use it for that. The use of semantic rules for interfaces, for example, ensures a correct utilization of the compat_interf_version interfaces. Compat_interf_version shows immediately a loose coupling goal interface, and the 'with_compat' keywords or annotation shows immediately his usage. But a version compatibility interface can have another use cases, for example a DAO with many different ways to do the job, by different database systems, web service calls,... This use case has not, apparently, a loose-coupling goal. It is rather a need of being able to change, when needed, the technical way to work.
Dependency injection, is a great principle for not forget that concrete class instantiation should be done outside too. "with_compat" keyword is a great way to immediately notice, at a glance, dependency injections locations.

So version compatibility interfaces and with_compat keyword allow to judiciously and smartly handle the eventual loose coupling. It prevents somehow to excessive loose coupling.

### INTERFACE INHERITANCE AND clprolf INTERFACES ROLES

Why interfaces don't replace inheritance? First interfaces always needs an implementation to be used for working, at the dependency injection moment. Then interfaces inheritance, in a class, does not permit to inherit implementations, but only from method signature. Suppose a Runnable Simu_comp_as_worker class, Runnable does not really constitute an inheritance, because we still have to implement the concerned methods, despite we inherit from Runnable! It's an inheritance of signature. That's why there is only two kind of interfaces, version, and capacity. Complete inheritance always comes by the fact that we inherit from a class, which could have implemented an interface method. But the child class inherits from this method implementation by the class inheritance, not by the interface inheritance. It only inherits of the signature of the method.

### THE USE CASES OF SIMU_COMP_AS_WORKER

In clprolf, we should avoid, in general, to use a simu_comp_as_worker, because the real_world_objects are more intuitive and not so technical, generally. For example, although the interpretations are free, in clprolf, it's more recommended to see a "Sort" class as a simu_real_world_obj, than a simu_comp_as_worker. The recommended examples where we need a simu_comp_as_worker, are, in general, and if wanted, technical classes like DAO. Or it can be technical job for handling displays and keybord inputs of a simu_real_world_obj, an equivalent of the view of MVC. So the Model and the View of the MVC should be in a simu_comp_as_worker, but we always look at this as we want! Each simu_real_word_obj class should, theoretically, have a corresponding technical realization on computer class, with a simu_comp_as_worker role, by example a simu_comp_as_worker AnimalRealiz. AnimalRealiz contains the computational code and tools in charge of the interactive realization on computer of the simu_real_world_obj Animal. This is a fundamental use case of simu_comp_as_worker in clprolf, and this aligns with the model and view goals. Model and View classes can be objects in composition of the realization class. Another case is a launcher like a launcher of an application, and should, in general, be a simu_comp_as_worker too. Or it could be also system libraries or applications. But remember that a simu_comp_as_worker, even in system programming, often use much simu_real_world_object, for the graphical interface, or the memory, the connections, the threads, and so on. But this is the computer who do the job!

### clprolf ROOTED IN REALITY AND TRY TO REMAIN SIMPLE

In clprolf, the mindset is to always try to stay near the concrete reality. So we ensures that real-world use cases would be ok.
For example, simu_comp_as_worker reminds us that there are a compilation in assembly language after, who looks like a technical solution for our original source code. Compatibility interfaces aims to keep it real by being aware of the concerned usage. clprolf avoids abstraction without concrete purpose, because programming and making a software is a concrete job and perhaps there is no much place for this.
Another distinctive characteristic of clprolf is that we're doing all for the reasoning and problems remain independant by the fact it is a software what we're doing. So all that we're talking about could be done with a sheet of paper, and a reasoning, independently of a physical computer. Even the simu_comp_as_worker methods mimic a computer doing a job, almost as a human doing the job, with special capacities. So we are sure that all always stay simple.

### THE OBJECT ROLES ON LEGACY CODE

Object role choice on existing java classes can be more tricky then writing clprolf code from scratch. I'll give clues for those who would need help about clprolf object roles on legacy java code, to find the appropriate role. For example, I can say that the GUI classes like those in Swing or Java FX can be well suited for a simu_real_world_obj, with either a MACHINE_TOOL role, or a GUI role.

### TRYING TO BRING A MATHEMATICAL-LIKE PROOF OF clprolf INTEREST

We can start from the Single Responsability Principle, which claims a clear and single purpose on each class.
clprolf offers a way to obtain not only clear and singular purpose of each class( and interface), but a meaningful purpose too. Having a meaningful purpose help communication with others, and memorization, and ease the class or interface creation. In addition, clprolf offers a way to add meaning to non-clprolf classes, which could be a way to master all possible design solutions.
So with simu_real_world_obj and simu_comp_as_worker, we ensures that all classes can be categorized in this kind of objects, while permitting everyone to keep his own interpretation. Having this precision made on a class, is a testament that we have meaning about it. So that looks like what we wanted to demonstrate. We could not say that clprolf is useless, because it would be equivalent to say that adding meaning is useless.

### IF clprolf WOULD BE WITH MESSAGES LIKE SMALLTALK-LIKE LANGUAGES - ALIGNMENT OF SIMU_COMP_AS_WORKER WITH ALAN KAY'S VISION OF AN OBJECT

* Differences with Smalltalk about the sender of the messages : talking instead messages, and the animator of the objects
clprolf is rather related to Simula, because objects are the key point in it. Like Simula, clprolf uses methods calls instead, because the programmer intuitively knows that he has to call methods. It seems more natural to do the actions, like with method calling, than to say the object to do them.
Smalltalk vision is quite interesting, but much fosters messages, because it uses messages. With clprolf, if there would have messages, the vision would be rather talking with objects, to stay close to objects. 
It would be the programmer who talks with the objects, and that's here where you can see that it is a program. An animal needs the programmer to send a message to eat, or talking to him to eat, for effectively eating. He is the conductor of the orchestra. Objects are here just puppets, and programmer is the puppeteer. So to be an effective puppet master, we need to master the objects, and in an intuitively way talking to them. And the memorization of the existing objects, and how you can "talk" to them should be easy. It's a testament that we need well-designed objects.
We can notice than when we have a "talking" with objects vision, interfaces become just a required vocabulary. So "with_compat" would be just asking for an object knowing this set of words. It's a testament too that interfaces are about capacities and versions.
The computer, on runtime, performs the method calls, and so on, and the simu_real_world_obj objects become simu_comp_as_worker too, in a way, and here we could say that objects become the messages senders, like in Smalltalk's vision. Thus it seems that it is a more technical and lower level vision, the communication between objects.

With the clprolf objects, speaking to a simu object, is equivalent to speaking to the real-world associated object, as it is a simulation. Talking to a simu_real_world_obj of a Horse, is quite like talking to a real-world horse. And talking with a simu_comp_as_worker, is like talking to a real-world worker, as we emulate a computer as worker. So it is the programmer who animates the objects. But in Smalltalk, it is an object which talking to another object, thus objects which animate the objects. Choosing the programmer as the main actor of the object animation, permits to be conscious that it is the developper the magician of the orchestra of objects. And it is rather quite what we're doing, we're doing simulation of objects, so we are rooted in reality.

* Differences with messages vision: Algorithmic mindset, even for the simu_real_world_obj
Telling that this is the programmer who sends the messages is a way to keep an algorithmic vision too. It leads us otherwise in an abstract vision quite far from real-world processes.Telling that a transferMoney method of a bankAccount sends a message receiveMoney of another bankAccount makes us a bit forget the algorithm, this one becomes hidden by overloaded communication. But we could say that in the transferMoney algorithm, there's a moment where we send a message receiveMoney to another bankAccount. In clprolf, we're trying to always have an algorithm mindset, even for the simu_real_world_obj. clprolf is implemented with underlying languages using method calls instead of messages communication(Java, C#, PHP, at this moment), so with languages qualified of not purely object-oriented. This guarantees this algorithmic mindset. clprolf is compatible with the procedural paradigm too, because procedural means algorithmic programming. Indeed, simu_real_world_obj are based on algorithms to describe their behaviors.

* Simu_comp_as_worker aligned with Alan Kay vision of OOP:
Alan Kay coined the term “object oriented programming” at grad school in 1966 or 1967.
Alan Kay said:
	"The big idea was to use encapsulated mini-computers in software which communicated via message passing rather than direct data sharing — to stop breaking down programs into separate “data structures” and “procedures”."
So the simu_comp_as_worker are equivalent to the mini-computers of Alan Kay's quotation. Each simu_comp_as_worker can "talk" with others, and this is the same as messages. Every simu_real_word_obj is, at run time, a simu_comp_as_worker, in a technical way of thinking.
The sole differences with Alan Kay's vision of OOP, is that we're talking about workers, and we'd rather use the "talk" term, for the communication. So in clprolf, it would be instead a set of workers talking together. The last difference is that we have this vision only at execution time, and we consider this as a technical vision.
clprolf's ideal vision, is such a network of objects, but with both simu_real_world_obj, and simu_comp_as_worker, and it aims to stick at reality, independently of a computer. And the message sender in the case of this network of objects, would be, in this case, the programmer.
When I'm talking of network, it's just the final system with all our simu_real_world_obj, and our simu_comp_as_worker! We have such system in the applications, by definition of the language.
For Alan Kay, who created the term "object oriented", an object is such a "mini-computer". So a simu_comp_as_worker can be considered as an object in the Alan Kay's sense.
In clprolf we're talking more about the computer as a whole. But the simu_comp_as_worker could indeed be viewed as independant micro-computers, thanks to the encapsulation, and the communication between them(messages).
The sender of the messages of the simu_comp_as_workers can be here the simu_comp_as_workers themselves, thus communication between objects. It's because we have only simu_comp_as_workers in the system. So we can say that there is a direct communication between them, if we want.
It's evident that a simu_real_world_obj can be viewed as the same simu_com_worker, if we use a technical interpretation of his work. A "Sorter" class can be viewed as a simu_real_world_obj, for example, of a HUMAN-EXPERT, or as a computer as worker, a computer program for sorting. So, as all that there is in clprolf is simu_real_world_obj, and simu_comp_as_worker, we can obtain an equivalent system with only simu_comp_as_worker, as Alan Kay's vision.

### PERFORMANCE OF THE LANGUAGE

* clprolf just adds semantic and clarity in java. It has no direct impact at all on performances. The object roles aims to reduce excessive inheritance, as common oo principles, or easy automatic use of other patterns or best practices. The clprolf's class and interfaces keywords only servs for semantic checkings. So this semantic rules adds checks on compilation time, but not at execution time. Other keywords of the language are only for the programmer or the compiler, but are not visible on the generated code. So the clprolf executable is quite like a java executable. This is the same for the associated java, C#, or PHP frameworks.
* Well made and well mastered and understood systems are often a main point for obtain performant systems. Increase the potential to design better architectures or applications often lead to find optimizations, or simply contribute to avoir misconceptions. So we have to gain with clprolf language about performance and efficiency for these reasons too.

### FUTURE DIRECTIONS OF clprolf

As well as there is only objects in pure OOP, the object roles in clprolf aims to be stable. clprolf aims to improve itself with real-world examples, if needed, but just in a goal of completing a missing functionality. For example, "underst" came later, as well as concurrency and parallelism aids. But the core principles remains stable from beginning. Some keywords could smoothly adapt their name, but keywords name now look stable.
clprolf aims to stay minimalistic, and to only simplifiy object oriented programming, or programming in general.
clprolf could add, eventually, other underlying languages with new framework versions.
The core principles of clprolf are simple so they can be easily understand and proved.
All the clprolf principles are constantly compared to other points of views, and we try to see if there is incoherences, as we have done later by thinking about messages in OOP and clprolf, finding a common vision with Smalltalk and Alan Kay.

### A COMPARISON OF clprolf AND CLASSICAL OBJECT-ORIENTED VISION OF THE DESIGN PATTERNS - EXAMPLE OF THE PROXY PATTERN

Let's compare the clprolf and classical oo language version of some design patterns. It could bring us some real-world examples, and check if clprolf is great for this too. This is not a critical of the design patterns at all, nor of the famous object-oriented languages. Anyway clprolf is a oo languages, and of the same family than classical oo languages. 

The proxy pattern

The real subject is the so called original object, I will use that well-known term, in this chapter.
With the proxy pattern, we could see advantages in clprolf's vision. First, by marking (for example) simu_real_world_obj the proxy and the real subject, we remember and understand easily that the proxy aims to have the same meaning as the original object. And we can easily think at a concrete example, an image, for example.
Then, we can quickly see that the used interface could be a version. The choice stands for the proxy should be as the real subject, but just another implementation. In general, the proxy adds security to the original object. So we'll have to ask such object with a with_compat, and we easily understand that it is weakly coupled.
We can fastly be aware that we could use in some cases inheritance, if the proxy object instantiates systematically the real subject. So it would be strongly object-oriented, thanks to inheritance. Inheritance permits polymorphism, and code reuse, and we should it if possible. In that case, we could realize that in clprolf, a pattern wouldn't be necessary.
We can quickly also say, that we can use composition in some cases too, and that would resemble at the adapter design pattern. In clprolf, the patterns seems more memorable. In that case too, the use of a pattern seems quite useless, and we would have been able to intuitively write this code. And the writed clprolf code, even intuively written, would be well-designed and readable.
In summary, with clprolf, we feel that we master the proxy design pattern, and that perhaps we wouldn't need it.

In pure object-oriented code, except for the very experienced programmers in design patterns, we just memorize that there is a proxy object, an interface, a real subject. But we can easily mix all that stuff, especially because there are much similar patterns, with similar use cases. The fun seems more distant.
With the clprolf mindset, it feels that we have easily a critical mind, which is useful about patterns. The difference between the proxy design pattern and the adapter seems to only be that the interface might not be complete, in the case of the proxy interface. But it's a minor difference, for a programmer, once it gives the programmer the design.
With the clprolf work on this, we are not focused on the "proxy" role, which seems strongly coupled with the composition idea, and we could adapt more easily to the concrete real-world example. It seems difficult, in the case of the proxy pattern, to generalize to all cases, so solutions could be brought be the programming language itself.

We could notice that in clprolf, we can talk about the case where the real-subject is a simu_comp_as_worker too. In that case, we could ask ourselves if this is a normal that the real subject doesn't contain inherently the security of the proxy. Of course, the proxy pattern covers more cases and each case could be discussed. We could see in the case of a simu_comp_as_worker, that perhaps inheritance could be a greater choice in general, because there would have less reasons to not have the same methods of the real subject.
So with clprolf, we could think about the different kind of real subject, which is not possible at all with oo languages like c++ or java.

We could explain the proxy pattern even to a child. This is not the case at all with the classical version with classical oo. clprolf aims to obtain a better master of the designed system, too, even for the experienced programmers.

### clprolf AND ALGORITHMS WRITING INFLUENCE

clprolf has been created only to simplify and help in object-oriented code writing and understanding. But we can notice that it acts as a tool for supporting algorithm writing too, indirectly. For example, underst could bring clues for writing hard algorithms, as well as the object roles. Writing a sorter algorithm with a simu_comp_as_worker, or a simu_real_world_obj, could bring us different perspectives. 
I think that the influence of clprolf about algorithms writing is due to making well-designed objects, or methods, nothing more. So it's a testament that it is an indirect influence.

* AN EXAMPLE OF WRITING A INSERTION SORTER CLASS, WITH BOTH SIMU_COMP_AS_WORKER AND SIMU_REAL_WORLD_OBJ
To demonstrate the difference and the usage between a simu_comp_as_worker and a simu_real_world_obj class, let's take an example. We have to write a sorter by insertion class, with the famous sort by insertion algorithm. Some people would use a simu_comp_as_worker, others a simu_real_world_obj. I tried to use both, to study the results, but I would use preferently a simu_real_world_obj, for this kind of job. Remember we are free to choose the interpretations of the classes we write. And even if a programmer use a role, we are still free to read it as we want, once we know the initial preference.

Let's see my result for the two simple examples. I tried to stay simple, and not adding interfaces.

The InsertionSorterWorker seems perhaps more direct. He's using the traditional insertion algorithm. For him, sorting is just browsing each element of the initial array, and inserting just this element in the new sorted array. Inserting an element is just call the findIndex(), and then insertAndShift. InsertAndShift is just virtually resize the destination array, move the elements on the right, including the element in our future place. And finally it has to copy the value at the correct wanted index. All this seems straightforward, and quite easy.

The InsertionSorter more mimics a human sorter, while using the well-known insertion sort algorithm. But it acts more in a human manner, so perhaps sometimes we would use some variants and could propose more innovative solutions. But it still stays the same, just a different point of view. The sort is seen here just as putting elements, one by one, in the final array, no matter the choosing candidates order. So we arbitrarily decide that we would start from the end, it's the same! The putInFinalArray immediately saw the lazy case of the first element of the sorted array. Then it calls findWhereToPut method, which works only with a non empty array, because, the expert doesn't bother for nothing. In the findWhereToPut, the expert may find it necessary to search by dichotomy, if he likes! The worker version could have not seen that. The findWhereToPut proceeds a bit differently from the worker version. The expert first gets rid of the case where the element is the last. Then he is sure to find, and he decided to start arbitrarily from the end. The makePlaceAtTheRight() method could feel like moving from the end is non intuitive and could use @Underst, though we could remark later that we do like such stuff, even for a human. So the "@Underst" is not so justified.

We could remark that both approaches use the same well-known algorithm, and the result is quite the same. But the work is done perhaps in a different way, and both ways are valuable and justified. The goal of the roles are not primarily to influence algorithm writing, but just indicate the meaning of the class. The simu_real_world_obj could seem more fun and great for communicate about it, but both are two ways to do the job.

Here is the final code:

```java
package org.clprolf.examples.miscellaneous.insertionsort;

import org.clprolf.simolframework.java.Role;
import org.clprolf.simolframework.java.Simu_comp_as_worker;
import org.clprolf.simolframework.java.Simu_real_world_obj;

@Simu_comp_as_worker
public class InsertionSorterWorker {
	private int array[]; 
	private int workingArray[];
	private int virtualLengthWorkingArr;
	
	public InsertionSorterWorker(int theArray[]) {
		this.array = theArray;
	}
	
	public int[] sort(){
		this.workingArray = new int[this.array.length];
		this.virtualLengthWorkingArr = 0;
		
		//Browse each element of the original array
		for(int i = 0;i<this.array.length;i++) {
			this.insertElement(array[i]);
		}
		return this.workingArray;
	}
	
	private void insertElement(int value) {
		int place;
		place = this.findInsertionIndex(value);
		this.insertAndShift(value, place);
	}
	
	private int findInsertionIndex(int valeur) {
		if (this.virtualLengthWorkingArr == 0) return 0;
		for(int i=0;i<this.virtualLengthWorkingArr;i++) {
			if (valeur <= this.workingArray[i]) {
				return i;
			}
		}
		return this.virtualLengthWorkingArr;
	}
	
	private void insertAndShift( int value, int place) {
		//I virtually enlarge my final array
		this.virtualLengthWorkingArr++;
		for (int i=this.virtualLengthWorkingArr-1;i>place;i--) {
			this.workingArray[i] = this.workingArray[i-1];
		}
		//Adding the new value.
		this.workingArray[place] = value;
	}
}
```

 And:

```java
package org.clprolf.examples.miscellaneous.insertionsort;

import org.clprolf.simolframework.java.Role;
import org.clprolf.simolframework.java.Simu_real_world_obj;
import org.clprolf.simolframework.java.Underst;

@Simu_real_world_obj(Role.HUMAN_EXPERT)
public class InsertionSorter {
	public int[] array;
	public int[] sortedArray;
	public int finalArrayLength;
	
	public InsertionSorter(int[] arrayToSort) {
		this.array = arrayToSort;
		this.sortedArray = new int[arrayToSort.length];
		this.finalArrayLength = 0;
	}
	
	public int[] sort() {
		//We look at each of the input values. We don't have to do it in sequence. Here, we start at the end!
		for (int i=this.array.length-1;i>=0;i--) {
			this.putInFinalArray(this.array[i]);
		}
		return this.sortedArray;
	}
	
	private void putInFinalArray(int valeur) {
		if (this.finalArrayLength == 0) {
			this.sortedArray[0] = valeur;
			this.finalArrayLength++;
			return;
		}
		int indice = findWhereToPut(valeur);
		//We have to resize the array, because we're going to insert
		this.finalArrayLength++;
		//
		makePlaceAtTheRight(indice);
		this.sortedArray[indice] = valeur;
	}
	
	// Search in a NON EMPTY array.
	// this.finalArrayLength must be > 0. Don't bother the expert for nothing.
	// Example: 2 5 7 10 => We're putting the 6 at index 2.
	// Case 2 5 7 9 => The 7 has to be in index 3, not at 2, if possible, to minimize the moves.
	private int findWhereToPut(int value) {
	//The expert may find it necessary to search by dichotomy, if he likes!
	// Here, the expert is starting from the end
		int lastPlaceIndex = this.finalArrayLength-1;
		//The expert gets rid of the case where the element is the last.
		if (this.sortedArray[lastPlaceIndex] < value) {
			return lastPlaceIndex+1;
		}
		//Now, we are sure to find. Our value is compulsorily <= all the elements.
		int indice = lastPlaceIndex;
		while (indice>=0 &&  this.sortedArray[indice] > value) indice--;
		return indice+1;
	}
	
	//We move all elements to the right, from the given index.
	// Don't forget that the sorted array has been enlarged.
	// Example 8/10/12, and we want to insert 9 à l'indice 1. We're moving the value at 1 to the end of the array.
	// We're starting from the end, to not crushing the values. It could first seem "@Underst",
	// but even in real-world, we have to approximatively do that.
	@Underst
	private void makePlaceAtTheRight(int index) {
		//The array has been increased
		int lastIndex = this.finalArrayLength - 1;
		//It should not be intuitive starting from the end, that's why the @Underst.
		for (int i = lastIndex-1; i>=index; i--) {
			this.sortedArray[i+1] = this.sortedArray[i];
		}
	}
}
```

### AN EXAMPLE OF clprolf IN ACTION ADAPTING TO EXISTING JAVA LIBRARIES

Let us show you an example of utilization of Java existing libraries in clprolf. Here is a sample program of two applications chatting just for fun, until the server side enter "q"(quit). The client displays what he received, and send that it is well done. We have, in this example, two NetworkTalker simu_real_world_obj HUMAN_EXPERT, talking together. They are able to remember their conversation. The technical realization of the simulation is in the simu_comp_as_worker NetworkTalkerRealiz, which does not create the java Socket object. The NetworkTalker class has got two constructors, adapted to the client or server socket case. Those for the client take a socket in parameter, and this is permit although it's technical, but to simplify, we just pass it to the realiz associated object. There is a singleton-like SocketServerConfig object with static methods, which represents a real-world configuration concept. Only the simu_comp_as_workers of realization of technical  aspects of the simulation, deal with the socket and the streams. clprolf's version quite simplifies the java version, by forgetting the socket and stream part. In clprolf, we could consider the ServerSocket class rather a "SocketServer", a server giving sockets once the connection is done. In our example, the server can create just one connection.

In the Java framework:

```java

package org.clprolf.simple_examples.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import org.clprolf.simolframework.java.Simu_comp_as_worker;

/**
 * clprolf simple example for network programming, here with sockets.
 * Example of a single chat between two applications, and a server waiting for a single connection.
 * 
 * v1.1	2024/02/09
 * @author Charles Koffler.
 *
 */
@Simu_comp_as_worker
public class NetworkExampleServerLauncher {
	
	public static void main(String[] args) throws IOException {
		/* We could see the Java class ServerSocket as a server of sockets ! */
		ServerSocket socketServer = new ServerSocket(SocketServerConfig.PORT);
		
		System.out.println("Server started, waiting for a demand of connection");
		//The server is doing his job, he is waiting for a request of connection.
		Socket serverSocket = socketServer.accept();
		
		System.out.println("A connection has been established, sockets are plugged in");
		
		//We now need one of the talker, in this chat. Two sockets have been plugged in.
		NetworkTalker serverSideTalker = new NetworkTalker("The server", serverSocket);
		
		Scanner scanner = new Scanner(System.in);
		String wantedSentence;
		
		do {
			System.out.println("Enter a sentence, 'q' to stop");
			wantedSentence = scanner.nextLine();
			serverSideTalker.saySentence(wantedSentence);
			serverSideTalker.hearSentence();
		}while ( !wantedSentence.equals("q"));
		
		serverSideTalker.stopTalking();
		scanner.close();
	}
}

```

```java
package org.clprolf.simple_examples.network;

import java.io.IOException;
import java.net.UnknownHostException;

import org.clprolf.simolframework.java.Simu_comp_as_worker;

/**
 * The client application. They are talking together, in the two directions.
 * @author Charles Koffler
 *
 */
@Simu_comp_as_worker
public class NetworkExampleClientLauncher {
	public static void main(String[] args) throws UnknownHostException, IOException {
		NetworkTalker clientTalker = new NetworkTalker("The client");
		
		while (!(clientTalker.hearSentence().equals("q"))) {
			clientTalker.saySentence("Well done!");
		}
		clientTalker.saySentence("Good bye!"); //Just for answer.
		clientTalker.stopTalking();
	}
}
```

```java
package org.clprolf.simple_examples.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import org.clprolf.simolframework.java.Nature;
import org.clprolf.simolframework.java.Simu_comp_as_worker;

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
```

```java

package org.clprolf.simple_examples.network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.clprolf.simolframework.java.Role;
import org.clprolf.simolframework.java.Simu_real_world_obj;
import org.clprolf.simolframework.java.With_compat;

/**
 * A talker who could discuss with someone, threw a network. Here, it is seen as a human talker!
 * @author Charles Koffler
 *
 */
@Simu_real_world_obj(Role.HUMAN_EXPERT)
public class NetworkTalker {
	public static enum MSG_DIRECTION {
		SAID, HEARD
	}
	public static class Message {
		public String sentence;
		public MSG_DIRECTION direction;
		
		public Message(String theMsg, MSG_DIRECTION theDirect) {
			this.sentence = theMsg;
			this.direction = theDirect;
		}
	}
	
	private String name;
	private @With_compat List<Message> conversation; 
	
	/* Our talker has a state. He keeps his conversation. */
	public List<Message> getConversation() {
		return conversation;
	}

	public String getName() {
		return name;
	}

	//Associated realization worker.
	protected NetworkTalkerRealiz realiz;
	
	private void commonInits(String theName) {
		this.name = theName;
		this.conversation = new ArrayList<Message>();
	}
	/**
	 * Constructor for a client-side network talker. Creates a client socket.
	 * @param theName
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	public NetworkTalker(String theName) throws UnknownHostException, IOException {
		this.realiz = new ClientSideNetworkTalkerRealiz(this);
		this.commonInits(theName);
	}
	
	/**
	 * Used for the case of a server-side socket, so it is created by the server of sockets.
	 * @param theName
	 * @param givenSocket
	 * @throws IOException
	 */
	public NetworkTalker(String theName, Socket givenSocket) throws IOException {
		this.commonInits(theName);
		this.realiz = new NetworkTalkerRealiz(this);
		this.realiz.setSocket(givenSocket);
	}
	
	/**
	 * The talker is talking!
	 * @param sentence
	 */
	public void saySentence(String sentence) {
		try {
			Message msg = new Message(sentence, MSG_DIRECTION.SAID);
			this.conversation.add(msg);
			
			this.realiz.display("Message said: " + sentence); //This server sends lines, terminated by "\n".
			this.realiz.writeLine(sentence);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The talker listen to a sentence from the other talker.
	 * @return
	 */
	public String hearSentence() {
		try {
			String sentence =  this.realiz.readLine();
			this.realiz.display("Message heard: " + sentence);
			
			Message msg = new Message(sentence, MSG_DIRECTION.HEARD);
			this.conversation.add(msg);
			
			return sentence;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
	public void stopTalking() throws IOException {
		this.realiz.display("Stop talking");
		this.realiz.close();
		
		this.realiz.displayConversation();
	}
}

```

```java

package org.clprolf.simple_examples.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import org.clprolf.simolframework.java.Simu_comp_as_worker;
import org.clprolf.simple_examples.network.NetworkTalker.MSG_DIRECTION;
import org.clprolf.simple_examples.network.NetworkTalker.Message;

/**
 * The worker for handling computer lower level tasks, associated with a NetworkTalker!
 * @author Charles Koffler
 *
 */
@Simu_comp_as_worker
public class NetworkTalkerRealiz {
	/**
	 * In some cases, owner could be useful, especially to access fields to display, and this kind of stuff.
	 */
	protected NetworkTalker owner;

	private Socket theSocket;
	private PrintWriter writer;
	private BufferedReader reader;
	
	/**
	 * The socket dependency have to be injected later, with setSocket().
	 * @param theOwner
	 */
	public NetworkTalkerRealiz(NetworkTalker theOwner) {
		this.owner = theOwner;
	}
	
	/**
	 * The way to inject this dependency.
	 * @param socket
	 * @throws IOException
	 */
	public void setSocket(Socket socket) throws IOException {
		this.theSocket = socket;
		//the writer
		//First we obtain a stream. A stream could be viewed as a real-world stream.
		OutputStream theOutputStream = this.theSocket.getOutputStream();
		//A writer could be viewed as a @Simu_real_world_obj(Role.HUMAN_EXPERT), a real-world writer.
		writer = new PrintWriter(theOutputStream);
		
		//The reader
		reader = new BufferedReader(new InputStreamReader(this.theSocket.getInputStream()));
	}
	
	public void writeLine(String message) throws IOException {
		writer.println(message);
		writer.flush();
	}
	
	public String readLine() throws IOException {
		return reader.readLine();
	}
	
	public void display(String theString) {
		System.out.println(this.owner.getName() + ": " + theString); //Here, an example of the need to have the owner in the technical class.
	}
	
	/**
	 * Display the history of the conversation
	 */
	public void displayConversation() {
		System.out.println("History of the conversation: ");
		System.out.println();
		for (Message currentMsg: this.owner.getConversation()) {
			System.out.println("Message: ");
			if (currentMsg.direction == MSG_DIRECTION.SAID) {
				System.out.print("Said;-");
			}
			else {
				System.out.print("Heard;-");
			}
			System.out.println(currentMsg.sentence + "-");
		}
	}
	
	public void close() throws IOException {
		theSocket.close();
	}
}

```

```java
package org.clprolf.simple_examples.network;

import org.clprolf.simolframework.java.Simu_real_world_obj;

/**
 * The configuration object of our server of sockets.
 * @author Charles Koffler
 *
 */
@Simu_real_world_obj
public class SocketServerConfig {
	public static String HOST = "localhost";
	
	public static int PORT = 8080;
}
```
