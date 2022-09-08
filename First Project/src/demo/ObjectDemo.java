package demo;
class Calculate
{
	int num1,num2,result=0;
	public void operation()
	{
		result=num1+num2;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate obj=new Calculate();
		obj.num1=5;
		obj.num2=10;
		obj.operation();
		System.out.println(obj.result);
	}

}
