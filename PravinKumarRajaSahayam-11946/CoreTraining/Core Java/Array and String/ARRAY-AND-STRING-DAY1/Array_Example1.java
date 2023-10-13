class Employee {
	int eid;
	String ename;
	float esalary;

	Employee(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	void display() {
		System.out.println("Employee Id is : " + " " + eid);
		System.out.println("Employee Name is : " + " " + ename);
		System.out.println("Employee Salary is : " + " " + esalary);
	}
}

public class Array_Example1 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Employee emp1 = new Employee(101, "'PravinKumar'", 1000.0f);
		Employee emp2 = new Employee(102, "'RajaSahayam'", 2000.0f);
		Employee emp3 = new Employee(103, "'Surya'", 3000.0f);
		Employee emp[] = new Employee[3];
		emp[0] = emp1;
		emp[1] = emp2;
		emp[2] = emp3;

		for (int i = 0; i < emp.length; i++) {
			emp[i].display();
		}
	}

}