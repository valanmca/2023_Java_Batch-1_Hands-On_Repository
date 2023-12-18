package com.jeban.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadString {

	public static void main(String[] args) {
		try {
            Path path = Paths.get("D:/Java/Myclass.java");
            
            String data = Files.readString(path);
            
            System.out.println(data);
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }

	}

}
