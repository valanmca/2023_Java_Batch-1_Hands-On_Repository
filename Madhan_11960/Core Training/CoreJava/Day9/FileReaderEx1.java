package com.madhan.coreday09;

import java.io.FileReader;
import java.io.IOException;
public class FileReaderEx1 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\madhan.pothiraj\\Documents\\Files.txt");
		
		int ch=0;
		while((ch=fr.read())!=-1)
		{
			System.out.print((char)ch);
		}
		fr.close();
	}

}
