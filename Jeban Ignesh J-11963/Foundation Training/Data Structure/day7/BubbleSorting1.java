package com.jeban.day7;
import java.util.Scanner;

public class BubbleSorting1 {

	public static void main(String[] args) {
//		int arr[]={5,8,3,6,7};
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the size:");
		int no=sc.nextInt();
		int arr[]=new int[no];
		System.out.println("Enter the elements in the array:");
		for (int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		int temp=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				

					
				}
			}
			System.out.println("bubble sorting is:"+arr[i]);
		}
		
	}

}
