package com.jeban.Day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//Read and write image file

import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
public class Myf2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fr=new FileInputStream("D:\\JavaFiles/FGNaK0.gif");//open a file for Reading purpose
		FileOutputStream fw=new FileOutputStream("D:\\JavaFiles/Newimage.gif");//Create a new file for Writing purpose
		int ch=0;
		
		while((ch=fr.read()) !=-1) {
//			System.out.print(ch+" ->"+ (image)ch);
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("Image Copied");

		

	}

}
