package com.mahesh.core_java_day_17_v11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadStringExample {
	static String data;

	public static void main(String[] args) {

		Path path = Paths.get("D://Hello.java");

		try {
			data = Files.readString(path);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println(data);
		}
	}

}
