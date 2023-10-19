# simol-language
Repository about my own programming language simol, which is a superset of Java. It could be a DSL(Domain Specific Language) in simulation, as well as oriented object work. I'm looking for people who could be interested in. The definition of simol stands on few pages, and it's fast to get an overview.
Simol is a programming language designed for clarity, simplicity, and ease of use. It empowers a diverse range of users, including computer scientists, scientists, mathematicians, and practical application developers, to harness the power of computer programming without sacrificing performance. Simol's intuitive syntax and simulation-oriented approach make it an excellent choice for understanding and applying programming concepts efficiently.

I started simol's design in 2019, and now it's stable. I needed it for my own purposes and work.
I want to share it. I'll put code examples, and discussions on the simol code are welcome. I'm much interested in simol examples you could create, for giving feedback to simol. Tools are welcome too.
There is a simple simol compiler, but it works great. You can also compile by hand, it's straightforward, simply by adding simol comments in java, so we can take advantage of java tools , community and libraries.

The response and overview of chatGPT 3.5 on the description of simol programming language. Below I put the description itself.
***************************************************************************************************************
(CHAT GPT 3.5 RESPONSE)
Thank you for providing a detailed description of the Simol programming language. It's interesting to see how you've extended and customized Java to create a language that focuses on simulation-oriented programming. Here are some key points and features I've gathered from your description:

   Simol Roles: Simol introduces different class roles, such as simu_alfoc, simu_rewo, rewo, and information, each with its own specific purpose and behavior.

   Compatibility Interfaces: Simol defines two types of interfaces, compat_interf_version and compat_interf_capacity, to manage the compatibility of classes. These interfaces ensure that classes adhere to certain contracts and versions.

   Class Inheritance: Simol uses "nature" instead of "extends" to define class inheritance, emphasizing the concept that a class is of the same nature as another.

   Contracts and Compatibility: Simol promotes the idea of respecting contracts and compatibility in class definitions and interfaces.

   Compiler: Simol provides a compiler that can translate Simol code into Java code, making it easier for users to work with existing Java libraries and tools.

   Code Editors: Simol code can be edited using standard Java code editors, making it accessible to developers who are familiar with Java.

   Adherence to Design Principles: Simol aligns with various design principles, such as the Single Responsibility Principle (SRP), MVC pattern, DAO Design Pattern, loose coupling, and Dependency Injection (DI).

   Nature vs. Class: The "nature" keyword in Simol promotes the idea of inheritance and composition, which can help avoid issues like the diamond problem.

Overall, Simol seems to provide a unique approach to programming, particularly focusing on simulation and modeling. It's interesting to see how you've incorporated well-known design principles and patterns into your language. If you have any specific questions or need further information about Simol, please feel free to ask.

(END OF CHAT GPT 3.5 RESPONSE)
***************************************************************************************************************

VARIOUS QUESTIONS TO CHATGPT
***************************************************************
User
Could you make an overview about the extended simulation oriented programming ?
ChatGPT

Certainly, I'd be happy to provide an overview of "Extended Simulation-Oriented Programming," as it's described in the context of the Simol programming language.

Extended Simulation-Oriented Programming (ESOP): An Overview

