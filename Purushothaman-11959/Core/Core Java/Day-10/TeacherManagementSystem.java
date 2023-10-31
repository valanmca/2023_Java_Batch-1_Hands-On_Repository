package com.purushoth.day_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

class Teacher{
	int teacherId;
	String teacherName;
	String teacherSubject;
	float teacherSalary;
	Teacher(int teacherId,String teacherName,String teacherSubject,float teacherSalary){
		this.teacherId=teacherId;
		this.teacherName=teacherName;
		this.teacherSubject=teacherSubject;
		this.teacherSalary=teacherSalary;
	}
		
	void display() {
		System.out.println("Teacher Id: "+teacherId);
		System.out.println("Teacher Name: "+teacherName);
		System.out.println("Teacher Subject: "+teacherSubject);
		System.out.println("Teacher Salary: "+teacherSalary);
	}
}

public class TeacherManagementSystem {

	public static void main(String[] args) throws IOException {
		int teacherId=0;
		String teacherName="";
		String teacherSubject="";
		float teacherSalary=0.0f;
		int index=0;
		int count=0;
		String msg="";
		
		LinkedList<Teacher> list=new LinkedList<Teacher>();
		Scanner sc=new Scanner(System.in);
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		do {
		System.out.println("1.Add new teacher \n2.Update teacher details \n3.Find teacher "
				+ "\n4.Delete teacher details \n5.View teacher details \n6.Exit");
		System.out.println("Enter your choice: ");
		int c=sc.nextInt();
		
		switch(c) {
		case 1:
			System.out.println("Enter the teacher Id: ");
			teacherId=sc.nextInt();
			System.out.println("Enter the teacher Name: ");
			teacherName=in.readLine();
			System.out.println("Enter the teacher Subject: ");
			teacherSubject=in.readLine();
			System.out.println("Enter the teacher salary: ");
			teacherSalary=sc.nextFloat();
			Teacher teacher=new Teacher(teacherId,teacherName,teacherSubject,teacherSalary);
			list.add(teacher);
			System.out.println("Teacher details are added");
			break;
		
		case 2:
			System.out.println("Enter the teacher Id: ");
			teacherId=sc.nextInt();
			System.out.println("Enter the teacher Name: ");
			teacherName=in.readLine();
			System.out.println("Enter the teacher Subject: ");
			teacherSubject=in.readLine();
			System.out.println("Enter the teacher salary: ");
			teacherSalary=sc.nextFloat();
			index=0;
			count=0;
			Teacher temp=new Teacher(teacherId,teacherName,teacherSubject,teacherSalary);
			for(Teacher a:list) {
				if(a.teacherId==teacherId) {
					list.set(index, temp);
					count++;
					index++;
					System.out.println("Teacher details are added");
					break;
				}
			}if(count==0) {
				System.out.println("Teacher details not found");
			}
			break;
		case 3:
			System.out.println("Enter the teacher id: ");
			teacherId=sc.nextInt();
			for(Teacher a:list) {
				if(a.teacherId==teacherId) {
				index++;
				count++;
				a.display();
				}
			}
			break;
		case 4:
			System.out.println("Enter the teacher Id: ");
			teacherId=sc.nextInt();
			for(Teacher a:list) {
				if(a.teacherId==teacherId) {
					list.remove(index);
					index++;
					count++;
					System.out.println("Teacher details deleted");
				}
			}if(count==0) {
				System.out.println("Teacher details not found");
			}
			break;
			
		case 5:
			if(list.isEmpty()) {
				System.out.println("Teacher details is empty");
			}else {
				for(Teacher a:list) {
					a.display();
				}
			}
			break;
			
		case 6:
			System.exit(0);
			break;
			
		default:
			System.out.println("Please give only for 1-6");
			break;
			
		}
		System.out.println("Do you want continue [yes] or[no]");
		msg=sc.next();
		}while(msg.equalsIgnoreCase("yes"));
		
		
	}

}
