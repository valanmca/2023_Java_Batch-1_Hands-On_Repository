package com.jenish.day10;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
	int stud_id;
	String stud_name;
	int m1, m2, m3;
	int total;
	float avg;
	
	Student(int stud_id, String stud_name, int m1, int m2, int m3, int total,float avg) {
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.total = total;
		this.avg = avg;
	}
	void calc() {
		total = m1 + m2 + m3;
		avg = total / 3;
	}
	void display() {
		System.out.println("Student id :" + stud_id);
		System.out.println("Student Name :" + stud_name);
		System.out.println("Mark1: " +m1);
		System.out.println("Mark2: " +m2);
		System.out.println("Mark3: " +m3);
		System.out.println("Total Marks:" + total);
		System.out.println(" Total Average: " +avg);
		System.out.println("---------------------------------");
	}
}

public class LabEx_01_Student {

	public static void main(String[] args) {
		int stud_id = 0;
		String stud_name = "";
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		int total = 0;
		float avg = 0;
		boolean flag = false;
		int index = 0;
		LinkedList<Student> list = new LinkedList<Student>();
		Scanner sc = new Scanner(System.in);
		String msg = "";
		
		do {
			System.out.println("1. Add Student details/marks 2. Find Student details/marks 3. Update Student details/marks 4. Delete Student details/marks 5. View all Student details/marks 6. Exit");
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter Student Id, Name, Mark1, Mark2, Mark3, Total, Average" );
				stud_id = sc.nextInt();
				stud_name = sc.next();
				m1 = sc.nextInt();
				m2 = sc.nextInt();
				m3 = sc.nextInt();
				Student stud = new Student(stud_id, stud_name, m1, m2, m3, total, avg);
				list.add(stud);
				System.out.println("Student details/marks are added");
				break;
				
			case 2:
				System.out.println("Enter the Student ID to find");
				stud_id = sc.nextInt();
				flag = false;
				for (Student s : list) {
					if (s.stud_id == stud_id) {
						flag = true;
						s.display();
						break;
					}
				}
				if (flag == false)
					System.out.println("Student Not Found");
				break;
			case 3:
				System.out.println("Enter Student Id, Name");
				stud_id = sc.nextInt();
				stud_name = sc.next();
				Student temp = new Student(stud_id, stud_name, m1, m2, m3, total, avg);
				index = 0;
				for (Student s : list) {
					if (s.stud_id == stud_id) {
						list.set(index, temp);
						System.out.println("Student details/marks are Updated");
						break;
					}
					index++;
				}
				if (flag == false)
					System.out.println("Record not Found");
				break;
			case 4:
				System.out.println("Enter the Student ID to Delete");
				stud_id = sc.nextInt();
				flag = false;
				index = 0;
				for (Student s : list) {
					if (s.stud_id == stud_id) {
						flag = true;
						list.remove(index);
						System.out.println("Student details/marks are Removed");
						break;
					}
					index++;
				}
				if (flag == false)
					System.out.println("Student Not Found");
				break;
			case 5:
				for (Student s : list) {
					s.calc();
					s.display();
				}
				break;
			case 6:
				System.exit(0);
				break;
			}
			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();
		}while (msg.equalsIgnoreCase("yes"));
		
		

	}

}
