package com.jeyavel.core.Day8;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesExNo1 {

	public static void main(String[] args) throws IOException {
		//we cannot use these to copy images they are binary orieanted 
		FileReader fr = new FileReader("D:\\MyFile.txt");//Open a file for reading purpose
		FileWriter fw = new FileWriter("D:\\NewFile.txt");//Creat a new file for Writing Puropse 
		int ch = 0;
		      //to assign the ch to read the the file while it is not -1 the wile loop will be ececuted
		      // and the generated input is an ASCII value 
		while((ch=fr.read())!=-1) {
			                  //type casting
			                  // it will change the Ascii value into character and diaplay it 
			System.out.print((char)ch);
			//we copy the file from one file to another using the ch 
			fw.write(ch);
		}
        fr.close();
        fw.close();
        System.out.println("File Copied");
	}

}
