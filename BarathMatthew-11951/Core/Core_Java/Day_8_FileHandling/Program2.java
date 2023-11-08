package Day_8_FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

public class Program2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\picture.jpg");//open a file for reading purpose.
		FileOutputStream fw = new FileOutputStream("D:\\NewPicture.jpg");//create a new file for writing purpose.
		int ch =0;
		
		while((ch = fr.read() )!=-1) {
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
		System.out.println("Image copied");

	}

}
