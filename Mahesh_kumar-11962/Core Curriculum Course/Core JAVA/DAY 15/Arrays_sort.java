package com.mahesh.core_java_day_16_V8;

import java.util.Arrays;

public class Arrays_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = {10,4,2,6,1,9,7,8};
		//Array start from 0
		Arrays.parallelSort(array1,2,7);
		for(int Arr: array1)
		{
			System.out.println(Arr);
		}
	}

}
