package com.javaDemo;
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

}


