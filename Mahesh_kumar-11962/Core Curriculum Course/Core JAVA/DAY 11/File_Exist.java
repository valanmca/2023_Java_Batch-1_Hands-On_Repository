package com.mahesh.core_java_day_11;

import java.io.File;

public class File_Exist {

	public static void main(String[] args) {
		
		File f_obj = new File("D:/OUTPUT.txt");
		if(f_obj.exists())
		{
			System.out.println("File is exist");
		}
		else
		{
			System.out.println("File not exist");
		}
		
	}

}
