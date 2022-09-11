package demo;

public class ArrayDemo {

	public static void main(String[] args) {
		System.out.println("1D array:");
		int num[]= {1,2,3,4};
		for (int i=0;i<num.length;i++)
		{
		System.out.print(" "+num[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("2D array:");
		int num1[]= {1,2,3,4};
		int num2[]= {5,6,7,8};
		int num3[]= {9,10,11};
		int num4[][]= {num1,num2,num3};
					
		for (int i=0;i<num4.length;i++)
		{
			for(int j=0;j<num4[i].length;j++)
			{
				System.out.print(" "+num4[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Jagged array:");
		int num5[]= {1,2,3,4};
		int num6[]= {5,6,7};
		int num7[]= {8,9,10};
		int num8[][]= {num5,num6,num7};
					
		for (int i=0;i<num8.length;i++)
		{
			for(int j=0;j<num8[i].length;j++)
			{
				System.out.print(" "+num8[i][j]);
			}
			System.out.println();
		}
	}

}
