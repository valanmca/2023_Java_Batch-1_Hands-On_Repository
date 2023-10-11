//Write a Java program for employees details.

//OOPS Variable , Method , Constructors

//Initiate class
class Employee {
	// Variables
	int eid; // Instance Variables or Objects
	String ename; // (inside the brackets of the Instance)
	float esalary;

	// Constructors
	Employee(int id, String name, float salary) // Class name is same as in Constructors
	{// Local Variables(inside the brackets)
		System.out.println("Inside Constructors : ");
		this.eid = id;
		this.ename = name;
		this.esalary = salary;
	}

//Instance Method
	// Method
	void display() {
		System.out.println("Employee id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
	}
}

public class Oops_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object creation and Calling the Constructors(Inside the brackets)
		Employee PravinKumar = new Employee(101, "PravinKumar", 2000.0f);
//Method Calling
		PravinKumar.display();

		Employee valan = new Employee(102, "Valan", 3000.0f);
		valan.display();

		Employee naveen = new Employee(103, "naveen", 5000.0f);
		naveen.display();

		Employee PravinKumar1 = new Employee(104, "PravinKumarRajaSahayam", 1000.0f);
		PravinKumar1.display();
	}

}
