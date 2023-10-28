package com.jenish.day09;

import java.io.File;

public class LabEx_04_Read_Write {

	public static void main(String[] args) {
		File myfile_dir = new File("D:\\JAVA Practice\\Variables\\Temp.java");
		if (myfile_dir.canWrite()) {
			System.out.println(myfile_dir.getAbsolutePath() + " Can write");
		}
		else {
			System.out.println(myfile_dir.getAbsolutePath() + " Cannot write");
		}
		if (myfile_dir.canRead()) {
			System.out.println(myfile_dir.getAbsolutePath() + " Can read");
		}
		else {
			System.out.println(myfile_dir.getAbsolutePath() + " Cannot read");
		}

	}

}
