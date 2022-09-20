package com.javaDemo;
import java.io.*;
public class UserInputDemo {
		
	public static void main(String[] args)throws IOException
	{	/* We need to handle exceptions which occur due to wrong user inputs or data type mismatch.
		   So in order to handle them, we can either use try-catch block or use the throws keyword.
		   
		   public static void main(String[] args)throws Exception  // similar to catch(Exception e) 
		   {
		    	...
		   }
		*/
		int a=0,n=0;
		// this is handled by throws keyword
		System.out.println("Enter a number: ");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		a= Integer.parseInt(in.readLine());
		System.out.println("throws: "+a);
		// using try-catch block to handle the exception
		System.out.println("Enter a number: ");
		BufferedReader br= null;
		// br is a resource. Any classes which comes with the help of io, are resources.
		// this means after using the resources, we have to close it. Otherwise it will occupy memory.
		// hence we need to close it after we are done taking inputs.
		
		try
		{	br= new BufferedReader(new InputStreamReader(System.in));
			n= Integer.parseInt(in.readLine());
			// br.close(); // as discussed earlier, we need to close resources. But closing it in 
						// try block might not be beneficial since the code might break its excution
						// before reaching to br.close(); So its better to close it in finally block.
			System.out.println("try-catch: "+n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
				
		finally 
		{
			br.close();
		}
		
	}

}
