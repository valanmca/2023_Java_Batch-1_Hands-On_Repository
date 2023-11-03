package com.gayathri.day10Files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Ex2FileWriter {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/Core Java/ReaderFile.txt");	//open a existing file for reading purpose
		FileWriter fw = new FileWriter("D:/Core Java/WriterFile.txt");	//create a new file for writing purpose
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File Copied");
	}

}

