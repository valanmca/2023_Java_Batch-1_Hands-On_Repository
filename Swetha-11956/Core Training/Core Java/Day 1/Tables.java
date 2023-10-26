//Write a Java program to print tables of the given number.
//Example : if the given number is 5
//1 * 5 = 5
//2 * 5 = 10
//……..
//10 * 5 = 50

package oopsDay1_Day2;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		int num1=num;
		for(int i=1;i<=10;i++) {
			System.out.println(i +"*"+num1+ "="+(i*num));
		}
		
	}

}
