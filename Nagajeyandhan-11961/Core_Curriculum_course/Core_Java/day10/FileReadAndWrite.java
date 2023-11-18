package com.jeyandhan.day10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/MyFile.txt"); // open a file for reading purpose
		FileWriter fw  = new FileWriter("D:/NewFile.txt"); // Create a new file for writing purpose
		
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch); 
		}
		
		fr.close();
		fw.close();
		System.out.println("File Copied");
	}

}
