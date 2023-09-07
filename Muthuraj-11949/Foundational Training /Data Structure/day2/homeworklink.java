package com.muthu.day2;
import java.util.Scanner;
import java.util.ArrayList;

public class homeworklink {

	public static void main(String[] args) 
	{

		ArrayList<Integer> inputlist = new ArrayList<Integer>();
		ArrayList<Integer> Digitcount = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		System.out.println("value");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) 
		{
			int temp = sc.nextInt();
			inputlist.add(temp);
		}
		
		System.out.println("Enter the value");

		for (int i = 0; i < n; i++)
		{
			int count = 0;
			int number = inputlist.get(i);// store the value from inputlist
			while (number != 0) {
				number = number / 10;
				count++;
			}
			
			System.out.println("count the number" + inputlist.get(i) + ":" + count);
			Digitcount.add(count);
		}
		
		System.out.println("value:" + Digitcount);
	}

}
