/*
 * Write a Java program to read a data from the file and perform the below:
1. Count the total no of characters
2. Count the total no of words.
3. Count the total no of Lines.
4. Count the total no of Vowels.

 */
package com.gayathri.day10Files;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex6CountingData {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:/Core Java/Exercise1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int ch = 0;
		int characterCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		int vowelCount = 0;
			
			while ((ch = fr.read()) != -1)// int
			{
				System.out.print((char)ch);
				characterCount++;
				if(ch==32)//ASCII value for space
					wordCount++;
				if(ch==46)//ASCII value for dot
					lineCount++;
				if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u')
					vowelCount++;
			}
			System.out.println("\nNo.of.characters in file : " + characterCount);
			System.out.println("No.of.words in file : " + wordCount);
			System.out.println("No.of.lines in file : " + lineCount);
			System.out.println("No.of.vowels in file : " + vowelCount);
			//System.out.println("No.of.cosonent in file : " + consonentCount);

		br.close();
		fr.close();
	}

}
