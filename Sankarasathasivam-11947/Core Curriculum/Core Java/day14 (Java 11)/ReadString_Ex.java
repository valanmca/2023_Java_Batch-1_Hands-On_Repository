package com.shiva.core.day14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadString_Ex {
	static String data;

	public static void main(String[] args) {

		Path path = Paths.get("F:\\Java_Code\\MyFile.java");

		try {
			data = Files.readString(path);
		} catch (IOException e) {

		} finally {
			System.out.println(data);
		}
	}

}
