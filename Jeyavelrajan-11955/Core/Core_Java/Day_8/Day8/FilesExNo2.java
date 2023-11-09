package com.jeyavel.core.Day8;

import java.io.FileInputStream;
//These two are used for the Binary forms like Images etc because they all are in Binary Forma`t 
import java.io.FileOutputStream;

import java.io.IOException;

public class FilesExNo2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("D:\\bird.jpg");//Open a Image for reading purpose
		FileOutputStream fo = new FileOutputStream ("D:\\NewBird.jpg");//Create a new image for Writing Puropse 
		int ch = 0;
		      //to assign the ch to read the the file while it is not -1 the wile loop will be ececuted
		      // and the generated input is an ASCII value 
		while((ch=fi.read())!=-1) {
			                  //type casting
			                  // it will change the Ascii value into character and diaplay it 
//			System.out.print((char)ch);
			//we copy the file from one file to another using the ch 
			fo.write(ch);
		}
        fi.close();
        fo.close();
        System.out.println("Image Copied");

	}

}
