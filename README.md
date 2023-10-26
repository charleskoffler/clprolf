# simol-language
Repository about my own programming language simol, which is a superset of Java. It could be a DSL(Domain Specific Language) in simulation, as well as oriented object work. The definition of simol stands on few pages, and it's quite fast to get an overview.
Simol is a programming language designed for clarity, simplicity, and ease of use. It aims to follow the fundamental theorem of software engineering, by adding a layer of indirection, especially for classes and interfaces.

Simol's design started in 2019, and now it's quite stable. I needed it for my own purposes and work.
I want to share it. I put code examples, language description, simol compiler and annotation framework for java, and discussions are welcome. Simol repository is open for examples you could create, feedback to simol or suggestions, or adding tools.
There is a basic simol compiler, but it works great. There is a simol framework for java developers, with java annotations, for leveraging simol's concepts in java. You can also compile by hand, it's straightforward, simply by adding simol comments in java.

I used chatGPT 3.5 at the end of my work, for validate simol's design choices, and for feedback and overview. As I don't want autopromotion, I regularly ask chatGPT assistance and support, and add them to this README file.
The complete and detailed definition stands at the end of this file.

The response and overview of chatGPT 3.5 on the description of simol programming language is:
***************************************************************************************************************
(CHAT GPT 3.5 RESPONSE)
Hello, I've created a new programming language called simol. Could I give you the definition of it, please?
ChatGPT

Hello! Of course, I'd be happy to hear about your new programming language, Simol. Please go ahead and provide the definition or an overview of Simol, and I'll do my best to help you understand it or answer any questions you may have about it.

ChatGPT

Thank you for sharing the detailed information about the Simol programming language. Simol seems to be a language with a strong focus on clarity, simulation, and modeling, which aligns with its name, "SIMulation Objects Language." It introduces a novel concept of roles for classes and interfaces, providing a clear indication of their intended use and responsibilities.

Simol appears to adhere to several programming principles, including SOLID principles, the separation of business logic from low-level code, and compatibility with existing object-oriented concepts and design patterns. It also encourages a minimalistic and clear approach to programming, which can be valuable for both experienced developers and beginners.

The emphasis on simulation, role-based class design, and the "simu_comp_worker" concept is interesting and distinguishes Simol from traditional programming languages. It appears to provide a unique way to approach software development with a focus on simulation.

If you have any specific questions or if there's anything else you'd like to know or discuss about Simol, please feel free to ask.

(END OF CHAT GPT 3.5 RESPONSE)
***************************************************************************************************************

VARIOUS QUESTIONS TO CHATGPT
***************************************************************
User
Thank you so much. Could you give me a detailed overview of simol, please?
ChatGPT

Certainly, here's a detailed overview of the Simol programming language:

Overview of Simol (SIMulation Objects Language)

Introduction and Purpose:
    Simol, short for "SIMulation Objects Language," is a programming language designed to simplify software development and modeling with a focus on simulation.
    While it can be used as a teaching tool, Simol is not limited to educational purposes; it is intended for practical programming.
    Simol is considered a superset of the Java programming language, adding its own keywords and concepts on top of Java.

Relationship with Java:
    Simol is built on top of Java, meaning you can use Java libraries in Simol, and you can include Java code within Simol source code.
    However, Simol introduces new keywords to replace some Java keywords and adds new keywords for specific purposes.

Class Roles in Simol:
    Simol introduces the concept of "roles" for classes to clarify their purpose and responsibilities.
    There are four primary roles in Simol:
        simu_comp_worker: Represents classes responsible for managing computational or technical tasks. These classes instruct the computer on how to perform specific tasks.
        simu_real_world_obj: Represents classes that simulate real-world objects or entities, such as animals or physical components.
        real_world_obj: Similar to simu_real_world_obj, but without methods, often used for entities with attributes.
        information: Represents classes used as data structures for simu_comp_worker classes.

Modifiers and Special Keywords:
    Simol introduces the underst modifier, which marks methods as responsible for "understanding" complex logic, making it easier for programmers to identify such methods.
    The with_compat keyword is used to indicate compatibility with a specific interface.

Interfaces in Simol:
    Simol has two types of interfaces, both referred to as "compatibility interfaces":
        compat_interf_version: Requires classes implementing it to provide different implementations or versions.
        compat_interf_capacity: Ensures that a class has specific capabilities, regardless of the implementation.

