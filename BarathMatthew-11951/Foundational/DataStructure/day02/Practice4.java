package com.matthew.day02;
import java.util.Scanner;
public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int temp = 1;
		for(int i =2;i<num+1;i++) {
			temp *=i;
		}
		System.out.println("Result:"+temp);
	}

}
