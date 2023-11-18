package com.purushoth.day_14;

import java.util.Arrays;

public class parallelArray {

	public static void main(String[] args) {
		int[] arr1= {10,23,45,2};
		Arrays.parallelSort(arr1,1,3);//To sort in different index
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}
