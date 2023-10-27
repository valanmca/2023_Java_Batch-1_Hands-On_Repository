package com.core.day_08;

import java.io.File;

public class Ass_4 {

	public static void main(String[] args) {
		
File obj=new File("D:\\File handling/mt15.jpg");

    if (obj.exists())
    {
    	System.out.println("Exists");
    }
    
    else
    {
    	System.out.println("File not find");
    }
	}

}
