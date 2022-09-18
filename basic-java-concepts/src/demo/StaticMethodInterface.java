package demo;

/*
 * Java 1.8 has introduced the concept of static methods in interface where we can call an interface, 
 * without creating another class. This is done with the help of static keyword. And to call it we
 * simply write <interface_name>.<method_name>(). We dont need to create an object of it.
 * 
 * We can even initialise variables inside an interface. But they cannot be left blank, we need to
 * initialize them. But these varables are constants,i.e.,they are initialised with the final keyword. 
 * Hence we cannot change them throughout the method scope.
 * 
 */
interface demo5
{
	int num=10;
	void abc();
	default void def()
	{
		System.out.println(num);
	}
	static void gh()
	{
		System.out.println(num+num);
	}
}
class intermeteg implements demo5
{
	public void abc()
	{
		System.out.println(num*num);
	}
}

public class StaticMethodInterface {

	public static void main(String[] args) {
		demo5 obj=new intermeteg();
		obj.def();
		demo5.gh();
		obj.abc();
	}

}
