package com.jeyavel.core.Day8;

import java.io.File;

public class ExerciseEx4 {

	public static void main(String[] args) {
	  File Rerw = new File("D:\\MyFile.txt");
	  if(Rerw.canRead()) {
		  System.out.println(Rerw.getAbsolutePath()+" :This file can Read");
		  
	  }else {
		  System.out.println(Rerw.getAbsolutePath()+" :This file cannot Read");
	  }
	  if(Rerw.canWrite()) {
		  System.out.println(Rerw.getAbsolutePath()+" :This file can Write");
		  
	  }else {
		  System.out.println(Rerw.getAbsolutePath()+" :This file cannot Write");
	  }

	}

}
