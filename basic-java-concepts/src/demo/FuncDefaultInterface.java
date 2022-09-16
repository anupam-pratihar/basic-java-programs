package demo;

@FunctionalInterface
interface Demo1
{
	public void def(); // abstract method
	/*
	 * public void def1(); 
	 * gives error since we can have only one abstract method in functional interface
	 */
	default void func()	//default keyword for defining a method in interface
	{
		System.out.println("in func");
	}
	default void met() // we can have multiple methods in interface
	{
		System.out.println("in met");
	}
}
class defMet1 implements Demo1
{
	public void def()
	{
		System.out.println("in def");
	}
}
public class FuncDefaultInterface {

	public static void main(String[] args) {

		Demo1 obj= new defMet1();
		obj.def();
		obj.met();
		obj.func();

	}

}
