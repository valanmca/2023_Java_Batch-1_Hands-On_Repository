package com.swetha.day1;
import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
		int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter array elements");
        
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        	
        }
        int flag=0;
        System.out.println("Enter the number want to search : ");
        
        int x=sc.nextInt();
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==x) {
        		flag=1;
        		System.out.println("The index value of"+ x +"is " +i);
        		
        	
        	}
        }
        if(flag!=1) {
        	System.out.println("-1");
        }
        
        	
	}

}