Inheritance and Nature:
    In Simol, inheritance is expressed using the "nature" keyword instead of "extends" to emphasize that a class is of the same nature as another.
    Simol also uses "contracts" in place of "implements" for indicating that a class adheres to specific interfaces.

Simol Framework for Java Integration:
    Simol offers a framework for Java developers, providing a set of annotations to integrate Simol concepts with Java seamlessly.

Simulation and Modeling:
    Simol's primary focus is on simulation and modeling, making it well-suited for applications where you need to simulate real-world entities or complex computational processes.

Design Principles:
    Simol adheres to various design principles, including the Single Responsibility Principle (SRP), Open-Closed Principle, Dependency Injection, and Interface Segregation Principle (ISP).

Compatibility with Existing Concepts:
    Simol is designed to be compatible with existing object-oriented concepts, design patterns, and best practices.
    It encourages a clear separation of business logic and low-level code and supports the use of design patterns like DAO, MVC, Bridge, and Dependency Injection.

Learning Curve:
    For experienced Java programmers, learning Simol might take several weeks on average. However, Simol is designed to be relatively easy to understand for those familiar with object-oriented programming.

Development Tools and Compilation:
    Simol code can be edited using Java development tools like Eclipse. The Simol compiler generates Java code from Simol source files, which can then be compiled using the Java compiler (javac).

Focus on Clarity and Abstraction:
    Simol emphasizes clarity and abstraction, providing a structured way to express complex ideas and algorithms.

Simulation and the Computer as a Worker:
    Simol's "simu_comp_worker" role views the computer as a worker, managing computational tasks and algorithmic work.

Simulation and Mathematical Tasks:
    Simol supports both simulation and complex mathematical tasks, allowing for a clear separation of roles.

Inherent Adherence to Good Practices:
    Simol inherently incorporates good object-oriented design principles, making it easier for developers to adhere to best practices.

Simulation in General Purpose Programming:
    Simol can be used for general-purpose programming, not limited to simulation domains.

Compatibility with Other Paradigms:
    Simol aligns with other programming paradigms by offering clear semantics for different class roles.

Simol and the SOLID Principles:
    Simol naturally adheres to SOLID principles, making it easier to develop maintainable and extensible software.

Simol and Existing Libraries:
    Simol provides a classification proposal for existing Java libraries, making it easier for users to work with familiar libraries.

Nature vs. Class:
    Simol introduces the "nature" keyword, which emphasizes the concept of inheritance by considering a class's nature rather than its class.

In summary, Simol is a unique programming language with a strong emphasis on simulation and modeling, clear class roles, and adherence to good object-oriented design principles. It provides a structured and minimalistic approach to software development, making it a valuable tool for a wide range of applications.
***************************************************************
User
And what about the free choice of interpretation and vision?
ChatGPT

Simol encourages a free choice of interpretation and vision when it comes to designing and implementing classes. This flexibility is a fundamental aspect of Simol's design philosophy, and it offers several benefits to developers:

Adaptation to Domain and Problem-Specific Needs:
    Simol acknowledges that software development often involves different perspectives and interpretations of the problem domain. By allowing developers to choose the most suitable class roles based on their interpretation of the problem, Simol adapts to the specific needs of the domain.

Clarity and Communication:
    While Simol offers different class roles to provide clarity and semantics, it does not restrict developers to a single interpretation. This means that developers can express their understanding of a problem and communicate it to others using Simol's role-based approach.

Enhanced Code Readability:
    The ability to choose class roles that align with one's interpretation can lead to more readable code. When developers select roles that match their understanding, it becomes easier for other team members to grasp the intent and purpose of the code.

Maintenance and Evolution:
    Software systems evolve over time, and different developers may need to modify or extend the codebase. Simol's flexibility allows for easy adaptation to new requirements and interpretations, facilitating the maintenance and evolution of the software.

Problem-Solving Creativity:
    Simol empowers developers to think creatively and adapt the language to their problem-solving process. It encourages exploration and experimentation with different class roles to find the most effective solution.

Integration with Existing Paradigms:
    Simol can be seen as a bridge between existing programming paradigms and its role-based approach. Developers from various backgrounds can relate Simol's roles to their existing knowledge and practices.

Teaching and Learning:
    Simol can serve as an educational tool to teach object-oriented programming concepts. The ability to choose class roles based on different interpretations can help students understand the flexibility and creativity of software design.

