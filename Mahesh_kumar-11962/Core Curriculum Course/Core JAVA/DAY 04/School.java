package com.mahesh.core_java_day_04;
import java.util.*;
public class School {

	ArrayList<String> Student = new ArrayList<String>();
	ArrayList<String> Teacher = new ArrayList<String>();
	ArrayList<String> Class = new ArrayList<String>();
	static Scanner sc =new Scanner(System.in);
	int index;
	static int val;
	static char choice;
	
	void add_student()
	{
		System.out.println("Enter the School Student Name : ");
		Student.add(sc.next());
		
		
	}
	void add_teacher()
	{
		System.out.println("Enter the School Teacher Name : ");
		Teacher.add(sc.next());
		
	}
	void add_class()
	{
		System.out.println("Enter the School Class Rooms : ");
		Class.add(sc.next());
		
	}
	
	void remove_student()
	{
		
		System.out.println("Enter the School Student Name : ");
		Student.remove(sc.next());
		
	}
	void remove_teacher()
	{
		System.out.println("Enter the School Teacher Name : ");
		Teacher.remove(sc.next());
		
	}
	void remove_class()
	{
		System.out.println("Enter the School Class Rooms : ");
		Class.remove(sc.next());
		
	}
	
	
	
	void Show()
	{
		System.out.println("School students list : "+Student);
		System.out.println("School teachers list : "+Teacher);
		System.out.println("School classes list : "+Class);
	}
	public static void main(String[] args)
	{
	
		School doit = new School();
		do {
			System.out.println("\t-*-*-*-ADD/REMOVE REVIEW-*-*-*-");
			System.out.println(
					"ADD  (press 1) / DELETE  (press 2) / VIEW DETAILS (press 3) ");

			int input = sc.nextInt();

			if (input == 1) {
				System.out.println(" Add Student (press 1) / Add Teacher (press 2) / Add Class (Press 3	)");
				val = sc.nextInt();
				if(val == 1)
				{
					doit.add_student();	
				}
				else if(val == 2)
				{
					doit.add_teacher();	
				}
				else if(val ==3)
				{
					doit.add_class();
				}
				else
				{
					
			     	System.out.println("Plz choose 1 to 4");
			     	
				}
				
			} else if (input == 2) {
				
				System.out.println(" Remove Student (press 1) / Remove Teacher (press 2) / Remove Class (Press 3)");
				val = sc.nextInt();
				if(val == 1)
				{
					doit.remove_student();	
				}
				else if(val == 2)
				{
					doit.remove_teacher();	
				}
				else if(val ==3)
				{
					doit.remove_class();
				}
				else
				{
					
						System.out.println("Plz choose 1 to 4");
				}
			}

			else if (input == 3) {
				doit.Show();

			} 
			else {
				System.out.println("Plz choose 1 to 4");
			}
			System.out.println("Do you want to repeat ?(press s)");
			choice = sc.next().charAt(0);
		}while(choice =='s');

	}

}
