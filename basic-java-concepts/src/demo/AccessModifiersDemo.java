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
 * 
*/

public class AccessModifiersDemo {

	public static void main(String[] args) {
		AccessModifierExample obj=new AccessModifierExample();
		obj.method1();
		

	}

}
