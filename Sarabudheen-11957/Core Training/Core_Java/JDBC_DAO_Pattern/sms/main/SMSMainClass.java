package com.sms.main;

import java.util.List;
import java.util.Scanner;
import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

public class SMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println(" 1.Insert \n 2.Delete \n 3.Update \n 4.Find \n 5.FindAll \n 6.Exit ");
		System.out.println("Enter Your Choice : ");
		return sc.nextInt();
	}

	public static Student insertStudent() {
		System.out.println("Enter Studnet ID and Student Name : ");
		return new Student(sc.nextInt(), sc.next());
	}

	public static int deleteStudent() {
		System.out.println("Enter the Student ID : ");
		return sc.nextInt();
	}

	public static Student updateStudent() {
		System.out.println("Enter the Student ID and Student Name : ");
		return new Student(sc.nextInt(), sc.next());
	}

	public static int findStudent() {
		System.out.println("Enter the Student ID : ");
		return sc.nextInt();
	}

	public static void findAllStudent() {

	}

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		String msg = "";

		do {

			switch (displayMenu()) {

			case 1:
//				Student stu = insertStduent();
//				int n = dao.insertStudent(stu);
				if (dao.insertStudent(insertStudent()) == 1) {
					System.out.println("Record Inserted");
				} else {
					System.out.println("Record Not Inserted");
				}
				break;

			case 2:

				if (dao.deleteStudent(deleteStudent()) == 1) {
					System.out.println("Record Deleted");
				} else {
					System.out.println("Record not found");
				}
				break;

			case 3:
				if (dao.updateStudent(updateStudent()) == 1) {
					System.out.println("Record Updated");
				} else {
					System.out.println("Record Not Updated");
				}
				break;

			case 4:

				int id = findStudent();
				Student bean = dao.findStudent(id);
				if (bean != null) {
					bean.displayStudent();
				} else {
					System.out.println("Record Not Found");
				}
				break;

			case 5:
				List<Student> list = dao.findAllStudent();
				for (Student e : list)
					e.displayStudent();
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.err.println("Enter Valid Choice !!!");
				System.exit(0);
				break;
			}

			System.out.println("Do you want to continue [Yes || No ] : ");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
