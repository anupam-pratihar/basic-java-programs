package com.javaDemo;

/*
 * Whenever we have an exception, the compiler doesnot specify about the exception.
 * Only on runtime we get to see the exception or error .
 * 
 * If we try to print anything after the exception, it will not print as it is breaking the 
 * execution on the line where the error occurs. As soon as we get the exception, it breaks 
 * the execution and print the error. It will not print anything after it. That means we are
 * not handling the exception.
 * 
 *  We use try catch block to handle exceptions.
 *  try is a block where we put all our critical statements,i.e. statements which may throw an 
 *  exception or has errors in them. 
 *  If it throws an exception, we need to have a catch block
 *  to catch the exception thrown. So try will throw an object of this exception which needs to 
 *  be caught by the catch block. 
 *  
 *  Finally is a block which will be executed even if we get an exception or not. This helps in 
 *  code redundancy.
 *  
 */
public class ExceptionDemo {

	public static void main(String[] args) 
	{
		/*
		 * 
		 * 
		try
		{
			int j=0;
			int i=85;
			int k=i/j;
			System.out.println("output:"+k);
		}
		// if there is critical statements in try block, it will send it to catch block for handling 
		// it. Else it will print k present in try block. The catch block wont be printed.
		catch (Exception e)
		{
			System.out.println("Error"); 
			// we can also turn the generic black coloured text to red 
			System.err.println("Arithmatic exception");
		}
		System.out.println("END");
		*
		*
		*
		try
		{
			int j=8;
			int i=85;
			int k=i/j;
			System.out.println("output:"+k);
		}
		// if there is critical statements in try block, it will send it to catch block for handling 
		// it. Else it will print k present in try block. The catch block wont be printed.
		catch (Exception e)
		{
			System.out.println("Error"); 
			// we can also turn the generic black coloured text to red 
			System.err.println("Arithmatic exception");
		}
		System.out.println("END");
		*
		*
		*
		try
		{
			int j=0;
			int i=85;
			int k=i/j;
			System.out.println("output:"+k);
		}
		// if there is critical statements in try block, it will send it to catch block for handling 
		// it. Else it will print k present in try block. The catch block wont be printed.
		catch (ArithmeticException e) // we can write the proper <Exception_name> instead of only 
										 Exception e
		{
			System.out.println("Error"); 
			// we can also turn the generic black coloured text to red 
			System.err.println("Arithmatic exception");
		}
		System.out.println("END");
		*/
		try
		{
			int j=0;
			int i=85;
			int k=i/j;
			System.out.println("output:"+k);
		}
		// if there is critical statements in try block, it will send it to catch block for handling 
		// it. Else it will print k present in try block. The catch block wont be printed.
		catch (ArithmeticException e) // we can write the proper <Exception_name> instead of only 
									  // Eception e
		{
			System.out.println("Error"); 
			// we can also turn the generic black coloured text to red 
			System.err.println("Arithmatic exception");
		}
		finally //helps in reducing code redundancy
		{
			System.out.println("END");
		}
		

	} 
}