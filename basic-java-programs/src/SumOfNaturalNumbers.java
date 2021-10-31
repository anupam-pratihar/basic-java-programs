/*
 *Problem Statement: 
 * Sum of first N Natural numbers:

Natural number are those number  which is start from one to infinite.

A natural number is a number that occurs commonly and obviously in nature. As such, it is a whole, 
non-negative number.

Example: Natural number={1,2,,4,5,6,…….}.

So we will perform the calculation Operation on Natural number using C++ programming approach.
 */

import java.io.*;
public class SumOfNaturalNumbers 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		int n=0,add=0,i=0;
		n=Integer.parseInt(in.readLine());
		for(i=1;i<=n;i++)
		{
			add=add+i;
		}
		System.out.println("Sum of first "+n+" natural numbers= "+add);
	}
}

/*
 * Bug:
 * No bugs.
 */
