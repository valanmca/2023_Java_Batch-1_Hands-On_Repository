package com.naveen.day8;

import java.io.File;

//5. Write a Java program to check if the given pathname is a directory or a file.

public class Ex10 {

	public static void main(String[] args) {
		
		File f1 = new File("D:\\\\JAVA Practice\\\\Variables\\\\Temp.java");
        if (f1.isDirectory()) 
          {
           System.out.println(f1.getAbsolutePath() + " is a directory.\n");
          } 
        else
         {
           System.out.println(f1.getAbsolutePath() + " is not a directory.\n");
         }
        if (f1.isFile()) 
          {
           System.out.println(f1.getAbsolutePath() + " is a file.\n");
          } 
        else
         {
           System.out.println(f1.getAbsolutePath() + " is not a file.\n");
         }  
	}

}
