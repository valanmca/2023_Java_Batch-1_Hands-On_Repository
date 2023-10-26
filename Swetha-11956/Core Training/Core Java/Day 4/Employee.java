package JavaOops4;
class employees{
	void calculateSalary() {
		System.out.println("Salary of employee");
	}
}
class Manager extends employees{
	void calculateSalary() {
		System.out.println("Salary of Manager is 50,000");
	} 
}
class Programmer extends employees{
	void calculateSalary() {
		System.out.println("Salary of Programmer is 80,000");
	}
	
}
public class Employee {

	public static void main(String[] args) {

		employees emp=new Manager();
		emp.calculateSalary();
		
		employees emp1=new Programmer();
		emp1.calculateSalary();
		
	}

}
