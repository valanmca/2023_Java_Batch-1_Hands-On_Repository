package com.jenish.day14;

import java.util.Arrays;

public class Ex_2_ParallelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {10, 1, 2, 6, 34, 90};
		
		Arrays.parallelSort(arr1);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
