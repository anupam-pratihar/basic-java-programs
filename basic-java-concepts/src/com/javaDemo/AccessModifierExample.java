package com.javaDemo;

import com.javaDemo.test.Student; // we can either import all files by * or specific files like this.

/*If we want to access classes from different packages we cannot use default access modifier.
* We need to make it public. This allows us to access a class outside the package.
* The scope of default access is only restricted to the same package.
* 
*  We can make our methods as public, private and protected.
*/

public class AccessModifierExample
{
	public void method1()
	{
		method2();
	}
	private void method2()
	{
		System.out.println("in class AME of package javaDemo");
	}
	public static void main(String args[])
	{
		Student s=new Student();
		s.rollno=10; // rollno of package javaDemo.test is default or private. So in order to make it 
					// visible  we need to change it to public.
		// s.Class=10; // Class is initialised protected in com.javaDemo.test.student hence showing an 
					//    error . Protected keyword wont allow visibility to a different package.
		//s.age=20; //we cannot accept age which is package private. 
					
			
		
	}
}


