package com.purushoth.day_15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class writeFileJava11 {

	public static void main(String[] args) {
Path path=Paths.get("D:/SampleJava11.txt");
		
		try {
			Files.writeString(path,"write", StandardOpenOption.WRITE);
			String data=Files.readString(path);
			System.out.println(data);
			System.out.println("Added Successfully");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
