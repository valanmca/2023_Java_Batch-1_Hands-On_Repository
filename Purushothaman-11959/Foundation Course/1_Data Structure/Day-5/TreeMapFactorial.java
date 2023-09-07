package com.purushoth.day5;
import java.util.TreeMap;
import java.util.Scanner;

public class TreeMapFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int fact=1;
		for (int i=1; i<=n;i++) {
			fact=fact*i;
			map.put(i, fact);
		}
		System.out.println(map);//To get the factorial of n numbers.
		
		System.out.println("Enter the Number: ");
		int a=sc.nextInt();
		System.out.println("Factorial of "+a+" : "+map.get(a));//To get
		
		System.out.println("Enter the Number to remove: ");
		int b=sc.nextInt();
		map.remove(b);
		System.out.println(map);//To remove
		

	}

}//To make factorial of numbers and to store in TreeMap.
