package oops10;

class Person {
	void displayname() {
		System.out.println("Hephzibah");
	}
}

class Employee extends Person {
	void displaysalary() {
		System.out.println("50000");
	}
}

public class inheri2 {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.displayname();
		obj.displaysalary();

	}

}
