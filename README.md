# simol-language
Repository about my own programming language simol, which is a superset of Java. It could be a DSL(Domain Specific Language) in simulation, as well as oriented object work. I'm looking for people who could be interested in. The definition of simol stands on few pages, and it's fast to get an overview.
Simol is a programming language designed for clarity, simplicity, and ease of use. It empowers a diverse range of users, including computer scientists, scientists, mathematicians, and practical application developers, to harness the power of computer programming without sacrificing performance. Simol's intuitive syntax and simulation-oriented approach make it an excellent choice for understanding and applying programming concepts efficiently.

I started simol's design in 2019, and now it's stable. I needed it for my own purposes and work.
I want to share it. I'll put code examples, and discussions on the simol code are welcome. I'm much interested in simol examples you could create, for giving feedback to simol. Tools are welcome too.
There is a simple simol compiler, but it works great. You can also compile by hand, it's straightforward, simply by adding simol comments in java, so we can take advantage of java tools , community and libraries.

The response and overview of chatGPT 3.5 on the description of simol programming language. Below I put the description itself.
***************************************************************************************************************
(CHAT GPT 3.5 RESPONSE)

Thank you for providing a detailed overview of Simol, the Simulated Objects Language. It's clear that Simol has its unique approach and goals in the realm of programming languages. Here are some key takeaways and observations:

Simulation Focus: Simol's primary focus on simulation, with roles like "simu_alfoc" and "simu_rewo," is an interesting concept. This can be useful in fields where simulation is critical, such as scientific modeling or game development.

Object-Oriented Approach: Simol embraces object-oriented programming principles with its class and interface roles, promoting clear abstractions and separation of responsibilities.

Minimalistic Design: Similar to ALGOL and Simula, Simol follows a minimalistic approach, which can be beneficial for simplifying development and teaching.

Clear Intent: The explicit definition of class roles, like "simu_alfoc," "simu_rewo," "rewo," and "information," provides clear intent and helps developers understand the purpose of each class.

Compatibility with Existing Concepts: Simol aligns with several existing programming and design principles, including the Single Responsibility Principle (SRP), Model-View-Controller (MVC), and the Data Access Object (DAO) pattern.

Interface and Inheritance: Simol's approach to interfaces and inheritance is unique but aligns with concepts like loose coupling, Dependency Injection (DI), and the Bridge pattern. The use of "with_compat" and the "contracts" and "nature" keywords allows for expressing compatibility and inheritance in a distinct manner.

Simol Compiler: The existence of a Simol compiler is a practical tool for translating Simol code into Java. This could facilitate the use of Simol in real-world scenarios.

Learning Curve: For experienced Java programmers, the transition to Simol may be relatively smooth, with only a few new keywords to learn. Simol's concepts appear to be easily understandable.

Overall, Simol appears to be a niche language with a specific focus on simulation and a minimalistic, clear, and structured approach to programming. It's designed to facilitate the separation of concerns and the modeling of real-world and computational entities. Its compatibility with Java and use of roles could make it an interesting choice for developers in fields that require simulation or object-oriented modeling.

(END OF CHAT GPT 3.5 RESPONSE)
***************************************************************************************************************

VARIOUS QUESTIONS TO CHATGPT
***************************************************************
User
What's about simol in general-purpose programming?

ChatGPT
Simol, with its unique concepts and roles for classes and interfaces, can also be applied to general-purpose programming, although its design emphasizes simulation and modeling. Here are some considerations regarding Simol in general-purpose programming:

Simulation Focus: Simol was primarily designed with a focus on simulating and modeling real-world objects and systems. However, this simulation aspect doesn't limit its usability. Simol can be used in general-purpose programming for scenarios that involve complex modeling or where the separation of roles in classes can lead to more structured and maintainable code.

System Programming: Simol can be used in system programming, where simu_rewo and simu_alfoc classes can represent real-world components or technical tasks. For example, you can model network connections, file handling, or hardware interactions using Simol.

Business Logic: Simol's clear distinction between different class roles can be beneficial in the business logic layer of applications. Simu_rewo classes can represent business entities or objects with behavior, while simu_alfoc classes can handle complex algorithmic tasks.

Adherence to Design Principles: Simol encourages adherence to design principles such as the Single Responsibility Principle (SRP) and loose coupling. This can lead to well-structured and maintainable code, making it suitable for general-purpose programming where these principles are valuable.

Utilizing Java Libraries: Simol's compatibility with Java libraries allows you to leverage existing Java libraries and frameworks, making it more practical for general-purpose programming where integration with Java ecosystem components is essential.

