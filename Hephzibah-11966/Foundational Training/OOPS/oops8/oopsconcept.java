package oops8;

class student {
	String name;
	int rollno;
	int clss;
	char section;

	student(String name, int rollno, int clss, char section) {
		this.name = name;
		this.rollno = rollno;
		this.clss = clss;
		this.section = section;
	}

	void display() {
		System.out.println("Student name :" + name);
		System.out.println("Roll no :" + rollno);
		System.out.println("Class :" + clss);
		System.out.println("Section :" + section);
	}
}

public class oopsconcept {

	public static void main(String[] args) {
		student hephzibah = new student("hephzi", 101, 10, 'A');
		hephzibah.display();

		student swetha = new student("swetha", 102, 9, 'B');
		swetha.display();
	}
}
