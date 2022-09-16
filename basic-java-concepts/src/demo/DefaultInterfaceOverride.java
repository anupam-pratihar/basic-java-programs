package demo;

interface Demo2
{
	public void def(); 
	default void func()	
	{
		System.out.println("in func");
	}
}

class defMet2 implements Demo2
{
	public void def()
	{
		System.out.println("in def");
	}
	public void func() // class defMet2's func() overrides func() present in interface
	{
		System.out.println("func overridden");
	}
}
public class DefaultInterfaceOverride {

	public static void main(String[] args) {
		Demo2 obj= new defMet2();
		obj.def();
		obj.func();

	}

}
