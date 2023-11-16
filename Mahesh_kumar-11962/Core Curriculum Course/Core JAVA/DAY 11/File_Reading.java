package com.mahesh.core_java_day_11;

import java.io.FileReader;
import java.io.IOException;

public class File_Reading {

	public static void main(String[] args) throws IOException {

		FileReader file_read = new FileReader("D:/DOC/Hello.txt");
		int ch = 0;
		while ((ch = file_read.read()) != -1) {
			System.out.print( ch+" -> "+(char)ch+" ");
			System.out.println();
			
		}
		file_read.close();
	}

}
