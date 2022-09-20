package demo;
import com.javaDemo.*;

/* In java we have access modifiers(not access specifiers as in c c++).
 * They are: default, final, abstract, public, private and protected.
 * In class we can only use default, final, abstract and public as access modifiers.
 * Public and protected cannot be used with class. 
 * We can use private with inner class. 
 * 
 * If we want to access classes from different packages we cannot use default access modifier.
 * We need to make it public. This allows us to access a class outside the package.
 * The scope of default access is only restricted to the same package.
 * 
 *  We can make our methods as public, private and protected.
 *  Private:   Specific class (same class)
 *  Default:   Specific package (same package)
 *  Public:    Any class or package (anywhere)
 *  Protected: Subsiding class (same package or another package provided it is a sub class)
 *  
 *  package demo -> AccessModifiersDemo.java
 *  package com.javaDemo -> Access ModifierExample.java, Engineer.java
 *  package com.javaDemo.test -> Student.java, DemoMain.java
 *  
 *  All these programs have examples of the major access modifiers and whether they are accepted or not
 *  through different files and packages.
 * 
*/

public class AccessModifiersDemo {

	public static void main(String[] args) {
		AccessModifierExample obj=new AccessModifierExample();
		obj.method1();
		

	}

}
