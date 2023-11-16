package com.mahesh.core_java_day_11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writing {

	public static void main(String[] args) throws IOException {
		FileReader f_read = new FileReader("D:/DOC/Hello.txt");
		FileWriter f_write = new FileWriter("D:/DOC/Info.txt");
		int ch =0;
		while((ch = f_read.read())!=-1)
		{
			f_write.write(ch);
		}
		
		
		f_read.close();
		f_write.close();
		System.out.println("File Copied");
		
		

	}

}
