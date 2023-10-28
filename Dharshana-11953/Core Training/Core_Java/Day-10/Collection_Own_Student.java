package com.dharshu.day10;

import java.util.LinkedList;
import java.util.Scanner;

class Student{
	int stud_id;
	String stud_name;
	int m1,m2,m3;
	int total;
	float avg;
	
	Student(int stud_id,String stud_name, int m1,int m2,int m3, int total,float avg){
		this.stud_id=stud_id;
		this.stud_name=stud_name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.total=total;
		this.avg=avg;
	}
	
	
	void cal() {
		total=m1+m2+m3;
		avg=total/3;
	}
	
	void display() {
		System.out.println("Student Id:" +stud_id);
		System.out.println("Student Name:" +stud_name);
		System.out.println("Mark1:" +m1);
		System.out.println("Mark2:" +m2);
		System.out.println("Mark3:" +m3);
		System.out.println("Total:" +total);
		System.out.println("Average:" +avg);
		System.out.println("---------------------------");
	}
	
}

public class Collection_Own_Student {

	public static void main(String[] args) {
		int stud_id=0;
		String stud_name="";
		int m1=0,m2=0,m3=0;
		int total=0;
		int avg=0;
		boolean flag=false;
		int index=0;
		LinkedList<Student> list=new LinkedList<Student>();
		Scanner sc= new Scanner(System.in);
		
		String msg="";
		
		do {
			System.out.println("1.Add Student 2.Find Student 3.Update Student 4.Delete Student 5.View Student Details 6.Exit");
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Student id,name,mark1,mark2,mark3,total,avg");
				stud_id=sc.nextInt();
				stud_name=sc.next();
				m1=sc.nextInt();
				m2=sc.nextInt();
				m3=sc.nextInt();
				
				Student stud=new Student(stud_id,stud_name,m1,m2,m3,total,avg);
				list.add(stud);
				
				System.out.println("Student Details are Added");
				break;
			case 2:
				System.out.println("Enter Student Id to Find");
				stud_id=sc.nextInt();
				flag= false;
				for(Student s:list) {
					if(s.stud_id == stud_id) {
						flag = true;
						s.display();
						break;
					}
				}
				if(flag == false) {
					System.out.println("Student Not Found");
				}
				break;
			case 3:
				System.out.println("Enter Student id,name");
				stud_id=sc.nextInt();
				stud_name=sc.next();
				Student temp=new Student(stud_id,stud_name,m1,m2,m3,total,avg);
				index=0;
				flag=false;
				for(Student s:list) {
					if(s.stud_id == stud_id) {
						flag=true;
						list.set(index, temp);
						System.out.println("Student Details are Updated");
						break;
					}
					index++;
				}
				if(flag == false) {
					System.out.println("Record Not Found");
				}
				break;
			case 4:
				System.out.println("Enter Student Id to Delete");
				stud_id=sc.nextInt();
				flag = false;
			    index=0;
				for(Student s:list) {
					if(s.stud_id == stud_id) {
						flag = true;
						//Remove
						list.remove(index);
						System.out.println("Student Details are Deleted");
						break;
					}
					index++;
				}
				if(flag == false) {
					System.out.println("Student Not Found");
				}
				break;
			case 5:
				System.out.println("Displaying the Student Details");
				for(Student s: list) {
					s.cal();
					s.display();
				}
				break;
			case 6:
				System.exit(0);
				break;
			}
			System.out.println("Do You Want to Continue [Y | N]");
			msg=sc.next();
			}while(msg.equalsIgnoreCase("Y"));
		}

	}


