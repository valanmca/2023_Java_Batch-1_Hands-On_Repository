package com.oops;
import java.util.Scanner;
import java.util.ArrayList;
class student{
	String name;
	String grade;
	
	ArrayList <String>course=new ArrayList<String>();
	
	Scanner sc=new Scanner(System.in);
	void add_Student()
	{
		System.out.println("Add Student:");
		System.out.println();
		System.out.println("Ener the student name :");
		name=sc.next();
		System.out.println("Ener the grade :");
		grade=sc.next();
		System.out.println();
	}
	
	void add_course()
	{
		System.out.println("Add Course:");
		System.out.println();
		System.out.println("Ener the student Course :");
		course.add(sc.next());
		System.out.println();
		
	}
	
	void remove_course()
	{
		System.out.println("Remove Course:");
		System.out.println();
		System.out.println("Ener the student Course to remove :");
		course.remove(sc.next());
		System.out.println();
		
	}
	
	void Show()
	{
		System.out.println("Student Details:");
		System.out.println();
		System.out.println("Name:"+name);
		System.out.println("Grade:"+grade);
		System.out.println("Course:"+course);
		System.out.println();
	}
	


	
}
public class Ass_1 {

	public static void main(String[] args) {
		student obj=new student();
		obj.add_Student();
		
		obj.add_course();
		obj.Show();
		obj.remove_course();
		obj.Show();
		
	

	}

}