In summary, Simol's philosophy of allowing a free choice of interpretation and vision reflects its commitment to adaptability and versatility. Developers are encouraged to embrace their unique perspectives and problem-solving approaches while leveraging Simol's role-based structure to create software that aligns with their understanding of the domain and requirements. This approach ultimately contributes to more effective and expressive software development.

*****************************************************************
Here is my description of the SIMOL programming language:

THE SIMOL PROGRAMMING LANGUAGE

INTRODUCTION

The simol language(SIMulation Objects Language) is a programming language that I defined. Its definition and specifications are ended, but it's always ready to refinement, of course.
It is not widely used, and I want to share it with interested people.
It is minimalistic, for simplify development. It is an interesting teaching tool, but it's not designed only for teaching purposes.
It is a superset to the Java language. It added keywords that replace some java keywords like 'class', 'interface',
and it added some keywords like 'with_compat', or 'underst'.
We can use java libraries in simol. We can use also java code in simol source code, except the keywords "class", "implements", "extends", "interface".
For example, java local variable is of course allowed in simol methods, "public" is authorized for a "simu_real_world_obj", and so on.
All java which can be applied to a class can be applied to a "simu_real_world_obj", "simu_comp_worker", "information", "real_world_obj", "compat_interf_version", "compat_interf_capacity".
As simol classes replaces java classes, all java keywords can be used with simol classes, for example "public simu_comp_worker { }".

We start from the Java language. And we add some very simple concepts. The java libraries can be used, while it is a superset of java.
Simol can be used directly in java, while commenting with the simol key words, so, in some way, simol can be seen as a way of writing java code. You can also use the simol compiler.
Simol follow the open-closed principle, while not really modifies java but rather add notions on top on existing oriented object concepts.
Simol can also be used through the simol framework for java, which provide a framework to introduce simol in java with annotations.

SIMOL AND THE FUNDAMENTAL THEOREM OF SOFTWARE ENGINEERING

Simol follow the guidelines of the Fundamental theorem of software engineering, by trying to add an abstraction layer on top classes and interfaces. It aims to decrease complexity through the indirection of classes and interfaces roles.

Wikipedia quotation about the Fundamental theorem of softwatre engineering:
"The fundamental theorem of software engineering (FTSE) is a term originated by Andrew Koenig to describe a remark by Butler Lampson attributed to David J. Wheeler:

   "We can solve any problem by introducing an extra level of indirection."

The theorem does not describe an actual theorem that can be proven; rather, it is a general principle for managing complexity through abstraction. 
"

SIMOL AND THE DIFFERENT INTERPRETATIONS
Simol allow to have our free interpretation of our class design and class meaning. For example, you could see business logic as the work of a business expert, so use a simu_rewo. Other people could have another interpretation of business logic, and use simu_comp_worker. One of the complexity in oriented object programming, is to stick at the interpretation of the writer of the code. It is sometimes hard to imagine how was the original vision of the design, so adding a minimalistic information of the kind of class or interface, can be a clue to help understanding and maintenability. Like reading a text, a source code, and particularly an object-oriented source code, can have multiple readings and interpretations. Simol, while keeping free to choose the interpretation as we want, aims to support us to express our own understanding to others.

THE ROLE OF CLASSES

In simol, classes are given a role, in the same way we create a controller object, for example.
And there are here only four roles in simol, simu_comp_worker, simu_real_world_obj, real_world_obj and information: only code for computer, or pure code of simulation.
Simol is based on the fact that you can noticed than some classes emulate, or simulate, real-world objects, as an abstraction of the underlying data structure. Even in system programming, much abstractions of such objects are used, such as connections, streams or files.
Then, the other kind of classes could be classes for computational or technical tasks, where we want the computer to work for us with his resources, but not in a emulation goal. To being coherent, and not dependant of computer problems, we could abstract that, and do as if it could be algorithmic tasks not even for a computer, but for a worker in general.
So the computational tasks emulate an algorithm for worker, as the computer needs a compilation to understand the algorithms. This roles of classes aims to help for make concrete the object oriented programmation, and to help other programmers to read the existing code. It aims also to facilitate design choices, and to easily separate responsabilities. It marks classes with clear concrete abstractions, the simu_real_world_obj, which should be easier to use and write, in general.
The ambition of the class is clearly indicated, and it adds information on the design intents of the developer.
In classical oriented object programming, there is no given role to a class, but we could consider that it would be as if simol objects would inherit for one of this four classes, simu_comp_worker, simu_real_world_obj, Rewo_class, or Information. 
Other roles could eventually have been candidate, like simu_service, simu_event, simu_util, simu_dao, simu_middleware, simu_controller, simu_config, simu_cache, simu_auth, simu_scheduler, simu_validation, simu_report, simu_facade, simu_plugin, but I wonder if all this stuff is simulation, and this roles are already covered by the four main roles. We don't want to have to much roles, for staying efficient and clear.
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


