package com.matthew.day02;
import java.util.Scanner;
public class ArrayMark {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[3];
		System.out.println("Enter Student ID :");
		int sID = sc.nextInt();
		System.out.println("Enter Student Name : ");
		String Name = sc.next();
		System.out.println("Enter three subject marks : ");
		for (int i = 0; i<marks.length;i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println("Student Id :"+sID);
		System.out.println("Student Name :"+Name);
		for(int i = 0;i<marks.length;i++) {
			System.out.println("Marks"+ (i+1) +":" + marks[i]);
		}
		int sum = 0;
		for (int i = 0;i<marks.length;i++) {
			sum+=marks[i];
		}
		System.out.println("Sum of marks : "+ sum);
		System.out.println("Average marks : "+ (sum/3));
	}

}
