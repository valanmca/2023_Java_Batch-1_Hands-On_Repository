/****** Linear Search Algorithm Using Array... ******/
package com.sara.day06;

import java.util.Scanner;

public class LinearSearchAlgo1 {

	public static void main(String[] args) {
		int array[] = {10,3,8,4,6,13,9,18,7,20};
		
		System.out.println("Enter The Element to Search : ");
		Scanner sc = new Scanner (System.in);
		int element = sc.nextInt();
		
		boolean isPresent = false;
		for(int i=0; i<array.length;i++) {
			if (element == array[i]) {
				System.out.println("The Element Present in the index : "+ i);
				isPresent = true;
				break;
			}
		}
		
		if (isPresent == false) {
			System.out.println("The Element is Not Present");
		}
	}

}
