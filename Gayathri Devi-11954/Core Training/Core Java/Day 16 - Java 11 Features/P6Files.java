package com.gayathri.day16Java11Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P6Files {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("‪D://Core Java//ReaderFile.txt");
		String data = Files.readString(path);
		System.out.println(data);

	}

}
