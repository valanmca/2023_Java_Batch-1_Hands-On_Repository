package com.jeban.java11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteString {

	public static void main(String[] args) {
		  Path file1 = Paths.get("D:/Java/Largest.java");
	        try {
	            Files.writeString(file1,"\n Hello World",StandardOpenOption.APPEND);
	            System.out.println("String Added Successfully...");
	        }catch(Exception e) {
	            
	        }
	}

}
