package com.jenish.day09;

import java.io.File;

public class LabEx_05_PathName {

	public static void main(String[] args) {
		File myfile_dir = new File("D:\\JAVA Practice\\variables");
		if (myfile_dir.isDirectory()) {
			System.out.println(myfile_dir.getAbsolutePath() + " is a directory");
		}
		else {
			System.out.println(myfile_dir.getAbsolutePath() + " is not a directory");
		}
		if (myfile_dir.isFile()) {
			System.out.println(myfile_dir.getAbsolutePath() + " is a file");
		}
		else {
			System.out.println(myfile_dir.getAbsolutePath() + " is not a file");
		}

	}

}
