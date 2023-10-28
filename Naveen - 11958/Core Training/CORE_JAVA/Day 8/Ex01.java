package com.naveen.day8;

// Program for reading a file.
import java.io.FileReader;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/MyFile.txt"); //Open a file for reading purpose.
		int ch = 0;
		
		while((ch = fr.read()) != -1 ) {
			System.out.print((char)ch);
		}
		
		fr.close();
				
	}

}
