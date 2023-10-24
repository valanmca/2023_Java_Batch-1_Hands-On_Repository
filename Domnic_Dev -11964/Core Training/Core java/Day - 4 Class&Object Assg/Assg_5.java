package Core_Topic_Domnic_Day_4;

import java.util.Scanner;
import java.util.ArrayList;

class Student {
	Scanner sc = new Scanner(System.in);
	ArrayList<String> students = new ArrayList<String>();
	ArrayList<String> teachers = new ArrayList<String>();
	ArrayList<String> standard = new ArrayList<String>();

	void addstudents() {
		System.out.println("Enter the student name :");
		students.add(sc.next());
	}

	void addteachers() {
		System.out.println("Enter the teacher name :");
		teachers.add(sc.next());
	}

	void createclass() {
		addstudents();
		addteachers();
		System.out.println("Enter the class");
		standard.add(sc.next());
	}

	void removestudents() {
		System.out.println("Enter the student name :");
		students.remove(sc.next());
	}

	void removeteachers() {
		System.out.println("Enter the teacher name :");
		teachers.remove(sc.next());
	}

	void removeclass() {

		System.out.println("Enter the class");
		standard.remove(sc.next());
	}

	void display() {
		System.out.println("Students:" + students);
		System.out.println("Teacher:" + teachers);
		System.out.println("Class:" + standard);

	}
}

public class Assg_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student obj1 = new Student();
		System.out.println("Select 1");
		int input = sc.nextInt();

		do {
			System.out.println("1.Create Details\n2.Delete Details\n3.View Details");
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println("1.Create Class\n2.View Details");

				int inp = sc.nextInt();

				if (inp == 1) {
					obj1.createclass();
				}

				if (inp == 2) {
					obj1.display();
				}
			} 
			if(num==2)  {
				System.out.println("1.Delete Student\n2.Delete Teacher\n3.Delete Class");
				int inpu = sc.nextInt();

				if (inpu == 1) {
					obj1.removestudents();
				}

				if (inpu == 2) {
					obj1.removeteachers();
				}
				if (inpu == 3) {
					obj1.removeclass();
				}
			}
			if(num==3) {
				obj1.display();
			}
		}

		while (input == 1);

	}

}
