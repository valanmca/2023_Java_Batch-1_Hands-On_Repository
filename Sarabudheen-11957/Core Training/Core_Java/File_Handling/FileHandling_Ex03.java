//Coping Image using FileInputStream and FileInputStream
package com.sara.CoreJava.Day_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling_Ex03 {

	public static void main(String[] args) throws IOException {
		FileInputStream file1 = new FileInputStream ("D:/Butterfly.jpg"); //Open a file for reading	
		FileOutputStream file2 = new FileOutputStream ("D:/CopyImage.jpg"); //Create a new file for writing
		int ch =0;
		while((ch = file1.read()) != -1) {
			file2.write(ch);
		}
		file1.close();	
		file2.close();	
		System.out.println("Image Copied...");
	}

}
