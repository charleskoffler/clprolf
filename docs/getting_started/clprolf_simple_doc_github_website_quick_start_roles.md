# QUICK START WITH clprolf FRAMEWORK AND LANGUAGE

## ABOUT SORTING OUR OBJECTS AND INTERFACES

clprolf language and framework talks especially about sorting our objects. The idea is to qualify the classes, in the same way we can add @Component, @Service, or @Controller in Spring Framework (role of types in Spring). The roles of objects are basic. They allows to ensure separation of concerns, by compiler checking of types roles obtained by inheritance.

The interfaces are also sorted to take advantage of the obtained abstraction, and also to ensure consistency in interfaces.

    
## KIND OF OBJECTS

The objects are separated by types which have methods or not. And the sort is about separating computational code and business code. So we can have a way to check, for example, the SRP principle(Single Responsability Principle).

The types with methods: @Simu_real_world_obj(or @Abstraction, it's equivalent), and @Simu_comp_as_worker( or @Comp_as_worker).

The other types: @Model_real_world_obj( or "@Model"), @Information.

Classical OOP class: no indication in the framework, and "indef_obj" in the language.

In the language, it's "simu_real_world_obj", "abstraction", "simu_comp_as_worker", "comp_as_worker", "model_real_world_obj", "model", and "information". 

## THE OBJECT ROLES: A METHOD FOR DESIGNING OUR OBJECTS (wording refined by chatGPT)

Traditional object-oriented programming (OOP) provides the framework for defining objects as collections of variables and methods but often lacks explicit guidance on how to design these objects effectively. Clprolf addresses this gap by offering structured roles for objects, facilitating intuitive and memorable design. These roles enable developers to assign a primary responsibility to each object, aligning perfectly with the Single Responsibility Principle.

By assigning roles, clprolf not only aids in storytelling and the emulation of real-world entities but also ensures that these roles are meaningful within the IT context—whether as simulations, abstractions, or models. This approach allows multiple interpretations and flexibilities in design while maintaining clear communication about an object's purpose.

Furthermore, clprolf leverages the compiler to enforce inheritance consistency, integrating semantic checks during the compilation process. This capability underscores the language's commitment to supporting the developer in the object design process, ensuring that objects adhere to OOP principles while fitting naturally within the clprolf framework.

Clprolf's introduction of object roles effectively serves as built-in guidelines for object-oriented design, complementing traditional OOP principles and design patterns. This integration highlights the necessity of supportive structures in object design, making clprolf an innovative tool that enhances the developer's ability to create well-structured and purpose-driven software.

This addition will likely resonate well with both new and experienced developers by illustrating how clprolf enhances the foundational practices of OOP with its unique approach to object roles.

## KIND OF INTERFACES

Interfaces in clprolf are classified by their function. Some interfaces are made for guarantee that a feature is present. The others bring an interface of a complete implementation. The separation of the sort of interfaces adds a way to keep the coherence of the interfaces. It is achieved by checking the inheritance of interfaces, or the "implements" part of a class, by compiler.

Specific feature interfaces: @Compat_interf_capacity

Complete implementation interface: @Compat_interf_version

Classical oop interface: @Compat_interf

In the language, it's "compat_interf_version", "compat_interf_capacity", "compat_interf".