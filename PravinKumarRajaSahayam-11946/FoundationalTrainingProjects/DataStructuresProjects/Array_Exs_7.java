package com.pravinkumar.day1;
import java.util.Scanner;
public class Array_Exs_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int [10];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the Numbers:");
      int array=sc.nextInt();
      System.out.println("The Array are:");
      for(int i=0;i<arr.length;i++)
      {
    	  arr[i]=sc.nextInt(array);
      }
      int max=1;
      for(int i=0;i<arr.length;i++)
      {
      if(max<arr[i]) 
      {
    	  System.out.println("The Maximum number is:" + max);
      }
      }
      int min=arr[0];
      for(int i=1;i<arr.length;i++)
      {
    	  if(min>arr[i])
    	  {
    		  System.out.println("The Minimum number is:" + min);
    	  }
      }
      

}
}
