package com.gayathri.day10Files;

import java.io.File;

/*
5. Write a Java program to check if the given pathname is a directory or a file.
 */
public class Ex11CheckPathName {

	public static void main(String[] args) {
		File file = new File("‪D:/Core Java/");
		if(file.isDirectory()) 
			System.out.println("Given pathname is Directory");
		
		else {
			System.out.println("Given pathname not directory");
		}
		
		
		if(file.isFile()) {
			System.out.println(file.getAbsolutePath()+"Given pathname is file");
		}
		else {
			System.out.println("Given pathname is not file");
		}
		
	
	}
}
