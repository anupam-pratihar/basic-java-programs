package com.javaDemo.test;

public class Student {

	public int rollno=7; // if no modifier is mentioned, it is default 
	int age=23;
	private static String name="Anupam"; // we need to add static, else an error will be shown.
	// we cannot use private outside the same class. So DemoMain cannot access it.
	protected static int marks=78; // it cannot be accessed outside this package.
	
	public static void main(String args[])
	{
		System.out.println(name); //like access modifiers, we cannot print a non-static field 
								 //	in a static method.
		System.out.println(marks);
	}

}
