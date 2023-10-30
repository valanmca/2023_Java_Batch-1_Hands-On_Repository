//Java program to count no of Characters,Words,Lines and Vowels in a file
package com.sara.CoreJava.Day_10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling_Assignment01 {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("D:/Virat_Kohli.txt"); // Open a file for reading

		File f = new File("D:/Virat_Kohli.txt");
		int ch = 0;
		int char_count = 0;
		int word_count = 1;
		int line_count = 1;
		int vowel_count = 0;

		while ((ch = file.read()) != -1) {// Count no of Characters
			char_count++;

			// Count no of Words
			if ((char) ch == ' ' || ch == 10) {
				word_count++;
			}

			// Count no of Lines
			if (ch == 10) {
				line_count++;
			}

			// Count no of Vowels
			if ((char) ch == 'a' || (char) ch == 'e' || (char) ch == 'i' || (char) ch == 'o' || (char) ch == 'u'
					|| (char) ch == 'A' || (char) ch == 'E' || (char) ch == 'I' || (char) ch == 'O'
					|| (char) ch == 'U') {
				vowel_count++;
			}

		}
		if (f.length() == 0) {
			word_count = 0;
			line_count = 0;
		}
		System.out.println(" ");
		System.out.println("Total no of Characters is : " + char_count);
		System.out.println("Total no of Words is : " + (word_count));
		System.out.println("Total no of Line is : " + (line_count));
		System.out.println("Total no of Vowel is : " + vowel_count);

		file.close();

	}
}
