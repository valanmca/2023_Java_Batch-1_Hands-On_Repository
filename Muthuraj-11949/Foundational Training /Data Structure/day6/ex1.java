package com.muthu.day6;
import java.util.Scanner;
//Linear Search Algorithm-Array
public class ex1 {
	public static void main(String[]args) {
		int arr[]= {10,8,5,6,2,4,20,18};
		System.out.println("Enter the elemet to serach");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		
		
		boolean isPresent =false;
		for(int i=0; i<arr.length;i++){
			if(k==arr[i]) {
				System.out.println("the element present in index:"+i);
				isPresent = true;
				break;
				
				
			}
			
		}
		if(isPresent == false) {
			System.out.println(" Element not present");
		}
		
	}

}
