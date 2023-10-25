package com.core.day_06_; 
//scenario 1 coding is correct and using throws to avoid compile time error
import java.io.FileReader;
import java.io.FileNotFoundException;

public class HandlingFile {

	public static void main(String[] args) throws  FileNotFoundException {
		
//		int a=10/0; //compile doesn't forced. Checked Exception
		
		FileReader fr=new FileReader("Demo.txt"); // compiler forces us to handle the exception. -checked Exception

	}

}
