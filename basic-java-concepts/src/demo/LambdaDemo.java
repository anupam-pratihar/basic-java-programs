package demo;

@FunctionalInterface // this makes sure that one and only one method can be passed through alpha
interface numb
{
	void number();
 // void numbers();  // this will give error since we have already specified @FunctionalInterface
					//  hence it will only accept one method
}
/*
 * class NUM implements numb
{
	public void number()
	{
		System.out.println("these are numbers.");
	}
}
*/

public class LambdaDemo {
	public static void main(String[] args)
	{
		/*
		numb obj= new numb() //anonymous class
				{
					public void number()
					{
						System.out.println("these are numbers.");
					}
				};	
			
			We already know how an object is created, or how we create a reference of an interface.
			We also know the syntax of an anonymous class, and when to use it. People hate java 
			because of its excessive boiler plate codes which are considered extra unwanted lines. 
			With the adaptation of scala, java is slowly trying to reduce this excess boiler plate
			codes which are already known or which can already be defined by the java compiler.
			
			This is known as lambda expression. 
		    Syntax: method bracket <space> arrow <space> method definition
		    () : the method bracket
		    -> : the arrow
		    {		: method definition
		    <body>
		    }
		    
		    Lambda expression is only possible with functional interfaces.
		
		    numb obj=() ->
		    				{
								System.out.println("these are numbers."); 
							}
		*/
		
		numb obj= () -> System.out.println("these are numbers."); 
		
		obj.number();
	
	}

}
