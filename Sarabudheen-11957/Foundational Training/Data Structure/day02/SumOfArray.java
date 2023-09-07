/*************** Sum of an Array... *************/
package com.sara.day02;

public class SumOfArray {

	public static void main(String[] args) {
		int array[] = new int[] { 10, 20, 30 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}
		System.out.println("Sum of The Array Elaments is : " + sum);

	}

}
