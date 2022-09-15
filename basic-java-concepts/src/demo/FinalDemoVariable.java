package demo;
// we can use final keyword with variables, methods and class.
// here we are seeing an implementation of final keyword with a variable
class A5
{
final int i=9,j; //adding final keyword to a variable makes it a constant,i.e. its value wont change
final String DATE="08",s;
// apart from i, DATE we have two more variables which are not yet assigned,i.e., j and s.
/*A5()	// we cannot change the value of i now since i is declared as final now.
{
	i=10; // A.i cannot be re-declared with a different value
	DATE="We can change"; // A.DATE cannot be changed similarly
	}
}
*/
A5()
{
	j=99;
	s="09";
 /* similarly, these two cannot be assigned again because with final keyword in place 
  * they can be assigned a value only once.
	j=999;
    s="010";
    */
}
}
public class FinalDemoVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A5 obj=new A5();
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.DATE);
		System.out.println(obj.s);
	}

}
