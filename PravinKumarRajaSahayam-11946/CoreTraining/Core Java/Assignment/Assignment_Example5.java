//5. Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.
import java.util.ArrayList;
import java.util.Scanner;

class School {
	ArrayList school = new ArrayList();
	ArrayList<String> teacher = new ArrayList<String>();
	ArrayList<String> students = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);
	int schoole;

	void school() {
		System.out.println("Welcome St.School");
		System.out.println(
				"---------------------------------------------------\nIf you want add the teacher press 1\nIf you want add the student press 2\nIf you want remove the teacher press 3\nIf you want remove the student press 4\nIf you want display the Teacher details press 5\nIf you want display the Students details press 6\n---------------------------------------------------------");
		System.out.println("Enter the number for access the source");
		schoole = sc.nextInt();

		if (schoole == 1) {
			System.out.println("Enter the Teacher Name : ");
			String teachers = sc.next();
			teacher.add(teachers);
		} else if (schoole == 2) {
			System.out.println("Enter the Student Name : ");
			String student = sc.next();
			students.add(student);
		} else if (schoole == 3) {
			System.out.println("Enter the Teacher Name would you want remove : ");
			String teachere = sc.next();
			teacher.remove(teachere);
			System.out.println(teacher);
		} else if (schoole == 4) {
			System.out.println("Enter the Student Name would you want remove : ");
			String studenta = sc.next();
			students.remove(studenta);
			System.out.println(students);
		} else if (schoole == 5) {
			System.out.println(teacher);
		} else if (schoole == 6) {
			System.out.println(students);
		}

	}

	void schoolr() {
		int schoolk = 0;
		while (schoolk == 0) {
			System.out.println("If you want repeat the process press 0 ");
			schoolk = sc.nextInt();

			if (schoolk == 0) {
				System.out.println("Enter the number for access the source");
				schoole = sc.nextInt();
			} else if (schoolk != 0) {
				System.out.println("Exist");
				break;
			}
			if (schoole == 1) {
				System.out.println("Enter the Teacher Name : ");
				String teachers = sc.next();
				teacher.add(teachers);
			} else if (schoole == 2) {
				System.out.println("Enter the Student Name : ");
				String student = sc.next();
				students.add(student);
			} else if (schoole == 3) {
				System.out.println("Enter the Teacher Name would you want remove : ");
				String teachere = sc.next();
				teacher.remove(teachere);
				System.out.println(teacher);
			} else if (schoole == 4) {
				System.out.println("Enter the Student Name would you want remove : ");
				String studenta = sc.next();
				students.remove(studenta);
				System.out.println(students);
			} else if (schoole == 5) {
				System.out.println(teacher);
			} else if (schoole == 6) {
				System.out.println(students);
			} 
		}
	}
}

public class Assignment_Example5 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		School schools = new School();
		schools.school();
		schools.schoolr();
	}

}
