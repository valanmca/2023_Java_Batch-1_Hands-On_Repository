package com.shiva.core.day10;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandle_02 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("F:/MyFile.txt");
		FileWriter fw = new FileWriter("F:/NewFile.txt");

		int ch = 0;

		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		fr.close();
		fw.close();
		System.out.println("File Copied");
	}

}
