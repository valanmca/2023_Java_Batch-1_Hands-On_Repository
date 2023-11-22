package com.gayathri.day16Java11Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class P7WriteStirng {

	public static void main(String[] args) throws IOException {
		Path file1 = Paths.get("‪D://","Core Java","ReaderFile.txt");
		try {
		Files.writeString(file1, "\n Hai everyone", StandardOpenOption.APPEND);
		System.out.println("String Added Successully");
		}
		catch(Exception e) {
			
		}

	}

}
