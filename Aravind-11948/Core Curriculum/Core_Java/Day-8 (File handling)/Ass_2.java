package com.core.day_08;

import java.io.File;

public class Ass_2 {

	public static void main(String[] args) {
		File obj=new File ("D:\\File handling");
		String [] filelist =obj.list();
		
		System.out.println("List of files: ");
		
		for(int i=0;i<filelist.length;i++) {
			System.out.println(filelist[i]);
		}
		
		
		
		
		 

	}

}
