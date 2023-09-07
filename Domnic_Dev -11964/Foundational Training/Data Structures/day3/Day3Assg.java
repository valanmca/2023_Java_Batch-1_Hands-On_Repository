package com.domnic.day3;
import java.util.Scanner;
public class Day3Assg {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println("Enter the iteration :");
		 String star="";
		for(int i=0;i<=input;i++) {
			star=star+"*";
			System.out.println(star);
		}
	}

}
