package com.pravinkumar.day7;

import java.util.Scanner;

public class Practice_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the Size of the Number:");
		int size = sc.nextInt();

		int number = 0;
		for (int i = 0; i < size; i++) {
			number = sc.nextInt();
		}
		int temp = 0;
		boolean isPresent = false;
		for (int i = 0; i < number; i++) {
			while (number > 0) {
				temp = sc.nextInt();
				isPresent = true;
				break;
			}
			if (isPresent == true) {
				System.out.println(temp);
			}
		}

		if (isPresent == false) {
			System.out.println(-1);
		}
	}

}
