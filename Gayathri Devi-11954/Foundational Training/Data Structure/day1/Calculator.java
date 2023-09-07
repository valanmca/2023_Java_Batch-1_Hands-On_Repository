package com.gayathri.day1;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Arithmetic Operations");
		
		System.out.print("\n Enter first number : ");
		int fn = sc.nextInt();
		
		System.out.print("\n Enter second number : ");
		int sn = sc.nextInt() ;
		
		int add = fn + sn;
		int sub = fn - sn;
		int mul = fn * sn;
		int div = fn / sn;
		int mdiv =  fn % sn;
		
		System.out.println("Addition result		 	: " + add);
		System.out.println("Subtraction result 		: " + sub);
		System.out.println("Multiplication result 		: " + mul);
		System.out.println("Division result			: " + div);
		System.out.println("Modulodivision result 		: " + mdiv);
		
	}

}
