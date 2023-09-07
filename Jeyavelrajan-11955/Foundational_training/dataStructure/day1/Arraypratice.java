
//Linear searching in array in DS
package com.jeyavel.day1;

import java.util.Scanner;

public class Arraypratice {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("The values you Want?");
		int n = sc.nextInt();
		int[] arr = new int[n];//Array declare using scanner to get n no of values 
		System.out.println("Enter the " + n + "Values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();// Append and store the input elements from the user using for loop
		}
			// Ask user to Enter the Target Value
			System.out.println("Enter the Target Value");
			int target = sc.nextInt();
			// to compare this target to All the value
			int position = -1; // declare default position =-1  (for) if /else statement 
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == target) {
					position = i;
					break;

				}
			}
			if (position != -1) {
				System.out.println(target + "position found-> " + (position +1));

			} else {
				System.out.println(target + "position not  found");
			}

		}
	}

