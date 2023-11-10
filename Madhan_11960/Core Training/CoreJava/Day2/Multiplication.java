package com.madhan.coreday2;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner digit=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=digit.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+number+"="+number*i);
		}

	}

}
