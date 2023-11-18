package com.sms.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

public class SMSMainClass {
	
	static Scanner sc=new Scanner(System.in);
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static int displayMenu() {
		System.out.println("1.Insert 2.Update 3.Delete 4.Find 5.View 6.Exit");
		System.out.println("Enter the choice");
		return sc.nextInt();
	}
	
	public static Student insertStudent() throws IOException {
		System.out.println("Enter the Student Id: ");
		int stdId=sc.nextInt();
		System.out.println("Enter the Student Name: ");
		String stdName=br.readLine();
		System.out.println("Enter the Student Department: ");
		String stdDept=br.readLine();
		System.out.println("Enter the Student Percentage: ");
		float stdPercentage=sc.nextFloat();
		
		return new Student(stdId,stdName,stdDept,stdPercentage);
	}
	
	public static Student updateStudent() throws IOException {
		System.out.println("Enter the Student Id: ");
		int stdId=sc.nextInt();
		System.out.println("Enter the Student Name: ");
		String stdName=br.readLine();
		System.out.println("Enter the Student Department: ");
		String stdDept=br.readLine();
		System.out.println("Enter the Student Percentage: ");
		float stdPercentage=sc.nextFloat();
		
		return new Student(stdId,stdName,stdDept,stdPercentage);
	}
	
	public static int deleteStudent() {
		System.out.println("Enter the Student Id: ");
		return sc.nextInt(); 
	}
	
	public static int findStudent() {
		System.out.println("Enter the Student Id: ");
		return sc.nextInt(); 
	}
	

	public static void main(String[] args) throws IOException {
		StudentDAO dao=new StudentDAO();
		do {
			switch(displayMenu()) {
			case 1:
				if(dao.insertStudent(insertStudent())==1)
				{
					System.out.println("Record is Inserted");
				} else {
					System.out.println("Record not Inserted");
				}
				break;
			case 2:
				if(dao.updateStudent(updateStudent())==1)
				{
					System.out.println("Record is Updated");
				} else {
					System.out.println("Record not Updated");
				}
				break;
			case 3:
				if(dao.deleteStudent(deleteStudent())==1)
				{
					System.out.println("Record deleted");
				} else {
					System.out.println("Record not deleted");
				}
				break;
			case 4:
				Student bean=dao.findStudent(findStudent());
				if(bean!=null) {
					bean.display();
				} 
				else {
					System.out.println("Student not found");
				}
				break;
			case 5:
				List<Student> list=dao.viewStudent();
				if(list.isEmpty()) {
					System.out.println("Student details are empty");
				} else {
					for(Student s:list) {
						s.display();
					}
				}
				break;
			case 6:
				System.exit(0);
				break;
			}
			
			System.out.println("Do you want to continue [yes] or [no]");
		}while(sc.next().equalsIgnoreCase("yes"));
		

	}

}
