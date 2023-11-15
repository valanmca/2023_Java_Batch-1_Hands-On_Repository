package com.shiva.core.day14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteString_Ex {

	public static void main(String[] args) {

		Path file = Paths.get("F:\\Java_Code\\java 11.txt");
		try {
			Files.writeString(file, "Hello Shiva ", StandardOpenOption.WRITE);

			String value = Files.readString(file);
			System.out.println(value);

			// Override the File
			Files.writeString(file, " ;)", StandardOpenOption.APPEND);
			System.err.println("String Appended");

			// Append File
			System.out.println(value);

		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
