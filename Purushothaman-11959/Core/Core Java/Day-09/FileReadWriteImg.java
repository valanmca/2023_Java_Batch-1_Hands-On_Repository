package com.purushoth.day_09;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWriteImg {

	public static void main(String[] args) throws IOException {
		FileInputStream fr=new FileInputStream("D:/car.jpg"); //Open a file for Reading purpose.
        FileOutputStream fw=new FileOutputStream("D:/NewCar.jpg");
		
        int ch=0;
        
        while((ch=fr.read()) != -1) {
        	fw.write(ch);
        }
        
        fr.close();
        fw.close();
        System.out.println("File copied");
	}

}//To write the image.


