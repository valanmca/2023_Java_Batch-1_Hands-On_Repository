package com.swetha.day6;
import java.util.LinkedList;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {10,12,24,29,39,40,51,56,69};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter searching element :");
		int k=sc.nextInt();
		
		
		int first=0;
		int last=arr.length-1;
		
		
		boolean isPresent=false;
		
		while(first<=last) {
	   int mid=(first+last)/2;
		 if(k==arr[mid]) {
			System.out.println("Searching element is found in index : "+mid);
			isPresent=true;
			break;
			
		}
		else if(k>arr[mid]) {
			first=mid+1;
			
			
		}
		else if(k<arr[mid]) {
			last=mid-1;
			
		}
	}
		if(isPresent==false) {
			System.out.println("Element is not present");
		}

}
}
