package com.domnic.day1;

public class ArrayEx {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println("The 3rd element of the array " + arr[2]);  
		
		arr[2]=55;  //updation or modification
		System.out.println("The updated 3rd element of the array " + arr[2]); 
		

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Array Element are :" +arr[i]); 
		}

	}

}
