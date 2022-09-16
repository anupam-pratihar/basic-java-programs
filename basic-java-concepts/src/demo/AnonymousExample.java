package demo;
// this is an Anonymous Inner Class example
class Ab
{
	public void show()
	{
		System.out.println("in A");
	}
}
/* 	 In order to change the existing method, we need to override it.
	 The only purpose of B is to override the method show() present in A.
	 So this class Bb can be meoved since its sole purpose is to override a method and it does not have
	 any other scope throughout the rest of the program.
	 
class Bb extends Ab
{
	public void show()
	{
		System.out.println("in B");
	}
}
*/
public class AnonymousExample {

	public static void main(String[] args) {
		
		/* So we remove class Bb, and add show() to Ab(){}. This also serves as a new class which 
		   does not have a name. So when we create a class and create an object of it, it is termed
		   as Anonymous class. Its scope is here, and we cannot reuse it.
		
		   So if our intention is to create a class for one time use, we can prefer anonymous class.
		   To create an anonymous class, we need to create an object, and just before semi colon, we
		   need to provide the implementation of the class. So when we call show(), it directly calls 
		   the anonymous class and not class Ab.
	    */
		 
		Ab obj=new Ab()
				{
					public void show()
					{
						System.out.println("in B");
					}
				}; 
		obj.show();
	}

}
