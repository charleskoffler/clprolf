package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import java.util.ArrayList;
import java.util.List;

import org.clprolf.framework.java.Agent;

@Agent //This class do not need to be abstract.
public class PersonClass {
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

    // internal properties accessed only via accessors.
    private PersonProperties sharedProperties;
    
    public void setSharedProperties(PersonProperties sharedProperties) {
		this.sharedProperties = sharedProperties;
	}
    
    public PersonProperties getSharedProperties() {
		return this.sharedProperties;
	}

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
    
    /*
     * Only for the main role.
     */
    public PersonClass(String name, int age) {
        this.sharedProperties = new PersonProperties(name, age);
        
    }
    
    // All persons know walking!
    public void walk() {
        System.out.println(getName() + " is walking.");
    }
}