/*
 * Problem Statement:
 * 
Check Whether a Number is Prime Number or Not.

 A number is considered as prime number when it satisfies the below conditions. 

    Prime number is a number which can be divided by 1 and itself
    A number which can not be divided by any other number other than 1 or itself is a prime number.
    It should have only 2 factors. They are, 1 and the number itself.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PrimeNumber {
	public static void main(String [] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num,count=0;
		System.out.println("Enter a number:");
		num=Integer.parseInt(in.readLine());
		for (int i=1;i<=num;i++)
		{
			if (num % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println(num+" is a prime number.");
		else
			System.out.println(num+" is not a prime number.");
	}
}

/*
 * Bugs:
 * No bugs.
 */ 
