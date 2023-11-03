package com.gayathri.day10Files;

/*
 * 1. Write a Java program to get a list of all file/directory names in the given directory.
 */
import java.io.File;

public class Ex7GetAllFiles {

	public static void main(String[] args) {
		File f1 = new File("D:/Core Java/");
		String[] fileList = f1.list(); 
		// String array to store list of files names as a string.
		for (int i = 0; i < fileList.length; i++) { 
			// Iterating that array to print the files.
			System.out.println(fileList[i]);
		}

	}
}