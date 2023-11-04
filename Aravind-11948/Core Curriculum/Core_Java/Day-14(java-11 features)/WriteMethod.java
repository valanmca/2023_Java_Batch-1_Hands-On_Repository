package com.core.day_14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class WriteMethod {

	public static void main(String[] args) {
		Path path1=Paths.get("D://","java  codes","sample.txt");
		try {
			Files.writeString(path1,"\nHello guys welcome to java 11", StandardOpenOption.WRITE);
			
			String data=Files.readString(path1);
			
			
			System.out.println(data);
			System.out.println("String Added Successfully!");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
