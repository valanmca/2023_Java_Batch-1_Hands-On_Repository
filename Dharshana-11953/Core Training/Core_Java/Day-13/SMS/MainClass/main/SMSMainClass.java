package com.sms.main;

import java.util.List;
import java.util.Scanner;


import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

public class SMSMainClass {
	
	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println("1. Insert 2. Delete 3. Update 4. Find 5. Find All 6.Exit");
		System.out.println("Enter Your Choice:");
		int choice = sc.nextInt(); //
		return choice; // return sc.nextInt(); (combination of the above line)
	}
	
	public static Student insertStudent() {
		System.out.println("Enter Student id , name, department : ");
		// we want to import the Employee class manually because it is present in
		// different package.
		// Employee emp=new Employee(sc.nextInt(),sc.next(),sc.nextInt());
		return new Student(sc.nextInt(), sc.next(), sc.next());
	}
	
	public static int deleteStudent() {
		System.out.println("Enter Student id to delete:");
		return sc.nextInt();
	}
	
	public static Student updateStudent() {
		System.out.println("Enter Student id , name, department : ");
		// we want to import the Employee class manually because it is present in
		// different package.
		// Employee emp=new Employee(sc.nextInt(),sc.next(),sc.nextInt());
		return new Student(sc.nextInt(), sc.next(), sc.next());
	}
	
	public static int findStudent() {
		System.out.println("Enter Student id to Find:");
		return sc.nextInt();
	}


	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		String msg = "";
		do {

			switch (displayMenu()) { // passing the method into the switch case insteadof the variable
			case 1:
				Student stud = insertStudent();
				int n = dao.insertStudent(stud);
				if (n == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;
			case 2:
				int id = deleteStudent();
				int n1 = dao.deleteStudent(id);
				if (n1 == 1)
					System.out.println("Record Deleted");
				else
					System.out.println("Record Not Deleted");
				break;
			case 3:
				Student stud2=updateStudent();
				int n2=dao.updateStudent(stud2);
				
				if (n2 == 1)
					System.out.println("Record Updated");
				else
					System.out.println("Record Not Updated");
				break;
			case 4:
				int id1 = findStudent();
				Student stud3 = dao.findStudent(id1);
				if(stud3 == null)
					System.out.println("Record Not Found");
				else
					stud3.display();
				
				break;
			case 5: 
				List<Student>list=dao.findAllStudent();
				for(Student e : list)
					e.display();
				break;
			}

			System.out.println("Do You Want to Continue [Yes | No]:");
			msg = sc.next();
		} while (msg.equals("Yes"));


	}

}
