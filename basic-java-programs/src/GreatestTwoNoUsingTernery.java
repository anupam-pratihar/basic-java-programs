/*
 * Problem Statement: 

Find Greatest of Two Numbers

The greatest of numbers can be identified with the help of IF-ELSE statement. 
The user is asked to insert two integers. The numbers inserted are then calculated using a set of 
program to get the correct output. It will find the highest number among them using IF-ELSE Statement
 and start checking which one is larger to display the largest number.

Example – If the given  numbers are 12 and 9 then greater number is 12
 12, 9= 12>9
*/

import java.io.*;
class GreatestTwoNoUsingTernery
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int a,b=0;
		System.out.println("Enter two numbers:");
		a=Integer.parseInt(in.readLine());
		b=Integer.parseInt(in.readLine());
		System.out.println(a>b?a+" is greater than "+b+".":b+" is greater than "+a+".");
		
	}
}

/*Bugs:
No bugs.
*/
