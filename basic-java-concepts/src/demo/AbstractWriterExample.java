package demo;

abstract class Writer
{
	public abstract void write();
	
	public void skills()
	{
		System.out.println("Skills: Creative, Discipline, Communication, Adaptability");
	}
}

class pen extends Writer
{
	public void write()
	{
		System.out.println("Writes with a: pen");
	}
}

class pencil extends Writer
{
	public void write()
	{
		System.out.println("Writes with a: pencil");
	}
}

class digital extends Writer
{
	public void write()
	{
		System.out.println("Writes with a: keyboard");
	}
}

public class AbstractWriterExample {

	public static void main(String[] args) {
		
		Writer obj=new pen();
		Writer obj2=new pencil();
		Writer obj3=new digital();
		obj.write();
		obj2.write();
		obj3.write();
		obj.skills();
	}

}
