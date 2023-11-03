package com.gayathri.day10Files;
import java.io.File;
/*
3. Write a Java program to check if a file or directory specified by pathname exists or not.
*/

public class Ex9CheckFile {

	public static void main(String[] args) {
		File file = new File("D:\\Core Java\\");
		if(file.exists()) {
			System.out.println("File is exits");
		}
		else {
			System.out.println("File is not exits");
		}
	
	}

}

