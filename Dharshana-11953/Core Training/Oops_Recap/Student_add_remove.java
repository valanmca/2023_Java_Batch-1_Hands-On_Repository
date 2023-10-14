package com.dharshu.OopsRecap;

import java.util.ArrayList;

class Student{
    String name,grade;
    ArrayList<String> course=new ArrayList<String>();
    
    Student(String Name,String Grade){
        this.name=Name;
        this.grade=Grade;
    }
    void add_course(String course) {
        this.course.add(course);
    }
    void remove_course(String course) {
        this.course.remove(course);
    }
    void display_details() {
        System.out.println("Name:"+name+'\n'+"Grade:"+grade);
    }
    void display() {
        
        System.out.println(course);
    }
}

public class Student_add_remove {

	public static void main(String[] args) {
		Student obj=new Student("Dharshu","A+");
        obj.display_details();
        obj.add_course("Java");
        obj.add_course("Phython");
        obj.add_course("C");
        obj.add_course("C++");
        obj.display();
        obj.remove_course("C");
        obj.display();

	}

}
