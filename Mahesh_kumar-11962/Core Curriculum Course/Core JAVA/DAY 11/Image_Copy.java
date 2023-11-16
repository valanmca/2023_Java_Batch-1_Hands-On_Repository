package com.mahesh.core_java_day_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Image_Copy {

	public static void main(String[] args) throws IOException {
	
		FileInputStream img_read = new FileInputStream("D:/DOC/kick.jpg");
		FileOutputStream img_write = new FileOutputStream("D:/DOC/kick_bud.png");
		int ch =0;
		while((ch = img_read.read())!=-1)
		{
			img_write.write(ch);
		}
		
		
		img_read.close();
		img_write.close();
		System.out.println("Image Copied");

	}

}
