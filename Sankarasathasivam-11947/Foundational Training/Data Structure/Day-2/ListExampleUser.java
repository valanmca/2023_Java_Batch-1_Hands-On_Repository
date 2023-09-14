package com.shiva.day02;

import java.util.*;

public class ListExampleUser {
	public static void main(String[] args) 
		{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) 
		{
			list.add(i);
		}
		System.out.println(list);

		ArrayList<Integer> Odd = new ArrayList<Integer>();
		ArrayList<Integer> Even = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) 
		{
			int temp = list.get(i);
			if (temp % 2 == 0)// instead of temp we can use list.get(i)
			{
				Even.add(temp);
			} 
			else 
			{
				Odd.add(temp);
			}
		}
		System.out.println(Even);
		System.out.println(Odd);
	}

}
