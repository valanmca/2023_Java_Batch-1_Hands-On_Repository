package com.mahesh.core_java_day_02;

import java.util.*;
public class Table {

	Scanner sc = new Scanner(System.in);
	int num;
	void multiply()
	{
		System.out.println("Enter the table you want : ");
		num = sc.nextInt();
		for(int i =1;i<=10;i++)
		{
			System.out.println(i +" * "+num+" "+" = "+ i*num);

		}
		
	}
	public static void main(String[] args) {
		
		Table doit = new Table();
		doit.multiply();

	}

}
