//Writing in the file by file handling
package com.sara.CoreJava.Day_10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_Ex02 {

	public static void main(String[] args) throws IOException {
		FileReader file1 = new FileReader ("D:/File_Handling.txt"); //Open a file for reading	
		FileWriter file2 = new FileWriter ("D:/File_Handling_2.txt"); //Create a new file for writing
		int ch =0;
		while((ch = file1.read()) != -1) {
			file2.write(ch);
		}
		file1.close();	
		file2.close();	
		System.out.println("File Copied...");
	}

}
