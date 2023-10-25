package com.jeyavel.coreDay1;
import java.util.ArrayList;

class Students{
	private String name;
	private int grade;
	private ArrayList<String> courses;
	
	public Students(String name,int grade) {
		this.name=name;
		this.grade=grade;
		this.courses = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	  }
	public int getGrade() {
		return grade;
	}
	public ArrayList< String > getCourse(){
		return courses;
	}
	public void addCourse(String course) {
		courses.add(course);
	}
	public void removeCourse(String course) {
		courses.remove(course);
	}
	public void printStudentDetails(){
		System.out.println("Name"+name);
		System.out.println("Grade "+grade);
		}
	}


public class AssExNo1 {

	public static void main(String[] args) {
		Students student1 = new Students(" jeyavel",98);
		Students student2 = new Students(" harrish", 97);
		Students student3 = new Students(" karthick",96);
	    System.out.println("Student Details");
	    
	    student1.printStudentDetails();
	    student2.printStudentDetails();
	    student3.printStudentDetails();
	    
	    System.out.println("Adding courses for"+student1.getName());
	    student1.addCourse("science");
	    student1.addCourse("social");
	    student1.addCourse("computer");
	    
	    System.out.println(student1.getName()+"courses"+student1.getCourse());
	    
	    System.out.println("Adding Courses for"+student2.getName());
	    student2.addCourse("Maths");
	    student2.addCourse("Science");
	    student2.addCourse("Social");
	    
	    System.out.println(student2.getName()+"courses"+student2.getCourse());
	    
	    System.out.println("Removing courses for"+student1.getName());
	    student1.removeCourse("social");
	    
	    System.out.println(student1.getName()+" After removing courses"+student1.getCourse());
	   

	}

}
