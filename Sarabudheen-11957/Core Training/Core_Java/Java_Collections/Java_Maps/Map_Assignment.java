////CRUD Operations for Students Management System
package com.sara.CoreJava.Day_12;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

class Student {
	int studentId;
	String studentName;
//	String studentDepartment;
//	int stduentMark;
//	String studentGrade;

	Student(int studentId, String studentName, String studentDepartment, int stduentMark, String studentGrade) {
		this.studentId = studentId;
		this.studentName = studentName;
//		this.studentDepartment = studentDepartment;
//		this.stduentMark = stduentMark;
//		this.studentGrade = studentGrade;
	}

	void display() {
		System.out.println("Student ID is : " + studentId);
		System.out.println("Student Name is : " + studentName);
//		System.out.println("Student Department is : "+studentDepartment);
//		System.out.println("Student Mark is : "+stduentMark);
//		System.out.println("Student Grade is : "+studentGrade);
	}
}

public class Map_Assignment {

	public static void main(String[] args) {

		int studentId = 0;
		String studentName = "";
		String msg = "";
		int index = 0;
		boolean flag = false;

		// Creating TreeMap with {Key,Value} pair
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();

		do {
			System.out.println("--------------------------");
			System.out.println(
					" 1.Add Student \n 2.Find Student \n 3.Update Student \n 4.Delete Student \n 5.View Student \n 6.Exit");
			System.out.println("--------------------------");
			System.out.println("Enter your choice : ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			switch (choice) {
			// Case to Add Student Data
			case 1:
				System.out.println("Enter Student Id,Name : ");
				studentId = sc.nextInt();
				studentName = sc.next();

				map.put(studentId, studentName);
				System.out.println("Student Data Added");
				break;

			// Case to Find Student Data
			case 2:
				System.out.println("Enter your Stduent Id : ");
				studentId = sc.nextInt();

				Set<Integer> set = map.keySet();
				System.out.println(set);
				Iterator<Integer> it = set.iterator();
				while (it.hasNext()) {
					Integer key = it.next();
					System.out.println(key + " ==> " + map.get(key));
					System.out.println("Student is founded");
				}

				break;

			// Case to Delete Student Data
			case 4:
				System.out.println("Enter Student Id : ");
				studentId = sc.nextInt();
				flag = false;
				index = 0;

				Set<Integer> set2 = map.keySet();
				System.out.println(set2);
				Iterator<Integer> it2 = set2.iterator();
				while (it2.hasNext()) {
					Integer key = it2.next();
					if (studentId == studentId) {
						flag = true;
						map.remove(key);
					}
					System.out.println("Student Data deleted");
				}
				if (flag == false) {
					System.out.println("Stduent not found");
				}
				break;

			// Case to Exit
			case 6:
				System.exit(0);
				break;
			}

			System.out.println("Do you want to continue [Yes || No]");
			msg = sc.next();

		} while (msg.equalsIgnoreCase("Yes"));

	}

}
