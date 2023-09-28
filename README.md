# losim-language
Repository about my own programming language losim

I've created a new programming language called losim, since 2019, and now it's stable. It is rather a specialized language for simulation contexts. It is a superset of Java, and easy and fast to learn.
I want to share it and get support and feedbacks, and hope it can help to code. I'll put code examples, and discussions on the losim code are welcome. I will not write losim tools myself, but we can write if you want, in this repository. I'm much interested in losim examples you could create, even small. This could be a way to give feedback to losim, and could open interesting discussions.
The compilation is straightforward, simply by adding losim comments in java, so we can take advantage of java tools , community and libraries.

The response of chatGPT 3.5 on the description of losim programming language. Below I put the description itself.
I'm French.
****************************************************************************************************************
(CHAT GPT 3.5 RESPONSE)
Thank you for providing the definition and specifications of the losim programming language. It appears to be an interesting language that builds upon Java while introducing some unique concepts and keywords for simulation-oriented programming.

Here's a brief summary of the key features and concepts in losim:

    Language Purpose: Losim, which stands for "Simulation Object Language," is designed for simulation-oriented programming. It aims to provide a simulation-centric perspective on object-oriented programming.

    Superset of Java: Losim is designed as a superset of Java, which means you can use Java libraries and even include Java code within losim source code.

    Simu_lapo and Simu_or: Instead of using the "class" keyword, losim introduces "simu_lapo" for technical classes and "simu_or" for classes simulating real-world objects. These classes can include methods to define the behavior.

    Objet_reel: Similar to "simu_or" but for classes that represent real-world objects without methods, primarily used for defining attributes.

    Information: Similar to "simu_lapo" but for classes without methods, used for representing information or data structures.

    Compr Modifier: The "compr" modifier is used to mark methods that have a role of "understanding" by the computer, such as recognition of objects in an image or complex algorithms.

    Interfaces: Losim introduces two types of interfaces: "interf_compat_version" for providing a version and "interf_compat_capacite" for guaranteeing a specific capability. Interfaces are used with the "avec_compat" modifier.

    Nature and Contrats: Instead of "extends" and "implements," losim uses "nature" for inheritance and "contrats" to list interfaces a class respects.

    Translation to Java: Losim code can be easily translated into Java. You can write losim code as comments in Java and replace losim-specific keywords with their Java counterparts for compilation.

Overall, losim seems to be a specialized language for those who want to focus on simulation and modeling while leveraging the power and compatibility of the Java ecosystem. It provides a unique way to approach object-oriented programming in a simulation context.
(END OF CHAT GPT 3.5 RESPONSE)
****************************************************************************************************************
Here is my description of the LOSIM programming language:

THE LOSIM PROGRAMMING LANGUAGE

INTRODUCTION

The LOSIM language(SIMulation Object Language) is a programming language that I defined. Its definition and specifications are ended.
It is not widely used, but it is a real language, because it's not evolving, and his definition is complete.
LOSIM is called "LOSSIM" (like SIMulation). It is a superset to the Java language. It added keywords that replace some java keywords like 'class', 'interface',
and it added some keywords like 'with_compat', or 'compr'.
We can use java libraries in losim. We can use also java code in losim source code, except the keywords "class", "implements", "extends", "interface".
For example, java local variable is of course allowed in losim methods, "public" is authorized for a "simu-or", and so on.
All java which can be applied to a class can be applied to a "sim_or", "simu_lapo", "information", "objet_reel", "interf_compat_version", "interf_compat_capacite".
As losim classes replaces java classes, all java keywords can be used with losim classes, for example "public simu_lapo { }".

It proposes to see the object oriented programming as a simulation oriented programming.
We start from the Java language. And we add some very simple concepts. The java libraries can be used, while it is a superset of java.
Losim can be used directly in java, while commenting with the losim key words, if we don't want to wait a losim translator. So, in some way, losim can be seen as a way of writing java code.

THE LOSIM CLASSES

Instead of "class", we use the following keywords:

