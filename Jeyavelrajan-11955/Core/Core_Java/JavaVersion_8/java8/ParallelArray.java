package com.jeyavel.core.java8;

import java.util.Arrays;

public class ParallelArray {

	public static void main(String[] args) {
		int[] arr1= {10,1,6,34,12,1,90};
		
		Arrays.parallelSort(arr1);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}
