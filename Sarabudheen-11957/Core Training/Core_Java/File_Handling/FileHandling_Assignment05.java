//Java program to check if a file or directory has read and write permissions
package com.sara.CoreJava.Day_10;

import java.io.File;

public class FileHandling_Assignment05 {

	public static void main(String[] args) {

		// Create a File object
		File file = new File("D:/File_Handling/sara_1.txt");

		if (file.canRead()) {
			System.out.println(file.getAbsolutePath() + " Can Read \n");
		} else {
			System.out.println(file.getAbsolutePath() + " Can't Read \n");
		}

		if (file.canWrite()) {
			System.out.println(file.getAbsolutePath() + " Can Write \n");
		} else {
			System.out.println(file.getAbsolutePath() + " Can't Write \n");
		}
	}

}
