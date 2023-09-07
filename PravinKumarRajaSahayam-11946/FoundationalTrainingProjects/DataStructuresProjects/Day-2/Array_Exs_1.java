//Sum of Arrays using Type 3
package com.pravinkumar.day2;
import java.util.Scanner;
public class Array_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]=new int[] {10,20,30,40,50};
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
    	sum +=arr[i];
    }
    System.out.println("The sum is : " + sum);
	}

}
