package oops10;

class Person1 {
	void displayname() {
		System.out.println("Hephzibah");
	}
}

class Employee1 extends Person1 {
	void displaysalary() {
		System.out.println("50000");
	}
}

class student extends Person1{
	void displayrollno() {
		System.out.println(11966);
	}
}

public class inheri3 {

	public static void main(String[] args) {
		Employee1 obj = new Employee1();
		obj.displayname();
		obj.displaysalary();
		
		student obj1=new student();
		obj1.displayrollno();
		obj1.displayname();


	}

}

