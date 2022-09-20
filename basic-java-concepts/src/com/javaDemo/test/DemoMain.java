package com.javaDemo.test;

public class DemoMain {

	public static void main(String[] args) {
		Student s=new Student();
		s.rollno=9;
		// this is present in same package, so it is visible for all classes to use in the same package
		// s.name="abc"; // private in com.javaDemo.test.Student, hence showing an error
		// although it is in same package, its visibility is private in class Student. So in order to
		// make it visible, we need to change it to something other than private.
		s.age=20;
		// s.marks=82; // issue with static field
		

	}

}
