package com.sara.CoreJava.Day_16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteString {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("D://Virat_Kohli.txt");
		
		Files.writeString(path, "\n SARA...", StandardOpenOption.APPEND);
		
		System.out.println("String Succefully Added...");
	}

}
