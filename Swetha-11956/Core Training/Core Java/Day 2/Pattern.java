//Java program to print the pattern
package oopsDay1_Day2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		
//		String s1;
//		
//		for(int i=0;i<=num;i++) {
//			String str="";
//			for(int j=1;j<=i;j++) {
//				s1="*";
//				str=str+s1;
//				
//			}
//			System.out.println(str);
//			
//		}
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
