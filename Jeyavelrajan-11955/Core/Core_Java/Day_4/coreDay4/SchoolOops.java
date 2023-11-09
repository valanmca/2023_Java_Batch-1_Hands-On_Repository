package com.jeyavel.coreDay4;
import java.util.*;
public class SchoolOops {
	String classes,student,teacher;
	static char select;
	ArrayList <String> classes_list = new ArrayList<String>();
	ArrayList <String> student_list  = new ArrayList<String>();
	ArrayList <String> teacher_list  = new ArrayList<String>();
    static Scanner sc_obj = new Scanner (System.in); 
	
    void studentDetails(){
      System.out.println("Enter the class name");
      classes=sc_obj.next();
      System.out.println("Enter the Student name");
      student=sc_obj.next();
      System.out.println("Enter the Teacher name");
      teacher=sc_obj.next();
    }
    void add_student(){
    	System.out.println("Add student");
    	System.out.println("Enter the Name of the Student");
    	student_list.add(student=sc_obj.next());
    }
    void remove_student(){
    	System.out.println("Remove student");
    	System.out.println("Enter the Name of the Student");
    	student_list.remove(sc_obj.next());
    }
    void add_teacher(){
    	System.out.println("Add teacher");
    	System.out.println("Enter the Name of the teacher");
    	teacher_list.add(teacher=sc_obj.next());
    }
    void remove_teacher(){
    	System.out.println("Remove Teacher");
    	System.out.println("Enter the Name of the teacher");
    	teacher_list.remove(sc_obj.next());
    }
    
    void add_classes(){
    	System.out.println("Add classes");
    	System.out.println("Enter the Name of the class");
    	classes_list.add(classes=sc_obj.next());
    }
    void remove_classes(){
    	System.out.println("Remove classes");
    	System.out.println("Enter the Name of the class");
    	classes_list.remove(sc_obj.next());
    }
    
	public static void main(String[] args) {
		SchoolOops sch = new SchoolOops();


	}

}
