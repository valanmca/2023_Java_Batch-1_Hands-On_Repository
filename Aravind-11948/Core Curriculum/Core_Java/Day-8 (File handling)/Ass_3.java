package com.core.day_08;

import java.io.File;
import java.io.FilenameFilter;

public class Ass_3 {
	
	public static void main(String[] args) {
		
		File obj=new File ("D:\\File handling");
		
		
		
		FilenameFilter filter=new FilenameFilter()
				{

					@Override
					public boolean accept(File dir, String name) {
						String lowercasename=name.toLowerCase();
						if (lowercasename.endsWith(".txt"))
						{
							return true;
						}
						else {
							
						return false;
						}
					}
			
				};
				
				String [] filelist =obj.list(filter);
			
		System.out.println("List of files: ");
		
		for(int i=0;i<filelist.length;i++) {
			System.out.println(filelist[i]);
		}
		
	}

}
