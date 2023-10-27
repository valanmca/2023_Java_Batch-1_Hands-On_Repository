package com.dharshu.day9;

import java.io.FileReader;
import java.io.IOException;

public class Ex_1_FileHandling {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader ("D:/MyFile.txt"); // Open a file for reading purpose
		int ch =0;
		while ((ch=fr.read()) != -1 ) {
			System.out.print((char)ch);
		}
		fr.close();
	}
}
