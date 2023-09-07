package com.jeyavel.day1;

public class array3rdtype {

	public static void main(String[] args) {
		int array[]=new int[] {10,20,30,40};
		int temp = 0;
		for(int i=0;i<array.length;i++) {
			 temp+=array[i];
		}
		System.out.println("The sum of the array is :"+ temp);

	}

}
