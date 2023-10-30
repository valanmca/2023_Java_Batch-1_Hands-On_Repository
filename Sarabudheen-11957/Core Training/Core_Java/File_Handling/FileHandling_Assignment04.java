//Java program to get specific files with extensions from a specified folder.

package com.sara.CoreJava.Day_10;

import java.io.File;
import java.io.FilenameFilter;

public class FileHandling_Assignment04 {

	public static void main(String[] args) {

		File directory = new File("D:/File_Handling");
		FilenameFilter filter = new FilenameFilter() {

			public boolean accept(File dir, String name) {
				String fileName = name.toLowerCase();
				if (fileName.endsWith(".txt")) {
					return true;
				} else {
					return false;
				}
			}
		};

		// List of all the text files
		String filesList[] = directory.list(filter);
		System.out.println("List of the text files in the specified directory:");
		for (String fileName : filesList) {
			System.out.println(fileName);
		}
	}

}
