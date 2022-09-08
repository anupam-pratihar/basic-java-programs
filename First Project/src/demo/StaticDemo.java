package demo;
class emp
{
	int salary, empID=0;
	static String company="Stefanini";
	void show()
	{
		System.out.println(empID+" | "+salary+" | "+company);
	}
}
public class StaticDemo {
	public static void main(String args[])
	{
		System.out.println("Employee Details:");
		System.out.println("empID  | salary| company");
		emp Navin=new emp();
		Navin.empID=145623;
		Navin.salary=29490;
		Navin.show();
		emp Raj =new emp();
		Raj.empID=696690;
		Raj.salary=25780;
		Raj.show();
		
	}
}
