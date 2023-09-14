package oops8;
//Class name
class Employee{
	int eid;          //Instance variables
	String ename;
	float esalary;
	//Constructor //used to initialize the variable
	Employee(int eid, String name, float salary){    //local variables
		System.out.println("Inside constructor");
		this.eid =eid;                                   //this.eid = eid ( this used to seperate instance variable to local variable)
		ename = name;                              //if local and instance variable are same, then use this to identify it
		esalary =salary;
	}
	//Method
	void display() {
		System.out.println("Employee id: " +eid);
		System.out.println("Employee name: " +ename);
		System.out.println("Employee salary: " +esalary);	
	}	
}
public class ObjCls {

	public static void main(String[] args) {
		//Object Creation and Calling the Constructor
		Employee hephzi=new Employee(101,"hephzi", 100000);  //Inside the braket is the argument
		//Method Calling
		hephzi.display();
		
		Employee emi=new Employee(102, "emi", 50000);
		emi.display();

	}

}
