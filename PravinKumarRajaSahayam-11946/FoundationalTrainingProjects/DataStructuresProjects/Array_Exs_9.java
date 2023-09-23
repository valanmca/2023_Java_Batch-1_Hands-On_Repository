package com.pravinkumar.day1;
import java.util.Scanner;
public class Array_Exs_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10]; 
    int number;
    int count=0;
    int temp;
    System.out.println("Enter the integer:");
    Scanner sc=new Scanner(System.in);
    number=sc.nextInt();
    temp=number;
    while(temp!=0)
    {
    	temp=temp/10;
    	count++;
    }
    	System.out.println("Total Number of Digits is:" + count);
	}

}
