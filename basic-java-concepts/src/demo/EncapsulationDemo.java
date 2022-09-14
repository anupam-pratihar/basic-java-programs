package demo;
class Student{
    private int roll_no;
    private String name;
    // Getters and Setters
    // to get the values and to set the values

    // Setter
    public void setRoll_no(int r)
    {
        this.roll_no = r;
    }

    // Getter
    public int getRoll_no()
    {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		 Student s1 = new Student();

	        // s1.roll_no = 2;
	        // s1.name = "Anupam";
	        // above we are trying to access those from the main method
	        // and that is not right - it should be through methods
	        // normally those methods called as Getters and Setters

	        // so let's do this using methods
	        s1.setRoll_no(2);
	        int roll_no = s1.getRoll_no();
	        System.out.println(roll_no);

	        // so only way to access variables is through methods
	        // since we access those through methods we need to make those variables private
	        // whenever you private variables you are binding those with methods
	        // this binding your data with methods concept called as encapsulation

	        s1.setName("Anupam");
	        System.out.println(s1.getName());

	        // if you are using getters and setters to change variables you can maintain a log file about those,
	        // so it is always better to access your variables using setter and getter methods
	    }
	}
