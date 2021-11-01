/*
 * Problem Statement:
Find the Sum of first N Natural Numbers
A Natural number is a same as Counting number.They are used to Count the numbers of real physical object. Natural number is start from 1 and go on infinite. The positive numbers 1, 2, 3… are known as natural numbers.

Example: 

Natural number={1,2,,4,5,6,…….}.
Formula for Sum of First  N natural numbers is : n(n+1)/2.
If you want to add first 5 Natural number then we find the Sum of 1+2+3+4+5 =15.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SumNaturalNoWithFormula
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=0,add=0;
		System.out.println("Enter a number:");
		n=Integer.parseInt(in.readLine());
		add=(n*(n+1))/2;
		System.out.println("Sum of first "+n+" natural numbers= "+add);
	}
}

/*
 * Bug:
 * No bugs.
 */
