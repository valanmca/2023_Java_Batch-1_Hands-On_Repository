package com.jeyavel.core.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadAndWrite {

	public static void main(String[] args) {
			Path file1 =Paths.get("D://","java11","sample.txt");
			
			try {
				Files.writeString(file1, "\n Hello form batch 1 ", StandardOpenOption.WRITE);
				String value =Files.readString(file1);
			
				
				System.out.println(value);
			
			}catch(IOException e){
				
			}

		}


	}

