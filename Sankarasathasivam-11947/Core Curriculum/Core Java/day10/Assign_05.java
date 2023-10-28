//Write a Java program to check if a file or directory has read and write permissions.

package com.shiva.core.day10;

import java.io.File;

public class Assign_05 {

	public static void main(String[] args) {

		File obj = new File("F:/NewFile.txt");

		if (obj.canWrite()) {
			System.out.println(obj.getAbsolutePath() + " Have Permission to Write");
		} else {
			System.err.println(obj.getAbsolutePath() + " Can't have Permission to Write");
		}

		if (obj.canRead()) {
			System.out.println(obj.getAbsolutePath() + " Have Permission to Read");
		} else {
			System.err.println(obj.getAbsolutePath() + " Can't have Permission to Write");
		}

	}

}