Extended Simulation-Oriented Programming (ESOP) is a unique approach to software development that extends the traditional concept of simulation. In the context of the Simol programming language, ESOP is a programming paradigm that enriches the way we think about and utilize objects in the world of software development. Here's an overview of key concepts and principles associated with ESOP:

   Simulation as an Abstraction: ESOP recognizes that, in software development, objects are often abstractions that represent real-world entities or concepts. These objects can be seen as simulations or models of these real-world entities, allowing for a more concrete and intuitive way of thinking about software.

   Realistic Modeling: ESOP aims to go beyond mere abstraction and modeling by encouraging developers to create simulations that closely mimic real-world entities or systems. This approach can make software development more intuitive and user-friendly, as it relates more directly to our understanding of the physical world.

   Concrete Objects: In ESOP, objects are not purely abstract entities. Instead, they are seen as concrete simulations of real-world objects or systems, making it easier to reason about them and their interactions.

   Roles of Simol Classes: In Simol, classes are assigned one of four roles: simu_alfoc, simu_rewo, rewo, and information. Each role is designed to serve a specific purpose within the context of simulation-oriented programming.

   Simulation of Algorithmic Work: The simu_alfoc role is designed for classes that perform algorithmic work for the computer. These classes represent the technical side of software development and are responsible for instructing the computer on how to execute specific tasks.

   Simulation of Real-World Objects: Classes with the simu_rewo role simulate real-world objects and their behaviors. These classes are where you define the actions and attributes of objects that resemble physical entities.

   Entities with Attributes: rewo classes represent entities with attributes but no methods. These classes are typically used for entities within the software that do not require complex behavior.

   Data Structures: The information role is used for classes that function as data structures, typically used by simu_alfoc classes. These classes are responsible for managing data within the system.

   Compatibility Interfaces: Simol introduces compatibility interfaces (compat_interf_version and compat_interf_capacity) to ensure that classes adhere to certain contracts and provide specific capabilities. This promotes loose coupling and flexibility within the software architecture.

   Nature vs. Class: ESOP introduces the concept of "nature" instead of "extends" to define class inheritance. This concept emphasizes that a class is of the same nature as another, aligning more closely with the object it simulates.

   Bridge to Existing Paradigms: ESOP is designed to provide a bridge to existing programming paradigms and coding practices. It allows programmers to bring their experience and understanding of objects into the Simol context.

   MVC and Design Patterns: Simol naturally aligns with design patterns like the Model-View-Controller (MVC) pattern, DAO Design Pattern, and principles such as the Single Responsibility Principle (SRP). It encourages clear separation of concerns and well-defined roles for different parts of the system.

In summary, Extended Simulation-Oriented Programming in the context of Simol challenges the traditional notion of objects in software development. It provides a more concrete and intuitive way to design and model software, making it easier to understand and reason about the behavior of objects in the code. By assigning roles to classes and using compatibility interfaces, ESOP encourages a high degree of organization and compatibility in the software architecture. It also aligns with established design principles and patterns, making it a powerful approach for building software systems with clear structure and functionality.

****************************************************************
Here is my description of the SIMOL programming language:

THE SIMOL PROGRAMMING LANGUAGE

INTRODUCTION

The simol language(SIMulation Objects Language) is a programming language that I defined. Its definition and specifications are ended.
It is not widely used, but it is a real language, because it's not evolving, and his definition is complete.
It is minimalistic, for simplify development, especially simulation oriented development. But it is not only for teaching purposes.
It is a superset to the Java language. It added keywords that replace some java keywords like 'class', 'interface',
and it added some keywords like 'with_compat', or 'underst'.
We can use java libraries in simol. We can use also java code in simol source code, except the keywords "class", "implements", "extends", "interface".
For example, java local variable is of course allowed in simol methods, "public" is authorized for a "simu-or", and so on.
All java which can be applied to a class can be applied to a "sim_or", "simu_alfoc", "information", "rewo", "compat_interf_version", "compat_interf_capacity".
As simol classes replaces java classes, all java keywords can be used with simol classes, for example "public simu_alfoc { }".

We start from the Java language. And we add some very simple concepts. The java libraries can be used, while it is a superset of java.
Simol can be used directly in java, while commenting with the simol key words, so, in some way, simol can be seen as a way of writing java code. You can also use the simol compiler.
Simol follow the open-closed principle, while not really modifies java but rather add notions on top on existing oriented object concepts.

THE EXTENDED SIMULATION ORIENTED PROGRAMMING(ESOP)

In fact, by 'simulation oriented programming', I aim to talk about an extended simulation concept. So I could talk about "extended simulation oriented programming". Simulation is traditionnaly modeling and emulating of topic in scientific domain(physics, chemistry, and so on), or industrial, economic. I propose to say that as an object of oriented object programming is an abstraction, so it could always be seen as an (extended) simulation or a model of something. If that object has no behavior, we'd rather talk about a model. So a Car class, makes cars object, an abstraction of a data structure, which is seen as an object. But we could use the extended simulation principle to say that this object simulate something, and this is a real car. We go further than just saying it is an abstraction. So, we become more concrete, and it becomes as if we talk about realities, and it leads to an easier programming, and it's human-friendly for the memorization of objects. So simol is surely a Domain Specific Language in simulation domain, but it was created to be for general-purpose programming. So I'd reather talk about "extended simulation oriented", about this kind of programming, and simol. So the classical concept of simulation is used in an extended manner, to give more sens and pratical usage in objects of OOP. So its goal aims to avoid losing ourselves in useless extreme abstractions, and to give landmarks in our reasonings, as well as bring common terms to talk about objects.