"simu_lapo"(stands for Simulation Algorithmic Language for Computer) => we have a class that does not simulate a real object. It gives work to the computer, technical. We see then this work as an algorithm in algorithmic language, which is executed by a computer ("Computer"). The computer will manage its resources (memory, processor, etc.) and peripherals, according to this algorithm. By algorithmic language, we mean the pseudo-language used in algorithmic courses. We will simulate this algorithm on the computer, thanks to the compiler. The computer does not really know how to execute this algorithm, it will execute equivalent assembly code.

"simu_or" (means simulation of a real object) => we have a class which is considered as a simulation of a real object, for example an animal, with methods eat(), run(), etc.
	Simulation realization on computer should be in a "simu_lapo", but if the realization is quite simple, it is allowed to write it directly in a "simu_or".

"objet_reel" => like "simu_or", but when we don't have methods. Example: a Customer class (with only attributes).
	It's better to use a simu_or in place of "objet_reel", even if we don't have methods for it, if it can evolve in the future and add methods.

"information" => like "simu_lapo", but when we don't have methods.

As losim wants to be as powerful and compatible with java, access modifiers, and other stuff in a java class declaration are allowed in the same way of a losim class declaration, obviously.
As losim wants to be as powerful and compatible with java, access modifiers, and other stuff in a java interface declaration are allowed in the same way of a losim interface declaration, obviously.


The modifier "compr"("understand") can be added to the methods of simu_or( or even simu_lapo) classes. It marks the methods that have a role of "understanding" by the computer (recognition of objects in an image, for example). "compr" can also be used on simu_lapo.
	"compr" indicates code that is non intuitive, for example complex sorts implementations. Even the famous and widely used algorithms can be marked as "compr".
	It is placed with the modifiers before a losim method name.

THE INTERFACES IN LOSIM
In LOSIM, there are two types of interfaces, and only these two types. LOSIM interfaces are called compatibility interfaces.

"interf_compat_version": the purpose of the interface is that the classes implementing it provide an implementation, a "version".

"interf_compat_capacite": the purpose of the interface is to guarantee that a class has a certain capability (to sort, etc.), no matter what the implementation.

We can't use interfaces in LOSIM, except for these two cases.

Another difference, for interfaces, is the obligation to write "avec_compat" (with compatibility), before the name of an interface, when using it.
Example: void drink(avec_compat Drink obj_buvable){(...}}
"avec_compat" is a modifier in a declaration of variable(local variable, attribute or argument).
The interest of 'avec_compat' is to understand for the user that it is not an object which have a particular class, but an object which have a particular compatibility.
So, of course, we can find it typical in a local variable declaration, or a argument definition.

SMALL DIFFERENCES IN HERITABILITY

- We use "nature", instead of "extends": inheritance is seen as an assertion that a class is of the same nature as another.
A car is of the same nature of a vehicule, on the real world, for example. "nature" doesn't have sense in losim, for interfaces.
	The nature of a simu_lapo is assumed to be a algorithm for computer. 'nature' must be used only by classes.
	
- We use "contrats", instead of "implements": we list interfaces that the class respects, there are considered as contracts.
Losim prefer not to use "avec_compat" for the interfaces list implemented in a losim class, because "avec_compat" emphasizes  the fact
that an object is compatible, not a class. A class is considered as respecting contracts. "implements" can not be used in losim because
it focuses on the implementation, not the idea of a contract is respected.

TO COMPILE

The translation of losim into java is very easy to do, in java, and we write the losim code as a comment(except in case we want to the source to be shorter).

"simu_lapo" => replace with "class"
"simu_or" => replace with "class"
"objet_reel" => replace with "class"
"information" => replace with "class"
"compr" => replace with ""(empty string)

"interf_compat_version" => replace with "interface"
"interf_compat_capacite" => replace with "interface"
"avec_compat" => replace with ""(empty string)

"nature" => replace with "extends"
"contrats" => replace with "implements"
EVERYTHING ELSE IS IDENTICAL TO JAVA 
(END OF THE DESCRIPTION OF THE LOSIM LANGUAGE)
********************************************************************************
