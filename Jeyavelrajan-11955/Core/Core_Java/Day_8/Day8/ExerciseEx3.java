package com.jeyavel.core.Day8;

import java.io.File;

public class ExerciseEx3 {

	public static void main(String[] args) {
		File isExis = new File("D:\\NewFile.txt");
		if(isExis.exists()) {
			System.out.println("The file or Directory is Exists");
		}else {
			System.out.println("The file or Directory is Not Exists");
		}

	}

}
