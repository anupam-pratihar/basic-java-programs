/*
 * Java Program to Check Whether a Number is Even or Odd

A number is even or odd using java :
Even number is a positive natural number which is completely divisible by two, 
where as odd number is the reverse of the even number, means odd number is also a positive 
natural number which is not completely divisible by two.

If N % 2 = 0, then the number is Even, else the number is Odd.

 */

import java.io.*;
public class EvenOrOdd 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		n=Integer.parseInt(in.readLine());
		if(n>0)
		{
			if (n % 2 == 0)
				System.out.println(n+" is an even number.");
			else
				System.out.println(n+" is an odd number.");	
		}
	}

}

/*
 * Bug:
 * Used BufferedReader class in this program. There was no memory leak in this code and we did not 
 * need to explicitly use in.close() here. 
 * Read: shorturl.at/lzEMU
 */
