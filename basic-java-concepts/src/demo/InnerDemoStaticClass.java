package demo;

/*
 * Inner class
 * Member class which does not have a static class
 * Static class
 * Anonymous class
 * 
 */
class Outer1 //Outer class
{
	static int a;
	public void show()
	{
		
	}
	static class Inner1 //Outer$Inner.class 
	{
		public void display()
		{
			System.out.println("in Display");
		}
	}
}
public class InnerDemoStaticClass  //InnerDemo class
{

	public static void main(String[] args)
	{
		Outer1 obj=new Outer1();
		obj.show();
		Outer1.Inner1 obj1=new Outer1.Inner1();
		obj1.display();
		
	}
	
	/*Outer.Inner since Inner class is present inside Outer class.
	* obj.new Inner() since we are creating an object of a class present 
	* inside the Outer class which already has an existing object obj.
	*/
	
	/* Whenever we create an object of Inner class, for reference we use 
	 * the Outer class and for member class we have to call the object of Outer 
	 * class to create the object of Inner class.
	 */
	
	/* 
	 * For static class we simply need to change the name and call the object from the
	 * Outer class since static keyword is mentioned.
	 */
}

