package org.clprolf.patterns.multiinh.notrecomm;

import org.clprolf.patterns.multiinh.notrecomm.impl.AssistantClass;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Person;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.With_compat;
import org.simol.simolframework.java.Worker_agent;

/**
 * The not recommended functional clprolf design pattern, for multiple inheritance
 * with interfaces.
 * 
 * @author Charles Koffler
 * 20241015
 */
@Worker_agent
public class Launcher {
/* Execution output:
I'm walking! 
I'm learning
I'm teaching!
Test of Person polymorphism
The person John is going to walk: 
I'm walking! 
Test of Student polymorphism
The student John is going to learn: 
I'm learning
End of test
Test of Teacher polymorphism
The teacher John is going to teach: 
I'm teaching!
End of test */
	
    public static void main(String[] args) {
        AssistantClass john = new AssistantClass("John", 36);
        john.walk();
        john.learn();
        john.teach();
        Launcher.testPerson(john);
        Launcher.testStudent(john);
        Launcher.testTeacher(john);
    }
    
    public static void testPerson(@With_compat Person person) {
    	System.out.println("Test of Person polymorphism");
    	System.out.println("The person " + person.getName() + " is going to walk: ");
    	person.walk();
    }
    
    public static void testStudent(@With_compat Student student) {
    	System.out.println("Test of Student polymorphism");
    	System.out.println("The student "+student.getName() + " is going to learn: ");
    	student.learn();
    	System.out.println("End of test");
    }
    
    public static void testTeacher(@With_compat Teacher teacher) {
    	System.out.println("Test of Teacher polymorphism");
    	System.out.println("The teacher "+teacher.getName() + " is going to teach: ");
    	teacher.teach();
    	System.out.println("End of test");
    }
}
