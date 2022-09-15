package demo;

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
