
package com.jeban.day1;
import java.util.*;

public class Arraypro2 {
	public static void main(String[] args) {
	
		float arr[] =new float[5];
	
		
		System.out.println("Initial array Elements are;");//for know array value
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter:" +arr.length +"values");//for get input the value from array
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextFloat();
				
		}
		System.out.println("New array Elements are:");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
