package com.jeyavel.day1;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner cal = new Scanner(System.in);
		
		System.out.println("Enter the First Value = ");
		int a = cal.nextInt();
		System.out.println("Enter the Second Value = ");
		int b = cal.nextInt();
		
		System.out.println("Add the two values =  "+(a+b));
		System.out.println("Subract the two values =  "+(a-b));
		System.out.println("Divide the two values =  "+(a/b));
		System.out.println("Modoulus the two values =  "+(a%b));
	}

}
