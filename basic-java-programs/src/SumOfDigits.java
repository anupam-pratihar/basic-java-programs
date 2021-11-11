/*
 * Problem Statement:
 * 
Sum of digits of a number using java :

We will find the sum of digits of an integer. For this purpose we will use a loop and a variable to sum the digits of the number entered by the user. Let us consider some examples for better understanding :

Input : 27

Output : Sum of Digits = 9

Input : 12345

Output : Sum of Digits = 15

So, now we create a java program to calculate the sum of digits of a given number.

 */

import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=0,m=0,q,r,s=0;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		m=n;
		while ( m != 0)
		{
			q=m/10;
			r=m-q*10;
			s=s+r;
			m=q;
		}
		System.out.println("Sum of digits of "+n+" = "+s);
		sc.close();
		}
	}

/*
Bugs:
No bugs.
*/