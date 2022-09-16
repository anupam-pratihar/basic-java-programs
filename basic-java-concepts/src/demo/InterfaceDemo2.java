package demo;
// this is similar to creating an interface with abstract classes.
// here, we are creating an object of interface abc with the help of class implementor.
interface abc
{
	void show();
}
class implementor implements abc
{
	public void show()
	{
		System.out.println("anything");
	}
}

public class InterfaceDemo2 {

	public static void main(String[] args) {
		
		abc obj=new implementor();
		obj.show();
	}

}
