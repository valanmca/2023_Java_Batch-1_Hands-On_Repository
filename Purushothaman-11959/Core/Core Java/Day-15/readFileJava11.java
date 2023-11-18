package com.purushoth.day_15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class readFileJava11 {

	public static void main(String[] args) {
		try {
			Path path=Paths.get("D:/SampleJava11.txt");
			String data=Files.readString(path);
			System.out.println(data);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
