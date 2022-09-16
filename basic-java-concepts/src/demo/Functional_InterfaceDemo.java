package demo;

@FunctionalInterface // this makes sure that one and only one abstract method can be passed 
					 // through alpha
interface alpha
{
	void alphabet();
 // void numbers();  // this will give error since we have already specified @FunctionalInterface
					//  hence it will only accept one abstract method
}
/*
 * class ALPH implements alpha
{
	public void alphabet()
	{
		System.out.println("these are alphabets.");
	}
}
*/
public class Functional_InterfaceDemo {

	public static void main(String[] args)
	{
		alpha obj= new alpha() //anonymous class
				{
					public void alphabet()
					{
						System.out.println("these are alphabets.");
					}
				};	
		obj.alphabet();
	}

}
