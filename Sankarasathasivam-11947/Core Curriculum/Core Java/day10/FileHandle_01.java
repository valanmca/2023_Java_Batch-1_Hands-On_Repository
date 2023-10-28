package com.shiva.core.day10;

import java.io.FileReader;
import java.io.IOException;

public class FileHandle_01 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("F:/MyFile.txt");// Open a file for Reading Purpose
		
		int ch = 0;

		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}

		fr.close();//Closing the opened file
	}

}
