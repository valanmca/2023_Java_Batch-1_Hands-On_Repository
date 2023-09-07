package DataStructureDay1;

import java.util.Scanner;

public class ArrayDay1 {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student Id:");
		int sId = sc.nextInt();
		
		System .out.println("Enter the Studengt name:");
		String sName = sc.next();
		
		System.out.println("Enter Three subject Marks:");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		
		int sum = m1+m2+m3;
		int avg = sum/3;
		
		System.out.println("Student Id:" + sId);
		System.out.println("Student Name:" + sName);
		System.out.println("Student Mark1:" + m1);
		System.out.println("Student Mark2:" + m2);
		System.out.println("Student Mark3:" + m3);
		System.out.println("Todal Marks:" + sum);
		System.out.println("Average :" + avg);
	}
}
