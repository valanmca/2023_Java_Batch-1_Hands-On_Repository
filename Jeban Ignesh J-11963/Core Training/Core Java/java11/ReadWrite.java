package com.jeban.java11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadWrite {

	public static void main(String[] args) {
        Path file1=Paths.get("D:/Java/Largest.java");
		try {
			Files.writeString(file1, "\n Hello World,Welcome to Sathyam cinemaaa.....", StandardOpenOption.WRITE);
			String value=Files.readString(file1);
			System.out.println(value);
		} catch (Exception e) {

		}
	
	

	}}


