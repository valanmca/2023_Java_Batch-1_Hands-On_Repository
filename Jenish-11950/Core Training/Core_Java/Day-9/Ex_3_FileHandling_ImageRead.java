package com.jenish.day09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_3_FileHandling_ImageRead {

	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:/BirdVd.jpg"); //Open a file Reading purpose
		FileOutputStream fw = new FileOutputStream("D:/NewVideo.jpg"); //Create a new file for writing purpose
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		
		fr.close();
		fw.close();
		System.out.println("Video Copied");

	}

}
