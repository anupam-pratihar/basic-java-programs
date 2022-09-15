package demo;

// abstract in a class and abstract in a method
// when we dont want to modify or update details to a method currently but want it to exist 
// independently on the current scope.
// if we call a class abstract we cannot create an object of it.

abstract class Human  // it is compulsory to call the class abstract if we have an abstract method.
{
	public abstract void eat(); // They can be declared simply without defining them.
	
	public void walk()
	{
		System.out.println("abstract walk");
	}
}

// It's not compulsory to have an abstract method to create an abstract class but we need the 
// abstract class if we have an abstract method.

class Man extends Human // when a class extends an abstract class, we need to implement the 
						// abstract method
					   //  Man class is known as Concrete class and Human class is abstract class
{
	public void eat()
	{
		System.out.println("man eating");
	}
}

// Why we need abstract class?
// * We dont want to create an object of abstract class
// * Instead of wasting 2-3 methods performing the same thing but with little changes, 
//   we can use only one method which accepts all the sub class objects.

public class AbstractDemo {
	
	public static void main(String[] args) {
		// Human obj=new Human();
		// We cannot instantiate the abstract class
		Human obj=new Man(); 
	 // reference   object
		obj.eat();
		obj.walk();
	}

}
