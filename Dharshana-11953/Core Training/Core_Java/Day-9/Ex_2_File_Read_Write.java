package com.dharshu.day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex_2_File_Read_Write {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/MyFile.txt"); //Open a file Reading purpose
		FileWriter fw = new FileWriter("D:/NewFile.txt"); //Create a new file for writing purpose
		int ch = 0;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		
		fw.close();
		System.out.println("File Copied");


	}

}
