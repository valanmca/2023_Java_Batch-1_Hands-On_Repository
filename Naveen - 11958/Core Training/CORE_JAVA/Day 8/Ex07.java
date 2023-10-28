package com.naveen.day8;

//2. Write a Java program to get specific files with extensions from a specified folder.

import java.io.FilenameFilter;
import java.io.File;

public class Ex07 {

	public static void main(String[] args) {
		File f1 = new File("D:\\JAVA Practice\\Variables");
		String[] list = f1.list(new FilenameFilter() {
	           @Override
	            public boolean accept(File dir, String name) {
	             if(name.toLowerCase().endsWith(".class")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
		for(String f:list) {
			System.out.println(f);
		}
	}

}
