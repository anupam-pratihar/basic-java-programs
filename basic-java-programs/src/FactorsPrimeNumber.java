/*
 * Problem Statement:
 * 
Check Whether a Number is Prime Number or Not.
Print both 1 and the number itself.

 A number is considered as prime number when it satisfies the below conditions. 

    Prime number is a number which can be divided by 1 and itself
    A number which can not be divided by any other number other than 1 or itself is a prime number.
    It should have only 2 factors. They are, 1 and the number itself.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FactorsPrimeNumber {
	public static void main(String [] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int num,count=0,k=0;
		System.out.println("Enter a number:");
		num=Integer.parseInt(in.readLine());
		int []arr=new int[num+1];
		for (int i=1;i<=num;i++)
		{
			if (num % i == 0)
			{
				arr[k++]=i;
				count++;
			}	
		}
		if (count == 2)
		{
			System.out.println(num+" is a prime number.");
			System.out.println("It can be divided by: ");
			for (int j=0;j<count;j++)
			{
				if (j==0)
					System.out.print(arr[j]+",");
				else
					System.out.print(arr[j]+".");
			}
		}
		else
			System.out.println(num+" is not a prime number.");
	}
}

/*
 * Bugs:
 * Run the j loop from count and not num.
 */ 



