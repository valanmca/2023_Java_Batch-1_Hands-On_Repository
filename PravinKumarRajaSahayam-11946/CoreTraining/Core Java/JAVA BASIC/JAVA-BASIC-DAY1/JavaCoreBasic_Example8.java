//5.Write a Java program to find the factorial of the given number.
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class JavaCoreBasic_Example8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number;
int factorial = 1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers : ");
number = sc.nextInt(); 
for(int i=1;i<=number;i++)
{
	factorial = factorial*i;
}
System.out.println( " The factorial is : " + " " + factorial);
	}
}
