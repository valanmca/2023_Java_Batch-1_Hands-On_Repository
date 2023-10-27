package com.core.day_08;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_read_Write_ByteStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file_read=new FileInputStream("D:/File handling/mt15.jpg");
		
		FileOutputStream file_write =new FileOutputStream("D:/File handling/new.jpg");
		
		int ch=0;
		
		while ((ch=file_read .read())!=-1) {
//			System.out.print((char)ch);
			
			file_write.write(ch);
			
		}
			
		
			
		file_read.close();
		file_write.close();
		System.out.println(" Image Copied");
		

	}

}
