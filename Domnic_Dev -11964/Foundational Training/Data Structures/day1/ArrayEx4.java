package com.domnic.day1;
import java.util.Scanner;
public class ArrayEx4 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int temp=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter " +arr.length+" Values");
		
		for(int i=0;i<arr.length;i++) {        
			arr[i]=sc.nextInt();
		}
		int temp1=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(temp<arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println("Maximum value " + temp);
		
		for(int i=1;i<arr.length;i++) {
			if(temp1>arr[i]) {
				temp1=arr[i];
			}
		}
		System.out.println("Minimum value " + temp1);
		
	}
}

