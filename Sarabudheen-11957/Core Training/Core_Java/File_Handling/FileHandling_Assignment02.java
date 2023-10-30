//Java program to check if a file or directory specified by pathname exists or not
package com.sara.CoreJava.Day_10;

import java.io.File;

public class FileHandling_Assignment02 {

	public static void main(String[] args) {
		File f = new File("D:/Virat_Kohli.txt");
		if (f.exists()) {
			System.out.println("File Exists...");
		} else {
			System.out.println("File Not Exists...");
		}
	}

}
