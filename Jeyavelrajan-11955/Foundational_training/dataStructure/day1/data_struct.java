package com.jeyavel.day1;
import java.util.Scanner;

public class data_struct {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the student id ");
		int sId = sc.nextInt();
		
		System.out.println("Enter the student Name :");
		String sname = sc.next();
		
		System.out.println("Enter the 3 subject Marks :");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		
		int sum = m1+m2+m3;
		int avg = sum/3;
		
		System.out.println("Enter the student ID   :" + sId);
		System.out.println("Enter the student Name :" + sname );
		System.out.println("Enter the student marks:" + m1);
		System.out.println("Enter the student marks:" + m2);
		System.out.println("Enter the student marks:" + m3);
		System.out.println("Enter the student Total:" + sum);
		System.out.println("Enter the student AVG  :" + avg);


	}

}
