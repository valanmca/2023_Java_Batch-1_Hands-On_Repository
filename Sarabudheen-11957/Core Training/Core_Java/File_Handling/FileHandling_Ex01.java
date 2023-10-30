//Reading a file by file handling
package com.sara.CoreJava.Day_10;

import java.io.FileReader;
import java.io.IOException;

public class FileHandling_Ex01 {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader ("D:/File_Handling.txt"); //Open a file for reading	
	int ch =0;
	while((ch = file.read()) != -1) {
		System.out.print((char)ch);
	}
	file.close();	
	}

}
