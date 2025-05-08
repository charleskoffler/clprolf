# CLPROLF - EXPLAINING THE DECLENSIONS IN CLPROLF

clprolf language and framework helps you define your objects with a sole responsibility. By choosing a main responsibility, your objects become SRP-compliant. You build a system where objects become pure components, and even inheritance does not change this.

This is achieved by choosing a nature of the class, the role, called the declension of the class. An object, in clprolf, can be either a business-like object, or a computational object.

### THE DECLENSIONS OR ROLES OF OBJECTS - THE CLASS ROLE OR CLASS responsibility

Declensions are about the nature of an object. Clprolf uses only basic class roles, which is the class responsibility. This helps reduce ambiguity in class purpose. The definition of the roles is quite intuitive. In clprolf, every class has a responsibility, either a simu_real_obj, or an agent, or for the technical objects, a worker_agent, or a comp_as_worker responsibility. Some object natures are the same than others(synonyms), because we want to emphasize some aspects.

There are here only five declensions( five main roles) in clprolf, worker_agent ( or simu_comp_as_worker(, comp_as_worker), agent ( simu_real_world_obj, or "simu_real_obj", "simu_agent", "abstraction"), "model" (model_real_world_obj, or , "model_real_obj"), information and indef_obj: only code for computer, or pure code of simulation.
clprolf is based on the fact that you can notice use agents to some objects in a system. And some objects emulate, or simulate, real-world objects, as an abstraction of the underlying data structure. Even in system programming, much abstractions of such objects are used, such as connections, streams, files or threads.
Other objects are focused on computational or support tasks. We tell that it is as algorithmic tasks given to a computer seen as a worker agent. So this object is seen as a micro-computer, specialized in the given task. The micro-computer is quite like a worker agent.
So we emulate a worker, and it needs a compilation to truly understand the algorithms.
These roles of objects aims to help for make clearer the object oriented programming, and facilitate maintenance. It aims also to facilitate design choices, and responsabilities separation. The agent(or equivalent) should be easier to use and write, in general.
The vision and responsibility of the class is clearly indicated, and chosen from the beginning, and it adds information on the design of the developer. 

We keep flexibility with the optional "indef_obj"(indefinite object), like a traditional oo object.

### OBJECT AND INTERFACE DECLENSIONS AND GENDERS

In Clprolf, we strive to approximate the richness of natural languages. Each object has a declension, representing its function within the system. Declension, also known as the object role or class role, is central to the design philosophy of Clprolf.

Each declension has some synonyms, which are completely equivalent. We choose one over another depending on our feeling or perspective about the class.

agent declension: agent, simu_agent, simu_real_world_obj, simu_real_obj, and abstraction.
worker_agent declension: worker_agent, simu_comp_as_worker, and comp_as_worker.
model declension: model, model_real_world_obj, and model_real_obj.
information declension: information, which has no synonyms.
indef_obj declension: no synonym

Each gender can have gender synonyms too. :

@Expert_component gender = @Human_expert = @Design_role
@GUI_Role gender = @Machine_tool
@Active_agent gender = no synonym
@Static gender = @Expert_component_static = @Human_expert_static
@Static gender for worker_agent declension = no synonyms
 
Note: genders are available only for the abstraction declension (except @Static, which can also apply to the worker_agent declension). Genders are always optional.

Interrelationships Between Declensions

   Agents and Workers: Every object with an agent declension can also function as a worker. This reflects how computers execute agents—as specialized workers. However, the goal is to minimize the number of workers in the system to maintain clarity and efficiency.
    
   Models and Information: Similarly, any object with a model declension can be represented as information, as this is how the computer stores models. Despite this, it is essential to avoid misusing information where a model would be more appropriate.
    
   Unidirectional Substitutions: While agents can take on worker roles and models can be viewed as information, the reverse is not true. A true worker cannot become an agent, and information cannot be replaced by a model. Such substitutions often indicate a design flaw or a deliberate perspective shift (e.g., when treating a sorting class as a worker).

Class Identification in Clprolf

Each class in Clprolf is identified by its name, with the addition of its declension and gender. This explicit classification simplifies understanding and enhances system consistency.

Interface declensions synonyms:

compat_interf_version declension = version_inh
compat_interf_capacity_declension = capacity_inh
compat_interf_declension: no synonym

An object’s declension can be added to an interface to specify which class declension is allowed to implement it (using contracts).

The gender of a compat_interf_capacity declension:

A capacity interface can have a gender called an Advice (advice-type gender):

@For_agent _like gender(advice)
@For_worker_like gender(advice)

By integrating declensions and genders, Clprolf ensures clarity in design, unambiguous role assignment, and a robust structure for both objects and interfaces.

## What are the business-like objects?

The business-like objects are:
agent (= simu_agent)
simu_real_obj(=simu_real_world_obj)
abstraction
model_real_obj(=model_real_world_obj, or model)

### agent

agent, simu_real_obj, and abstraction are equivalent, but proposes a different perspective on the object.
The agent object is more active, and the simu_real_obj more focuses on the simulation aspect. The abstraction declension is about emphasizing the abstraction aspect obtained by the encapsulation.

An agent is considered as an actor in the system, and each object in OOP can be an agent. It is a MAS-like system concept. A Multi-Agent System (MAS) is simply seen as a real-world, or an IT system, where agents are autonomous and work together.
"simu_agent" highlights that the component is a simulation of a real-world agent, for example a real-world employee. But this is the same!

### simu_real_obj

A simu_real_obj means that the component is defined as a micro simulation of a real-world object. That's all. For example, a instance of Giraffe could be called simu_real_obj because it is quite like a little simulation of a real-world giraffe! We have the states of the modeling of a giraffe, the public methods let us simulate how the giraffe behaves. So with simu_real_obj we are more in a neutral description of the system.
"simu_real_world_obj" is longer than "simu_real_obj", and this is why we prefer, in general, using a shortcut.

### abstraction

An "abstraction" class is always about an abstraction of a concept. For example, an abstraction of a connection, or a abstraction of a socket. We could use this for all the objects, but it is recommended to reserve it for the abstract concepts. So system objects are often with this role.

### model_real_obj

A "model_real_obj" is an object without behavior, just there for modeling. It is a simu_real_obj, without method. So it is still classified in the business-like objects! "model_real_world_obj" is quite a long name, so there are shortcuts, like "model". Thus the "model_real_obj" objects are just entities.

## What are the technical objects?

All the other objects are pure computer objects. Their responsibility and job is only about the computer, managing peripherals, or memory, or launching an application.
So the view and model of the MVC design pattern, are, in clprolf, technical jobs for the computer. In these classes, the actor of the action is the computer. This is why we have the declension "worker_agent" (and its synonyms like "comp_as_worker").

"comp_as_worker" (=shortcut for "simu_comp_as_worker")
"worker_agent"
"information"

The so called "worker" is the computer, having such a role of worker. So we talk about it at the third person, as we do when we say "My computer is starting", or "my computer has an issue".

### comp_as_worker

"comp_as_worker" means "computer as a worker", a short name for "simulation of a computer as a worker". The "simu_comp_as_worker" keyword is quite long, and is quite rarely used.

### worker_agent

"worker_agent" is the same role, but it insists on the agent aspect, so it seems having more an active role. This is a way to have agents even for technical parts, as well as the business-like agent objects.So we can obtain a system formed only by agents, pure agents, and worker agents.

### information

"information" is just a container of coherent datas. It is quite like a data structure, but it acts like an information in an algorithm. The datas are about the computer, and used for a worker agent. So it is different of model_real_obj, and does not act as a model. Thus a set of variables having a common topic, and designed for a worker job, is a clprolf information.

## How do we use the declension?

The declension just replaces the class keyword, in the language. Or it is an annotation just above the class definition, in the Framework.

## Are the class roles consistent by inheritance ?

Of course! The compiler should check role coherence of the inheritances. Business objects, and technical objects, can not be in the same line of inheritance. It can not have the same legacy for keeping the roles intact. We can enforce this, as an exception, with the @Forced_inh annotation, both in the Framework and the language.
Equivalent roles are accepted for the same inheritance.

## Summary

In clprolf, we still have objects, the same as in object-oriented programming. These objects becomes components, thanks to class roles. The class roles are just class qualifiers, like "agent", or "worker_agent".
Some qualifiers are equivalent, either because there are shortcut, or because they emphasize an aspect. The class roles are checked for the inheritance, by the compiler, even for the framework.
We obtain a simpler system, where components should be more maintainable.

### Algorithm to Choose a Clprolf Declension for Your Class

For those using Clprolf partially:

   If your class has a clear, well-identified responsibility,
    → you don’t need to assign a Clprolf role. It’s optional.

   But if you're unsure,
    → start with @Indef_obj as a placeholder.

If the class already fits one of the well-known architectural categories, you can directly assign a matching Clprolf role:

   A service → @Agent

   A helper → @Agent, often with the gender Role.STATIC

   A DAO or repository → @Worker_agent

   A controller → @Agent
	
For those using Clprolf fully:

→ You must assign an explicit declension to every class.
Step 1 – Does the class have methods?

   Yes → It’s an active object.
    → Choose between @Agent and @Worker_agent.

   No → It’s a passive structure.
    → Use @Model or @Information, depending on whether it’s an entity or a neutral data container.

Step 2 – Is the code business-related or technical?

   If it belongs to business logic or expert knowledge
    → use @Agent.

   If it belongs to a technical or support layer
    (e.g., printing, persistence, ...)
    → use @Worker_agent.

🧪 Example – System class in Java:

At first glance, it looks like a @Worker_agent,
since it provides technical, low-level services.

But is it only that?
Clprolf always favors @Agent roles when possible, over @Worker_agent.

System could be reinterpreted as:

   an @Abstraction, since “the system” is a conceptual entity, or

   an @Agent with the gender Role.EXPERT_COMPONENT, if you see it as an expert component representing the external environment.

🔧 Optional Roles and Genders:

   If the class represents a general concept,
    → use @Abstraction (a synonym of @Agent).

   If it represents an expert component,
    → use @Agent with Role.EXPERT_COMPONENT.

   If most methods are static,
    → apply the STATIC gender (even if the class also includes instance methods).
