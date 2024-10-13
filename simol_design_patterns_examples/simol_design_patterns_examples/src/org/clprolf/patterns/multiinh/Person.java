package org.clprolf.patterns.multiinh;

import java.util.ArrayList;
import java.util.List;

import org.simol.simolframework.java.Agent;

@Agent
public abstract class Person {
    //
	// We have to do that work, for allowing sharing the properties between clones,
	// and especially permit automatic synchronization of datas!.
    protected class PersonProperties {
        private String name;
        private int age;

        public PersonProperties(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    /* The person can have only one main role.  */
    private Person principalRole; // Le rôle principal
    
    // internal properties accessed only via accessors.
    private PersonProperties sharedProperties;
    
    public void setSharedProperties(PersonProperties sharedProperties) {
		this.sharedProperties = sharedProperties;
	}

	//Not for clones!
    private List<Person> agents;

    // Getters and setters, as usual.
    public String getName() {
        return sharedProperties.getName();
    }

    public int getAge() {
        return sharedProperties.getAge();
    }
    
    public void setName(String name) {
        sharedProperties.setName(name);
    }

    public void setAge(int age) {
        sharedProperties.setAge(age);
    }
    
    public Person getPrincipalRole() {
        return principalRole;
    }
    
    /*
     * Only for the main role.
     */
    public Person(String name, int age) {
        this.sharedProperties = new PersonProperties(name, age);
        
        this.principalRole = this;  // The main role is defined as the self person.
        
        // Instanciation of the collection only for the main person.
        
       this.agents = new ArrayList<>();
        
    }
    
    // Adding an agent as a new role, but being also a person
    public void addAgent(Person agent) {
        agent.setSharedProperties(this.sharedProperties); // Use of the same shared properties.
        if (agents != null) {
            agents.add(agent);
        }
    }

    // Use of the main agent, and of the collection if not empty.
    // This method is not allowed for secondary agents.
    public void useRoles() {
    	// Utiliser le rôle principal (this)
    	System.out.println("Using the main role");
        if (this instanceof Teacher) {
            ((Teacher) this).teach();
        } else if (this instanceof Student) {
            ((Student) this).learn();
        }
        else if (this instanceof Engineer) {
            ((Engineer) this).design();
        }

        if (agents != null && !agents.isEmpty()) {
        	System.out.println("Using the secondary roles");
            // Using secondary agents.
            for (Person agent : agents) {
                if (agent instanceof Teacher) {
                    ((Teacher) agent).teach();
                } else if (agent instanceof Student) {
                    ((Student) agent).learn();
                }
                else if (this instanceof Engineer) {
                    ((Engineer) this).design();
                }
            }
            System.out.println("End of work!");
        } else {
            System.out.println(getName() + " doesn't have secondary agents to use");
        }
    }

    // All persons know walking!
    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}