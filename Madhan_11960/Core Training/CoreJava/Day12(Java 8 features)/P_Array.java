package com.madhan.lambda;

import java.util.Arrays;

public class P_Array {

	public static void main(String[] args) {
    int[] arr1= {10,1,6,34,12,1,90};
    
    Arrays.parallelSort(arr1,1,4);
    
    for(int i=0;i<arr1.length;i++) {
    	System.out.println(arr1[i]);
    }
	}

}
