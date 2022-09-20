package com.javaDemo;

public class OwnExceptionDemo {

	public static void main(String[] args) {
		
		int i=7,j=10,k=0;
		try
		{
			
			k=i/j;
			if (k == 0)
			{
				throw new JavaDemoOwnException (" Do not want 0 to be displayed.");
			}
			System.out.println(k);
		}
		catch(JavaDemoOwnException e)
		{
			System.out.println("error: "+ e.getMessage());
		}

	}

}
