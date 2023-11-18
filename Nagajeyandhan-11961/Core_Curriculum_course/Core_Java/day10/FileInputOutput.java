package com.jeyandhan.day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInputOutput {

	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:/Bird.jfif"); // open a file for reading purpose
		FileOutputStream fw  = new FileOutputStream("D:/NewImage.jpg"); // Create a new file for writing purpose
		
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch); 
		}
		
		fr.close();
		fw.close();
		System.out.println("Image Copied");
	}

}