The modifier "underst"("understanding") can be added to the methods of simu_real_world_obj( or even simu_comp_worker) classes. It marks the methods that have a role of "understanding" by the computer (recognition of objects in an image, for example). "underst" can also be used on simu_comp_worker.
	"underst" indicates code that is non intuitive, for example complex sorts implementations. Even the famous and widely used algorithms can be marked as "underst".
	It is placed before the result type of a method declaration. It can not be used for the methods of an compatibility interface.

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
	The nature of a simu_comp_worker is assumed to be a algorithm for computer. 'nature' must be used only by classes.
	
- We use "contracts", instead of "implements": we list interfaces that the class respects, there are considered as contracts.
simol prefer not to use "with_compat" for the interfaces list implemented in a simol class, because "with_compat" emphasizes  the fact
that an object is compatible, not a class. A class is considered as respecting contracts. "implements" can not be used in simol because
it focuses on the implementation, not the idea of a contract is respected.

SIMOL FRAMEWORK FOR JAVA DEVELOPERS
Simol framework is a package of java annotations, that offers a toolbox for java developers to work with simol frame. There are eight annotations, for each pure simol keyword, but not for "nature" and "contracts".
Those annotations serves to fill the gap between java and simol, and to provide a way to easily use and learn simol mindset.

The package org.simol.simolframework.java offers:
@Simu_real_world_obj, @Simu_comp_worker, @Real_world_obj, @Information, @Compat_interf_capacity, @Compat_interf_version, @With_compat, and @Underst. They are placed in the same locations as pure simol, but just before class line, or interface, or method, or just before a type use for @With_compat(except in particular cases as return type of methods).
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

COMPATIBILITY WITH OTHER PARADIGMS

The kind of objects simu_real_world_obj and simu_comp_worker can be seen as only simu_comp_worker, as simu_real_world_obj is finally a specialized simu_comp_worker in goal of simulation of the real-world. The same reasoning is valid for real_world_obj, which are first a kind of "information" object, but an "information" as well.
So with this observation, we can say that there is only, finally, only simu_comp_worker classes(and only "information"), and this aligns with paradigms that do not differenciate classes. So we could see that even in simol, there is one sort of class or structures, like in classical oriented object programming(as well in procedural paradigm). In summary, it's quite like simu_real_world_obj would inherit of simu_comp_worker, and as real_world_obj would inherit from information, which is quite like regular object vision. This precisions aims to make a bridge with objects existing paradigms and code.

SIMOL IN GENERAL PURPOSE PROGRAMMING

Simol could be interesting too for general-purpose, for those who are interested on a simulation vision. Indeed, even in system programming, we can easily find simu_real_world_obj as connections, sockets, file, memory and so on.

RELATIONSHIPS WITH EXISTING INTERFACES

Finally, java and other oriented objects programmers often uses "-able" interfaces, which has a marked meaning of capacity. And existing interfaces like Factory are well know as being version purpose interfaces. Interfaces are famous to be as a contract.

NATURE VERSUS CLASS

The class keyword emphasizes mold and inheritance. Nature keyword limits a bit inheritance, and it's more restrictive, but keep behind the idea of inheritance, as well as having the same nature implies an inheritance. Nature aims to avoid pure technical inheritance, and promote composition in other cases. It could give arguments to limit multiple inheritance for simu_real_world_obj, if it would exist in java, and could bring a solution to diamond problem.

LEARNING CURVE

Several weeks average might be necessary to become proficient in simol, for a experienced Java programmer, while he would be familiar with simol which is not so far from Java. Java programmers are used to manipulate concepts. Simol's concepts are relatively easy to understand, for a experienced java programmer, and the reduced number of new keywords(ten).


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
    strictfp
    
VariableModifier:
    final
    Annotation
    with_compat
	
MethodOrFieldDecl:
	MethodDecl
	FieldDecl

MethodDecl:
	[underst] Type Identifier MethodOrFieldRest

