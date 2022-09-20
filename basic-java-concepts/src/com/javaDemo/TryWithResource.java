package com.javaDemo;

import java.io.*;
public class TryWithResource {
		
	public static void main(String[] args)throws IOException
	{	
		int n=0;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		
		
		/*
		 * A try block can exist without a catch block. It simply needs the finally block.
		 * Try block either needs catch block or finally else it will show an error.
		 * So to close the resource without actually writing a catch block or finally, we need to 
		 * try(...)
		 * {
		 * 		...
		 * }
		 * 
		 * This syntax is known as try with resource. In this, the resource automatically gets closed
		 * as soon as the object goes out of scope. Even if it gets an exception, it will close it
		 * automatically. This was implemented from java 1.7;
		 
		 
		 *
		 * BufferedReader br= null;
		 * try
		{	br= new BufferedReader(new InputStreamReader(System.in));
			n= Integer.parseInt(in.readLine());
			
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
		
		 */
		
		try (BufferedReader br= new BufferedReader(new InputStreamReader(System.in)))
		{	
			n= Integer.parseInt(in.readLine());
		}
		System.out.println("try with resource: "+n);
		
		
	}

}

