package revision.oops;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	ArrayList<String> course_List=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	String name;
	String grade;
	String courses;
	
	void to_addStudent() {
		System.out.println("Enter the name: ");
		name=sc.next();
		System.out.println("Enter the grade: ");
		grade=sc.next();
	}
	
	void to_addCourses() {
        System.out.println("Enter no.of course to add:");
        int n=sc.nextInt();
        System.out.println("Enter Courses:");
        for(int i=0;i<n;i++)
        {
            course_List.add(courses=sc.next());
        }      
	}
	
	void to_removeCourses() {
		System.out.println("Enter no.of course to remove:");
        int n=sc.nextInt();
        System.out.println("Enter Courses:");
        for(int i=0;i<n;i++)
        {
            course_List.remove(courses=sc.next());
        }      
	}
	
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
		System.out.println("Courses: "+course_List);
	}

	public static void main(String[] args) {
		
		Student std1=new Student();
		std1.to_addStudent();
		std1.to_addCourses();
		std1.display();
		std1.to_removeCourses();
		std1.display();
	}

}//Write a Java program to create a class called "Student" with a name, grade, and 
//courses attributes, and methods to add and remove courses.

