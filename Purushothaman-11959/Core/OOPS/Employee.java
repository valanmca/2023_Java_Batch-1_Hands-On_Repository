package revision.oops;

public class Employee {
	int emp_Id;
    String emp_Name;
    float emp_Salary;
    
Employee (int emp_Id,String emp_Name,float emp_Salary){
	this.emp_Id=emp_Id;
	this.emp_Name=emp_Name;
	this.emp_Salary=emp_Salary;
}

void display() {
	System.out.println("Id of the employee:"+emp_Id);
	System.out.println("Name of the employee:"+emp_Name);
	System.out.println("Salary of the employee:"+emp_Salary);
	System.out.println(" ");
}
	
	
	public static void main(String[] args) {
		Employee Dom=new Employee(102,"Domnic",32000.0f);
		Employee Magesh=new Employee(103,"Magesh",20000.0f);
		Employee shiva=new Employee(105,"Sankarasathasivam",23000.0f);
		Dom.display();
		Magesh.display();
		shiva.display();

	}

}
