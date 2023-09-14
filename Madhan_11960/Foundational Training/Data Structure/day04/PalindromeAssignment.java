package com.madhan.day04;
import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeAssignment {

	public static void main(String[] args) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		System.out.println("Enter the size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the values:");
		for(int i=0;i<size;i++)
		{
			
			int value=sc.nextInt();
			array.add(value);
		}
		System.out.println(array);
		
		ArrayList<Integer> array1=new ArrayList<Integer>();
		for(int i=size-1;i>=0;i--)
		{
			int temp=array.get(i);
			array1.add(temp);
		}
          System.out.println(array1);
          int temp=0;
          if(array.isEmpty()==true)
          {
        	  System.out.println("Palindrome");
          }
          else
          {
          for(int i=0;i<size;i++)
          {
        	  temp=0;
        	  int x=array.get(i);
        	  int y=array1.get(i);
        	  if(x==y)
        	  {
        		  temp=1;
        		  break;
        	  }
        	  else
        	  {
        		  temp=0;
        		  break;
        	  }
          }
          if(temp==0)
          {
        	  System.out.println("Not an Palindrome");
          }
          else
          {
        	  System.out.println("Palindrome");
          }
          }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
