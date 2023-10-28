//Write a Java program to check if the given pathname is a directory or a file.

package com.shiva.core.day10;

import java.io.File;

public class Assign_06 {

	public static void main(String[] args) {
		File obj = new File("F:/");

		if (obj.isDirectory()) {
			System.out.println("The given file is Directory");
		} else if (obj.isFile()) {
			System.out.println("It is a File");
		}
	}

}