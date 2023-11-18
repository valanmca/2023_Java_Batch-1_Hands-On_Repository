package com.jeyandhan.day10;
import java.io.FileReader;
import java.io.IOException;

public class Files {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("D:/MyFile.txt"); // open a file for reading purpose
		
		int ch = 0;
		while((ch = fr.read()) != -1) {
			System.out.println((char)ch);
		}
		
		fr.close();
	}

}
