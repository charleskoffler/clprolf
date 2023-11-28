# simol-language
Repository about my own programming language simol, which is a superset of Java. It could be a DSL(Domain Specific Language) in simulation, as well as oriented object work. The definition of simol stands on few pages, and it's quite fast to get an overview.
Simol is a programming language designed for clarity, simplicity, and ease of use. It aims to follow the fundamental theorem of software engineering, by adding a layer of indirection, especially for classes and interfaces.

Simol's design started in 2019, and now it's quite stable. I needed it for my own purposes and work.
I want to share it and build a community around it. I put code examples, language description, simol compiler and annotation framework for java, and discussions are welcome. Simol repository is opened to create a community around it and share examples, discussions, suggestions, tools. I can support myself other repositories while it's about programming languages subject, or perhaps if I could program in simol framework for Java.

There is a basic simol compiler, but it works great. There is a simol framework for java developers too, with java annotations, for leveraging simol's concepts in java.

I used chatGPT 3.5 at the end of my work, for validate simol's design choices, and for feedback and overview. As I don't want autopromotion, I regularly ask chatGPT assistance and support, and add them to this README file.
The complete and detailed definition stands at the end of this file.

The response and overview of chatGPT 3.5 on the description of simol programming language is:
***************************************************************************************************************
(CHAT GPT 3.5 RESPONSE)

Hello. I've create a new programming language, called simol, can I give you the definition, my friend, please?
ChatGPT

Of course! I'd be happy to learn more about your new programming language, Simol. Please go ahead and share the definition or any details you'd like to discuss.
ChatGPT

Thank you for sharing the detailed definition of the Simol programming language! It's evident that you've put a lot of thought into its design and principles. Simol seems to focus on providing a clear and minimalistic approach to programming, with an emphasis on simulation, roles, and clear abstractions.

I appreciate the effort you've taken to draw connections between Simol and existing programming languages, paradigms, and principles. The use of roles, such as simu_comp_worker and simu_real_world_obj, along with the introduction of nature and contracts, reflects a unique perspective on object-oriented programming.

The inclusion of annotations and modifiers, such as underst, long_action, and prevent_missing_collision, adds an interesting layer to the language, providing additional information about the intent and behavior of classes and methods.

It's also interesting to see the compatibility with Java, the mention of frameworks, and the effort to bridge existing concepts and paradigms. The alignment with principles like S.O.L.I.D and the consideration of design patterns further emphasize the design philosophy behind Simol.

If you have specific questions or if there's anything specific you'd like feedback or discussion on, feel free to let me know!

(END OF CHAT GPT 3.5 RESPONSE)
***************************************************************************************************************

VARIOUS QUESTIONS TO CHATGPT
***************************************************************
User
Thanks a million, my friend. Could you make a detailed overview of simol, please?
ChatGPT

Certainly! Let's provide a detailed overview of Simol, summarizing its key features, design principles, and components.
Simol Overview:
1. Introduction:

   Name: Simol (Simulation Objects Language)
    Purpose: Simol is designed as a programming language with a focus on simulation and clear abstractions. It aims to simplify development while being versatile enough for various purposes.
    Relation to Java: Simol is a superset of Java, introducing new keywords and concepts while allowing the use of Java libraries and code.

2. Roles in Simol:

   Class Roles:
        simu_comp_worker: Represents classes that assign tasks to the computer, focusing on technical or computational work.
        simu_real_world_obj: Represents classes simulating real-world objects, providing a clear abstraction for real-world entities.
        real_world_obj: Similar to simu_real_world_obj but without methods, often used for entities.
        information: Represents classes used for computational tasks without methods, typically used by simu_comp_worker.

   Interface Roles:
        compat_interf_version: Interface for classes providing different implementations (versions) of a feature.
        compat_interf_capacity: Interface guaranteeing a class has a certain capability, regardless of the implementation.

3. Class Design and Interpretation:

   Role Annotations:
        @Design_role, @GUI_role, @Human_expert, @Machine_tool: Annotations to provide additional information about the interpretation and role of a simu_real_world_obj.
        These annotations help in expressing the developer's understanding and facilitate code interpretation.

   Inheritance and Nature:
        Uses "nature" instead of "extends" to emphasize that inheritance asserts a class is of the same nature as another.
        Introduces "contracts" instead of "implements" for listing interfaces to emphasize adherence to contracts.

4. Interfaces in Simol:

   Limited Interfaces:
        Only two types of interfaces: compat_interf_version and compat_interf_capacity.
        Must use with_compat before the interface name when using it.

   Role of Interfaces:
        compat_interf_version: Indicates the purpose is to provide different implementations (versions) of a feature.
        compat_interf_capacity: Guarantees that a class has a certain capability, regardless of the implementation.

