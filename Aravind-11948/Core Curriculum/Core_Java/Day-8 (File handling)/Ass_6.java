package com.core.day_08;

import java.io.File;

public class Ass_6 {

	public static void main(String[] args) {
		File obj=new File("D:\\File handling/Myfile.txt");
		
		if (obj.isDirectory())
		{
			System.out.println("given file is directory");
		}
		
		else  if (obj.isFile())
		{
			System.out.println("It is file");
		}
		

	}

}
