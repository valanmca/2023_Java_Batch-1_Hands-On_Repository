package com.jeyavel.core.Day8;

import java.io.File;

public class ExerciseEx5 {

	public static void main(String[] args) {
	File dict = new File("D:");
	if(dict.isDirectory()) {
		System.out.println(dict.getAbsolutePath()+" It is a Directory");
	}else {
		System.out.println(dict.getAbsolutePath()+" It is Not a Directory");
	}if(dict.isFile()){
		System.out.println(dict.getAbsolutePath()+" It is a File");
	}else {
		System.out.println(dict.getAbsolutePath()+" It is Not a File");
	}

	}

}
