package com.gayathri.day15Java8Features;

import java.util.Arrays;

public class P6ParallelArray {
	public static void main(String [] args) {
		int [] array = {98,23,5,76,654,1};
		
		Arrays.parallelSort(array,1,3);//1-starting index, 3-ending index
		
		//Arrays.parallelSort(array);
		
		for(int i =0;i<array.length;i++)
			System.out.println(array[i]);
		
	}

}