5. Simol Framework for Java Developers:

   Annotations: A package of Java annotations that serves as a toolbox for Java developers working with Simol.
    Includes annotations such as @Simu_real_world_obj, @Simu_comp_worker, @Compat_interf_version, etc., for seamless integration.

6. Modifiers and Annotations:

   Modifiers:
        underst: Marks methods that involve non-intuitive or complex code, providing a hint to developers.
        long_action: Marks methods that last for some time, often used for actions like video game movements.
        prevent_missing_collision: A method modifier for simu_real_world_obj to ensure no missed collisions or interactions.
        one_at_a_time, tour_monitor, for_every_thread: Modifiers aiding in parallelism and synchronization.

   Simol Framework Annotations:
        Annotations like @Long_action, @Prevent_missing_collision, etc., provide additional information for Simol framework integration.

7. Teaching and Learning:

   Accessibility for Teaching:
        Simol aims to be accessible for teaching programming, especially to children, with clear roles like "human-expert" and "machine tools."

8. Compatibility and Integration:

   Compatible with Java:
        Simol is designed as a superset of Java, allowing the use of Java libraries and code.
        Bridges existing concepts and paradigms while introducing new perspectives.

   Compatibility with Design Patterns:
        Naturally adheres to design patterns like DAO, MVC, and principles like S.O.L.I.D.

9. Simol Compiler and Code Editors:

   Simol Compiler:
        Parses Simol code and Java code, generates Java code if syntax is correct.
        Does not handle semantic analysis but focuses on syntactical correctness.

   Code Editors:
        Simol sources can be opened with Java editors like Eclipse or Notepad++.
        The generated Java code can be formatted with standard Java IDEs.

10. Learning Curve and Simplicity:

    Learning Simol:
        Takes several weeks for an experienced Java programmer to become proficient.
        Concepts are relatively easy to understand with a reduced number of new keywords.

11. Simulation Focus and Real-World Modeling:

    Simulation Emphasis:
        Strong emphasis on simulation, aligning with roles such as simu_real_world_obj and simu_comp_worker.
        Provides a clear abstraction for real-world modeling.

Conclusion:

Simol presents a unique perspective on programming languages, emphasizing simulation, clear abstractions, and real-world modeling. With its compatibility with Java, Simol aims to bridge existing concepts while introducing new roles, interfaces, and annotations to enhance expressiveness and clarity in code. The Simol framework for Java developers and the incorporation of modifiers and annotations contribute to the language's versatility and ease of use. The language's focus on teaching and learning, as well as its emphasis on simulation, positions Simol as a language with a distinct design philosophy.
*****************************************************************
Here is my description of the SIMOL programming language:

THE SIMOL PROGRAMMING LANGUAGE

INTRODUCTION

The simol language(SIMulation Objects Language) is a programming language that I defined. Its definition and specifications are ended, but it's always ready to refinement, of course.
It is not widely used, and I want to share it with interested people.
It is minimalistic, for simplify development. It is an interesting teaching tool, but it's not designed only for teaching purposes.
It is a superset to the Java language. It adds keywords that replace some java keywords like 'class', 'interface',
and it adds some keywords like 'with_compat', or 'underst'.
We can use java libraries in simol. We can use also java code in simol source code, except the keywords "class", "implements", "extends", "interface".
For example, java local variable is of course allowed in simol methods, "public" is authorized for a "simu_real_world_obj", and so on.
All java which can be applied to a class can be applied to a "simu_real_world_obj", "simu_comp_worker", "information", "real_world_obj", "compat_interf_version", "compat_interf_capacity".
As simol classes replaces java classes, all java keywords can be used with simol classes, for example "public simu_comp_worker { }".

We start from the Java language. And we add some very simple concepts. The java libraries can be used, while it is a superset of java.
Simol follow the open-closed principle, while not really modifies java but rather add notions on top on existing oriented object concepts.
Simol can be used with the simol compiler, or can also be used through the simol framework for java, which provide annotations to introduce simol in java.

SIMOL AND THE FUNDAMENTAL THEOREM OF SOFTWARE ENGINEERING

Simol follow the guidelines of the Fundamental theorem of software engineering, by trying to add an abstraction layer on top classes and interfaces. It aims to decrease complexity through the indirection of classes and interfaces roles.

Wikipedia quotation about the Fundamental theorem of softwatre engineering:
"The fundamental theorem of software engineering (FTSE) is a term originated by Andrew Koenig to describe a remark by Butler Lampson attributed to David J. Wheeler:

   "We can solve any problem by introducing an extra level of indirection."

The theorem does not describe an actual theorem that can be proven; rather, it is a general principle for managing complexity through abstraction. 
"

