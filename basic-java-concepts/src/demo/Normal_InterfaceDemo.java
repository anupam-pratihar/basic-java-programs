package demo;

/*
 * Types of interfaces:
*     > Normal Interface (which has more than one method)
*     > Single Abstract Method Interface (which has only one method)
*     > Marker Interface ( which does not have any method)
*     		Eg: An example of Marker interface will be java's inbuilt Serializable interface which 
*     			does not have any method.
*     			interface Serializable
*     			{
*     			
*     			}
* 
* 	Till 1.7, we used to have these three interfaces.
* 	Now with java 8, Single Abstract Method Interface is renamed as Functional Interface. It has
* 	only one method similarly. The advantage of knowing functional interface is that we can use 
* 	lambda expression, which is a concept of Scala language. In 1.8, java adapted scala and it has
* 	its functionalities present in java now.
*/
interface AP // Normal Interface 
{
	void name();
	void college();
	void company();
}

class candidate implements AP
{
	public void name()
	{
		System.out.println("Anupam Pratihar");
	}
	
	public void college() 
	{
		System.out.println("FIEM");
	}

	public void company()
	{
		System.out.println("NA");
	}

}

public class Normal_InterfaceDemo {

	public static void main(String[] args) {
		AP obj=new candidate();
		obj.name();
		obj.college();
		obj.company();

	}

}
