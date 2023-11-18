package com.ems.main;

import java.util.List;
import java.util.Scanner;
import com.ems.bean.*;
import com.ems.dao.StudentDAO;

public class EMSMainClass {

	static Scanner sc = new Scanner(System.in);

	public static int displayMenu() {
		System.out.println("1.Insert\n 2.Delete\n 3.Update\n 4.Find\n 5.Find All\n 6.Exit");
		System.out.println("Enter your choice");

		return sc.nextInt();

	}

	public static Student insertStudent() {
		System.out.println("Enter Student id,Name and Sec");
		return new Student(sc.nextInt(), sc.next(), sc.next());
	}

	public static int deleteStudent() {
		System.out.println("Enter the ID to be deleted");
		return sc.nextInt();
	}
	public static Student updateStudent() {
		System.out.println("Enter Student id,Name and Sec");
		return new Student(sc.nextInt(), sc.next(), sc.next());
	}
	public static int findStudent() {
		System.out.println("Enter the Id");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		String msg = "";

		do {
			int choice = displayMenu();
			switch (choice) {

			case 1:
//				Student std=insertStudent();
//				int n=dao.insertStudent(std);

				if (dao.insertStudent(insertStudent()) == 1)
					System.out.println("Record Inserted");
				else
					System.out.println("Record Not Inserted");
				break;

			case 2:
//				int std_id = deleteStudent();
//				int n = dao.deleteStudent(std_id);
				if (dao.deleteStudent(deleteStudent()) == 1)
					System.out.println("Record Deleted");
				else
					System.out.println("Record not deleted");
				break;
				
			case 3:
				Student std=updateStudent();
				int n1=dao.updateStudent(std);
				
				if(dao.deleteStudent(deleteStudent())==1)
					System.out.println("Record Updated");
				else
					System.out.println("Record not updated");

				break;
				
			case 4:
                int id=findStudent();
                Student bean=dao.findStudent(id);
                if(bean !=null) {
                	bean.display();
                }
                else {
                	System.out.println("Record Not Found");
                }
                
				break;
				
			case 5:
				List<Student> list=dao.findAllStudents();
				for(Student e:list)
					e.display();
				break;
				

			}

			System.out.println("Do you want to contiue [y | n]:");
			msg = sc.next();
		} while (msg.equals("y"));

	}

}
