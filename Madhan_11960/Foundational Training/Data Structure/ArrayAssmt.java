package com.madhan.day01;
import java.util.*;
public class ArrayAssmt {

	public static void main(String[] args) {
		System.out.println("Enter the values:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
          System.out.println("count of the digits are:"+count);
	}

}
