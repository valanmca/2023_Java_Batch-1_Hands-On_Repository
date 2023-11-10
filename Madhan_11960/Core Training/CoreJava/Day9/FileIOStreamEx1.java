package com.madhan.coreday09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStreamEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream("D:/Dhoniii.jpg");
		FileOutputStream fo=new FileOutputStream("D:/NewImage.jpg");
		
		int ch=0;
		while ((ch=fs.read())!=-1)
		{
			fo.write(ch);
				}
		fs.close();
		fo.close();
		System.out.println("Image copied");
		
	}

}
