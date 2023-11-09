package com.jeyavel.core.Day8;

import java.io.File;

public class ExerciseEx1_1 {

	public static void main(String[] args) {
		File dictor = new File("D:\\backup");
		String[] files = dictor.list();
		for(int i=0;i<dictor.length();i++) {
			System.out.println(files[i]);
		}
		
		 

	}

}