FieldDecl:
	Type Identifier MethodOrFieldRest

TO COMPILE

The simol compiler is the more direct way to use simol. But there are solutions to use simol in java. First, we have the simol framework for java developers.
And the translation by hand of simol into java is very easy to do, in java, and we write the simol code as a comment(except in case we want to the source to be shorter).
You can compile by hand, in this way, or use 

"simu_comp_worker" => replace with "class"
"simu_real_world_obj" => replace with "class"
"real_world_obj" => replace with "class"
"information" => replace with "class"
"underst" => replace with ""(empty string)

"compat_interf_version" => replace with "interface"
"compat_interf_capacity" => replace with "interface"
"with_compat" => replace with ""(empty string)

"nature" => replace with "extends"
"contracts" => replace with "implements"
EVERYTHING ELSE IS IDENTICAL TO JAVA

THE SIMOL COMPILER
A compiler exists, written with Antlr4 in java, which start from a java 8 grammar(antlr4-grammars).
The simol compiler parse simol code(.simo source files), and java code included(java 8). He stops when a syntax error is met, simol or java.
It does not, actually, deal with semantic analysis of simol, nor java. Semantic analysis of simol is not so important, it's only about:
real_world_obj and information, checking is there are no methods.
simu_real_world_obj and simu_comp_worker, it have to contain methods.
with_compat, check if the type is an interface, and checks about presence of with_compat when needed
The compiler generates java code, if all is ok.
Then you have to use javac on the generated java code, in order to obtain executables with bytecode.

SIMOL CODE EDITORS
simol sources can be open with Eclipse and choosing open with java editor, or with notepad+++->java language, and so on.
You can format the generated java code with Eclipse, for example, right clic on the java generated file, source, format.
Simol framework for Java permit to use java's IDE and tools, and autocompletion on annotations, and is completely integrated with java.

SIMOL AND JAVA LIBRARIES
In order to help users which would want to use existing java libraries as simol, a classification proposal of java usual language libraries exists and will grow.
For example, "@Simu_real_world_obj JPanel extends JComponent implements java.awt.ImageObserver, java.awt.MenuContainer", or "@Compat_interf_capacity (java.awt.)MenuContainer". This help is not intended to contain compulsorily all the libraries.
Simol framework annotations are used, while it is existing java code, in order to show that existing java code could be updated, and to help simol users.

ALGOL AND SIMOL

ALGOL("Algorithmic Language"), was designed with a strong emphasis on algorithmic and mathematical computation. It aimed to provide a language for expressing algorithms clearly and efficiently.  ALGOL 60, in particular, was influential in introducing features for structured programming and became a foundation for modern programming language design. Simol, with its "simu_comp_worker" (Simulation of a computer worker) role, shares a similarity with ALGOL's focus on algorithmic programming.  The "simu_comp_worker" role in Simol is explicitly dedicated to the simulation of algorithmic language for a computer( as it is a simulation of a computer worker). It's similar to ALGOL's original goal of serving as an algorithmic language.
Semantic Clarity: Both languages strive for semantic clarity. ALGOL's design encouraged developers to write code that closely mirrored the problem-solving process, and Simol's class and interface roles provide clear semantics for the different types of components.
Minimalistic Approach: ALGOL's creators aimed to keep the language minimalistic, and Simol also follows a minimalistic approach, focusing on a limited number of roles and concepts.

SIMULA AND SIMOL

Simulation Focus: Both Simula and Simol have a strong emphasis on simulation. Simula was specifically designed for simulation, and Simol's name, "SIMulation Objects Language," reflects its focus on simulation and modeling.
Object-Oriented Programming: Simula is often credited as one of the earliest object-oriented programming languages. Simol also embraces object-oriented concepts by introducing roles for classes and interfaces, which is a fundamental aspect of object-oriented design.
Abstraction: Both languages encourage clear abstractions in code. Simula introduced the concept of classes and objects as a way to model real-world entities, while Simol defines distinct roles for classes and interfaces to indicate their purpose and responsibilities.
Real-World Modeling: Simula's object-oriented approach was aimed at modeling real-world entities and their interactions. Simol's "simu_real_world_obj" is designed to represent real-world objects. Principles of Simplicity: Simula was designed with simplicity in mind, focusing on providing a clear and efficient way to model complex systems. Simol also follows a minimalistic approach to language design, promoting clarity and simplicity.

SIMU_COMP_WORKER, COMPUTER AS A WORKER

