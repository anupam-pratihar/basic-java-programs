/*
 * Problem Statement:
 * 
 * Checking if a number is positive or negative using Java
Check whether number is positive or negative
A number is positive or negative using java :
In this article, we will create a java program to check whether the number entered by the user is
positive or negative. The number is demonstrated as positive or negative by comparing the entered 
number with the Zero(0). If the number entered by the user is greater than zero, then the number is
positive, else if the number is less than zero, then the number is negative and else the number is zero.

    N > 0 then, number is Positive.
    N < 0 then, number is Negative.
    N = 0 then, number is Zero.
    
 */

import java.util.Scanner;
public class PositiveOrNegativeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); //same issue of resource leak
		int n=0;
		n=sc.nextInt();
		if (n > 0)
			System.out.println(n+" is a positive number.");
		else if (n < 0)
			System.out.println(n+" is a negative number.");
		else if (n == 0)
			System.out.println(n+" is zero in words :)");
		
	}

}

/*
Bug:
Same issue of resource leak from sc. It needs to be closed, else automatic java garbage collector
won't be able to clear the heap memory allocated to object sc. If we sc.close() it, it will force close 
System.in too. For small programs, this excess unused memory is not an issue but when the difficulty level 
increases this will be a problem. Lets try BufferedReader class next instead of Scanner classs.abstract
*/