package com.mahesh.core_java_day_11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class File_Filter {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:/sentence.txt");
		File f = new File("D:/sentence.txt");
		int ch = 0, count = 0, vowel = 0, word = 1, line = 1;
		while ((ch = fr.read()) != -1) {
			count++;
			if (ch == (char) 'A' || ch == (char) 'a' || ch == (char) 'E' || ch == (char) 'e' || ch == (char) 'I'
					|| ch == (char) 'i' || ch == (char) 'O' || ch == (char) 'o' || ch == (char) 'U'
					|| ch == (char) 'u') {
				vowel++;

			}
			if (ch == (char) ' ' || ch == 10) {
				word++;
			}
			if (ch == 10) {
				line++;
			}
		}

		System.out.println();
		System.out.println("Total charactors count : " + count);
		System.out.println("Total vowles : " + vowel);
		if (f.length() == 0) {
			word = 0;
			line = 0;
		}
		System.out.println("Total words : " + word);
		System.out.println("Total Lines : " + line);

	}

}
