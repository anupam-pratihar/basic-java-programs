package demo;
/*
 * Inner class
 * Member class which does not have a static class
 * Static class
 * Anonymous class
 * 
 */
class Outer //Outer class
{
	int a;
	public void show()
	{
		
	}
	class Inner //Outer$Inner.class 
	{
		public void display()
		{
			System.out.println("in Display");
		}
	}
}
public class InnerDemo  //InnerDemo class
{

	public static void main(String[] args)
	{
		Outer obj=new Outer();
		obj.show();
		Outer.Inner obj1=obj.new Inner();
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

}
