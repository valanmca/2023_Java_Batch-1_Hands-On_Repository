package com.naveen.day1;

import java.util.ArrayList;

class Student {
    private String name;
    private int grade;
    private ArrayList<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        this.courses.add(course);
    }

    public void removeCourse(String course) {
        this.courses.remove(course);
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public ArrayList<String> getCourses() {
        return this.courses;
    }
    public void printStudentDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Grade: " + grade);
    }

}


public class Ex05 {

	public static void main(String[] args) {
		
		 Student s1 = new Student("Naveenraj", 11);
		 Student s2 = new Student("Gayathri", 10);
		 Student s3 = new Student("Jenish", 12);
		 
		 s1.printStudentDetails();
		 s2.printStudentDetails();
		 s3.printStudentDetails();
		 
		 System.out.println("\nAdding courses for " + s1.getName());
		 s1.addCourse("HTML");
		 s1.addCourse("CSS");
		 s1.addCourse("JS");
		 
		 System.out.println(s1.getName() + " courses: " + s1.getCourses());
		 
		 System.out.println("\nAdding courses for " + s2.getName());
		 s2.addCourse("Tamil");
		 s2.addCourse("English");
		 s2.addCourse("Hindi");
		 
		 System.out.println(s2.getName() + " courses: " + s2.getCourses());
		 
		 System.out.println("\nAdding courses for " + s3.getName());
		 s3.addCourse("Angular");
		 s3.addCourse("React");
		 s3.addCourse("Vue");
		 
		 System.out.println(s3.getName() + " courses: " + s3.getCourses());
		 
		 System.out.println("\nRemoving 'HTML' course for " + s1.getName());
		 s1.removeCourse("HTML");
		 
		 System.out.println(s1.getName() + " courses: " + s1.getCourses());
		 

	}

}
