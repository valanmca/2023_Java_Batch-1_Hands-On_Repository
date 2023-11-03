package com.gayathri.day10Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Ex3FileIOStream {

	//images - binary data- are byte stram so we used input/output stram

	//normal text are using character stram so use file reader & filewriter
	
	public static void main(String[] args) throws IOException  {
		
		FileInputStream fis = new FileInputStream("D:/Core Java/me.jpg");
		FileOutputStream fos = new FileOutputStream("D:/Core Java/newme.jpg");
		int ch = 0;
		//img reading
		while( ( ch = fis.read() ) != -1) {
			System.out.print((char)ch);
			}
		//img writing
		while( ( ch = fis.read() ) != -1) {
		fos.write(ch);
		}
		fis.close();
		fos.close();
		System.out.println("Image Copied");
	}

}