package com.matthew.day03;
import java.util.Scanner;

public class work1 {
	int a = 12;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		String var = "";
		for (int i = 1; i <= num; i++) {
			var += "*";
			System.out.println(var);
		}
	
	}	
	
}