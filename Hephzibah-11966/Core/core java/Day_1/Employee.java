package oops_1;

public class Employee {
	int eid;
	String ename;
	float esalary;
	
	Employee(int eid, String ename, float esalary){
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	
	void display() {
		System.out.println("Employee id:" +eid);
		System.out.println("Employee Name:" +ename);
		System.out.println("Employee Salary:" +esalary);
	}

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"hephzi",200000.0f);
//		emp1.display();
		
		Employee emp2=new Employee(102,"emi",150000.0f);
//		emp2.display();
		
		Employee emp[]=new Employee[2];
		emp[0]=emp1;
		emp[1]=emp2;
		
		for(int i=0;i<emp.length;i++) {
			emp[i].display();	
		}
		

	}

}
