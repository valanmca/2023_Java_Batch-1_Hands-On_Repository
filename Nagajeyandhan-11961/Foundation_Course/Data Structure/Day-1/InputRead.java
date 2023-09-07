//Student Information using array

package com.jeyandhan.day01;
import java.util.*;
public class InputRead {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sId,m1,m2,m3;
		String sName = "Jeyandhan";
		System.out.println("\t Student Information");
		System.out.println("Student Id : ");
		sId = sc.nextInt();
		System.out.println("Student Name : ");
		sName=sc.next();
		System.out.println("Mark1 : ");
		m1 = sc.nextInt();
		System.out.println("Mark2 : ");
		m2 = sc.nextInt();
		System.out.println("Mark3 : ");
		m3 = sc.nextInt();
		int sum=m1+m2+m3;
		float avg=sum/3;
		System.out.println("\t Student Information");
		System.out.println("Student Id : " +sId);
		System.out.println("Student Name : " +sName);
		System.out.println("Mark1 : "+m1 +"\nMark2 : "+m2+"\nMark3 : "+m3);
		System.out.println("Total : "+sum+"\nAverage : "+avg);
		
		

	}

}
