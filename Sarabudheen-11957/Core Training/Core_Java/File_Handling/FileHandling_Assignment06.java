//Java program to check if the given pathname is a directory or a file
package com.sara.CoreJava.Day_10;

import java.io.File;

public class FileHandling_Assignment06 {

	public static void main(String[] args) {
		// Create a File object
		File file = new File("D:/File_Handling/sara_1.txt");
		File directory = new File("D:/File_Handling/Directory_01");

		if (directory.isDirectory()) {
			System.out.println(directory.getAbsolutePath() + " is a Directory \n");
		} else {
			System.out.println(directory.getAbsolutePath() + " is not a Directory\n");
		}

		if (file.isFile()) {
			System.out.println(file.getAbsolutePath() + " is a File\n");
		} else {
			System.out.println(file.getAbsolutePath() + " is not a Directory \n");
		}
	}

}
