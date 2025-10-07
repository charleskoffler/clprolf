package org.clprolf.patterns.multiinh;

import org.clprolf.framework.java.Worker_agent;

@Worker_agent
public class Launcher {
/*
	Using the main role
	Pierre is making a system.
	Using the secondary roles
	Pierre is teaching.
	Pierre is learning.
	End of work!
	Pierre is teaching.
	Pierre is learning.
	Pierre is making a system.
	Age of pierreStudent: 42
	Pierre is walking.*/
    public static void main(String[] args) {
        // Pierre is first an engineer.
    	Engineer pierre = new Engineer("Pierre", 30);

        // Adding a teacher role, but making a new "clone" agent at the same time.
        Teacher pierreTeacher = new Teacher();
        pierre.addAgent(pierreTeacher);

        // Making a new agent.
        Student pierreStudent = new Student();
        // Adding a student role.
        pierre.addAgent(pierreStudent);

        // Using the roles.
        pierre.useRoles();
        
        // or
        pierreTeacher.setAge(42);
        
        pierreTeacher.teach();
        
        pierreStudent.learn();
        
        //Pierre is still an engineer as main occupation!
        pierre.design();
        
     // Ensures that pierreTeacher's update has been reported on pierreStudent
        System.out.println("Age of pierreStudent: " + pierreStudent.getAge());
        
        // Pierre is walking. He exists even without doing a job!
        pierre.walk();
    }
}
