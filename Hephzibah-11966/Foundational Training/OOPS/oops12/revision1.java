package oops12;
class Employee{
	int id;
	String name;
	float salary;
	

Employee(int id, String name, float salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
}
void setsalary(float salary) {
	this.salary=salary;
    System.out.println("change salary :" +salary);

}
	
void display() {
	System.out.println("employee id :" +id);
	System.out.println("employee name :" +name);
	System.out.println("employee salary :" +salary);
	}}

public class revision1 {

	public static void main(String[] args) {
		Employee obj=new Employee(10,"hephzi",100000.0f);
		obj.display();
		obj.setsalary(20000.0f);
	
}}
