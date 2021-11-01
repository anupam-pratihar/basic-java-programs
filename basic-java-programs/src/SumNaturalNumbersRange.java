/*
 *Problem Statement: 
 * Sum of first N Natural numbers:

Natural number are those number  which is start from one to infinite.

A natural number is a number that occurs commonly and obviously in nature. As such, it is a whole, 
non-negative number.

Example: Natural number={1,2,,4,5,6,…….}.
So we will take two numbers as input, say 5 and 10. We will then find the sum of the range b/w 5 and 10,i.e.
5+6+7+8+9+10=45.

So we will perform the calculation Operation on Natural number using java programming approach.
 */

import java.io.*;
public class SumNaturalNumbersRange
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=0,m=0,add=0,i=0;
		System.out.println("Enter two numbers:");
		m=Integer.parseInt(in.readLine());
		n=Integer.parseInt(in.readLine());
		if (m < n)
		{
			for(i=m;i<=n;i++)
				{
					add=add+i;
				}
		}
		System.out.println("Sum of natural numbers between "+m+" and "+n+" = "+add);
	}
}