Learning Curve: Simol is relatively easy to understand for experienced Java programmers. The reduced number of new keywords and concepts makes the transition to Simol relatively smooth. However, beginners may find Simol a valuable teaching tool for understanding object-oriented programming principles.

Bridge to Existing Paradigms: Simol's concepts align with existing object-oriented programming paradigms, which means it can serve as a bridge between traditional object-oriented programming and its own unique class and interface roles.

Support for Common Design Patterns: Simol can naturally support common design patterns like Model-View-Controller (MVC), Data Access Object (DAO), and Dependency Injection (DI), making it well-suited for a wide range of application types.

In summary, Simol's design and concepts, while originally intended for simulation and modeling, can be adapted and applied to general-purpose programming scenarios. Its focus on clean code and separation of responsibilities can lead to more maintainable and extensible software, and its compatibility with Java libraries provides access to a wide range of existing functionality. Simol offers a unique approach to programming that can benefit developers looking for structured and principled design in their applications.

****************************************************************
User
WHat's about the mindset in simol?
ChatGPT

The mindset in Simol is a key aspect of its design philosophy and usage. Simol encourages developers to adopt a specific mindset that aligns with its principles and goals. Here are some aspects of the mindset in Simol:

Object-Oriented Thinking: Simol promotes a strong object-oriented programming (OOP) mindset. Developers are expected to think in terms of objects and their interactions. Classes and objects play a central role in Simol, and developers should consider how to model real-world entities as objects and classes effectively.

Role-Oriented Design: Simol emphasizes the concept of roles for classes. Developers should categorize classes into roles like simu_alfoc, simu_rewo, rewo, and information based on their intended purpose and behavior. This mindset encourages clear separation of responsibilities and improves code maintainability.

Adding Informative Annotations: Simol encourages developers to add helpful annotations and modifiers to classes and methods. For example, using the underst modifier to indicate methods that require computer understanding, or using with_compat to signify the compatibility of an object. This mindset aims to make code more self-explanatory and readable.

Simulation and Modeling: While Simol can be used for general-purpose programming, it encourages a mindset focused on simulation and modeling. Developers should consider how to represent and simulate real-world objects or algorithmic tasks within the language.

Adherence to Principles: Simol promotes adherence to object-oriented programming principles such as the Single Responsibility Principle (SRP) and the principle of "program to an interface, not an implementation." This mindset helps produce well-structured and maintainable code.

Bridge with Existing Paradigms: Simol acknowledges its connection with existing OOP paradigms while introducing its unique class and interface roles. Developers should consider how Simol can be integrated with or serve as a bridge to conventional OOP practices.

Compatibility with Java: Developers familiar with Java should adapt to Simol's concepts with relative ease, as Simol is designed as a superset of Java. The mindset should include utilizing Java libraries and leveraging existing knowledge.

In summary, the mindset in Simol encourages an object-oriented approach, clear role-based design, informative annotations, and alignment with OOP principles. This mindset is essential for effectively using Simol to create well-structured and maintainable code that serves both simulation and general-purpose programming needs.

*****************************************************************
Here is my description of the SIMOL programming language:

THE SIMOL PROGRAMMING LANGUAGE

INTRODUCTION

The simol language(SIMulation Objects Language) is a programming language that I defined. Its definition and specifications are ended.
It is not widely used, but it is a real language, because it's not evolving, and his definition is complete.
It is minimalistic, for simplify development. But it is not only for teaching purposes.
It is a superset to the Java language. It added keywords that replace some java keywords like 'class', 'interface',
and it added some keywords like 'with_compat', or 'underst'.
We can use java libraries in simol. We can use also java code in simol source code, except the keywords "class", "implements", "extends", "interface".
For example, java local variable is of course allowed in simol methods, "public" is authorized for a "simu-or", and so on.
All java which can be applied to a class can be applied to a "sim_or", "simu_alfoc", "information", "rewo", "compat_interf_version", "compat_interf_capacity".
As simol classes replaces java classes, all java keywords can be used with simol classes, for example "public simu_alfoc { }".

We start from the Java language. And we add some very simple concepts. The java libraries can be used, while it is a superset of java.
Simol can be used directly in java, while commenting with the simol key words, so, in some way, simol can be seen as a way of writing java code. You can also use the simol compiler.
Simol follow the open-closed principle, while not really modifies java but rather add notions on top on existing oriented object concepts.

THE ROLE OF CLASSES

