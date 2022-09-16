package demo;
/* this is an classic example of abstract class and abstract method. 
 * 
*  continued from class kit, 
*  so instead of defining abstract write(), we can declare it. Now if class pen in future want to
*  extend to some other class suppose class pen extends writer1, abc. But java does not support 
*  multiple inheritance.
*  
*  So to achieve or solve the problem at hand, we can change the keyword abstract class writer1 
*  to interface writer1. So class pen extends writer1 also changes to class pen implements writer1.
*  Now if we have a class abc, we can easily define it as class pen extends abc implements writer1.
*  Hence we can extend one class and implement n number of interfaces.Given the choice, its better 
*  to create interfaces.
*  
*  Interface is similar to abstract class. The difference is, 
*  -> In abstract class, we can have abstract methods and we can even have normal methods.
*     But in interface we can have only the methods which are abstract. We cannot define a method.
*     So we cannot define any method in interface, we can only declare it.
*     By default every method is void <name_of_method> (), where public abstract is already assumed 
*     by the compiler.
*     
*  -> We cannot extend multiple classes but we can implement multiple interfaces.
*  -> Interfaces are by default public abstract.
*     
*     We can create the reference of interface, but we cannot create the object of it.
*/
interface writer1
{
	void write();
}
abstract class digital1
{
	abstract void write();
}
class pen1 extends digital1 implements writer1
{
	public void write()
	{
		System.out.println("in pen1");
	}
}
class pencil1 extends digital1 implements writer1
{
	public void write()
	{
		System.out.println("in pencil1");
	}
}
/*class kit   // suppose this is a class where we pass the object of pen,i.e. pen p 
 *  			 through another method doSomething(). And in it we pass write () which will refer 
 *  			 to the write() in pen, not pencil since we have passed object p of pen class. 
{
	void doSomething(pen p)
	{
		p.write();
	}
}
 *			 //  To call doSomething() we need to create object of class kit. Then in order to pass a 
 *  			 value through doSomething(p) we need to create an object of pen. It returns a value 
 *  			 but we get an error when we pass object of class pencil since we have not defined
 *  			 anything about it in class kit. 
 * 
 * 			//   So to remove this ambiguity we can create an abstract class with write() having no 
 * 				 body. The advantage is this will help us create a reference of super class and an 
 * 				 object of sub class. So now we can pass writer1 through doSomething and based on the 
 * 				 sub class(pen or pencil) object passed, we can call write() and it won't show an 
 * 				 error now.
 * 
 * 			//   Hence writer1 is the reference and pen or pencil sub class is the object 
 * 				 
 */
class kit
{
	void doSomething(writer1 p)
	{
		p.write();
	}
}
public class InterfaceDemo
{
	public static void main(String args[])
	{
		kit k= new kit();
		writer1 p=new pen1();
		writer1 pc=new pencil1();
		k.doSomething(p);
		k.doSomething(pc);
	}
}
