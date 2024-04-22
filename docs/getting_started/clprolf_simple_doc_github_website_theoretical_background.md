# Getting started in clprolf - A software as a set of communicating applications

## The objects with methods: the simu_real_world_obj objects (or "abstraction"), and the simu_comp_as_worker( or "comp_as_worker") objects

In clprolf, a software is perceived as a set of (micro) applications which would communicate between them. Much applications communicate through a network, like in the internet, for example, of like services. So in clprolf, it's quite like each object would be an application in itself. Each application would be composed of even micro simulation applications(or abstractions), or purely micro computational tasks, like an operating system in our metaphor. Each application with a responsability of business or scientific job, like a management application, or a scientific simulation, would be considered as a simulation application. Here, the object of simulation are the simu_real_world_obj, because they simulate a real-world object, but we can call it an "abstraction" too. And the other objects with methods are the simu_comp_as_worker(or "comp_as_worker"), because they are purely a job for the computer. So we consider that we are giving a work to a computer, and we treat him as a worker.

## The objects without methods: the model_real_world_obj objects(or "model"), and the information objects

The objects without methods are pure data objects. We have the "information" data objects, and the "model_real_world_obj" data objects(or "model"). The "model_real_world_obj" are the objects who are a model of a real-world entity. All the other objects are just used as a data structure, a set of data, and constitute an "information" object in clprolf.

## A comparison with pure object-oriented paradigm
Alan Kay, who coined the term "object", describes a system as a set of (micro) computers communicating by messages. And each object would be such a (micro) computer. In clprolf, we finally stay close to this vision. We just add that it is a set of (micro) applications communicating together.

## Advantages of the simulation perspective
The simulation vision enables, if needed, to directly reason with the real-world objects, and that could ease the job. A worker vision of the computer aims to simplify too, as we can think about the computer quite like a real worker.
