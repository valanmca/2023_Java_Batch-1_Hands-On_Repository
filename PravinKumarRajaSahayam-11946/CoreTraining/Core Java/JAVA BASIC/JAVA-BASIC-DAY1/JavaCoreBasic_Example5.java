//2.Write a Java program to find the sum of digits of the given number.
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class JavaCoreBasic_Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123;
		int sum=0;
		int i;
		int count;
		int t=number;
			while(number!=0)
			{
				count = number % 10;
				sum = sum + count;
			number = number / 10;
			
			}
		System.out.println("Sum of the given digits" + " " + t + " " + "is :" + " " + sum);
		   
	}
}
