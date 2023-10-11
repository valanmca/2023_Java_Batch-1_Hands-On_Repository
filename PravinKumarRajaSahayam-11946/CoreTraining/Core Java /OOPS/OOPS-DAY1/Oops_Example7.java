
//1. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
import java.util.ArrayList;

class Student {
	private String name;
	private int grade;
	private ArrayList<String> courses;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		this.courses = new ArrayList<String>();
	}

	public String getname() {
		return name;
	}

	public int getgrade() {
		return grade;
	}

	public ArrayList<String> getcourses() {
		return courses;
	}

	public void addcourses(String course) {
		courses.add(course);
	}

	public void removecourses(String course) {
		courses.remove(course);
	}

	public void printStudentsDetails() {

		System.out.println("Name : " + name);
		System.out.println("Grade : " + grade);
	}
}

public class Oops_Example7 {

	public static void main(String[] args) {

		Student student1 = new Student("PravinKumar", 100);
		Student student2 = new Student("RajaSahayam", 101);
		Student student3 = new Student("Surya", 105);
		System.out.println(" Students Details : ");
		student1.printStudentsDetails();
		student2.printStudentsDetails();
		student3.printStudentsDetails();
		System.out.println("Adding the courses for the : " + student1.getname());
		student1.addcourses("MATHS");
		student1.addcourses("Science");
		student1.addcourses("ENGLISH");
		System.out.println(student1.getname() + "'s courses : " + student1.getcourses());
		System.out.println("/n Adding the courses for the : " + student2.getname());
		student2.addcourses("Biology");
		student2.addcourses("Geography");
		student2.addcourses("History");
		System.out.println(student2.getname() + "'s courses : " + student2.getcourses());
		System.out.println("/n Removing the courses 'Science' from the " + student1.getname());
		student1.removecourses("Science");
		System.out.println(student1.getname() + "'s courses : " + student1.getcourses());
	}
}
