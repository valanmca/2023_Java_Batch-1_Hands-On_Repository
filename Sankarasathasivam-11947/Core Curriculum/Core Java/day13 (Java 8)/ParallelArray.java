package com.core.day_13;

import java.util.Arrays;

public class ParallelArray {

	public static void main(String[] args) {
		int arr[]= {60,70,40,30,90,10};
		Arrays.parallelSort(arr,0,5);
		
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

}
