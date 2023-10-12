//3.Write a Java program to print tables of the given number. Example : if the given number is 5 1 * 5 = 5 2 * 5 = 10 …….. 10 * 5 = 50
import java.util.Scanner;
import java.util.*;
import java.io.*;
public class JavaCoreBasic_Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println( " Enter the number : " ); 
		number = sc.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(i + " " + "*" + " " + number + " " + "=" + " " + number*i);
}
	}
}
