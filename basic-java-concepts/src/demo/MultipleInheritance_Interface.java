package demo;

interface demo3
{
	default void show1()
	{
		System.out.println("in demo3 show1");
	}
	default void show()
	{
		System.out.println("in demo3 show");
	}
}
interface demo4
{
	default void show1()
	{
		System.out.println("in demo4 show1");
	}
	default void show()
	{
		System.out.println("in demo4 show");
	}
}
class Mulin implements demo3,demo4
{
	public void show() // in this, we are overriding show() of both demo3 and demo4
	{				   // if we add <interface>.super.<method_name> in this show(),
					   // we will achieve the same result as show1();
		System.out.println("in Mulin show");
	}
	public void show1() // with the help of super keyword we are calling each interface and its 
						// respective method to avoid ambiguity
	{
		demo3.super.show1();
		demo4.super.show1();
	}
	
}

public class MultipleInheritance_Interface {

	public static void main(String[] args) {
		demo3 obj= new Mulin();
		obj.show();
		obj.show1();

	}

}
