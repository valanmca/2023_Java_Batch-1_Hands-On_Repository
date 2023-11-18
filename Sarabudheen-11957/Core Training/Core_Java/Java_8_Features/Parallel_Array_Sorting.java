package com.sara.CoreJava.Day_15;

import java.util.Arrays;

public class Parallel_Array_Sorting {

	public static void main(String[] args) {
		int[] array = {9,5,3,1,6,8,2,7,10,4};
		Arrays.parallelSort(array);
		
		for (int i=0;i<=array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
