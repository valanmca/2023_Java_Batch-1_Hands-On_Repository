package com.purushoth.day_09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteTxt {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:/MyFile.txt"); //Open a file for Reading purpose.
        FileWriter fw=new FileWriter("D:/NewFile.txt");
		
        int ch=0;
        
        while((ch=fr.read()) != -1) {
        	fw.write(ch);
        	System.out.print((char)ch);
        }
        
        fr.close();
        fw.close();
        System.out.println("File copied");
	}

}//To write the file.
