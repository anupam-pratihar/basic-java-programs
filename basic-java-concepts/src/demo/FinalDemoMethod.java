package demo;
//here we are seeing an implementation of final keyword with a method

/* this was a straightforward example of inheritance where one class inherits the methods 
and variables of another class. This also shows how someone can wrongfully use someone else's 
work without his/her consent. This is where final keyword come into effect.

In this FDC1 can override contents of show() from FDC2 during object creation.
In order to stop this we need to make method show() from class FDC1 final.
*/
class FDC3
{
	public final void show()
	{
		System.out.println("in show");
	}
}
// since we have final void show(), FDC2 cannot override it.
// hence we need to rename show() in class FDC2
class FDC4 extends FDC3
{
	/*public void show()
	{
		System.out.println("I can steal FDC1's show() without much complaint from him.-ha haha hahaha ");
	}
	*/
	public void show1()
	{
		System.out.println("in show of FDC2 --- I cannot steal FDC1's show() now. ");
	}
}
public class FinalDemoMethod {

	public static void main(String[] args) {
		
		FDC4 obj=new FDC4();
		obj.show1();
	}

}
