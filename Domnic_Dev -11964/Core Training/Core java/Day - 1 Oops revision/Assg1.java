package Core_Topic_Domnic_Day_1;

import java.util.ArrayList;
import java.util.Scanner;
class Student{
	String name;
	String grade;
	ArrayList<String> list = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);

	void Add_Student() {

		System.out.println("Enter student Name : ");
		name = sc.next();
		System.out.println("Enter student Grade : ");
		grade = sc.next();

	}

	void Add_Course() {
		System.out.println("Enter the number of Courses : ");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" Courses : ");

		for (int i = 0; i <n; i++) {
			list.add(sc.next());
		}
	}

	void Remove_Course() {

		System.out.println("Enter student Course : ");
		list.remove(sc.next());

	}

	void display() {
		System.out.println("Name of the student :" + name);
		System.out.println("Grade of the student :" + grade);
		System.out.println("Course of the student :" + list);

	}
}
public class Assg1 {
	

	public static void main(String[] args) {
		Student obj = new Student();
		obj.Add_Student();
		obj.Add_Course();
		obj.display();
		System.out.println();
		obj.Remove_Course();
		obj.display();
	}

}
