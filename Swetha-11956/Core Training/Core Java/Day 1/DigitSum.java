package oopsDay1_Day2;
import java .util.Scanner;
public class DigitSum {

	public static void main(String[] args) {
		int rem;
		int n=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		int n1=num;
		
		while(num>0) {
			rem=num%10;
			n=n+rem;
			num=num/10;
		}
		System.out.println("Sum of digits of given number "+n1+ " is " + n);
		
	}

}