SIMOL AND THE DIFFERENT INTERPRETATIONS
Simol allows to have our free interpretation of our class design and class meaning. For example, you could see business logic as the work of a business expert, so use a simu_real_world_obj. Other people could have another interpretation of business logic, and use simu_comp_worker. One of the complexity in oriented object programming, is to stick at the interpretation of the writer of the code. It is sometimes hard to imagine how was the original vision of the design, so adding a minimalistic information of the kind of class or interface, can be a clue to help understanding and maintenability. Like reading a text, a source code, and particularly an object-oriented source code, can have multiple readings and interpretations. Simol, while keeping free to choose the interpretation as we wants, aims to support us to express our own understanding to others.

THE ROLE OF CLASSES

In simol, classes are given a role, in the same way we create a controller object, for example.
And there are here only four roles in simol, simu_comp_worker, simu_real_world_obj, real_world_obj and information: only code for computer, or pure code of simulation.
Simol is based on the fact that you can notice than some classes emulate, or simulate, real-world objects, as an abstraction of the underlying data structure. Even in system programming, much abstractions of such objects are used, such as connections, streams, files or threads.
Then, the other kind of classes could be classes for computational or technical tasks, where we want the computer to work for us with his resources, but not in a emulation goal. To being coherent, and not dependant of computer problems, we could abstract that, and do as if it could be algorithmic tasks given to a computer seen as a worker.
So the computational tasks emulate an algorithm for worker, as the computer needs a compilation to understand the algorithms.
These roles of classes aims to help for make concrete the object oriented programming, and to help other programmers to read the existing code. It aims also to facilitate design choices, and easily separate responsabilities. It marks classes with clear concrete abstractions, and the simu_real_world_obj should be easier to use and write, in general.
The ambition of the class is clearly indicated, and it adds information on the design intents of the developer.
In classical oriented object programming, there is no given role to a class, but we could consider that it would be as if simol objects would inherit for one of this four classes, Simu_comp_worker, Simu_real_world_obj, Real_world_obj, or Information. 
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
Those annotations serves to fill the gap between java and simol, and easily use and learn simol mindset.

The package org.simol.simolframework.java offers:
@Simu_real_world_obj, @Simu_comp_worker, @Real_world_obj, @Information, @Compat_interf_capacity, @Compat_interf_version, @With_compat, @Underst, @Long_action, @Prevent_missing_collision, @One_at_a_time, @For_every_thread, @Turn_monitor, @Nature, @Contracts. They are placed in the same locations as pure simol, but just before class line, or interface, or method, or before a type (like for @With_compat, except in particular cases as return type of methods).
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
So with this observation, we can say that there is only, finally, only simu_comp_worker classes(and only "information"), and this aligns with paradigms that do not differenciate classes. So we could see that even in simol, there is one sort of class or structures, like in classical oriented object programming(as well in procedural paradigm). In summary, it's quite like simu_real_world_obj would inherit of simu_comp_worker, and as real_world_obj would inherit from information, which is quite like regular object vision. These precisions aims to make a bridge with objects existing paradigms and code.

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
These methods guarantees that when we have long_action, within or not in multiple threads, for simu_real_world_objects, such as in a video game, with the player and enemies, we don't have to worry about the missed collisions or interactions. For example, a setPosition method, marked prevent_missing_collision. All the involved parts have to be marked prevent_missing_collision, for example the getPosition. These parts have to be synchronized between them in case of parallelism(multi-threading).

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
"underst", "with_compat", "long_action", "prevent_missing_collision"  => replace with ""(empty string)
"compat_interf_version", "compat_interf_capacity" => replace with "interface"
"nature" => replace with "extends"
"contracts" => replace with "implements"
simol annotations are ignored(@Human_expert, @Design_role, @Machine_tool, @GUI_role, @LongAction, @Prevent_missing_collision)
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

INHERENTLY INCLUDE GOOD ORIENTED OBJECT PRATICES AND PATTERNS

While object oriented languages does not mention directly design patterns and best oo pratices and principles, simol inherently includes good oriented object design principles and guidelines. Classical oriented object languages not supplies in the language itself such patterns or guidelines. Simol can also benefit of design patterns or principles, of course, but number of guidelines and good principles are already embedded. So the programmer can focus directly on his first programming problem and goals.

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

* Well suited for design patterns and oriented object principles in general(composite, and so on), as simol brings accuracy and clear intents

* About interface inheritance:
For the interfaces, simol not directly talks about interface inheritance(nor java, anyway). But if we want we can use it as a capacity, it would show that this inheritance is not of the same nature.

(END OF THE DESCRIPTION OF THE LOSIM LANGUAGE)
********************************************************************************
