package com.naveen.day8;

//1. Write a Java program to get a list of all file/directory names in the given directory.

import java.io.File;

public class Ex06 {

	public static void main(String[] args) {
		File f1 = new File("D:\\JAVA Practice\\Variables");
		String[] fileList = f1.list(); //String array to store list of files names as a string.
		for(int i=0; i<fileList.length; i++) {  //Iterating that array to print the files.
			System.out.println(fileList[i]);
		}
	}

}
