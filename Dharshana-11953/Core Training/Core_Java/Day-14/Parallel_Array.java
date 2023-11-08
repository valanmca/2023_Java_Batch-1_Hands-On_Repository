package com.dharshu.day14;

import java.util.Arrays;

public class Parallel_Array {

	public static void main(String[] args) {
		
		int arr1[]= {10,16,24,7,19,1};
		
		Arrays.parallelSort(arr1,1,4);//FromIndext to ToIndex
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}
