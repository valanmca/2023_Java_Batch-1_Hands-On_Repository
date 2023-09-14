package com.madhan.day07;
import java.util.Scanner;
import java.util.ArrayList;

public class BubblesortArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter the digit:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the values:");
		for (int i = 0; i < n; i++) 
		{
			int value = sc.nextInt();
			arr.add(value);
		}
		System.out.println(arr);
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr.get(j)>arr.get(j+1))
				{
					int temp=arr.get(j);
					arr.set(j,arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
		System.out.println("After Bubble sort occurs:");
        
      	  System.out.println(arr);
        
	}

}
