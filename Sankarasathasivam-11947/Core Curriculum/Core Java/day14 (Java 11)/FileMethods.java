package com.core.day_14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileMethods {

	public static void main(String[] args) {
		try
		{
			Path path=Paths.get("D://java  codes//sample.txt");
			Path path1=Paths.get("D://","java  codes","sample.txt");
			String data=Files.readString(path);
			
			System.out.println(data);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
