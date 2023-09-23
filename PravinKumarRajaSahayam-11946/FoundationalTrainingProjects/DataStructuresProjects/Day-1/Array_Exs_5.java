//Array Types 1 and 2 and 3
package com.pravinkumar.day1;
import java.util.Scanner;
public class Array_Exs_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//float arr[]=new float[5];
		//char arr[]=new char[5];
		//String arr[]=new String[5];
		//boolean arr[]=new boolean[5]; by default it is false
    int arr[]=new int[5];
    
    //Types 1
    
    System.out.println("Initial Elements are:");
    for(int i=0;i<arr.length;i++)
    {
	System.out.println(arr[i]);
    }
    
    //types 2
    
    System.out.println("Enter" + arr.length + "Values");
    Scanner sc = new Scanner (System.in);
    for(int i=0;i<arr.length;i++)
    {
    	//For Declare this Take the inputs from the user
    	arr[i] = sc.nextInt();
    }
    System.out.println("New Elements are:");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.println(arr[i]);
    }
    
    //Types 3
    
	}

}
