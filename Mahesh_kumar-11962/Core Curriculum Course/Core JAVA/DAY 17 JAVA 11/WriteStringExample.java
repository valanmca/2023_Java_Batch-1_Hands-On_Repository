package com.mahesh.core_java_day_17_v11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteStringExample {

	public static void main(String[] args) {
	
		Path file = Paths.get("D://sentence.txt");
		try
		{
			
			Files.writeString(file,"Hello soldiers", StandardOpenOption.WRITE);
			
			String value= Files.readString(file);
			System.out.println(value);
			
			// Overide the file 
			Files.writeString(file," ;)", StandardOpenOption.APPEND);
			System.err.println(" String Appended");
			// Append the file
			
			System.out.println(value);
			
		}
		
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}
