package com.mahesh.core_java_day_02;

import java.util.ArrayList;
import java.util.Scanner;
public class Prime_Sum {

	Scanner sc = new Scanner(System.in);

	public void prime() {

		ArrayList<Integer> lst = new ArrayList<Integer>();
		int num = 2;
		int count = 0;
		while (lst.size() != 10) 
		{
			for (int index = 2; index <= num; index++) 
			{
				if (num % index == 0)
				{
					count++;
				}
			}
			if (count == 1) 
			{
				lst.add(num);
			}
			count = 0;
			num++;
		}
		System.out.println("Prime numbers list : "+lst);
		int sum = 0;
		for (int index = 0; index < lst.size(); index++) {
			sum = sum + lst.get(index);
		}
		System.out.println("Sum of 10 prime numbers : " + sum);

	}

	public static void main(String[] args) {

		Prime_Sum obj = new Prime_Sum();
		obj.prime();

	}

}
