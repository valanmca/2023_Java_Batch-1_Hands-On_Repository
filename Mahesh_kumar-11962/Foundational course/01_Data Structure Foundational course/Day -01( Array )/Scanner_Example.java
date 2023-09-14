package com.mahesh.ds_day1;
import java.util.Scanner;

public class Scanner_Example {

	public static void main(String[] args) {

		Scanner Sc_object = new Scanner(System.in);
		
		int rollno;
		String Sname;
		char section;
		
		int mark1,mark2,mark3;
		
		System.out.print("Enter your name : ");
		Sname = Sc_object.next();
		
		System.out.print("Enter your rollno : ");
		rollno = Sc_object.nextInt();
		
		System.out.print("Enter your Section/Batch : ");
		section=Sc_object.next().charAt(0);
		
		System.out.print("\nEnter your 3subjectmarks one by one : ");
		System.out.println("\nEnter your DataStructure mark : ");
		mark1 = Sc_object.nextInt();
		
		System.out.print("\nEnter your Aptitude mark : ");
		mark2 = Sc_object.nextInt();
		
		System.out.print("\nEnter your Communication mark : ");
		mark3 = Sc_object.nextInt();
		
		System.out.print("\nyour  DataStructure mark is : "+mark1);
		System.out.print("your Aptitude mark is : "+mark2);
		System.out.print("\nyour Communication mark is : "+mark3);
		
		int subract =mark1-mark2;
		
		System.out.print("Subract two value"+subract);
	}

}
