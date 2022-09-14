package demo;

class printer
{
	void show(Number i)
	{
		System.out.println(i);
	}
	/*void show(Integer i)
	{
		System.out.println(i);
	}
	void show(Double i)
	{
		System.out.println(i);
	}
	*/
}
public class AbstractNumbersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printer obj=new printer();
		obj.show(6.76);
	}

}
