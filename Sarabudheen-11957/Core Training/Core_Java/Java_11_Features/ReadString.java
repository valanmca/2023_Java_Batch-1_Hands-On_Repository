//Java 11 Feature - ReadString method
package com.sara.CoreJava.Day_16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadString {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("D://Virat_Kohli.txt");

		String data = Files.readString(path);

		System.out.println(data);

	}

}
