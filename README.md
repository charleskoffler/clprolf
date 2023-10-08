# simol-language
Repository about my own programming language simol, a Domain Specific Language about simulation, which is a superset of Java. I'm looking for people who could be interested in. The definition of simol stands on one page, and it's fast to get an overview.
Simol is a programming language designed for clarity, simplicity, and ease of use. It empowers a diverse range of users, including scientists, mathematicians, and practical application developers, to harness the power of computer programming without sacrificing performance. Simol's intuitive syntax and simulation-oriented approach make it an excellent choice for understanding and applying programming concepts efficiently.

So it's a new programming language called simol, since 2019, and now it's stable. I needed it for my own purposes and work. It is rather a specialized language for simulation contexts. It is a superset of Java, and easy and fast to learn.
I want to share it and get support and feedbacks, and hope it can help to code. I'll put code examples, and discussions on the simol code are welcome. I will not write simol tools myself, but we can write if you want, in this repository. I'm much interested in simol examples you could create, even small. This could be a way to give feedback to simol, and could open interesting discussions.
The compilation is straightforward, simply by adding simol comments in java, so we can take advantage of java tools , community and libraries.

The response and overview of chatGPT 3.5 on the description of simol programming language. Below I put the description itself.
****************************************************************************************************************
(CHAT GPT 3.5 RESPONSE)
Thank you for providing a detailed overview of the Simol programming language. It appears to be an interesting language with some unique concepts and design decisions. Here are some key points and observations based on the information you've provided:

    Purpose and Design Philosophy: Simol aims to be a superset of Java, introducing specific keywords and concepts to promote a simulation-oriented programming approach. It differentiates between simulation of algorithmic processes and simulation of real-world objects, emphasizing clarity in code organization.

    Simol Classes: Simol introduces alternative keywords for defining classes, such as "simu_alfoc" for algorithmic classes, "simu_rewo" for classes simulating real-world objects, "rewo" for classes without methods, and "information" for classes without methods but still representing real-world objects. These distinctions help in code organization and clarity.

    Interfaces in Simol: Simol introduces two types of interfaces, "compat_interf_version" for indicating different implementations of the same functionality and "compat_interf_capacity" for specifying certain capabilities. The "with_compat" modifier is used to indicate interface compatibility.

    Small Differences in Inheritance: Simol uses "nature" instead of "extends" to signify inheritance, emphasizing that a class shares the same nature as another class. This distinction doesn't apply to interfaces. Simol also uses "contracts" instead of "implements" for indicating that a class adheres to specific interfaces.

    Compilation: Translating Simol into Java appears to be straightforward, with simple substitutions of Simol keywords with Java keywords. This allows Simol code to be used within a Java environment.

    Compatibility with Existing Concepts: Simol's concepts align with some established principles and design patterns, such as the Single Responsibility Principle (SRP), Model-View-Controller (MVC), and the Data Access Object (DAO) pattern. Simol promotes loose coupling and adheres to "program to an interface, not an implementation" principles.

    Interface Inheritance: Although Simol doesn't explicitly mention interface inheritance, it can be used as a form of contract fulfillment, which aligns with established software design practices.

Overall, Simol seems to provide a unique perspective on structuring code and promoting a simulation-focused approach within the Java ecosystem. Developers who are interested in simulation-based programming may find Simol to be a valuable tool for organizing and expressing their ideas. If you have any specific questions or need further clarification about Simol, please feel free to ask.

(END OF CHAT GPT 3.5 RESPONSE)
****************************************************************************************************************
Here is my description of the LOSIM programming language:

THE SIMOL PROGRAMMING LANGUAGE

INTRODUCTION

The simol language(SIMulation Objects Language) is a programming language that I defined. Its definition and specifications are ended.
It is not widely used, but it is a real language, because it's not evolving, and his definition is complete.
It is a superset to the Java language. It added keywords that replace some java keywords like 'class', 'interface',
and it added some keywords like 'with_compat', or 'underst'.
We can use java libraries in simol. We can use also java code in simol source code, except the keywords "class", "implements", "extends", "interface".
For example, java local variable is of course allowed in simol methods, "public" is authorized for a "simu-or", and so on.
All java which can be applied to a class can be applied to a "sim_or", "simu_alfoc", "information", "rewo", "compat_interf_version", "compat_interf_capacity".
As simol classes replaces java classes, all java keywords can be used with simol classes, for example "public simu_alfoc { }".

It proposes to see the object oriented programming as a simulation oriented programming.
We start from the Java language. And we add some very simple concepts. The java libraries can be used, while it is a superset of java.
simol can be used directly in java, while commenting with the simol key words, if we don't want to wait a simol translator. So, in some way, simol can be seen as a way of writing java code.

THE simol CLASSES

Instead of "class", we use the following keywords:

"simu_alfoc"(stands for Simulation of Algorithmic Language FOr Computer) => we have a class that does not simulate a real object. It gives work to the computer, technical. We see then this work as an algorithm in algorithmic language, which is executed by a computer ("Computer"). The computer will manage its resources (memory, processor, etc.) and peripherals, according to this algorithm. By algorithmic language, we mean the pseudo-language used in algorithmic courses. We will simulate this algorithm on the computer, thanks to the compiler. The computer does not really know how to execute this algorithm, it will execute equivalent assembly code.

"simu_rewo" (means simulation of a real-world object) => we have a class which is considered as a simulation of a real object, for example an animal, with methods eat(), run(), etc.
	Simulation realization on computer should be in a "simu_alfoc", but if the realization is quite simple, it is allowed to write it directly in a "simu_rewo".

"rewo" => like "simu_rewo", but when we don't have methods. Example: a Customer class (with only attributes).
	It's better to use a simu_rewo in place of "rewo", even if we don't have methods for it, if it can evolve in the future and add methods.

"information" => like "simu_alfoc", but when we don't have methods.

As simol wants to be as powerful and compatible with java, access modifiers, and other stuff in a java class declaration are allowed in the same way of a simol class declaration, obviously.
As simol wants to be as powerful and compatible with java, access modifiers, and other stuff in a java interface declaration are allowed in the same way of a simol interface declaration, obviously.


The modifier "underst"("understanding") can be added to the methods of simu_rewo( or even simu_alfoc) classes. It marks the methods that have a role of "understanding" by the computer (recognition of objects in an image, for example). "underst" can also be used on simu_alfoc.
	"underst" indicates code that is non intuitive, for example complex sorts implementations. Even the famous and widely used algorithms can be marked as "underst".
	It is placed with the modifiers before a simol method name.

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

SMALL DIFFERENCES IN HERITABILITY

- We use "nature", instead of "extends": inheritance is seen as an assertion that a class is of the same nature as another.
A car is of the same nature of a vehicule, on the real world, for example. "nature" doesn't have sense in simol, for interfaces.
	The nature of a simu_alfoc is assumed to be a algorithm for computer. 'nature' must be used only by classes.
	
- We use "contracts", instead of "implements": we list interfaces that the class respects, there are considered as contracts.
simol prefer not to use "with_compat" for the interfaces list implemented in a simol class, because "with_compat" emphasizes  the fact
that an object is compatible, not a class. A class is considered as respecting contracts. "implements" can not be used in simol because
it focuses on the implementation, not the idea of a contract is respected.

TO COMPILE

The translation of simol into java is very easy to do, in java, and we write the simol code as a comment(except in case we want to the source to be shorter).

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
