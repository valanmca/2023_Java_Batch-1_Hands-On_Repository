package com.purushoth.day_06;

import java.util.Scanner;

class Mark{
	public static void getMark() throws ArithmeticException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark: ");
		int mark=sc.nextInt();
		
		//To get mark
		
		if (mark<0) {
			throw new ArithmeticException("Mark is negative");
		}
		else {
			System.out.println("Mark uploaded "+mark);
		}
	}
}
public class Throws1 {

	public static void main(String[] args) {
		
		Mark std=new Mark();
		std.getMark();
	}

}
