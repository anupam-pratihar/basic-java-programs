/*
 * Problem Statement:
 * 
 * Take two numbers as input and swap them and print the swapped values.
Input Format:

The first line of input contains a single integer 't', representing the total number of test cases.

The second line of input contains two integers 'a' and 'b', representing the second number. 

Output Format:

The first line of output prints the swapped value of 'a' and 'b'.

Constraints:

1 <= 'T' <= 10^2
-10^5 <= 'a', 'b' <= 10 ^ 5

Sample Input 1:

2
1 2 
3 4

Sample Output 1:

2 1
3 4

 */

import java.util.Scanner; // Scanner class for i/o operations
public class SwapTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=0,j=0,c=0,n=0;
		
		try //try-finally block implemented to stop resource/memory leak from Scanner sc object
		{
			System.out.println("Enter total number of test cases: ");
			n=sc.nextInt(); 
			int []a=new int[n];
			int []b=new int[n];
			System.out.println("Fill the array respectively: ");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				b[i]=sc.nextInt();
			}
			for (j=0;j<n;j++)
			{
				c=a[j];
				a[j]=b[j];
				b[j]=c;
				System.out.println(a[j]+" "+b[j]);
			}
		}
		finally //to stop resource leak, we need to close the object 
		{
			sc.close();
		}		
	}
}

/*
 * Bug: 
 * 
 * resource leak: 'sc' is never closed.
 * Detailed quora explaination: https://qr.ae/pGxxyt
 * It is telling you that you need to close the Scanner you instantiated on System.in with Scanner.close(). 
 * Normally every reader should be closed. This will close the Scanner and silence the warning, but it will 
 * also close System.in which is typically not desirable.
 * It's because you won't be able to read from it again. I. e. you will get
 * java.util.NoSuchElementException: No line found if you try to call (new Scanner(System.in)).nextLine().
 * Search on this topic for better understanding.
 */
