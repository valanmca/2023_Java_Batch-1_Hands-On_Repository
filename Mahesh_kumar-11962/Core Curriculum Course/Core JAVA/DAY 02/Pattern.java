package com.mahesh.core_java_day_02;

import java.util.Scanner;
import java.util.*;

public class Pattern {
	Scanner sc = new Scanner(System.in);
	int num;

	void print() {
		System.out.println("Enter the table you want : ");
		num = sc.nextInt();
		String sum ="";
		for(int i =0;i<=num;i++)
		{
			sum = sum+" *";
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {

		Pattern ob = new Pattern();
		ob.print();

	}

}
