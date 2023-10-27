package com.dharshu.day9;

import java.io.File;

//4. Write a Java program to check if a file or directory has read and write permissions.

public class Lab_Ex_5 {

	public static void main(String[] args) {
		File file = new File("D:\\JAVA Practice\\Variables\\Temp.java");
		if (file.canWrite())
		{
		System.out.println(file.getAbsolutePath() + " can write.\n");
		}
		else
		{
		System.out.println(file.getAbsolutePath() + " cannot write.\n");
		}
		if (file.canRead())
		{
		System.out.println(file.getAbsolutePath() + " can read.\n");
		}
		else
		{
		System.out.println(file.getAbsolutePath() + " cannot read.\n");
		}


	}

}
