package com.sms.main;

import java.util.List;
import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

public class StudentMainClass {
	static Scanner sc=new Scanner (System.in);
	
	public static int displayMenu() {
		System.out.println("1.Insert , 2. Delete , 3.Find , 4.Update  , 5.Find All , 6. Exit");
		System.out.println("Enter your choice");
		return sc.nextInt();
	}
	
	public static Student insertStudent() {
		System.out.println("Enter Student rno, student name ,student dept");
		Student stud=new Student(sc.nextInt(),sc.next(),sc.next());
		return stud;
	}
	
	public static int deleteStudent() {
		System.out.println("Enter the rno to delete the student");
		return (sc.nextInt());
	}
	
	public static int findStudent() {
		System.out.println("Enter the rno to find the student");
		return (sc.nextInt());
	}
	public static Student updateStudent() {
		System.out.println("Enter student rno ,name, dept to update");
		return new Student(sc.nextInt(),sc.next(),sc.next());
	}
	
	

	public static void main(String[] args) {

		StudentDAO dao=new StudentDAO();
		String msg="";
		do {
		switch(displayMenu()) {
		
		case 1:
			if(dao.InsertStudent(insertStudent())==1) {
				System.out.println("Record inserted");
			}
			else {
				System.out.println("Record not inserted");
			}
			break;
		case 2:
			
			if(dao.DeleteStudent(deleteStudent())==1){
				System.out.println("Record deleted");
			}
			else {
				System.out.println("Record not deleted");
			}
			break;
			
		case 3:
			int rollno=findStudent();
			
			Student bean=dao.findStudent(rollno);
			if(bean!=null) {
				bean.display();
			}
			else {
				System.out.println("Record not found");
			}
			break;
			
		case 4:
			if(dao.UpdateStudent(updateStudent())==1) {
				System.out.println("Record updated");
			}
			else {
				System.out.println("Record not found");
			}
		case 5:
			List <Student> list=dao.findAllStudent();
			
			for(Student s: list) {
				s.display();
			break;
			}
			
			
		}
		System.out.println("Do you want to continue [yes|No ]");
		msg=sc.next();
	}while(msg.equals("yes"));
	}

}
