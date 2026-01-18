// For all tests
@Static
import java_interface version_inh abstraction java.util.List;

public version_inh agent Animal {
	public void run();
}

public compat_interf_version agent Vehicule {
	public boolean start();
}

public compat_interf_version CompatIntWithoutDecl {
	public boolean theMeth();
}

public capacity_inh Eatable {
	public void eat(int quantity);
}

public agent AnimalImpl {
	
}

// BB1
/* **ARCH BB1 (interfaces):**
By default, a `compat_interf_version` cannot inherit from another `compat_interf_version`.*/

public compat_interf_version agent BB1Car extends Vehicule {
}

// No problem.
public version_inh agent BB1Dog extends Animal, Vehicule {
}

// FIN BB1

// BB2
/* **ARCH BB2 (interfaces):**
A `capacity` interface cannot inherit (`nature`) from a `version`.
`capacity_inh` and `compat_interf_capacity` are treated identically in all semantic checks. */

// Problem
public capacity_inh BB2EatableOne nature Animal {
	public void eat(int quantity);
}

// Problem
public compat_interf_capacity BB2EatableTwo extends Vehicule {
	public void eat(int quantity);
}

/*
**ARCH BA3 (interfaces, usage):**
A class cannot `contracts` a `capacity`. */

//Problem
public agent BA3Dog contracts Eatable {

}

//
/*
**ARCH BA4 (interfaces, usage):**
A class cannot `contracts` multiple `version` interfaces simultaneously. */

//problem
public agent BA4Animal contracts Animal, Vehicule {
}

// ARCH-BA5
// error (BA5Animal declension does not match Animal target declension)
public simu_real_obj BA5Animal contracts Animal {
}

public simu_real_obj BA5_2Animal contracts CompatIntWithoutDecl {
}

//
/* **ARCH BA2 (interfaces, usage):**
If a class uses `contracts`, the referenced type must be a `version` interface. */

//problem
public agent BA2Animal contracts AnimalImpl {
	public void jump() {
	
	}
}



//
/***ARCH BA1 (interfaces, usage):**
The `contracts` keyword is mandatory for all implementations. */

//issue
/*public agent BA1Animal implements AnimalImpl {
	public void jump() {
	
	}
}*/