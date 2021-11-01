/*
 * Problem Statement:
 * 
Prime Numbers in a Given Range

A number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).

The java program reduces the number of iteration within the for loop. It is made to identify or 
calculate the prime numbers within a given range of numbers inserted by the user.

Ex:- if user enter a range as 40-50 

In that range 41,43,47 these three number are prime number.

 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PrimeNumbersRange 
{
	public static void main(String [] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num1,num2,count=0;
		System.out.println("Enter two numbers:");
		num1=Integer.parseInt(in.readLine());
		num2=Integer.parseInt(in.readLine());
		System.out.println("The prime numbers are: ");
		for(int i=num1;i<=num2;i++) 
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i % j ==0)
				{
					count++;
				}
			}
			if (count == 2)
			{
				System.out.println(i);
			}
			
		}
		
	}
}

/*
 * Bugs:
 * No bugs.
 * Point to remember: making count=0 inside i loop is a must since everytime it checks for a new number,
 * it will initialize count=0 before entering the for loop.
 */
		