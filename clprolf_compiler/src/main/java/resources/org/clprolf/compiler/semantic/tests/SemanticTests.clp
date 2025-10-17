// For all tests

public version_inh agent Animal {
	public void run();
}

public compat_interf_version agent Vehicule {
	public boolean start();
}

public capacity_inh Eatable {
	public void eat(int quantity);
}

public agent AnimalImpl {
	
}

// BB1
/* **ARCH BB1 (interfaces):**
A `compat_interf_version` interface cannot inherit multiple `version` interfaces.
A `version_inh` may do so.*/

public compat_interf_version agent BB1Car extends Vehicule, Animal {
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

//
/* **ARCH BA2 (interfaces, usage):**
If a class uses `contracts`, the referenced type must be a `version` interface. */

//problem
public agent BA2Animal contracts AnimalImpl {
	public void jump() {
	
	}
}

