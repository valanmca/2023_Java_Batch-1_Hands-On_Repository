package com.muthu.lambda;

import java.util.Arrays;

public class Parrael_Array {

	public static void main(String[] args) {
  int[] arr1= {10,2,6,34,56,78,98};
  
  Arrays.parallelSort(arr1,1,4);
  
  for(int i=0;i<arr1.length;i++) {
	  System.out.println(arr1[i]);
  }
	}

}
