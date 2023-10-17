//Write a Java Programs to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmers. In each subclass, override the calculateSlary() method to calculate and return the salary based on their specific roles.
class Employee {
	String name;
	String role;

	Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public int calculateSalary() {
		return 0;
	}
}

class Manager extends Employee {
	int baseSalary;
	int bonus;

	Manager(String name, int baseSalary, int bonus) {
		super(name, "Manager");
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}

	public int calculateSalary() {
		return baseSalary + bonus;
	}
}

class Programmers extends Employee {
	int baseSalary;
	int overtimepay;

	Programmers(String name, int baseSalary, int overtimepay) {
		super(name, "Programmers");
		this.baseSalary = baseSalary;
		this.overtimepay = overtimepay;
	}

	public int calculateSalary() {
		return baseSalary + overtimepay;
	}
}

public class Inheritance_Example15 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Employee objs = new Manager("PravinKumarRajaSahayam", 10, 30);
		Employee obja = new Programmers("Surya", 40, 800);

		System.out.println(
				"Name : " + objs.getName() + "\nRole : " + objs.getRole() + "\nSalary : " + objs.calculateSalary());
		System.out.println(
				"Name : " + obja.getName() + "\nRole : " + obja.getRole() + "\nSalary : " + obja.calculateSalary());

	}

}
