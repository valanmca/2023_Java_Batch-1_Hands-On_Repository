package com.naveen.day8;

// Program for writing a file.
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/MyFile.txt"); //Open a file for reading purpose.
		FileWriter fw = new FileWriter("D:/NewFile.txt"); //Create a new file for writing purpose.
		
		int ch = 0;
		
		while((ch = fr.read()) != -1 ) {
			
			fw.write(ch);
			
		}
		
		fr.close();
		fw.close();
		
		System.out.println("File Copied");
				
	}

}
