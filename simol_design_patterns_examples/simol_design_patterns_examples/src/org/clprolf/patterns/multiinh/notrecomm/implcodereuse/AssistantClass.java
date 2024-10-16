package org.clprolf.patterns.multiinh.notrecomm.implcodereuse;

import org.clprolf.patterns.multiinh.notrecomm.interfaces.Assistant;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Student;
import org.clprolf.patterns.multiinh.notrecomm.interfaces.Teacher;
import org.simol.simolframework.java.Agent;
import org.simol.simolframework.java.Contracts;


@Agent //If class role on the interface Teacher, here we have exactly the same role.
public class AssistantClass implements @Contracts Assistant, Teacher, Student {
	protected TeacherClass teacher;
	protected StudentClass student;
	protected PersonClass person;
	
	public AssistantClass(String name, int age){
		//We are choosing the teacher as the first twin, but it could be the student!
		this.teacher = new TeacherClass(name, age);
		this.student = new StudentClass(teacher); //Passing the teacher to the student, for the person part of the teacher.
		this.person = (PersonClass)this.teacher;
	}
	
	//For Teacher
	public void teach(){
		this.teacher.teach();
	}
	
	//For Student
	public void learn(){
		this.student.learn();
	}

	//For person
	public int getAge() {
		return this.person.getAge();
	}
	public void setAge(int age) {
		this.person.setAge(age);
	}
	
	public String getName() {
		return this.person.getName();
	}
	public void setName(String name) {
		this.person.setName(name);
	}
	//
	public void walk() {
		this.person.walk();
	}
}
