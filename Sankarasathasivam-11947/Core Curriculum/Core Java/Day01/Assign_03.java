
//Write the Java program to print tables of the given number

package com.shiva.core.day01;
import java.util.Scanner;

public class Assign_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value ");
		int number=sc.nextInt();
		
		System.out.println("Enter the ending digit ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(+i+" * "+number+" = "+(number*i));
		}

	}

}
