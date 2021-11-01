/*
 * Problem Statement:
 * Find Greatest of Three Numbers
The C program to find the greatest of three numbers requires the user to insert three integers. 
Flow chart is also used in C programming to find the greatest number among three integers inserted
by the user. A simple if-else block is used to identify the greatest number. 
switch case.
*/

import java.io.*;
public class GreatestOfThreeNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter three numbers:");
		int a=Integer.parseInt(in.readLine());
		int b=Integer.parseInt(in.readLine());
		int c=Integer.parseInt(in.readLine());
		if ( a > b && a > c)
			System.out.println(a+" is greater than "+b+" and "+c);
		else if ( b > c && b > a)
			System.out.println(b+" is greater than "+a+" and "+c);
		else
			System.out.println(c+" is greater than "+a+" and "+b);

	}

}

/*Bugs:
No bugs.
*/