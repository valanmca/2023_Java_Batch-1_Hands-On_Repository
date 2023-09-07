package com.swetha.day6;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		
		//Linear Search
		int arr[]= {10,8,5,6,2,4,20,18};
		
        System.out.println("enter the element to search :");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        
        boolean isPresent=false;
        for(int i=0;i<arr.length;i++) {
        	if(k==arr[i]) {
        		System.out.println("Elements present in the index : "+i);
        		isPresent=true;
        		break;
        	}
        }
        if(isPresent==false) {
        	System.out.println("Element is not present");
        }
	}
	

}
