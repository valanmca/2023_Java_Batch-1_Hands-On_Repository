//linear search algorithm
package com.domnic.day6;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		//System.out.println("Enter the array elements :");
	System.out.println("Enter " +arr.length+" Values");
		
		for(int i=0;i<arr.length;i++) {        
			arr[i]=sc.nextInt();
		}
		//int arr[]= {44,67,12,79,34,90,78};
		
		System.out.println("Enter the Element to be found :");
		int num=sc.nextInt();
		
		boolean temp=false;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				System.out.println("Element is present in the index : "+i);
				temp=true;
				
			}
		}
		if(temp==false) {
			System.out.println("The element is not present");
		}
	}

}
