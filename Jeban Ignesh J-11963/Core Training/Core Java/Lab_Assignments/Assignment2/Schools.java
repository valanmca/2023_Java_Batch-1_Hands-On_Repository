package com.jeban.Assignment2;

import java.util.ArrayList;

class School{
	ArrayList <String> Students=new ArrayList<String>();
	ArrayList <String> Teachers=new ArrayList<String>();
	ArrayList <String> Class=new ArrayList<String>();
	
	void add_details(String student,String teacher,String classes) {
		Students.add(student);
		Teachers.add(teacher);
		Class.add(classes);
	}
	void remove_details(String student,String teacher,String classes) {
		Students.remove(student);
		Teachers.remove(teacher);
		Class.remove(classes);
	}
	void display() {
		System.out.println("Students List:"+Students);
		System.out.println("Teachers List:"+Teachers);
		System.out.println("Classes List:"+Class);
		
	}
	
}

public class Schools {

	public static void main(String[] args) {
		School obj=new School();
		obj.add_details("Jeban", "Joseph", "XII");
		obj.add_details("Menon", "Rani", "XII");
		obj.add_details("NallaSivam", "Antony", "XII");
		obj.display();
		obj.remove_details("Jeban", null, null);
		obj.display();

	}

}
