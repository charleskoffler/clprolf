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

## KIND OF INTERFACES

Interfaces in clprolf are classified by their function. Some interfaces are made for guarantee that a feature is present. The others bring an interface of a complete implementation. The separation of the sort of interfaces adds a way to keep the coherence of the interfaces. It is achieved by checking the inheritance of interfaces, or the "implements" part of a class, by compiler.

Specific feature interfaces: @Compat_interf_capacity

Complete implementation interface: @Compat_interf_version

Classical oop interface: @Compat_interf

In the language, it's "compat_interf_version", "compat_interf_capacity", "compat_interf".