package demo;
//here we are seeing an implementation of final keyword with a class

/* this was a straightforward example of inheritance where one class inherits the methods 
 and variables of another class. This also shows how someone can wrongfully use someone else's 
 work without his/her consent. This is where final keyword come into effect.

class FDC1
{
	public void show()
	{
		System.out.println("in show");
	}
}
class FDC2 extends FDC1
{
	public void show1()
	{
		System.out.println("I can steal FDC1's show() without much complaint from him.");
	}
}
*/
final class FDC1 // hence final keyword turns FDC1 non inheriting class
{
	public void show()
	{
		System.out.println("in show of FDC1");
	}
}
// with final keyword in place we cannot extend class FDC1
class FDC2
{
	public void show()
	{
		System.out.println("in show of FDC2 --- I cannot steal FDC1's show() now.");
	}
}
public class FinalDemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FDC2 obj=new FDC2();
		obj.show();
		 
	}

}
