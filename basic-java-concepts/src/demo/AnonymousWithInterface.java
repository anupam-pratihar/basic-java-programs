package demo;

//this is similar to creating an interface with abstract classes.
//here, we are creating an object of interface abc with the help of class implementor.
interface AICI
{
	void show();
}
/*
 *  Since implementor class had only one job of creating an object for interface AICI, and had no 
 *  scope outside of it, we can create an anonymous class instead of it.
 
class implementor implements abc
{
	public void show()
	{
		System.out.println("anything");
	}
}
*/
public class AnonymousWithInterface {
	
	public static void main(String[] args) {
		// an anonymous class will also create a class but unlike others we cannot reuse the 
		// definition elsewhere
		AICI obj=new AICI()
				{
					public void show()
						{
							System.out.println("anything");
						}
				};
		obj.show();
	}

}