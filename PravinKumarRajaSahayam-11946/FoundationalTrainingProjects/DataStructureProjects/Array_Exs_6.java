package com.pravinkumar.day1;
import java.util.Scanner;
public class Array_Exs_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]=new int[10];
    
    //Take the input from the user
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the 10 Number: ");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=sc.nextInt();
    }
    
    //Elements to be Searched
    
    System.out.println("Enter the Element to be Seacrhed:");
    int temp=sc.nextInt();
    int count=-1;
    for(int i=0;i<arr.length;i++)
    {
    	if(temp==arr[i])
    	{
    		System.out.println(i);
    		count=1;
    	}
    }
    if(count==-1)
      {
    	System.out.println(count);
        }
    
	
	}
}

