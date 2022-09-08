package demo;
//Error in output.

class DOJ
{	
	static String s="";
	public DOJ()
	{
		s="Complete Training to get DOJ.";
		System.out.println(s);
	}
	public DOJ(int appID)
	{
		if(appID>1274 && appID<1369)
			s="Your DOJ is scheduled for October-November.";
		
		System.out.println("Applicant ID:"+appID);
		System.out.println(s);
	}
	public DOJ(int appID,String s1) 
	{
		if(appID>989 && appID<1273)
		{
			if(s1=="I&D")
			{
				s="Your DOJ is scheduled for November-December.";
			}
		}
		
		System.out.println("Applicant ID:"+appID);
		System.out.println(s);
	}
	public DOJ(int appID,String s1,String s2)
	{
		if(appID>1370 && appID<1498)
		{
			if(s1=="I&D")
			{
				if(s2=="Hyderabad")
				{
					s="Your DOJ is scheduled for December.";
				}
			}
		}
		
		System.out.println("Applicant ID:"+appID);
		System.out.println(s);
	}
	
}
public class ConstructorOverloadingDemo {
	public static void main(String args[])
	{
		DOJ emp=new DOJ();
		System.out.println(emp);
		DOJ emp1=new DOJ(1301);
		System.out.println(emp1);
		DOJ emp2=new DOJ(1056,"I&D");
		System.out.println(emp2);
		DOJ emp3=new DOJ(1487,"I&D","Hyderabad ");
		System.out.println(emp3);
	}
}
