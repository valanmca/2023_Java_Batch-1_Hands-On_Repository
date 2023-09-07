package com.jenish.day06;

import java.util.Scanner;

//LinearSearch Algorithm-Array

public class LinearSearchAlgorithm_Arr_Sample_Ex1 {

	public static void main(String[] args) {
		int array[]= {10,8,5,6,2,4,20,18};
		
		System.out.println("Enter the Element to Search:");
		Scanner sc= new Scanner(System.in);
		int k= sc.nextInt();
		
		boolean isPresent = false;
		for(int i=0; i<array.length; i++) {
			if(k==array[i]) {
				System.out.println("Elements present in the index:" +i);
				isPresent=true;
				break;
			}
		}
		if(isPresent==false)
			System.out.println("Element Not Present");
		sc.close();
		
	}

}
