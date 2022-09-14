package demo;
// int, float, double
//for normal applications we can use primitives ( this is faster than Wrapper classes )
//for applications which doesn't support primitives we have to use wrapper classes 
public class WrapperDemo {
	
	public void Wrap()
	{
		int i=9; //primitive datatype
		
		/* concept of int comes from C programming, hence it is stored in a primitive data format
		 * in java, this s not acceptible since in OOPs concept everything is treated as an object or 
		 * should be stored or accessed with the help of objects.
		 *
		 * instead of using int which will treat i as a variable, we should write
		 * Integer which is a class, hence it will be treated as an object. 
		 */
		
		Integer ii = new Integer(9); // this is known as wrapper class
		int j= ii.intValue();
		/* this is not a primitive variable, it is a reference since we have a class on the left.
		 * 9 in i is primitive variable, but 9 stored in object ii is a reference variable.
		*/	
		System.out.println("Primitive int data: "+i);
		System.out.println("Wrapper class int data: "+j);
	}
	
	public void BoxUnbox()
	{
		int primitive_i = 5;    // Primitive Datatype
        Integer object_i = new Integer(5);  // this integer called as the wrapper class
        // the deference is first primitive_i is a primitive variable and the object_i is a reference variable

        Float object_f = new Float(5.05);

        // if you're passing a primitive value to the wrapper class this concept is called as Boxing/Wrapping
        Integer object_ii = new Integer(primitive_i);// putting a value inside the object is called as boxing/wrapping

        // to get the value
        System.out.println(object_i.intValue());
        System.out.println(object_f.floatValue());

        // you can assign it to a new variable too
        int new_variable = object_ii.intValue(); // taking a value from the object is called as unboxing/unwrapping
        System.out.println(new_variable);
	}
	
	public void Auto()
	{
        // let's create a new integer object
        // we can directly use like below
        // in the background java will do this part " new Integer(i3); "
		int i3=20;
        Integer value = i3 ;        // AutoBoxing or AutoWrapping
        int new_value = value; // Auto Unboxing or Auto Unwrapping
        // you don't need to use the object_name.intValue();
        System.out.println(new_value);
	}
	public void StrToInt()
	{
        String str = new String("20201");
        // if you want the integer value of str
        int number = Integer.parseInt(str);
        System.out.println(number);
	}
	public static void main(String[] args) 
	{
		WrapperDemo obj=new WrapperDemo();
		obj.Wrap();
		obj.BoxUnbox();
		obj.Auto();
		obj.StrToInt();
		
	}

}
