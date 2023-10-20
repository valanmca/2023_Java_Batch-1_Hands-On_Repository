package com.mahesh.core_java_day_03;
import java.util.*;
public class Str_Buffer_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Word : ");
		String  word = sc.nextLine();
		
		StringBuffer copy_word = new StringBuffer(word);
		copy_word.reverse();
	
		String dup_word = copy_word.toString();
		if(word.equalsIgnoreCase(dup_word))
		{
			System.out.println("\nPALINDROME");
		}
		else
		{
			System.out.println("\nNON PALINDROME");
		}

	}

}
