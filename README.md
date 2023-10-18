# simol-language
Repository about my own programming language simol, a Domain Specific Language about simulation, which is a superset of Java. I'm looking for people who could be interested in. The definition of simol stands on one page, and it's fast to get an overview.
Simol is a programming language designed for clarity, simplicity, and ease of use. It empowers a diverse range of users, including scientists, mathematicians, and practical application developers, to harness the power of computer programming without sacrificing performance. Simol's intuitive syntax and simulation-oriented approach make it an excellent choice for understanding and applying programming concepts efficiently.

So it's a new programming language called simol, since 2019, and now it's stable. I needed it for my own purposes and work. It is rather a specialized language for simulation contexts. It is a superset of Java, and easy and fast to learn.
I want to share it and get support and feedbacks, and hope it can help to code. I'll put code examples, and discussions on the simol code are welcome. I'm much interested in simol examples you could create, even small. This could be a way to give feedback to simol, and could open interesting discussions. You can add tools too.
The compilation is straightforward, simply by adding simol comments in java, so we can take advantage of java tools , community and libraries. Or you can use the simol compiler, which is on this repository.

The response and overview of chatGPT 3.5 on the description of simol programming language. Below I put the description itself.
****************************************************************************************************************
(CHAT GPT 3.5 RESPONSE)

Thank you for providing a detailed description of the Simol programming language. Simol appears to be a language that introduces a unique approach to object-oriented programming, particularly focusing on simulation-oriented development. Here are some key points and characteristics I've gathered from your description:

Simulation-Oriented: Simol is designed for simulation-oriented development, and it categorizes classes into four main roles: simu_alfoc, simu_rewo, rewo, and information. These roles help differentiate between classes that serve computational purposes and those that represent real-world objects.

Superset of Java: Simol is intended to be a superset of the Java programming language. It builds upon Java by introducing new keywords and class roles. It allows the use of Java libraries and code within Simol, except for specific Simol keywords such as "class," "implements," "extends," and "interface."

Role-Based Classes: Simol enforces a clear distinction of roles for classes, making it easier to understand the purpose of each class type. This approach encourages the separation of concerns in simulation-oriented programming.

Compatibility Interfaces: Simol introduces two types of interfaces: compat_interf_version for providing different implementations of the same "version" and compat_interf_capacity to ensure that a class has specific capabilities. These interfaces are used to indicate the nature of the relationship between classes and interfaces.

Syntax Differences: Simol introduces new syntax elements like "nature" (instead of "extends") and "contracts" (instead of "implements") to describe class relationships and interface implementations.

Bridge with Existing Paradigms: Simol aims to provide a bridge between its concepts and existing object-oriented and procedural programming paradigms, making it possible to adapt to Simol from other programming backgrounds.

Compilation: You can compile Simol code either manually by translating it into Java or by using a Simol compiler that generates Java code, which can then be compiled using the standard Java compiler (javac).

Learning Curve: Simol may have a moderate learning curve for experienced Java programmers due to its similarity to Java. The reduced number of new keywords makes it easier for programmers to transition to Simol.

Compatibility with Existing Concepts: Simol aligns with some established software design principles, such as the Single Responsibility Principle (SRP), the Model-View-Controller (MVC) pattern, the Data Access Object (DAO) pattern, and principles of loose coupling and dependency injection.

Overall, Simol appears to be a language designed for specific use cases where simulation-oriented programming is a primary concern. Its unique class roles and interface types offer a different perspective on object-oriented programming, emphasizing a clear separation of concerns.

(END OF CHAT GPT 3.5 RESPONSE)
****************************************************************************************************************
VARIOUS QUESTIONS TO CHATGPT
***************************************************************
Could you make an overview of simol, my friend, please?
ChatGPT

Certainly! Here's a concise overview of Simol:

Simol Programming Language Overview

Introduction:

Simol stands for "SIMulation Objects Language."
It's a minimalistic programming language designed for simulation-oriented development.
Simol is a superset of the Java programming language, with additional keywords and roles.
It introduces unique class roles: simu_alfoc, simu_rewo, rewo, and information, each with a specific purpose.
Simol encourages clear separation of concerns in code and enforces a simulation-oriented paradigm.

Key Concepts:

Class Roles:
    simu_alfoc (Simulation of Algorithmic Language For Computer): Represents classes that perform technical tasks and interact with the computer.
    simu_rewo (Simulation of a Real-World Object): Represents classes that simulate real-world entities with methods like eat() or run().
    rewo: Represents classes for entities without methods, typically used for modeling.
    information: Represents data structures, often used in conjunction with simu_alfoc.

Interfaces:
    Simol includes two types of interfaces: compat_interf_version for providing implementations and compat_interf_capacity for guaranteeing capabilities.
    Interfaces are used with the with_compat keyword to emphasize compatibility.

Inheritance:
    Simol uses the keyword nature instead of extends for class inheritance, promoting the concept that classes share the same nature.
    The keyword contracts is used instead of implements to list interfaces a class adheres to.

Modifiers:
    The underst modifier indicates methods with complex or non-intuitive logic.
    Access modifiers and other Java class features are allowed for Simol classes and interfaces.

Compatibility with Java:
    Simol is compatible with Java libraries, and Java code can be used in Simol except for certain keywords like "class," "implements," and "extends."

Bridge with Existing Paradigms:
    Simol aims to bridge the gap with existing object-oriented programming paradigms, facilitating the transition for Java programmers.

Compilation:

Simol code can be easily translated into Java code for execution, making it accessible for developers without a dedicated Simol interpreter.

