package demo;

/*
 * In abstraction, we can both define a method or declare it.
 * But in interface, we can only declare the method. This was true till 1.7;
 * In 1.8, we can define methods in interface.
 */

interface Demo
{
	public void def();
	
	/*
	 * public void met()		// this will give error since abstract methods do not specify a body
	 * {
	 * 	  System.out.println("in met");
	 * }
	 * Hence to add a method in interface we need to use a special keyword default.
	 */
	default void met() //default keyword for defining a method in interface
	{
		System.out.println("in met");
	}
}

class defMet implements Demo
{
	public void def()
	{
		System.out.println("in def");
	}
}
public class DefaultMethodInterface {

	public static void main(String[] args) 
	{
		Demo obj= new defMet();
		obj.def();
		obj.met();
	}

}
