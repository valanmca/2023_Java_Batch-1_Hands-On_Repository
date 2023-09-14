//Sum of Digits using array

package com.jeyandhan.day02;

public class SumOfArray {

	public static void main(String[] args) {
		int array[]=new int[] {40,30,60};
		int sum=0;
		
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println(sum);
	
	}
}
