package com.gayathri.day10Files;

import java.io.FileReader;
import java.io.IOException;
public class Ex1FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/Core Java/MyFile.txt");	//open a file for reading purpose
		int ch = 0;
		while((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		fr.close();
	}

}
