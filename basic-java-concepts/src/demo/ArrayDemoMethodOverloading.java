package demo;

public class ArrayDemoMethodOverloading {
	int num[]=new int[4];
	int num1[]=new int[4];
	int num2[]=new int[4];
	int num3[]=new int[4];
	int num4[]=new int[4];
	public void OneD(String args[])
	{
		System.out.println("1D array:");
		int num[]= {1,2,3,4};
		for (int i=0;i<num.length;i++)
		{
		System.out.print(" "+num[i]);
		}
		System.out.println();
	}
	public void TwoD(String args[])
	{
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
	}
	public void Jagged(String args[])
	{
		System.out.println();
		System.out.println("Jagged array:");
		int num1[]= {1,2,3,4};
		int num2[]= {5,6,7};
		int num3[]= {8,9,10};
		int num4[][]= {num1,num2,num3};
					
		for (int i=0;i<num4.length;i++)
		{
			for(int j=0;j<num4[i].length;j++)
			{
				System.out.print(" "+num4[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		ArrayDemoMethodOverloading obj=new ArrayDemoMethodOverloading();
		obj.OneD(args);
		obj.TwoD(args);
		obj.Jagged(args);

	}

}
