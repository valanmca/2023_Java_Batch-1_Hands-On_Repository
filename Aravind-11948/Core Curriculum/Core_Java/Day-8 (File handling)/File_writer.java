package com.core.day_08;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class File_writer {

	public static void main(String[] args) throws IOException {
		
		FileReader File_read =new FileReader("D:/File handling/Myfile.txt"); //open a file for reading purpose 
		
		FileWriter File_write=new FileWriter("D:/File handling/Newfile.txt");
		
		int ch=0;
		
		while ((ch=File_read .read())!=-1) {
//			System.out.print((char)ch);
			
			File_write.write(ch);
			
		}
			
			
		File_read.close();
		File_write.close();
		System.out.println(" File Copied");
		

	}

}
