package com.shiva.core.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Assign_01 {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("F:/Char.txt");

		File obj = new File("F:/Char.txt");

		int ch = 0;

		int count = 0;

		int vowel = 0;
		
		int word = 1;//Default
		
		int line = 1;

		while ((ch = fin.read()) != -1) {
			count++;
			System.out.print((char) ch);// Character count Assignment Done

			// To count the Vowels in the file
			int let = (char) ch;

			if (let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u') {
				vowel++;
			}

			// To count no of words in the file
			if (ch == 10 || ch == (char) ' ') {
				word++;
			}

			// To count the No of Lines
			if (ch == 10) {
				line++;
			}
		}

		System.out.println();
		System.out.println("The Number of Characters : " + count);// 31

		System.out.println("The Number of Vowels : " + vowel);// 9

		if (obj.length() == 0) {
			word = 0;
			line = 0;
		}

		System.out.println("The Number of Words : " + word);// 3

		System.out.println("The Number of Lines : " + line);//1

	}

}