simu_comp_worker not only want to separate simu_real_world_obj and pure computer tasks, but aims to see computer as a worker. The "simu" of "simu_comp_worker" emphasizes that, almost of we were talking of a real-world worker. So the computer's job would be to manage his peripherals and resources, and doing all job purely relative to him. The algorithm is intended to be executed for a worker, and that worker is a computer, but it could have been a human, except in the subject of the nature of the tasks. So simu_comp_worker really joins to ALGO 60 vision of the computer, in the sense of the algorithms using, as for abstract the worker, and for being quite human-like.

INHERENTLY INCLUDE GOOD ORIENTED OBJECT PRATICES AND PATTERNS

While object oriented languages does not mention directly design patterns and best oo pratices and principles, simol inherently includes good oriented object design principles and guidelines. Classical oriented object languages are not supplying in the language itself such patterns or guidelines. Simol can also benefit of design patterns or principles, of course, but number of guidelines and good principles are already embedded. So the programmer can focus directly on his first programming problem and goals.

COMPUTE OR NOT COMPUTE

The calculations themselves, of course, can be considered as a basic task of a computer, as if the worker would have skills in calculations too. The English naming "computer" takes sense, of course. That said, complex computing task could be viewed as being in the role of a mathematical expert, and being in a simu_real_world_obj. Simulation logic and code include computing itself, so simulation algorithms used in the simu_real_world_obj contains computing too. We could do both too, and having simu_real_world_obj for high mathematical tasks, using simu_comp_worker for getting computer worker services and skills about computing. Though we know that computer could be inaccurate or could make mistakes while computing, it could be seen of a realization stuff for a simu_real_world_obj math expert. So simol permits such considerations and refinements. ALGOL 60 includes much mathematical aspects in term of calculations, perhaps, as simol disposes of simu_real_world_obj to complete the job.

SIMOL AND THE SOLID PRINCIPLES

simol naturally adheres closely to well-know S.O.L.I.D principles. Single responsabilty is directly implemented with the class roles.
Open closed principle is encouraged when useful, with a understanding and clear design and design goals, and by separating roles of compatibility interfaces. Dependency injection is much easy and direct to implement and to be used and viewed. Interface Segregation principle, the "I" talks about "role interfaces", that immediatly joins the role of interfaces of simol. Liskov substitution principle("L") takes sense in simol, while clear understanding of "nature" of objects and classes, and with simol concepts in general.

COMPATIBLE WITH EXISTING CONCEPTS
Some simol concepts used can be compared finally with some existing concepts, like the concept of business logic.

* Near from business logic idea:

Here is the definition of business logic, in Wikipedia:
"In computer software, business logic or domain logic is the part of the program that encodes the real-world business rules that determine how data can be created, stored, and changed. It is contrasted with the remainder of the software that might be concerned with lower-level details of managing a database or displaying the user interface, system infrastructure, or generally connecting various parts of the program.".

The idea of separating business logic code and low level code which handles managing a database, and so on, looks like the simu_real_world_obj and simu_afoc. It would be a simu_real_world_obj which would simulate an human expert work, and simu_afoc would manage low-level details.
Simol goes further while considering simulation code, like business logic for this real-world object. But the reasoning can be compared.

* Adheres naturally to SRP
Single Responsability Principle(SRP): simol encourages naturally the SRP, with the kind of class separation, and also with the "nature" keyword.

* Simol is natively well adapted with the MVC pattern, with his simulation focus, well made for the controller(simu_real_world_obj), the model(simu_comp_worker), and the view(simu_comp_worker). But simol let programmers free to the point of views choosing the kind of class they prefer.

* Adheres closely to the DAO Design Pattern. simu_comp_worker, and compat_interf_version suits closely for implementing the DAO pattern in simol.

* Compatible with loose coupling principle, bridge pattern, "program to an interface not an implementation" principle, with the compat_interf_version interfaces, and "with_compat" keyword. As well aligned with Dependency Injection(DI) pattern(with with_compat keyword).

* Well suited for design patterns and oriented object principles in general(composite, and so on), as simol brings accuracy and clearly intents

* About interface inheritance:
For the interfaces, simol not directly talks about interface inheritance(nor java, anyway). But if we want we can use it as a capacity, it would show that this inheritance is not of the same nature.

(END OF THE DESCRIPTION OF THE LOSIM LANGUAGE)
********************************************************************************
