package com.muthu.day7;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Size");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the Elememts");
	for(int i=0; i<arr.length;i++)
	{
		int number =sc.nextInt() ;}
	
			for(int i=0; i<arr.length;i++) {
				int min=i;
				for(int j=i+1; j<arr.length;j++) {
					if (arr[min]>arr[j]);
					min=j;
				}
			
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;	
		}
			for(int i = 0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}

}

}