In simol, classes are given a role, in the same way we create a controller object, for example.
And there are here only four roles in simol, simu_alfoc, simu_rewo, rewo and information: only code for computer, or pure code of simulation.
Simol is based on the fact that you can noticed than some classes emulate, or simulate, real-world objects, as an abstraction of the underlying data structure. Even in system programming, much abstractions of such objects are used, such as connections, streams or files.
Then, the other kind of classes could be classes for computational or technical tasks, where we want the computer to work for us with his resources, but not in a emulation goal. To being coherent, and not dependant of computer problems, we could abstract that, and do as if it could be algorithmic tasks not even for a computer, but for a worker in general.
So the computational tasks emulate an algorithm for worker, as the computer needs a compilation to understand the algorithms. This roles of classes aims to help for make concrete the object oriented programmation, and to help other programmers to read the existing code. It aims also to facilitate design choices, and to easily separate responsabilities. It marks classes with clear concrete abstractions, the simu_rewo, which should be easier to use and write, in general.
The ambition of the class is clearly indicated, and it adds information on the design intents of the developper.
In classical oriented object programming, there is no given role to a class, but we could consider that it would be as if simol objects would inherit for one of this four classes, Simu_alfoc, Simu_rewo, Rewo_class, or Information. 
Other roles could eventually have been candidate, like simu_service, simu_event, simu_util, simu_dao, simu_middleware, simu_controller, simu_config, simu_cache, simu_auth, simu_scheduler, simu_validation, simu_report, simu_facade, simu_plugin, but I wonder if all this stuff is simulation, and this roles are already covered by the four main roles. We don't want to have to much roles, for staying efficient and clear.
There is a little difference too, in the way that in simol we don't mark 'class' the classes, and directly talk about objects. While we talk about a role, we couldn't add the information that it is a mold, and we can imagine directly the class as an object. It aims to facilitate abstractions, but of course the concepts about classes keep valuable in simol.
Some people would perhaps use simol in classical simulation domains, but it is not restricted, in essence, in a kind of programming(though it could look like). The mindset should be quite easy to get for an object oriented programmer, though it doesn't refute object programming principles and vision. For a beginner, it should facilitate programming teaching.
Simol requires an object mindset and a desire to indicate helpful extra information on the used objects.

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
So with this observation, we can say that there is only, finally, only simu_alfoc classes(and only "information"), and this aligns with paradigms that do not differenciate classes. So we could see that even in simol, there is one sort of class or structures, like in classical oriented object programming(as well in procedural paradigm). In summary, it's quite like simu_rewo would inherit of simu_alfoc, and as rewo would inherit from information, which is quite like regular object vision. This precisions aims to make a bridge with objects existing paradigms and code.

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

ALGOL AND SIMOL

ALGOL("Algorithmic Language"), was designed with a strong emphasis on algorithmic and mathematical computation. It aimed to provide a language for expressing algorithms clearly and efficiently.  ALGOL 60, in particular, was influential in introducing features for structured programming and became a foundation for modern programming language design. Simol, with its "simu_alfoc" (Simulation of Algorithmic Language For Computer) role, shares a similarity with ALGOL's focus on algorithmic programming.  The "simu_alfoc" role in Simol is explicitly dedicated to the simulation of algorithmic language for computer, similar to ALGOL's original goal of serving as an algorithmic language.
 Semantic Clarity: Both languages strive for semantic clarity. ALGOL's design encouraged developers to write code that closely mirrored the problem-solving process, and Simol's class and interface roles provide clear semantics for the different types of components.
Minimalistic Approach: ALGOL's creators aimed to keep the language minimalistic, and Simol also follows a minimalistic approach, focusing on a limited number of roles and concepts.

SIMULA AND SIMOL

Simulation Focus: Both Simula and Simol have a strong emphasis on simulation. Simula was specifically designed for simulation, and Simol's name, "SIMulation Objects Language," reflects its focus on simulation and modeling.
Object-Oriented Programming: Simula is often credited as one of the earliest object-oriented programming languages. Simol also embraces object-oriented concepts by introducing roles for classes and interfaces, which is a fundamental aspect of object-oriented design.
Abstraction: Both languages encourage clear abstractions in code. Simula introduced the concept of classes and objects as a way to model real-world entities, while Simol defines distinct roles for classes and interfaces to indicate their purpose and responsibilities.
Real-World Modeling: Simula's object-oriented approach was aimed at modeling real-world entities and their interactions. Simol's "simu_rewo" is designed to represent real-world objects. Principles of Simplicity: Simula was designed with simplicity in mind, focusing on providing a clear and efficient way to model complex systems. Simol also follows a minimalistic approach to language design, promoting clarity and simplicity.

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
