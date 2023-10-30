//Java program to get a list of all file/directory names in the given directory
package com.sara.CoreJava.Day_10;

import java.io.File;

public class FileHandling_Assignment03 {

	public static void main(String[] args) {

		File directory = new File("D:/File_Handling");

		String file[] = directory.list();

		for (int i = 0; i < file.length; i++) {
			System.out.println(file[i]);
		}

	}

}
