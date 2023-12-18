package com.jeban.Day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Myf1 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\JavaFiles/Myfile1.txt");//open a file for Reading purpose
		FileWriter fw=new FileWriter("D:\\JavaFiles/Myfile2.txt");//Create a new file for Writing purpose
		int ch=0;
		
		while((ch=fr.read()) !=-1) {
			System.out.print( (char)ch);
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File Copied");

	}

}
