//Write a Java program to check if a file or directory specified by pathname exists or not

package com.shiva.core.day10;

import java.io.File;

public class Assign_04 {

	public static void main(String[] args) {

		File obj = new File("F:/New.txt");

		if (obj.exists()) {
			System.out.println("File Exists");
		} else {
			System.err.println("File Not Exists");
		}

	}

}
