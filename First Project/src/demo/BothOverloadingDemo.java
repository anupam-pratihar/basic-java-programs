package demo;
class Calc
{
	int num1,num2=0;
	static int result=0;
	public Calc(int n)
	{
		num1=n;
		num2=n;
	}
	public Calc(int n, String s)
	{
		num1=n*2;
		num2=n*2;
		System.out.println(s+":");
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

public class BothOverloadingDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj=new Calc(10);
		obj.add(); 
		System.out.println(Calc.result);
		obj.add(7);
		System.out.println(Calc.result);
		System.out.println("................................................................");
		Calc obj1=new Calc(3,"The result is");
		obj1.add(); 
		System.out.println(Calc.result);
		obj1.add(7);
		System.out.println(Calc.result);
	}
}
