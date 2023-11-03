package com.naveen.day_13;

import java.util.Arrays;

public class Ex02_ParallelArray {

	public static void main(String[] args) {
		
		int [] arr1 = {10, 5, 8, 7, 9 ,90, 84};
		
		Arrays.parallelSort(arr1, 2, 6); //start form 2 to 6
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