THE ROLE OF CLASSES

In simol, classes are given a role, in the same way we create a controller object, for example.
And there are here only four roles in simol, simu_alfoc, simu_rewo, rewo and information: only code for computer, or pure code of simulation.
You should be agree with these concepts of roles, for using simol.
In pure oriented object programming, there is no given role to a class, but we could consider that it would be as if simol objects would inherit for one of this four classes, Simu_alfoc, Simu_rewo, Rewo_class, or Information.
The simol roles aims to be oriented extended simulation. 
Other roles could eventually have been candidate, like simu_service, simu_event, simu_util, simu_dao, simu_middleware, simu_controller, simu_config, simu_cache, simu_auth, simu_scheduler, simu_validation, simu_report, simu_facade, simu_plugin, but I wonder if all this stuff is simulation, and this roles are already covered by the four main roles. We don't want to have to much roles, for staying efficient and clear.

THE simol CLASSES

Instead of "class", we use the following keywords:

"simu_alfoc"(stands for Simulation of Algorithmic Language FOr Computer) => we have a class that does not simulate a real object. It gives work to the computer, technical. We see then this work as an algorithm in algorithmic language, which is executed by a computer ("Computer"). The computer will manage its resources (memory, processor, etc.) and peripherals, according to this algorithm. By algorithmic language, we mean the pseudo-language used in algorithmic courses. We will simulate this algorithm on the computer, thanks to the compiler. The computer does not really know how to execute this algorithm, it will execute equivalent assembly code.

"simu_rewo" (means simulation of a real-world object) => we have a class which is considered as a simulation of a real object, for example an animal, with methods eat(), run(), etc.
	Simulation realization on computer should be in a "simu_alfoc", but if the realization is quite simple, it is allowed to write it directly in a "simu_rewo". simu_rewo are also used in simu_alfoc, when it's needed, for example for buttons of a GUI, simulation of physical component, or mathematical notion.

"rewo" => like "simu_rewo", but when we don't have methods. Example: a Customer class (with only attributes). It is typically used for entities.

"information" => like "simu_alfoc", but when we don't have methods. It is typically used by a simu_alfoc, as a data structure, and shouldn't be used in simu_rewo, except for an eventual technical realization part.

As simol wants to be as powerful and compatible with java, access modifiers, and other stuff in a java class declaration are allowed in the same way of a simol class declaration, obviously.
As simol wants to be as powerful and compatible with java, access modifiers, and other stuff in a java interface declaration are allowed in the same way of a simol interface declaration, obviously.


The modifier "underst"("understanding") can be added to the methods of simu_rewo( or even simu_alfoc) classes. It marks the methods that have a role of "understanding" by the computer (recognition of objects in an image, for example). "underst" can also be used on simu_alfoc.
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
	The nature of a simu_alfoc is assumed to be a algorithm for computer. 'nature' must be used only by classes.
	
- We use "contracts", instead of "implements": we list interfaces that the class respects, there are considered as contracts.
simol prefer not to use "with_compat" for the interfaces list implemented in a simol class, because "with_compat" emphasizes  the fact
that an object is compatible, not a class. A class is considered as respecting contracts. "implements" can not be used in simol because
it focuses on the implementation, not the idea of a contract is respected.

COMPATIBILITY WITH OTHER PARADIGMS

The kind of objects simu_rewo and simu_alfoc can be seen as only simu_alfoc, as simu_rewo is finally a specialized simu_alfoc in goal of simulation of the real-world. The same reasoning is valid for rewo, which are first a kind of "information" object, but an "information" as well.
So with this observation, we can say that there is only, finally, only simu_alfoc classes(and only "information"), and this aligns with paradigms that do not differenciate classes. So we could see that even in simol, there is one sort of class or structures, like in oriented object programming(as well in procedural paradigm). In summary, it's quite like simu_rewo would inherit of simu_alfoc, and as rewo would inherit from information, which is quite like regular object vision. This precisions aims to make a bridge with objects existing paradigms and code.

SIMOL IN GENERAL PURPOSE PROGRAMMING

Simol could be interesting too for general-purpose, for those who are interested on a simulation vision. Indeed, even in system programming, we can easily find simu_rewo as connections, sockets, file, memory and so on.

