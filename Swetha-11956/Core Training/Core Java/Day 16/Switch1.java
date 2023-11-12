package com.swetha.features;
import java.util.Scanner;

public class Switch1 {

	public String FindDay(int dayNum) {
		return switch (dayNum) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		case 7 -> "Sunday";
		default -> "Invalid day";
		};
	}

	public static void main(String[] args) {

		
		Switch1 day  = new Switch1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day of the week : ");
		int input = sc.nextInt();
		System.out.println(day.FindDay(input));
	}

}
