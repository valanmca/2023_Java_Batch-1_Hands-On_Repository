package com.purushoth.day_09;

import java.io.FileReader;
import java.io.IOException;
public class FileRead {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:/MyFile.txt"); //Open a file for Reading purpose.
		
        int ch=0;
        
        while((ch=fr.read()) != -1) {
        	System.out.print((char)ch);
        }
        
        fr.close();
	}

}//To read the file.
