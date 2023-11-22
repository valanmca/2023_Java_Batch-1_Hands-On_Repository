//Write a Java program to create a class called "Student" with a name, grade, 
//and courses attributes, and methods to add and remove courses.

package oopsDay1_Day2;
import java.util.ArrayList;

class Student1{
	
	String name;
	String grade;
	ArrayList<String> course=new ArrayList<String>();
	
	Student1(String name,String grade){
		this.name=name;
		this.grade=grade;
		
	}
	public void addCourse( String courses) {
		course.add(courses);
	}
	public void removeCourse( String courses) {
		course.add(courses);
	}
	void display() {
		System.out.println("Student Name : "+name);
		System.out.println("Student Grade : "+grade);
		System.out.println("Student course : "+course);
		System.out.println(" ");
	}
	
}
public class StudentCourse {

	public static void main(String[] args) {
		Student1 s1=new Student1("Swetha","A");
		
		s1.addCourse("Maths");
		s1.addCourse("Physics");
		s1.display();
		
		s1.removeCourse("Physics");
		s1.display();
		
	}

}
