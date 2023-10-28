package com.shiva.core.day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle_Byte {

	public static void main(String[] args) throws IOException {

		FileInputStream fr = new FileInputStream("F:/Boy.jpg");
		FileOutputStream fw = new FileOutputStream("F:/NewImage.jpg");

		int ch = 0;

		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		fr.close();
		fw.close();
		System.out.println("Image Copied");

	}

}
