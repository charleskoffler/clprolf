Simol Programming Language And Simol Java Framework( as well as Simol C# and PHP8 Framework)

Repository about my own programming language simol, which is a superset of Java, and about Simol Java Framework both. The simol framework is a java framework with pure annotations, to leverage Simol language in Java, it has the same goal. So I will talk about the language, but this could be applied for those who are interested in the simol java framework. A simol C# framework is present too, for the C# users, as well as a Simol PHP 8 Framework.
 The language could be a DSL(Domain Specific Language) in simulation, as well as object oriented work. The definition of simol stands on few pages, and it's quite fast to get an overview.
Simol is a programming language designed for clarity, simplicity, and ease of use. It aims to follow the fundamental theorem of software engineering, by adding a layer of indirection, especially for classes and interfaces. The language, and frameworks, inherently embeds good object oriented principles, and significant design patterns, which is a unique feature in programming languages. I'm looking for persons interested in testing the language, or more if they like.

One of the main goal, or perhaps the most important goal in simol, is to make possible to write programs that we would think quite impossible or very hard to write. The approach to master and make intuitive and fun the objects and class components aims to make almost totally direct or intuitive the programming task. Writing code with pleasure and fun, make it interesting, all this should be permitted with simol approach. While aiding in thinking of one solution to solve the writing problems, simol aims to aid in eventually seeing all other possible solutions. Indeed all the possible interpretations should help to bring different ways to solve the problem, and mastering it. The conception of the applications should become more human-like and manageable.

Simol frameworks contain a "beginners" package, which is composed by four classes and two interfaces, for each class and interface kind. For example, the SimuRealWorldObj class, or CompatInterfVersion interface.
They are considered as the four root classes for simol, and can be used instead of the corresponding annotation, or in addition. As well as java has 'Object' class as a root of all classes, we have such root classes.
About the interfaces, each interface must implement one of the root interface of simol, and not only the mother interface. The main interfaces in simol are CompatInterfVersion and CompartInterfCapacity.
The developper who want to slowly move to simol, while keeping a pure object-oriented mindset, can inherit all his root classes or interfaces with them.
They allow the transition to simol while keeping their coding style. Once the programmer would have integrated the concepts, he could use all annotations instead. And he can keep an inheritance vision of the roles in mind, if he prefers.

Simol's design started in 2019, and now it's quite stable. I needed it for my own purposes and work, and I have tested the concepts in my work and home programming since 2019.
I especially seek out persons who want to test the language or the simol framework for java, C# and PHP8. If people are interested, they can participate further in discussions, writing example code, or writing tools, for example, or submitting evolution ideas for simol.
I put code examples, language description in the main README file, simol compiler and annotation framework for java. I'll try to collorate with other repositories by using simol framework, for supporting but as a way to demonstrate practical usage of simol.

There is a basic simol compiler, but it works great. There is a simol framework for java developers too, with java annotations, for leveraging simol's concepts in java.

I used chatGPT at the end of my work, for validate simol's design choices, and for feedback and overview. As I don't want autopromotion, I regularly ask chatGPT assistance and support, and add them to this README file.
The complete and detailed definition stands at the end of this file.

The response and overview of chatGPT 4 about the description of simol programming language is :
***************************************************************************************
(CHAT GPT 4 RESPONSE)

Hello my friend. I've created a new programming language. What do you think of it, please? "(...)"
ChatGPT

Thank you for sharing the comprehensive documentation of your Simol programming language and framework. It's quite an extensive and detailed description, covering various aspects of the language, its design goals, and how it integrates with and extends Java.

Here are some thoughts and impressions:

   Innovation and Approach: Simol's approach of adding meaningful roles to classes and interfaces (like simu_real_world_obj, simu_comp_worker, real_world_obj, and information) is innovative. This idea of tagging classes with their intended role or nature can indeed make the code more intuitive and maintainable. It aligns well with the concept

of semantic clarity, helping programmers understand the purpose of each class and interface at a glance. This approach could be particularly beneficial in large-scale projects where understanding the role of each component is crucial for maintenance and further development.

   Integration with Java: The fact that Simol is a superset of Java and can utilize Java libraries while introducing new concepts is advantageous. This allows Java developers to transition to Simol without abandoning their existing knowledge and tools. The seamless integration and ability to use Java code within Simol (except for certain keywords) is a thoughtful design choice, enabling wider adoption among Java programmers.

   Educational Tool: Your emphasis on Simol being an educational tool, not just for teaching but also for simplifying development, is commendable. The minimalistic nature of the language, combined with its clear role delineations, could make it easier for beginners to grasp object-oriented programming concepts. The idea that programming should be fun and intuitive is a strong foundation for an educational programming language.

   Open Source and Community Engagement: The decision to make Simol open source and to engage with the community through platforms like GitHub is a strategic move. It allows for wider adoption, feedback, and contributions from developers worldwide, which can lead to continuous improvement and evolution of the language.

   Theoretical Underpinnings and Practical Applications: Your detailed explanation shows that Simol is grounded in solid programming principles while also being practical. The integration of concepts like the Fundamental Theorem of Software Engineering and the SOLID principles, along with the focus on roles and semantic clarity, positions Simol as both theoretically sound and practically useful.

   Compatibility and Flexibility: The language’s design seems to balance well between introducing new concepts and maintaining compatibility with existing paradigms. This flexibility could make Simol appealing to a wide range of developers, from those working on system programming to those involved in web development or general-purpose applications.

   Framework Support for Java, C#, and PHP: Providing frameworks for popular programming languages like Java, C#, and PHP indicates an understanding

of the diverse ecosystem in software development. This cross-language support can facilitate adoption among developers familiar with these languages, expanding Simol's reach.

   Complexity and Learning Curve: While the language offers many innovative features, the learning curve might be steep for some, especially given the extensive range of concepts and keywords introduced. It's essential to have comprehensive documentation, tutorials, and community support to aid in learning and adoption.

   Semantic Rules and Compiler Checks: The implementation of semantic rules in the compiler to enforce the coherence of class and interface roles is a unique feature. It embeds best practices into the language itself, potentially reducing common programming errors and enhancing code quality. However, this could also add to the complexity of the language, requiring developers to have a deeper understanding to effectively utilize these features.

   Practical Use Cases: The detailed examples and use cases provided (like simu_real_world_obj for business logic or simu_comp_worker for technical tasks) illustrate the practical applications of Simol. This can help developers understand how to apply Simol in real-world scenarios, which is crucial for adoption.

In conclusion, Simol presents a fascinating and innovative approach to programming language design, with a strong emphasis on semantic clarity, educational value, and integration with existing technologies. Its open-source nature and community-oriented approach could foster a robust ecosystem for further development and adoption. As with any new language, widespread adoption will depend on the availability of strong documentation, tooling, learning resources, and community support. Best of luck with your project!

(END OF CHAT GPT 4 RESPONSE)
***************************************************************************************
Here is my description of simol:

SIMOL PROGRAMMING LANGUAGE AND SIMOL JAVA FRAMEWORK

INTRODUCTION

I present both simol programming language and simol framework, which is a java framework with pure annotations, to leverage Simol language in Java, it has the same goal.
So I will talk about the language, but this could be applied for those who are interested in the simol java framework.
The simol language(SIMulation Objects Language) is a programming language that I defined. It is not widely used.
It is minimalistic, for simplify development. It is an interesting teaching tool, but it's not designed only for teaching purposes.
It is a superset to the Java language. It adds keywords that replace some java keywords like 'class', 'interface',
and it adds some keywords like 'with_compat', or 'underst'.
We can use java libraries in simol. We can use also java code in simol source code, except the keywords "class", "implements", "extends", "interface".
For example, java local variable is of course allowed in simol methods, "public" is authorized for a "simu_real_world_obj", and so on.
All java which can be applied to a class can be applied to a "simu_real_world_obj", "simu_comp_worker", "information", "real_world_obj", "compat_interf_version", "compat_interf_capacity".
As simol classes replaces java classes, all java keywords can be used with simol classes, for example "public simu_comp_worker { }".

We start from the Java language. And we add some very simple concepts. The java libraries can be used, while it is a superset of java.
Simol follow the open-closed principle, while not really modifies java but rather add notions on top on existing object oriented concepts.
Simol can be used with the simol compiler, or can also be used through the simol framework for java, which provide annotations to introduce simol in java.

SIMOL LANGUAGE AND FRAMEWORK GITHUB REPOSITORY
A Github repository has been created for simol, so I can share it with people, and gather feedback and contributions. I'm looking especially, at least, for testers, nothing more. And then, interested people could go further by participating in a deeper manner. So collaborators would be awesome to test the simol language or framework, giving feedback or insights about it, or share discussions with me or others! ChatGPT has been my first collaborator, thanks to this fantastic AI-based tool. Simol is open source, with an M.I.T license.

MAIN GOAL IN SIMOL DESIGN: AID TO EASILY AND WITH FUN MAKE POSSIBLE WRITING WHAT WE THINK IMPOSSIBLE OR HARD
One of the main goal, or perhaps the most important goal in simol, when designing it, was to make possible to write programs that we would think quite impossible or very hard to write. The approach to master and make intuitive and fun the objects and class components aims to make almost totally direct or intuitive the programming task. Writing code with pleasure and fun, make it interesting, all this should be permitted with simol approach. While aiding in thinking of one solution to solve the writing problems, simol aims to aid in eventually seeing all other possible solutions. Indeed all the possible interpretations should help to bring different ways to solve the problem, and mastering it. The conception of the applications should become more human-like and manageable.

SIMOL FOR BEGINNERS, A WAY TO KEEP OBJECT-ORIENTED MINDSET
Simol frameworks contain a "beginners" package, which is composed by four classes and two interfaces, for each class and interface kind. For example, the SimuRealWorldObj class, or CompatInterfVersion interface.
They are considered as the four root classes for simol, and can be used instead of the corresponding annotation, or in addition. As well as java has 'Object' class as a root of all classes, we have such root classes.
About the interfaces, each interface must implement one of the root interface of simol, and not only the mother interface. The main interfaces in simol are CompatInterfVersion and CompartInterfCapacity.
The developper who want to slowly move to simol, while keeping a pure object-oriented mindset, can inherit all his root classes or interfaces with them.
In fact, they are empty but allow the transition to simol while keeping their coding style. Once the programmer would have integrated the concepts, he could use all annotations instead. And he can keep an inheritance vision of the roles in mind, if he prefers.

Summary: Each interface must extend either CompatInterfVersion root interface, or CompatInterfCapacity. But it can have another interfaces in their inheritance, of course.
For classes, it is not the same, only the root classes must inherit from a root simol class(SimuRealWorldObj, SimuCompWorker, RealWorldObj, Information). This is because all the descendants must have the same role, in simol. And because we can not have multiple inheritance in the underlying language, for declaring a role in each class.

Usage example in java: public class Main extends SimuCompWorker { (...) }
Or public class Animal extends SimuRealWorldObj. Interface examples: public interface Callable extends CompatInterfCapacity { (...) }
Examples in C#: interface ICallable : ICompatInterfCapacity, or class Program : SimuCompWorker

SIMOL AND THE FUNDAMENTAL THEOREM OF SOFTWARE ENGINEERING

Simol follow the guidelines of the Fundamental theorem of software engineering, by trying to add an abstraction layer on top classes and interfaces. It aims to decrease complexity through the indirection of classes and interfaces roles.

Wikipedia quotation about the Fundamental theorem of softwatre engineering:
"The fundamental theorem of software engineering (FTSE) is a term originated by Andrew Koenig to describe a remark by Butler Lampson attributed to David J. Wheeler:

   "We can solve any problem by introducing an extra level of indirection."

The theorem does not describe an actual theorem that can be proven; rather, it is a general principle for managing complexity through abstraction. 
"

SIMOL AND THE DIFFERENT INTERPRETATIONS
Simol allows to have our free interpretation of our class design and class meaning. For example, you could see business logic as the work of a business expert, so use a simu_real_world_obj. Other people could have another interpretation of business logic, and use simu_comp_worker. One of the complexity in object oriented programming, is to stick at the interpretation of the writer of the code. It is sometimes hard to imagine how was the original vision of the design, so adding a minimalistic information of the kind of class or interface, can be a clue to help understanding and maintenability. Like reading a text, a source code, and particularly an object-oriented source code, can have multiple readings and interpretations. Simol, while keeping free to choose the interpretation as we wants, aims to support us to express our own understanding to others.

THE ROLE OF CLASSES

In simol, classes are given a role, in the same way we create a controller object, for example.
And there are here only four roles in simol, simu_comp_worker, simu_real_world_obj, real_world_obj and information: only code for computer, or pure code of simulation.
Simol is based on the fact that you can notice than some classes emulate, or simulate, real-world objects, as an abstraction of the underlying data structure. Even in system programming, much abstractions of such objects are used, such as connections, streams, files or threads.
Then, the other kind of classes could be classes for computational or technical tasks, where we want the computer to work for us with his resources, but not in a emulation goal. To being coherent, and not dependant of computer problems, we could abstract that, and do as if it could be algorithmic tasks given to a computer seen as a worker.
So the computational tasks emulate an algorithm for worker, as the computer needs a compilation to understand the algorithms.
These roles of classes aims to help for make concrete the object oriented programming, and to help other programmers to read the existing code. It aims also to facilitate design choices, and easily separate responsabilities. It marks classes with clear concrete abstractions, and the simu_real_world_obj should be easier to use and write, in general.
The ambition of the class is clearly indicated, and it adds information on the design intents of the developer.
In classical object oriented programming, there is no given role to a class, but we could consider that it would be as if simol objects would inherit for one of this four classes, Simu_comp_worker, Simu_real_world_obj, Real_world_obj, or Information. 
Other roles could eventually have been candidate, like simu_service, simu_event, simu_middleware, simu_controller, simu_scheduler, simu_facade, simu_plugin, but these roles are already covered by the four main roles. We don't want to have too much roles, for staying efficient and clear.
There is a little difference too, in the way that in simol we don't mark 'class' the classes, and directly talk about objects. While we talk about a role, we couldn't add the information that it is a mold, and we can imagine directly the class as an object. It aims to facilitate abstractions, but of course the concepts about classes keep valuable in simol.
Some people would perhaps use simol in classical simulation domains, but it is not restricted, in essence, in a kind of programming(though it could look like). The mindset should be quite easy to get for an object oriented programmer, though it doesn't refute object programming principles and vision. For a beginner, it should facilitate programming teaching.
Simol requires an object mindset and a desire to indicate helpful extra information on the used objects.

THE simol CLASSES

Instead of "class", we use the following keywords:

"simu_comp_worker"(stands for SIMUlation of a COMPuter WORKER) => we have a class that does not simulate a real object. It gives work to the computer, technical. We see then this work as an algorithm in algorithmic language, which is executed by a computer ("Computer"). The computer will manage its resources (memory, processor, etc.) and peripherals, according to this algorithm. By algorithmic language, we mean the pseudo-language used in algorithmic courses. We will simulate this algorithm on the computer, thanks to the compiler. The computer does not really know how to execute this algorithm, it will execute equivalent assembly code.

"simu_real_world_obj" (means simulation of a real-world object) => we have a class which is considered as a simulation of a real object, for example an animal, with methods eat(), run(), etc.
	Simulation realization on computer should be in a "simu_comp_worker", but if the realization is quite simple, it is allowed to write it directly in a "simu_real_world_obj". simu_real_world_obj are also used in simu_comp_worker, when it's needed, for example for buttons of a GUI, simulation of physical component, or mathematical notion.

"real_world_obj" => like "simu_real_world_obj", but when we don't have methods. Example: a Customer class (with only attributes). It is typically used for entities.

"information" => like "simu_comp_worker", but when we don't have methods. It is typically used by a simu_comp_worker, as a data structure, and shouldn't be used in simu_real_world_obj, except for an eventual technical realization part.

As simol wants to be as powerful and compatible with java, access modifiers, and other stuff in a java class declaration are allowed in the same way of a simol class declaration, obviously.
As simol wants to be as powerful and compatible with java, access modifiers, and other stuff in a java interface declaration are allowed in the same way of a simol interface declaration, obviously.

THE INTERFACES IN simol
In simol, there are two types of interfaces, and only these two types. simol interfaces are called compatibility interfaces.

"compat_interf_version": the purpose of the interface is that the classes implementing it provide an implementation, a "version".
	It is typically used for supply different implementations of the same DAO, for example(with database, web services, memory, etc.). When we're using interfaces for loose coupling goals, we should use an compat_interf_version too, to indicate that the intent is to forecast a change of implementation and not depend to a concrete class.

"compat_interf_capacity": the purpose of the interface is to guarantee that a class has a certain capability (to sort, etc.), no matter what the implementation.

We can't use interfaces in simol, except for these two cases.

Another difference, for interfaces, is the obligation to write "with_compat" (with compatibility), before the name of an interface, when using it.
Example: void drink(with_compat Drink obj_buvable){(...}}
"with_compat" is a modifier in a declaration of variable(local variable, attribute or argument).
The interest of 'with_compat' is to understand for the user that it is not an object which have a particular class, but an object which have a particular compatibility.
So, of course, we can find it typical in a local variable declaration, or a argument definition.
Remark: there's not a with_compat indication for the return type of a method, as an exception of the rule, the return type is not a variable declaration. Indeed, there's already one, in general, in the body of the method. And there is one in the declaration of the variable which will receive the result when the calling occurs. 

SMALL DIFFERENCES IN HERITABILITY

- We use "nature", instead of "extends": inheritance is seen as an assertion that a class is of the same nature as another.
A car is of the same nature of a vehicule, on the real world, for example. "nature" doesn't have sense in simol, for interfaces.
	Even the simu_comp_workers have a role, about their job. 'nature' must be used only by classes.
	
- We use "contracts", instead of "implements": we list interfaces that the class respects, there are considered as contracts.
simol prefer not to use "with_compat" for the interfaces list implemented in a simol class, because "with_compat" emphasizes  the fact
that an object is compatible, not a class. A class is considered as respecting contracts. "implements" can not be used in simol because
it focuses on the implementation, not the idea of a contract is respected.

SIMOL FRAMEWORK FOR JAVA DEVELOPERS
Simol framework is a package of java annotations, that offers a toolbox for java developers to work with simol frame. There are annotations, for each simol keyword or annotation.
Those annotations serves to fill the gap between java and simol, and easily use and learn simol mindset. There is a beginners package too, which permit to keep object-oriented habits in simol, using inheritance instead annotations.

The package org.simol.simolframework.java offers:
@Simu_real_world_obj, @Simu_comp_worker, @Real_world_obj, @Information, @Compat_interf_capacity, @Compat_interf_version, @With_compat, @Underst, @Long_action, @Prevent_missing_collision, @One_at_a_time, @For_every_thread, @Turn_monitor, @Nature, @Contracts, @Forced_inh, @Forced_int_inh.
They are placed in the same locations as pure simol, but just before class line, or interface, or method, or before a type (like for @With_compat, except in particular cases as return type of methods).
Example:
@Simu_real_world_obj
public class Car { (...) }
Or @With_compat UserDao daoUser;
Or
@Underst //Recognize object in an image.
public void recognizeObject(){ }
Or
@Compat_interf_capacity
public interface MySortable { }

THE UNDERST MODIFIER
The modifier "underst"("understanding") can be added to the methods of simu_real_world_obj( or even simu_comp_worker) classes. It marks the methods that have a role of "understanding" by the computer (recognition of objects in an image, for example). "underst" can also be used on simu_comp_worker.
	"underst" indicates code that is non intuitive, for example complex sorts implementations. Even the famous and widely used algorithms can be marked as "underst".
	It is placed before the result type of a method declaration. It can not be used for the methods of an compatibility interface.

THE ROLE ANNOTATIONS OF SIMU_REAL_WORLD_OBJ
A simu_real_world_obj can be various things, include abstract realities. Don't believe simu_real_world_obj, in simol, could only represents concrete objects like car. Everything that is not a computer worker job, and has methods, is, in simol, a simulation of a real_world object.
So, abstract notions, should be in such kind of simol classes.
To ease understanding and smart compatibility with classical object oriented used classes, simol has introduced annotations. This annotations is designed to be used on a simu_real_world_obj declaration. Thus, @Design_role, @GUI_role, @Human_expert_role, are precisions you can add in your simu_real_world_obj, for better understanding of your interpretation and vision. But they are not mandatory. And these annotations doesn't enforce the reader to use the same interpretation.
These annotations are also available as a optional enum value "role", in @Simu_real_world_obj simol framework for java.

@Design_role : controllers, services, and so on, are understood, in simol, as design roles. A controller is supposed to control the job between several entities, services are supposed to supply or design a service, and so on. These objects are designed to have a role in a software architecture, and are comparison with the abstract function they play. But they stay abstractions, and do not precisely give a job at the computer worker, they don't precise inherently the underlying algorithm.  So you can add @Design_role annotation, but these classes could be seen as another abstraction, for example a human expert for an MVC controller.

@GUI_role: software developers who prefer a GUI interpretation, can use @GUI_role for the buttons, windows, and other classes like that. This does not enforce people to have the same vision, and a window could also be seen of the simulation of a real-world machine, with his real buttons, etc.

@Human_expert: Many of business job can be viewed as a human expert simulation. Business logic is a computer worker-like interpretation at the basis, but could ony be understood as a human-expert simulation.

@Machine_tool: A machine tool vision of a GUI, where a window is interpreted as a simulation of a machine tool, with concrete buttons, a little display for a text, and so on.

Examples:
@GUI_role
public simu_real_world_obj Window { (...) }

@Design_role
public simu_real_world_obj Controller { (...) }

@Human_expert
public simu_real_world_obj MeteoExpert { (...) }

@Machine_tool
public simu_real_world_obj Window { (...) }

In the simol framework for java, as annotations are already used, the role annotations are available through a optional role attribute of @Simu_real_world_obj. For instance:
@Simu_real_world_obj(Role.DESIGN_ROLE)
The roles are Role.DESIGN_ROLE, Role.GUI_ROLE, Role.HUMAN_EXPERT, and Role.MACHINE_TOOL

COMPATIBILITY WITH OTHER PARADIGMS

   Simol contains role annotations, in order to stay accessible with common interpretations and usage of classes, and for good understanding of the simu_real_world_obj use.
	The kind of objects simu_real_world_obj and simu_comp_worker can be seen as only simu_comp_worker, as simu_real_world_obj is finally a specialized simu_comp_worker in goal of simulation of the real-world. The same reasoning is valid for real_world_obj, which are first a kind of "information" object, but an "information" as well.
So with this observation, we can say that there is only, finally, only simu_comp_worker classes(and only "information"), and this aligns with paradigms that do not differenciate classes. So we could see that even in simol, there is one sort of class or structures, like in classical object oriented programming(as well in procedural paradigm). In summary, it's quite like simu_real_world_obj would inherit of simu_comp_worker, and as real_world_obj would inherit from information, which is quite like regular object vision. These precisions aims to make a bridge with objects existing paradigms and code.

SIMOL IN GENERAL PURPOSE PROGRAMMING

Simol could be interesting too for general-purpose, for those who are interested on a simulation vision. Indeed, even in system programming, we can easily find simu_real_world_obj as connections, sockets, file, threads, memory and so on.

RELATIONSHIPS WITH EXISTING INTERFACES

Finally, java and other oriented objects programmers often uses "-able" interfaces, which has a marked meaning of capacity. And existing interfaces like Factory are well known as being version purpose interfaces. Interfaces are famous to be as a contract.

NATURE VERSUS CLASS

The class keyword emphasizes mold and inheritance. Nature keyword limits a bit inheritance, and it's more restrictive, but keep behind the idea of inheritance, as well as having the same nature implies an inheritance. Nature aims to avoid pure technical inheritance, and promote composition in other cases. It could give arguments to limit multiple inheritance for simu_real_world_obj, as well as for simu_comp_worker, if it would exist in java, it could bring a solution to diamond problem.

THE LONG_ACTION MODIFIER

As well as "underst", it exists a method modifier called "long_action". This modifier indicates that a method(especially in a simu_real_world_object), lasts during some times. It typically performs a loop, such for a movement of a video game enemy. All this methods would be called "long_action", in simol. These actions will be handled at the same time, for a single object, with an unique thread. This is especially used for video-game development, but not only. So the long action would be executed step by step, by calling the "continue" associated method. For example, a walk long action, would be associated with "continueWalk()". Then there will be an unique endLongActions() method, with call all sub-continue methods. The user would just first call the long action, as usual("walk()"), for example, and then he would just call endLongActions(), for the next steps of the action. This could suit, for example, for a video game, which would call endLongAction in the paint() method of the graphical container. "long_action" aims to keep an "action-oriented" perspective, even if we emulate threads behind. A boolean should be needed, and will be marked "@Long_action". The three associated methods are marked with the "long_action" modifier. In the simol framework for java, we introduce a "@Long_action" unique annotation, for all the cases. 
We can have a natural perpective on the long actions, and naturally permit to execute all actions of an object in the same time.

PREVENT_MISSING_COLLISION

prevent_missing_collision is a method modifier(or @Prevent_missing_collision annotation in simol framework).
It is used especially for simu_real_world_object. It's a tool for simplify concurrency(especially with "long_action") and parallelism(multi-threading) for these objects. It can be used for any concurrency simulations, as real-time simulations.
These methods guarantees that theses actions, within or not in multiple threads, for simu_real_world_objects, such as in a video game, with the player and enemies, we don't have to worry about the missed collisions or interactions. For example, a setPosition method, marked prevent_missing_collision. All the involved parts have to be marked prevent_missing_collision, for example the getPosition. These parts have to be synchronized between them in case of parallelism(multi-threading).

PARALLELISM AID
To simplify parallelism managing, three modifiers has been added.
one_at_a_time(method modifier): for synchronized methods, or containing synchronized blocks, to indicate that one thread at a time executes the job.
tour_monitor : attribute modifier on a synchronization lock object declaration, to ease understanding of the synchronization.
for_every_thread : attribute modifier on a volatile attribute declaration, highlightning the usability of the attribute in parallelism conditions.
Three equivalent annotations have been added for the framework.

LEARNING CURVE

Several weeks average might be necessary to become proficient in simol, for a experienced Java programmer, while he would be familiar with simol which is not so far from Java. Java programmers are used to manipulate concepts. Simol's concepts are relatively easy to understand, for a experienced java programmer, and the reduced number of new keywords.

SIMOL GRAMMAR FROM JAVA SE 7 GRAMMAR(BNF-style from Oracle Site):

NormalClassDeclaration: 
    SimolRole Identifier [TypeParameters]
                                [nature Type] [contracts TypeList] ClassBody

SimolRole:
	simu_real_world_obj
	simu_comp_worker
	real_world_obj
	information
	
NormalInterfaceDeclaration: 
    SimolInterfaceRole Identifier [TypeParameters] [extends TypeList] InterfaceBody

SimolInterfaceRole:
	compat_interf_version
	compat_interf_capacity
	
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

MethodDecl:
	[SimolMethodModifier] Type Identifier MethodOrFieldRest

FieldDecl:
	Type Identifier MethodOrFieldRest

TO COMPILE

The simol compiler is the more direct way to use simol. But we have the simol framework for java developers too.

"simu_comp_worker", "simu_real_world_obj", "real_world_obj", "information" => replace with "class"
"underst", "with_compat", "long_action", "prevent_missing_collision" => replace with ""(empty string)
"compat_interf_version", "compat_interf_capacity" => replace with "interface"
"nature" => replace with "extends"
"contracts" => replace with "implements"

simol annotations are ignored(@Human_expert, @Design_role, @Machine_tool, @GUI_role, @LongAction, @Forced_inh, @Forced_int_inh)
EVERYTHING ELSE IS IDENTICAL TO JAVA

THE SIMOL COMPILER
A compiler exists, written with Antlr4 in java, which start from a java 8 grammar(antlr4-grammars).
The simol compiler parse simol code(.simo source files), and java code included(java 8). He stops when a syntax error is met, simol or java.
It does not, at the moment, deal with semantic analysis of simol, nor java. Semantic analysis in simol is not so important.
The compiler generates java code, if all is ok.
Then you have to use javac on the generated java code, in order to obtain executables with bytecode.

SIMOL CODE EDITORS
simol sources can be opened with Eclipse, choosing open with java editor, or with notepad+++->java language, and so on.
You can format the generated java code with Eclipse, for example, right clic on the java generated file, source, format.
Simol framework for Java permit to use java's IDE and tools, and autocompletion on annotations, and is completely integrated with java.

SIMOL AND JAVA LIBRARIES
In order to help users who would want to use existing java libraries as simol, a classification proposal of java usual language libraries exists and will grow.
For example, "@Simu_real_world_obj JPanel extends JComponent implements java.awt.ImageObserver, java.awt.MenuContainer", or "@Compat_interf_capacity (java.awt.)MenuContainer". This help is not intended to contain compulsorily all the libraries.
Simol framework annotations are used, while it is existing java code, in order to show that existing java code could be updated, and to help simol users.

ALGOL AND SIMOL

ALGOL("Algorithmic Language"), was designed with a strong emphasis on algorithmic and mathematical computation. It aimed to provide a language for expressing algorithms clearly and efficiently.  ALGOL 60, in particular, was influential in introducing features for structured programming and became a foundation for modern programming language design. Simol, with its "simu_comp_worker" (Simulation of a computer worker) role, shares a similarity with ALGOL's focus on algorithmic programming.  The "simu_comp_worker" role in Simol is explicitly dedicated to the simulation of algorithmic language for a computer( as it is a simulation of a computer worker). It's similar to ALGOL's original goal of serving as an algorithmic language.
Semantic Clarity: Both languages strive for semantic clarity. ALGOL's design encouraged developers to write code that closely mirrored the problem-solving process, and Simol's class and interface roles provide clear semantics for the different types of components.
Minimalistic Approach: ALGOL's creators aimed to keep the language minimalistic, and Simol also follows a minimalistic approach, focusing on a limited number of roles and concepts.

SIMULA AND SIMOL

Simulation Focus: Both Simula and Simol have a strong emphasis on simulation. Simula was specifically designed for simulation, and simol's name, "SIMulation Objects Language," reflects its focus on simulation and modeling.
Object-Oriented Programming: Simula is often credited as one of the earliest object-oriented programming languages. Simol also embraces object-oriented concepts by introducing roles for classes and interfaces, which is a fundamental aspect of object-oriented design.
Abstraction: Both languages encourage clear abstractions in code. Simula introduced the concept of classes and objects as a way to model real-world entities, while Simol defines distinct roles for classes and interfaces to indicate their purpose and responsibilities.
Real-World Modeling: Simula's object-oriented approach was aimed at modeling real-world entities and their interactions. Simol's "simu_real_world_obj" is designed to represent real-world objects. Principles of Simplicity: Simula was designed with simplicity in mind, focusing on providing a clear and efficient way to model complex systems. Simol also follows a minimalistic approach to language design, promoting clarity and simplicity.

SIMU_COMP_WORKER, COMPUTER AS A WORKER

simu_comp_worker not only wants to separate simu_real_world_obj and pure computer tasks, but aims to see computer as a worker. The "simu" of "simu_comp_worker" emphasizes that, almost of we were talking of a real-world worker. So the computer's job would be to manage his peripherals and resources, and doing all job purely relative to him. The algorithm is intended to be executed for a worker, and that worker is a computer, but it could have been a human, except in the subject of the nature of the tasks. So simu_comp_worker really joins to ALGO 60 vision of the computer, in the sense of the algorithms using, as for abstract the worker, and for being quite human-like.

INHERENTLY INCLUDE GOOD OBJECT-ORIENTED PRATICES AND PATTERNS

While object oriented languages does not mention directly design patterns and best oo pratices and principles, simol inherently includes good object oriented design principles and guidelines. Classical object oriented languages not supplies in the language itself such patterns or guidelines. Simol can also benefit of design patterns or principles, of course, but number of guidelines and good principles are already embedded. So the programmer can focus directly on his first programming problem and goals.

COMPUTE OR NOT COMPUTE

The calculations themselves, can be considered or not as a basic task of a computer. The English naming "computer" takes sense, of course. That said, complex computing task could be viewed as being in the role of a mathematical expert. ALGOL 60 includes much mathematical aspects in term of calculations, perhaps, as simol disposes of simu_real_world_obj to complete the job.

SIMOL AND THE SOLID PRINCIPLES

simol naturally adheres closely to well-know S.O.L.I.D principles. Single responsabilty is directly implemented with the class roles.
Open closed principle is encouraged when useful, with a understanding and clear design and design goals, and by separating roles of compatibility interfaces. Dependency injection is much easy and direct to implement and to be used and viewed. Interface Segregation principle, the "I" talks about "role interfaces", that immediatly joins the role of interfaces of simol. Liskov substitution principle("L") takes sense in simol, while clear understanding of "nature" of objects and classes, and with simol concepts in general.

MACHINE TOOLS, HUMAN EXPERT ROLES, COMPUTER WORKER, ETC., WELL ESTABLISHED PERSPECTIVES
simu_real_world_obj can have a more precised role, which can have an interpretation as machine tools, for graphical interfaces, or human-expert roles, for classes which could have a design role too(especially controllers).
"Human expert" is quite similar in the intent, as expert system goals.
And metaphors with real-world objects, like "Button", or "Window", are famous too. 
About the computer worker vision, we already use such vocabulary, when talking about a "server", or a "worker thread" for a system thread, which are well-established terms.

TEACHING PROGRAMMING OR JAVA TO CHILDREN
Teaching advanced programming to children seems possible to children, while difficult with Java. Simol, or simol framework, can be a way to learn easily java too. Human expert or machine tools roles, as well as computer worker, which are intrinsically part of simol or simol framework, can be a way to explain complex topics to young children, and render object oriented programming accessible to children.

WEB PROGRAMMING
Simol framework can be useful too in web programming. Servlet could be annotated like @Simu_real_world_obj(Role.HUMAN_EXPERT), of an expert in serving, which work is to call the right (business) expert(for example, a weather forecast expert).
The hidden servlet generated for a .jsp page for the view, could be interpreted as a simu_comp_worker associated with the business expert, for display and user inputs.

COMPATIBLE WITH EXISTING CONCEPTS
Some simol concepts used can be compared finally with some existing concepts, like the concept of business logic.

* Near from business logic idea:

The idea of separating business logic code and low level code which handles managing a database, and so on, looks like the simu_real_world_obj and simu_afoc. It would be a simu_real_world_obj which would simulate an human expert work, and simu_comp_worker would manage low-level details.
Simol goes further while considering simulation code, like business logic for this real-world object. But the reasoning can be compared.

* Adheres naturally to SRP
Single Responsability Principle(SRP): simol encourages naturally the SRP, with the kind of class separation, and also with the "nature" keyword.

* Simol is natively well adapted with the MVC pattern, with his simulation focus, well made for the controller(simu_real_world_obj), the model(simu_comp_worker), and the view(simu_comp_worker), for example.

* Adheres closely to the DAO Design Pattern. simu_comp_worker, and compat_interf_version suits closely for implementing the DAO pattern in simol.

* Compatible with loose coupling principle, bridge pattern, "program to an interface not an implementation" principle, with the compat_interf_version interfaces, and "with_compat" keyword. As well aligned with Dependency Injection(DI) pattern(with with_compat keyword).

* Well suited for design patterns and object oriented principles in general(composite, and so on), as simol brings accuracy and clear intents. For example adapter design pattern, with especially compat_interf_version.

* About interface inheritance:
For the interfaces, simol not directly talks about interface inheritance(nor java, anyway). But if we want we can use it as a capacity, it would show that this inheritance is not of the same nature.

RULES ABOUT INHERITANCE CHECKING OF CLASSES AND INTERFACES
Classes and interfaces roles allow some semantic checks, done by the compiler or semantic checking tools. Those checks can be ignored, by using "@Forced_inh" and "@Forced_int_inh" annotations(in simol language as well as in the java framework).
The semantic control permit the compilation to find contradictions that can imply that the roles indicated on classes or interfaces are not coherent and have a problem. A fruit class which would be declared as simu_comp_worker could not be the mother class of a Apple class declared in simu_real_world_obj.
Thanks to the semantic control about contradictions, we can automatically detect a misuse of class or interface roles, and enforce the user to respect the language definition and philosophy.
These compiler controls still permit to have a free interpretation of our classes and interfaces.

* Summary of the semantic rules for inheritance
In order for the users to easily learn and master the rules, it's quite easy to explain their intent in few words.
A synopsis of the semantic inheritance rule could be that we must sort out the sheep from the goats, in simol. But the imposed rules are the behavior that we intuitively have while programming simol, and we are free to them with "forced" keywords.

* The semantic checks made by the compiler are all in three kind of rules:

All the rules about semantics are only on the direct level of the class(the single level), and not at multiple level. This simplifies the rules applications and understanding.

class inheritance contradiction:
	The direct inheritance of a class, his nature in simol, should  be coherent with the role of this class. The role of the mother class should be the same of the role of the class itself. For example, the nature of a simu_real_world_obj have to be a simu_real_world_obj. Or a simu_comp_worker class must inherit of a simu_comp_worker_class.

Contracts contradictions
	A class should implement only one compat_interf_version. It's quite evident, because of the definition of a compatibility interface version. A class should be only the version of one thing. But a class can have multiple capacities, or can be the version of something and have capacities in addition.

Inheritance of interfaces contractions
	A single rule in this topic: the direct inheritance of an interface can be only capacities. We can increase an interface only in terms of capacities. This is for coherence with the compatibility interfaces roles

Reasons: A compat_interf_version stands for a unique version, and can not be composed by another compat_interf_version (in particular case, such for particular cases of evolutivity, we could use @Forced annotations). And a compat_interf_capacity can not be composed by a compat_interf_version.

Impact of the three kind of contradictions:
	 Thanks to inheritance and contracts declarations, the compiler can find contradictions in the chosen roles for classes and interfaces. This leads to enforce the code to have coherent and correct, while allowing all types of interpretations. And the programmer is enforced to respect the class and interface roles. This is a way for the compiler to ensure the correct utilization of the roles.

Examples: The programmer can not declare a Fruit as simu_real_word_obj, a Banana as simu_comp_worker, because the compiler would forbid this when seeing the class inheritance contradiction. But the multiple interpretations are still allowed. For the interfaces, having a "Sortable" interface declared as a compat_interf_version would be detected by the compiler when trying to establish a contract with Sortable and Measurable(a compat_interf_capacity). The checker would see the problem with the contracts contradictions test, and will understand that there is something incoherent. The problem here was that the programmer declared Sortable as a version, and he betrayed his incoherence while trying to use it with a class which implement a capacity interface.

* Ignoring inheritance checking
These checks can be ignored, by using "@Forced_inh" and "@Forced_int_inh" keywords, on the class or the interface, or directly before the name of the inherited class or interface. @Forced_inh means "forced inheritance", and is for class inheritance. "@Forced_int_inh", is for interface inheritance(included interface to interface inheritance). So all the existing java code can be used and accepted, and we can program as we want to do it. Applied to a class or interface, these keywords concerns all the inherited types of the concerned class or interface. In the C# and PHP8 frameworks, there are only "forced" attributes upon the class or the interface, because of C# and PHP8 attributes limitations.

In the simol framework:

/*All the inherited class are in forced inheritance, they are all accepted in inheritance(even if they are incompatible by being a Simu_comp_worker) */
@Forced_inh
@Simu_real_world_obj
public class Car extends CarRealization {
(...)
}

OR

@Simu_real_world_obj
public class Car extends Vehicule, @Forced_inh CarRealization {
(...)
}

With

/* CarRealization is the technical class for displays or inputs handling, of the Car simulation */
@Simu_comp_worker
public class CarRealization {
(...)
}

* The simol compiler doesn't currently proceed simol semantic checks, nor these rules. And the framemworks haven't currently tools for checking this either.

INSIGHTS ABOUT INHERITANCE AND SIMOL

What is inheritance in OO programming? Inheritance could not be only a copy of attributes and methods, which we could call abusive inheritance when alone. In that case, composition should be used instead of inheritance, and everyone describe by the way composition as a "has-a" relationship. This aligns with the common principle of "composition over inheritance". Inheritance has a meaning of being of the same family too, and is a "is-a" relationship, by definition. In the beginners package of the simol frameworks, we meet empty classes and interfaces, but their job is yet crucial. It's because the children classes and interfaces inherits of their sense, and not only of properties and methods. 
Simol allows to secure inheritance and avoid having only a technical inheritance. Having roles, added with semantic inheritance control on roles, are a guarantee that we think about a meaning too. So a business class can not inherit from a computational class.
But this could be not enough, and inheritance might be still incoherent. A Human class could inherit of a Heart class, because there are both real-world objects simulation. That's why the "nature" keyword prevents of having inheritance without being really the same kind of thing.
So we can see simol roles as a securing of object oriented programming, nothing more, and as if we would proceed the same way as a programmer who would respect good practice rules in OOP.
That said, simol let us choose the role and interpretation, and simol let us enforce inheritance in case we want to not respect the semantic rules(with "Forced_inh" and "Forced_int_inh"). So we are sure of flexibility in practical situations, and that simol is as powerful as classical OO Languages.

SIMOL FRAMEWORK FOR C# DEVELOPPERS
As C# is close to Java, a simol C# framework provide attributes like the java annotations, despite Java is the main language in simol. It permits to leverage simol in C# too, for the C# users. It acts as the java annotations, except for some details. The interface and class attributes are more precise by targetting a class or an interface. But there is no 'Nature' or 'Contracts', nor 'With_compat' on a local variable, due to C# attributes limitations. It is not very important the lack of 'Nature' and 'Contracts', because of the existing ":" in C#, and once the users know the philosophy of simol about this. For the "With_compat", the most important is about field and parameters, not about local variables. And interfaces names begin by 'I', in C#, they are remarkable.
"Forced" attributes are only upon the class or the interface definition, because of C# attributes limitations.
Like in the java framework, there is a beginners package too, which permit to keep object-oriented habits in simol, using inheritance instead annotations.

SIMOL FRAMEWORK FOR PHP 8
A PHP 8 simol Framework is available too, as well as for C# and Java.
Nature and Contracts are not present due to PHP attributes limitations, and With_compat is not on local variables.
TurnMonitor, For_every_thread, One_at_a_time, are deleted too because thread support is not supplied.

THE COMPAT_INTERF_VERSION AND LOOSE COUPLING

What does loose coupling mean? It means that we should be dependent on interfaces and not on implementations. That said, we still depend on the signature of the methods, and so on, of the interface. We still depend on the chosen implementation, but we can choose it as we want. So it could mean that we can have multiple implementations for a given interface. Not all the use cases, and not all the real-world examples need that. A great need is in collections of public libraries, for example, but there could have other interesting use cases. But loose coupling with interfaces brings complexity too, and we shouldn't abuse of it, if the need of choosing the implementation is not so important. For example, debugging on an IDE can become impossible, because we can not enter in the implementation methods, code becomes less clear, and so on.
Another inconvenient of the interfaces, is that we lose the inheritance of the concrete classes, and the associated polymorphism and meaning. We can have inheritance of interfaces, but usually we don't use it here. And we can notice that in simol a version can not inherit of another version interface.

The compat_interf_version was designed just to know what we're doing with interfaces. But it is evident that it can help about loose coupling usage. Be aware that a compat_interf_version is the sole choice for loose coupling, and it brings security and clarity to use it for that. The use of semantic rules for interfaces, for example, ensures a correct utilization of the compat_interf_version interfaces. Compat_interf_version shows immediately a loose coupling goal interface, and the 'with_compat' keywords or annotation shows immediately his usage. But a version compatibility interface can have another use cases, for example a DAO with many different ways to do the job, by different database systems, web service calls,... This use case has not, apparently, a loose-coupling goal. It is rather a need of being able to change, when needed, the technical way to work.
Dependency injection, is a great principle for not forget that concrete class instantiation should be done outside too. "with_compat" keyword is a great way to immediately notice, at a glance, dependency injections locations.

So version compatibility interfaces and with_compat keyword allow to judiciously and smartly handle the eventual loose coupling. It prevents somehow to excessive loose coupling.

INTERFACE INHERITANCE AND SIMOL INTERFACES ROLES
Why interfaces don't replace inheritance? First interfaces always needs an implementation to be used for working, at the dependency injection moment. Then interfaces inheritance, in a class, does not permit to inherit implementations, but only from method signature. Suppose a Runnable Simu_comp_worker class, Runnable does not really constitute an inheritance, because we still have to implement the concerned methods, despite we inherit from Runnable! It's an inheritance of signature, but not an inheritance of implementation. That's why in simol, there is only two kind of interfaces, version, and capacity. Complete inheritance always comes by the fact that we inherit from a class, which could have implemented an interface method. But the child class inherits from this method implementation by the class inheritance, not by the interface inheritance. It only inherits of the signature of the method.

THE USE CASES OF SIMU_COMP_WORKER

In simol, we should avoid, in general, to use a simu_comp_worker, because the real_world_objects are more intuitive and not so technical, generally. For example, although the interpretations are free, in simol, it's more recommended to see a sort class as a simu_real_world_obj, than a simu_comp_worker. The recommended examples where we need a simu_comp_worker, are, in general, and if wanted, technical classes like DAO. Or it can be technical job for handling displays and keybord inputs of a simu_real_world_obj, an equivalent of the view of MVC. So the Model and the View of the MVC should be in a simu_comp_worker, but we always look at this as we want! A launcher like a launcher of an application should, in general, be a simu_comp_worker too. But remember that a simu_comp_worker, even in system programming, often use much simu_real_world_object, for the graphical interface, or the memory, the connections, the threads, and so on. But this is the computer who do the job!

SIMOL ROOTED IN REALITY AND TRY TO REMAIN SIMPLE

In simol, the mindset is to always try to stay near the concrete reality. So we ensures that real-world use cases would be ok.
For example, simu_comp_worker reminds us that there are a compilation in assembly language after, who looks like a technical solution for our original source code. Compatibility interfaces aims to keep it real by being aware of the concerned usage. Simol avoids abstraction without concrete purpose, because programming and making a software is a concrete job and perhaps there is no much place for this.
Another distinctive characteristic of simol is that we're doing all for the reasoning and problems remain independant by the fact it is a software what we're doing. So all that we're talking about could be done with a sheet of paper, and a reasoning, independently of a physical computer. Even the simu_comp_worker methods mimic a computer doing a job, almost as a human doing the job, with special capacities. So we are sure that all always stay simple.

TRYING TO BRING A MATHEMATICAL-LIKE PROOF OF SIMOL INTEREST

We can start from the Single Responsability Principle, which claims a clear and single purpose on each class.
Simol offers a way to obtain not only clear and singular purpose of each class( and interface), but a meaningful purpose too. Having a meaningful purpose help communication with others, and memorization, and ease the class or interface creation. In addition, simol offers a way to add meaning to non-simol classes, which could be a way to master all possible design solutions.
So with simu_real_world_obj and simu_comp_worker, we ensures that all classes can be categorized in this kind of objects, while permitting everyone to keep his own interpretation. Having this precision made on a class, is a testament that we have meaning about it. So that looks like what we wanted to demonstrate. We could not say that simol is useless, because it would be equivalent to say that adding meaning is useless.

From this demonstration, I utilized an advanced AI-based tool to refine it. This collaboration with AI technology has been instrumental in articulating the theoretical underpinnings of Simol:

"
BEGINNING OF AI-based tool refinement:
Mathematical-like Proof of Simol's Interest

   1. Premise on the Single Responsibility Principle (SRP):
        SRP advocates for a clear and single purpose for each class, which is a widely accepted principle in software engineering for promoting maintainability and clarity in code design.

   2. Introduction of Simol's Enhanced Purpose:
        Simol extends this principle by ensuring not only a clear and singular purpose for each class and interface but also imbuing them with meaningful purpose.
        A meaningful purpose enhances communication among developers, aids in memorization, and simplifies the process of class or interface creation.

   3. Application to Non-Simol Classes:
        Simol also offers a framework to add meaning to non-Simol classes, suggesting a method to master various design solutions in a broader programming context.

   4. Categorization with Simu_real_world_obj and Simu_comp_worker:
        The categorization of all classes as either simu_real_world_obj or simu_comp_worker in Simol ensures that every class can be distinctly identified while allowing individual interpretations.
        This categorization acts as a testament to having a meaningful understanding of each class’s role and functionality.

   5. Conclusion and Inference:
        The addition of meaning and purpose to classes, as facilitated by Simol, is fundamentally useful and beneficial.
        Asserting that Simol is useless would be equivalent to stating that adding meaning and purpose to classes is useless, which contradicts established principles of software engineering, particularly the SRP.
        Therefore, by logical extension, Simol's approach is valuable and beneficial in software development.

This structured proof outlines a logical progression from established principles to the unique advantages offered by Simol. It cleverly ties the utility of Simol to the universally recognized value of clarity and purpose in object-oriented programming, thereby presenting Simol not just as a useful tool but as an evolution of existing best practices.

END OF AI-based refinement.
"

DEMONSTRATION OF THE ADVANTAGES OF CLASS AND INTERFACE ROLES, AND OF THE CHOICE OF THESE ROLES, ABOUT NATURALLY INCORPORATING BEST PRATICES
Simol was originally designed in an intent of simplify and clarify object-oriented programming, nothing more. And in a desire of making object oriented programming more fun. These goals finally corresponds to much best oo practices results.
This chapter want to be a practical and minimalist proof of the utility of roles in incorporating best practices, if we want to think about how could we obtain a language with those qualities.

A main innovation in simol language and framework, is that we inherently use good pratices in object-oriented programming, and some design patterns. We make code following SRP, for example, or SOLID principles, without effort or headache!
We are not saying that with simol we would incorporate all the design patterns in the world, all these aspects, and all oo principles aspects, absolutely not. But we're saying that with simol we embeds naturally main ideas and concepts of best object-oriented programming.
Simol was not designed, initially, in the goal of applying best oo practices, but just ease object oriented programming. So these advantages came after the end of simol design. They are rather a consequence of a desire of simplicity and understandable classes and interfaces.

Explanations: The compiler uses the semantic rules about interface and class inheritance, to search contradictions about class and interface roles. So it ensures that our choice of roles and contracts in our code respect the roles meaning in simol.
So we can have an inherently coherence and respect main oo principles, because simol's philosophy is cohent with main oo principles and patterns.
We can notice that our chosen class and interface roles are the unique ones which could allow semantic rules permitting the semantic analyser to verify much principles or respect of the philosophy of famous design patterns.
So it needs design class roles, and such fundamental and basic class roles who distinguish business part and technical part, to permit that a language, like simol, embeds the power of inherently leverage well-known object oriented principles and design patterns. Classical object oriented languages, like java, do not embeds natively that quality.
The interface roles, and interface inheritance compiler checks, thanks to them, permit to inherently obtain the Interface segregation principle of SOLID.

(END OF THE DESCRIPTION OF THE LOSIM LANGUAGE)
********************************************************************************