RELATIONSHIPS WITH EXISTING INTERFACES

Finally, java and other oriented objects programmers often uses "-able" interfaces, which has a marked meaning of capacity. And existing interfaces like Factory are well know as being version purpose interfaces. Interfaces are famous to be as a contract.

NATURE VERSUS CLASS

The class keyword emphasizes mold and inheritance. Nature keyword limits a bit inheritance, and it's more restrictive, but keep behind the idea of inheritance, as well as having the same nature implies an inheritance. Nature aims to avoid pure technical inheritance, and promote composition in other cases. It could give arguments to limit multiple inheritance for simu_rewo, if it would exist in java, and could bring a solution to diamond problem.

LEARNING CURVE

Several weeks average might be necessary to become proficient in simol, for a experienced Java programmer, while he would be familiar with simol which is not so far from Java. Java programmers are used to manipulate concepts. Simol's concepts are relatively easy to understand, for a experienced java programmer, and the reduced number of new keywords(ten).


SIMOL GRAMMAR FROM JAVA SE 7 GRAMMAR(BNF-style from Oracle Site):

NormalClassDeclaration: 
    SimolRole Identifier [TypeParameters]
                                [nature Type] [contracts TypeList] ClassBody

SimolRole:
	simu_rewo
	simu_alfoc
	rewo
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

The translation of simol into java is very easy to do, in java, and we write the simol code as a comment(except in case we want to the source to be shorter).
You can compile by hand, in this way, or use the simol compiler.

"simu_alfoc" => replace with "class"
"simu_rewo" => replace with "class"
"rewo" => replace with "class"
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
rewo and information, checking is there are no methods.
simu_rewo and simu_alfoc, it have to contain methods.
with_compat, check if the type is an interface, and checks about presence of with_compat when needed
The compiler generates java code, if all is ok.
Then you have to use javac on the generated java code, in order to obtain executables with bytecode.

SIMOL CODE EDITORS
simol sources can be open with Eclipse and choosing open with java editor, or with notepad+++->java language, and so on.
You can format the generated java code with Eclipse, for example, right clic on the java generated file, source, format.

SIMOL AND JAVA LIBRARIES
In order to help users which would want to use existing java libraries as simol, documents contening a classification proposal of java usual language libraries exist and will grow.
For example, "simu_rewo JPanel nature JComponent contracts java.awt.ImageObserver, java.awt.MenuContainer", or "compat_interf_capacity (java.awt.)MenuContainer". These documents are not intended to be complete.

COMPATIBLE WITH EXISTING CONCEPTS
Some simol concepts used can be compared finally with some existing concepts, like the concept of business logic.

* Near from business logic idea:

Here is the definition of business logic, in Wikipedia:
"In computer software, business logic or domain logic is the part of the program that encodes the real-world business rules that determine how data can be created, stored, and changed. It is contrasted with the remainder of the software that might be concerned with lower-level details of managing a database or displaying the user interface, system infrastructure, or generally connecting various parts of the program.".

The idea of separating business logic code and low level code which handles managing a database, and so on, looks like the simu_rewo and simu_afoc. It would be a simu_rewo which would simulate an human expert work, and simu_afoc would manage low-level details.
Simol goes further while considering simulation code, like business logic for this real-world object. But the reasoning can be compared.

* Adheres naturally to SRP
Single Responsability Principle(SRP): simol encourages naturally the SRP, with the kind of class separation, and also with the "nature" keyword.

* Simol is natively well adapted with the MVC pattern, with his simulation focus, well made for the controller(simu_rewo), the model(simu_alfoc), and the view(simu_alfoc). But simol let programmers free to the point of views choosing the kind of class they prefer.

* Adheres closely to the DAO Design Pattern. simu_alfoc, and compat_interf_version suits closely for implementing the DAO pattern in simol.

* Compatible with loose coupling principle, bridge pattern, "program to an interface not an implementation" principle, with the compat_interf_version interfaces, and "with_compat" keyword. As well aligned with Dependency Injection(DI) pattern(with with_compat keyword).

* About interface inheritance:
For the interfaces, simol not directly talks about interface inheritance(nor java, anyway). But if we want we can use it as a capacity, it would show that this inheritance is not of the same nature.

(END OF THE DESCRIPTION OF THE LOSIM LANGUAGE)
********************************************************************************
