package com.javaDemo;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int [5];
			a[5]=9; // this is give an error since we are crossing array index
			int b[]=null;
			b[2]=10; // this will give null pointer exception
			int j=0;
			int i=85;
			int k=i/j;
			System.out.println("output:"+k); // this will give arithmetic exception
		}
		/* 
		 * So whichever exception it catches first, the code execution ends there in try block
		   i.e., if ArrayIndex exception is handled first, the rest of the try block wont be 
		   executed,or the other two exceptions.
		
		   Sometimes we might not know which exception is thrown, so if we dont specify it in catch 
		   block, it wont be handled. So its better to write a simple catch block in the end.
		   catch(Exception e)
		   {	...
		   		...
		   }
		
		 *Like method overloading format, we can write multiple catch blocks for different exceptions.
		 *Or we can write them in a single catch block too
		 
		 * catch (ArithmeticException e) 
		   {
			System.out.println("Error"); 
			
			System.err.println("Arithmetic exception");
		   }
		   
		 catch (ArrayIndexOutOfBoundsException e) 
		   {
			System.out.println("Error"); 
			
			System.err.println("ArrayIndexOutOfBounds exception");
		   }
		*
		*
		*Or, we can write all the exceptions in a single line like this:
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) 
		// multiple catch blocks in one line was introduced from java 1.7
		{
			System.err.println("Error"); 
		}
		
		*/
		
		catch (ArithmeticException e) 
		   {
			System.out.println("Error"); 
			
			System.err.println("Arithmetic exception");
		   }
		   
		 catch (ArrayIndexOutOfBoundsException e) 
		   {
			System.out.println("Error"); 
			
			System.err.println("ArrayIndexOutOfBounds exception");
		   }
		
		catch (NullPointerException e) 
		   {
			System.out.println("Error"); 
			
			System.err.println("NullPointer exception");
		   }
		catch (Exception e) 
		   {
			System.err.println("Error"); 
		   }
		
		finally 
		{
			System.out.println("END");
		
		}
	}

}