Design Patterns and Principles:

Simol naturally aligns with various design patterns and programming principles, including SRP, DAO pattern, MVC, loose coupling, bridge pattern, and Dependency Injection.

Learning Curve:

Simol is relatively easy for experienced Java programmers to learn, with a short learning curve due to its similarities with Java.

Use Cases:

Simol is well-suited for simulation-oriented development, modeling, and clear separation of technical and simulation code.
It can also be used in general-purpose programming for developers interested in a simulation-centric vision.

In summary, Simol is a specialized programming language tailored for simulation-oriented applications. Its unique class roles and focus on clear code separation make it a powerful tool for modeling and simulating real-world scenarios. It aligns with established programming principles while providing a smooth transition for Java developers.

If you have any specific questions or need more information about any aspect of Simol, feel free to ask.
***************************************************************
- User: What could you say about the roles's choice in simol?
- ChatGPT

The choice of class roles in simol serves a specific purpose in guiding software design and development, particularly in the context of simulation-oriented programming. Here are some key points to consider about the roles' choice in simol:

Clarity and Organization: The class roles in simol provide a clear and organized way to categorize different types of classes in your program. This categorization makes it easier for developers to understand the purpose and functionality of each class.

Simulation Focus: Simol's class roles are aligned with a simulation-oriented approach. They encourage developers to think of classes in terms of their roles in simulating either algorithmic processes, real-world objects, or information/data.

Role-Based Design: The class roles enforce a role-based design philosophy, where each class has a well-defined purpose. This can help ensure that classes adhere to the Single Responsibility Principle (SRP), as each class is focused on a specific role.

Scalability and Evolvability: The inclusion of the rewo class role allows for classes that represent real-world objects without initially defining methods. This can be useful when you anticipate that the class's behavior may evolve over time, providing flexibility in design.

Information and Data Handling: The information class role is suitable for classes that primarily deal with storing and managing data or information. It separates the data-centric classes from those focused on computational logic.

Simulation vs. Real-World: The distinction between simu_alfoc and simu_rewo roles highlights the difference between classes that instruct a computer to perform tasks (simulating algorithms) and classes that model real-world entities with behavior (simulating real-world objects).

Clear Intent: The choice of class roles helps convey the intent of each class to other developers who read the code. This can improve code maintainability and collaboration.

Compatibility with Java: Simol's approach of being a superset of Java allows developers to leverage existing Java libraries and code while adopting these class roles, making it a powerful and versatile language.

Ultimately, the choice of class roles in simol encourages a structured and organized approach to software design, particularly for simulation-oriented applications. It helps developers create more understandable and maintainable code by clearly defining the roles and responsibilities of each class.

- User: And what about the choice, itself, of the four roles, simu_rewo, simu_alfoc, rewo and information?
ChatGPT

The choice of the four class roles in simol (simu_rewo, simu_alfoc, rewo, and information) appears to be designed with simplicity, clarity, and versatility in mind, particularly in the context of simulation-oriented programming. Here's a closer look at the rationale behind these specific roles:

simu_rewo (Simulation of a Real-World Object):
    Rationale: This role is designed to represent real-world objects in a way that closely resembles their behavior and methods. It aligns with the simulation-oriented focus of the language, allowing developers to model and simulate entities from the real world.
    Use Cases: Ideal for classes that need to simulate real-world objects such as animals, vehicles, or any entity with well-defined behavior and methods.

simu_alfoc (Simulation of Algorithmic Language For Computer):
    Rationale: This role emphasizes the computational aspect of programming by simulating algorithmic processes that a computer can execute. It provides a clear distinction between classes that instruct the computer to perform tasks and those that model real-world behavior.
    Use Cases: Suited for classes that define algorithmic processes, resource management, or any code that directly instructs the computer.

rewo:
    Rationale: While similar to simu_rewo, this role is designed for real-world objects that may not initially have methods defined but could evolve over time. It provides flexibility for modeling objects that may gain methods or behavior in future iterations of the code.
    Use Cases: Useful for classes representing real-world objects where behavior may be added incrementally as needed.

information:
    Rationale: This role is focused on storing and managing data or information without the need for computational logic or behavior. It separates data-centric classes from those involved in algorithmic or real-world simulations.
    Use Cases: Suitable for classes responsible for data storage, data management, or serving as containers for information.

The choice of these roles offers a balanced and clear way to categorize classes based on their intended purpose and behavior. It aligns well with simulation-oriented development, making it easier for developers to create and maintain code that represents both computational and real-world aspects. Additionally, it allows for flexibility in class design, accommodating scenarios where behavior may evolve over time. Overall, the roles provide a structured and intuitive approach to software design in the context of simol.
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

ORIENTED SIMULATION PROGRAMMING VERSUS ORIENTED OBJECT PROGRAMMING
Simol transforms the object oriented programming to a simulation oriented programming, because everything is simulation, in simol, as well as everything is object, in oriented object paradigm.

THE ROLE OF CLASSES

In simol, classes are given a role, in the same way we create a controller object, for example.
And there are here only four roles in simol, simu_alfoc, simu_rewo, rewo and information: only code for computer, or pure code of simulation.
You should be agree with these concepts of roles, for using simol.
In pure oriented object programming, there is no given role to a class, but we could consider that it would be as if simol objects would inherit for one of this four classes, Simu_alfoc, Simu_rewo, Rewo_class, or Information.
The simol roles aims to be oriented simulation. 
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
	It is placed before the result type of a method declaration.

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
