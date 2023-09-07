package com.matthew.day01;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		while( num >0){
			num /=10;
			count++;
		}
		System.out.println("Length of the given number : "+count);
	}

}
