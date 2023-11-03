package com.gayathri.day10Files;
/*
2. Write a Java program to get specific files with extensions from a specified folder.
 */
import java.io.File;
import java.io.FilenameFilter;
public class Ex8GetSpecificFile {

	public static void main(String[] args) {
		 File f1 = new File("D:/Core Java/");
	        String[] list = f1.list(new FilenameFilter() {
	            @Override
	            public boolean accept(File dir, String name) {
	                if (name.toLowerCase().endsWith(".txt")) {
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for (String f : list) {
	            System.out.println(f);
	        }
	    }
}