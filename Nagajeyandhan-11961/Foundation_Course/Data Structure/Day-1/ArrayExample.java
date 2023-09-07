//Displaying and updating particular element

package com.jeyandhan.day01;

public class ArrayExample {

	public static void main(String[] args) {
		int a[]= {20,10,40,30,50};
		System.out.println("\tArray");
		System.out.println("The Element is: "+ a[3]); //printing the third element
		a[4]=70; //updating the fourth element
		System.out.println("The Element is: "+ a[4]);
		for(int i=0; i<a.length; i++) { 
			System.out.println("The Elements in the array are: " +a[i]); //printing all elements
		}

	}

}
