package com.madhan.coreday09;



	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	
	public class FileWriterEx1 {
	
		public static void main(String[] args) throws IOException {
			FileReader fr=new FileReader("C:\\Users\\madhan.pothiraj\\Documents\\Files.txt");
			FileWriter fw=new FileWriter("D:/NewFile.txt");
			int ch=0;
			while((ch=fr.read())!=-1)
			{
				fw.write(ch);
			}
			fr.close();
			fw.close();
			System.out.println("File Copied");
		}

	}
