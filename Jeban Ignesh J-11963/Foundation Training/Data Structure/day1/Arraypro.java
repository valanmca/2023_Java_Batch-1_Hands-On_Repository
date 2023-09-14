
package com.jeban.day1;

public class Arraypro {
	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		
		System.out.println("Third Element:"+ arr[2]);//displaying the element
		
		arr[2]=80;//Updating and modifying element
		
		System.out.println("New Element:"+arr[2]);
		
		System.out.println("Array elements are:");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	

}
