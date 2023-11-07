package com.sms.main;

import java.util.List;
import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;



public class SMSMainClass {
	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println("1. Insert 2. Delete 3. Update 4. Find 5. Find All 6. Exit");
		System.out.println("Enter your choice : ");
		// int choice = sc.nextInt();
		return sc.nextInt();
	}

	public static Student insertStudent() {
		System.out.println("Enter employee id, name, depart :");
		return new Student(sc.nextInt(), sc.next(), sc.nextInt());

	}

	public static int deleteStudent() {
		System.out.println("Enter Student id to delete :");
		return sc.nextInt();

	}

	public static Student updateStudent() {
		System.out.println("Enter Student id, name, depart :");
		return new Student(sc.nextInt(), sc.next(), sc.nextInt());

	}

	public static int findStudent() {
		System.out.println("Enter Student id to Find:");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		String msg = "";
		do {
			// int choice = displayMenu();
			switch (displayMenu()) {
			case 1:
				if (dao.insertEmployee(insertStudent()) == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;

			case 2:
				int id = deleteStudent();
				int n = dao.deleteStudent(id);
				if (n == 1) {
					System.out.println("Record Deleted");
				} else {
					System.out.println("Record Not Deleted");
				}
				break;

			case 3:
				Student emp = updateStudent();
				int n1 = dao.updateStudent(emp);
				if (n1 == 1) {
					System.out.println("Record Updated");
				} else {
					System.out.println("Record Not Updated");
				}
				break;

			case 4:
				int id1 = findStudent();
				Student emp2 = dao.findStudent(id1);
				if (emp2 == null)
					System.out.println("Record Not Found");
				else
					emp2.display();

				break;
			case 5:
				List<Student> list = dao.findAllStudent();
				for(Student e : list)
					e.display();
				break;
			}
			System.out.println("Do you want to continue [Yes | No] :");
			msg = sc.next();
		} while (msg.equals("Yes"));

		
	}

}
