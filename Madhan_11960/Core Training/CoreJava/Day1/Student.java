package com.madhan.coreday1;

import java.util.ArrayList;
import java.util.Scanner;

/*1. Write a Java program to create a class called "Student" with a name, grade, 
and courses attributes and methods to add and remove courses.*/

public class Student {
	
	//variables;
    String S_name;
    String S_grade;

    ArrayList <String>S_course = new ArrayList<String>();
    Scanner sc_obj = new Scanner(System.in);
    
    void Add_Student() {
        
        System.out.println("Enter student Name : ");
        S_name = sc_obj.next();
        System.out.println("Enter student Grade : ");
        S_grade = sc_obj.next();
        
    }
    void Add_Course()
    {
    	System.out.println("Enter student count:");
    	int n=sc_obj.nextInt();
        System.out.println("Enter student Course : ");
       
        for(int i=0;i<n;i++)
        {
        	S_course.add(sc_obj.next());
        }
    }

    void Remove_Course() {

        System.out.println("Enter student Course to remove : ");
        S_course.remove(sc_obj.next());
    
    }
    void Show() 
    {
        System.out.println("student Name : "+S_name);
        System.out.println("student Grade : "+S_grade);
        System.out.println("student Course : "+S_course);

    }

	public static void main(String[] args) {
		Student action = new Student();
        action.Add_Student();
        action.Add_Course();
        action.Show();
        action.Remove_Course();
        action.Show();

	}

}
