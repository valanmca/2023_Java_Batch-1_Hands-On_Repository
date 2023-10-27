package com.dharshu.day9;

import java.io.File;
//3. Write a Java program to check if a file or directory specified by pathname exists or not.

public class Lab_Ex_2 {

	public static void main(String[] args) {
		File f1 = new File("D:\\JAVA Practice\\Variables\\Temp.txt");
		if (f1.exists())
		{
			System.out.println("The directory or file exists.\n");
			}else
			{
				System.out.println("The directory or file does not exist.\n");
				}
	}

}
