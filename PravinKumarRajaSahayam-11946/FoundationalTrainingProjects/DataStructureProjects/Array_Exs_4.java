//Arrays Indexs Programs
package com.pravinkumar.day1;

public class Array_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50};
		
		//Printing the Element using the Index Numbers
		System.out.println("Thrid Number in thi Index:" + arr[3]);
		
		//Updating the Element using the Index Numbers
		arr[3]=90;
		System.out.println("Third Number in this Index after the Changes:" + arr[3]);

		System.out.println("Array Elements are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
