package com.naveen.day1;

/*print tables*/
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.println("Enter the number to be multiplied : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<=10; i++) {
			System.out.println(i +" *"+ n +" =" +(i*n));
		}

	}

}
