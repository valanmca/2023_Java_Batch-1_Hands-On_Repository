// Palindrome using string buffer

package com.jeyandhan.day03;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str;
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter a text: ");
		str = sc.next();
		
		StringBuffer sb = new StringBuffer(str);
		
		sb.reverse();
		
		String data = sb.toString();
		
		if(str.equalsIgnoreCase(data)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
