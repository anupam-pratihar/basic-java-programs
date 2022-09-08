package demo;
class Cal
{
	int num1,num2,result=0;
	 public Cal()
	{
		num1=0;
		num2=0;
	}
	public void add()
	{
		result=num1+num2;
	}
	public void add(int n)
	{
		result=num1+num2+n;
	}
}

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		
		Cal obj=new Cal();
		obj.num1=5;
		obj.num2=10;
		obj.add(); 
		System.out.println(obj.result);
		obj.add(7);
		System.out.println(obj.result);
	}
}
