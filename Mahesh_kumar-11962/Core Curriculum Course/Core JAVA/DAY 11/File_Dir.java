package com.mahesh.core_java_day_11;

import java.io.File;

public class File_Dir {

	public static void main(String[] args) {
		File f_obj = new File("D:/OUTPUT.txt");
		if (f_obj.exists()) {

			if (f_obj.isDirectory()) {
				System.out.println(f_obj.getAbsolutePath() + "is a Directory");
			} else {
				System.out.println(f_obj.getAbsolutePath() + " is not a Directory");
			}

			if (f_obj.isFile()) {
				System.out.println(f_obj.getAbsolutePath() + " is a File");
			} else {
				System.out.println(f_obj.getAbsolutePath() + " is not a File");
			}
		} else {
			System.out.println("File not exist");
		}

	}

}
