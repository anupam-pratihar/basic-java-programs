/*
 * Problem Statement:
 * 
Year is a Leap Year or Not

In this program we have to find the year is a leap year or not. Generally  we assume that year is 
exactly divisible by 4 is a leap year. But it is not only in this case 1900 is divisible by 4. 
But it  is not a leap so it that case we follows these conditions   

    It is exactly divisible by 100
    If it is divisible by 100, then it should also exactly divisible by 4
    And it is divisible by 400  

These all conditions are true year is a leap year.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LeapYear
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int year=Integer.parseInt(in.readLine());
		System.out.println("Enter a year:");
		if (year % 100 == 0)
		{
			if(year % 4 == 0)
			{
				if (year % 400 ==0)
				{
					System.out.println(year+" is a leap year.");
				}
			}
		}
		else
			System.out.println(year+" is not a leap year.");

	}
}

/*
 * Bugs:
 * No bugs.
 */ 
