package com.core.day_08;

import java.io.File;

public class Ass_5 {

	public static void main(String[] args) {
		File obj=new File("D:\\File handling/Myfile.txt");
		
		if(obj.canWrite())
		{
			System.out.println(obj.getAbsolutePath() +"   have write permision");
		}
		
		else
		{
			System.out.println(obj.getAbsolutePath()+" Cannot have write permision");
		}
		
		
		
		if(obj.canRead())
		{
			System.out.println(obj.getAbsolutePath() +"   have Read permision");
		}
		
		else
		{
			System.out.println(obj.getAbsolutePath()+" Cannot have Read permision");
		}

	}

}
