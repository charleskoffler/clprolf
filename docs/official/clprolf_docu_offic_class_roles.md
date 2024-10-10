# CLPROLF - EXPLAINING THE KIND OF CLASSES IN CLPROLF

clprolf language and framework helps you define your objects with a sole responsability. By choosing a main responsability, your objects becomes SRP-compliant. You build a system where objects become pure components, and even inheritance does not change this.

How do we achieve this? We can obtain this by choosing a nature of the class. An object, in clprolf, can be either a business-like object, or a computational object.

## What are the business-like objects?

The business-like objects are:
agent (= simu_agent)
simu_real_obj(=simu_real_world_obj)
abstraction
model_real_obj(=model_real_world_obj, or model)

### agent

agent, simu_real_obj, and abstraction are equivalent, but proposes a different perspective on the object.
The agent object is more active, and the simu_real_obj more focuses on the simulation aspect. The abstraction role is about emphasizing the abstraction aspect obtained by the encapsulation.

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

All the other objects are pure computer objects. Their responsability and job is only about the computer, managing peripherals, or memory, or launching an application.
So the view and model of the MVC design pattern, are, in clprolf, technical jobs for the computer. In these classes, the actor of the action is the computer. This is why we have roles like "computer_as_worker", or "worker_agent".

"comp_as_worker" (=shortcut for "simu_comp_as_worker")
"worker_agent"
"information"

These two roles are equivalent. The so called "worker" is the computer, having such a role of worker. So we talk about it at the third person, as we do when we say "My computer is starting", or "my computer has an issue".

### comp_as_worker

"comp_as_worker" means "computer as a worker", a short name for "simulation of a computer as a worker". The "simu_comp_as_worker" keyword is quite long, and is quite rarely used.

### worker_agent

"worker_agent" is the same role, but it insists on the agent aspect, so it seems having more an active role. This is a way to have agents even for technical parts, as well as the business-like agent objects.So we can obtain a system formed only by agents, pure agents, and worker agents.

### information

"information" is just a container of coherent datas. It is quite like a data structure, but it acts like an information in an algorithm. The datas are about the computer, and used for a worker agent. So it is different of model_real_obj, and does not act as a model. Thus a set of variables having a common topic, and designed for a worker job, is a clprolf information.

## How do we use the class role?

The object role just replaces the class keyword, in the language. Or it is an annotation just above the class definition, in the Framework.

## Are the class roles consistent by inheritance ?

Of course! The compiler should check role coherence of the inheritances. Business objects, and technical objects, can not be in the same line of inheritance. It can not have the same legacy for keeping the roles intact. We can enforce this, as an exception, with the @Forced_inh annotation, both in the Framework and the language.
Equivalent roles are accepted for the same inheritance.

## Summary

In clprolf, we still have objects, the same as in object-oriented programming. These objects becomes components, thanks to class roles. The class roles are just class qualifiers, like "agent", or "worker_agent".
Some qualifiers are equivalent, either because there are shortcut, or because they emphasize an aspect. The class roles are checked for the inheritance, by the compiler, even for the framework.
We obtain a simpler system, where components should be more maintainable.
