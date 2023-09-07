package com.jenish.day02;

public class Sum_Of_Array_Ex {

	public static void main(String[] args) {
		int array[]=new int[] {10,20,30};
		int sum =0;
		System.out.println("Enter the Values");
		for(int i=0; i<array.length; i++) {
			sum=sum+array[i];
		}
		System.out.println("Sum of Array:" +sum);

	}

}
