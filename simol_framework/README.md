The simol framework for Java, and the simol framework for C# and PHP 8

2023/11/28

The sources of the simol annotation framework for java, are placed in the simol compiler sources, in the org.simol.simolframework.java namespace.

The sources of the simol C# framework, are in the simol_framework folder, as a C# project, named SimolCsharpFramework.
For the Simol PHP 8 Framework, it's in the simol_framework folder too, as an Eclipse project.

History of the versions of the simol java framework

1.0	20231128	Added @Nature and @Contracts.
1.1 20231130	Correction on @Prevent_missing_collision.
1.2 20231216  Added @One_at_a_time, @Turn_monitor, and @For_every_thread
1.3 20240108 	Added @Forced_inh and @Forced_int_inh
1.4 20240111	Simol framework for beginners
1.5 20240206	Added @Dependent_activity
1.6 20240223	Real_world_obj becomes Model_real_world_obj
1.7	20240229	Added EXPERT_COMPONENT role of @Simu_real_world_obj.
1.8 20240319 Simu_comp_worker renamed to Simu_comp_as_worker.
1.9	20240321	Changed in the beginners classes, to SimuCompAsWorker.
2.0 20240331 Addition of Abstraction, Comp_as_worker, and Model annotations.
2.1 20240404 Correction about Abstraction annotation.
2.2 20240823 Addition of @Forced_pract_code.
2.3 20240920 New sub-roles: @Human_expert_static and @Expert_component_static.
2.4 20240925 New roles and sub-role for multi-agent system perspective.
2.5 20241016 New optional annotations for interface inheritance( @Version_int and @Capacity_inh)
2.6 20241022 Ajout énumération pour les compat_interf_capacity ou capacity_inh (Advice).
2.7 20241023 Removed beginners package.
2.8 20240428 Addition of @Indef_obj and @Compat_interf
2.9 20240428 Addition of a role (for @Static) in worker_agent declensions.
3.0 20250512 Added role in version_inh(correction)
3.1 202050927 New name of packages. Refined genders.

History of the versions of the simol C# framework

1.0 20240106
1.1 20240107 Minor correction
1.2 20240108 Added Forced_inh and fForced_int_inh
1.3 20240111 Simol framework for beginners
1.4 20240113 Corrections on class and files names. Beginners package in a directory.
1.5 20240113 Minor correction
1.6 20240206	Added @Dependent_activity. Minor corrections.
1.7 20240223	Real_world_obj becomes Model_real_world_obj
1.8 20240229	Added EXPERT_COMPONENT role of @Simu_real_world_obj.
1.9	20240319	Renamed Simu_comp_worker to Simu_comp_as_worker.
2.0	20240321	Changed in the beginners package, to SimuCompAsWorker.
2.1	20240404	Addition of the new keywords "Abstraction", "Comp_as_worker", and "Model".
2.2 20240404	Addition of "Abstraction", "Comp_as_worker", and "Model" in the beginners package.
2.3	20240606	Renamed package from Simol to Clprolf. Addition of forgotten "public" modifiers. Changed the project type to "class library".
2.4 20240823 Addition of [Forced_pract_code].
2.5 20240920 New static sub-roles for simu_real_world_obj("Role.STATIC", "Role.HUMAN_EXPERT_STATIC", and "Role.EXPERT_COMPONENT_STATIC").
2.6 20241023 Removed beginners package.
2.7 20250512 Simol C# Framework, v2.7

 	New roles and sub-role for multi-agent system perspective.
    New optional annotations for interface inheritance( @Version_int and @Capacity_inh)
    New enum for compat_interf_capacity and capacity_inh (Advice).
    Removed beginners package.
    Addition of @Indef_obj and @Compat_interf
    Addition of a role (for @Static) in worker_agent declensions.
    Independent enum for Role.
    Simol C# Framework, v2.8 (20250514)
 
2.8 20250514 Agent declensions allowed upon interfaces, for optional features for interface inheritance.

History of the versions of the simol PHP 8 framework

1.0	20240113
1.1 20240113 Minor corrections
1.2 20240207 Minor corrections
1.3 20240223Real_world_obj becomes Model_real_world_obj
1.4	20240229 Added EXPERT_COMPONENT role of #[Simu_real_world_obj].
1.5	20240319 Renamed Simu_comp_worker to Simu_comp_as_worker.
1.6	20240324 Correction on the beginners class SimuCompAsWorker.
1.7	20240404	Addition of the new keywords "Abstraction", "Comp_as_worker", and "Model".
1.8 20240823 Addition of "Forced_pract_code".
1.9 20241023 Removed beginners package.