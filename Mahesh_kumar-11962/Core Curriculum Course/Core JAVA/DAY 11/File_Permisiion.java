package com.mahesh.core_java_day_11;

import java.io.File;

public class File_Permisiion {

	public static void main(String[] args) {

		File f_obj = new File("D:/OUTPUT.txt");
		if (f_obj.exists()) 
		{

			if (f_obj.canWrite()) {
				System.out.println(f_obj.getAbsolutePath() + " can writable format");
			} else {
				System.out.println(f_obj.getAbsolutePath() + " can't writable format");
			}

			if (f_obj.canRead()) {
				System.out.println(f_obj.getAbsolutePath() + " can readable format");
			} else {
				System.out.println(f_obj.getAbsolutePath() + " can't readable format");
			}
		} else {
			System.out.println("File not exist");
		}

	}

}
