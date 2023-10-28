package com.naveen.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Program for reading and writing a image
public class Ex03 {

		public static void main(String[] args) throws IOException {
			FileInputStream fr = new FileInputStream("D:/n.png"); //Open a img for reading purpose.
			FileOutputStream fw = new FileOutputStream("D:/n1.png"); //Copying the same img.
			
			int ch = 0;
			
			while((ch = fr.read()) != -1 ) {
				
				fw.write(ch);
				
			}
			
			fr.close();
			fw.close();
			
			System.out.println("Image Copied");
					
		}
	}


