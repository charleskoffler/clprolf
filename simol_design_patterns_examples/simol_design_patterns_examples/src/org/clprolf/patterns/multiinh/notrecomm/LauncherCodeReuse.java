package org.clprolf.patterns.multiinh.notrecomm;

import org.clprolf.patterns.multiinh.notrecomm.implcodereuse.AssistantClass;
import org.clprolf.patterns.multiinh.notrecomm.implcodereuse.TeacherClass;
import org.clprolf.patterns.multiinh.notrecomm.implcodereuse.StudentClass;
import org.clprolf.patterns.multiinh.notrecomm.implcodereuse.PersonClass;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Person;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.With_compat;
import org.simol.simolframework.java.Worker_agent;

/**
 * The not recommended functional clprolf design pattern, for multiple inheritance
 * with interfaces, and code reuse.
 * 
 * @author Charles Koffler
 * 20241015
 */
@Worker_agent
public class LauncherCodeReuse {
/* Execution output:
*** TEST OF AN ASSISTANT ***
John is walking.
John is learning.
John is teaching.
Test of Person polymorphism
The person John is going to walk: 
John is walking.
Test of Student polymorphism
The student John is going to learn: 
John is learning.
End of test
Test of Teacher polymorphism
The teacher John is going to teach: 
John is teaching.
End of test
*** TEST OF A TRUE TEACHER ***
Test of Person polymorphism
The person Angela is going to walk: 
Angela is walking.
Test of Teacher polymorphism
The teacher Angela is going to teach: 
Angela is teaching.
End of test
*** TEST OF A TRUE STUDENT ***
Test of Person polymorphism
The person Mary is going to walk: 
Mary is walking.
Test of Student polymorphism
The student Mary is going to learn: 
Mary is learning.
End of test
*** NEW TEST WITH THE ASSISTANT ***
John is walking.
John is learning.
John is teaching.
Test of Person polymorphism
The person John is going to walk: 
John is walking.
Test of Student polymorphism
The student John is going to learn: 
John is learning.
End of test
Test of Teacher polymorphism
The teacher John is going to teach: 
John is teaching.
End of test

 */
	
    public static void main(String[] args) {
    	System.out.println("*** TEST OF AN ASSISTANT ***");
        AssistantClass john = new AssistantClass("John", 36);
        john.walk();
        john.learn();
        john.teach();
        LauncherCodeReuse.testPerson(john);
        LauncherCodeReuse.testStudent(john);
        LauncherCodeReuse.testTeacher(john);
        //
        System.out.println("*** TEST OF A TRUE TEACHER ***");
        TeacherClass trueTeacherAngela = new TeacherClass("Angela", 54);
        LauncherCodeReuse.testPerson(trueTeacherAngela);
        LauncherCodeReuse.testTeacher(trueTeacherAngela);
        //
        System.out.println("*** TEST OF A TRUE STUDENT ***");
        StudentClass trueStudentMary = new StudentClass("Mary", 21);
        LauncherCodeReuse.testPerson(trueStudentMary);
        LauncherCodeReuse.testStudent(trueStudentMary);
        //
        System.out.println("*** NEW TEST WITH THE ASSISTANT ***");
        john.walk();
        john.learn();
        john.teach();
        LauncherCodeReuse.testPerson(john);
        LauncherCodeReuse.testStudent(john);
        LauncherCodeReuse.testTeacher(john);
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
