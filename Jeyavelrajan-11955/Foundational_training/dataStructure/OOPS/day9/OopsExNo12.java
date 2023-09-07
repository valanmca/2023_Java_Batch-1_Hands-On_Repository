package com.jeyavel.OOPS.day9;

class Student{
	String Name;
	static String mark="3 marks of the student "; 
	int Mark1;
	int Mark2;
	int Mark3;
	
	
	Student(String Name,int Mark2,int Mark3, int Mark1){
		this.Name=Name;
		this.Mark1=Mark1;
		this.Mark2=Mark2;
		this.Mark3=Mark3;
		
	}
	
	public int getsum() {
		int getsum =this.Mark1+this.Mark2+this.Mark3;
		return getsum;
	}
	public int average() {
		int average = getsum()/3;
		return average;
	}
	
	void display() {
		System.out.println("Name of the Student    ->"+Name);
		System.out.println("Mark1    ->"+Mark1);
		System.out.println("Mark2    ->"+Mark2);
		System.out.println("Mark3    ->"+Mark3);
		System.out.println("Sum  of the Student    ->"+getsum());
		System.out.println("Average of the Student ->"+average());
		
		
	}
	
}


public class OopsExNo12 {

	public static void main(String[] args) {
		Student obj1=new Student("jeyavel",89,90,78);
		obj1.display();

	}

}
