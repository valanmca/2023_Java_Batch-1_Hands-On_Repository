package com.purushoth.day_09;

import java.io.File;
import java.io.FilenameFilter;

public class SpecificExtension {

	public static void main(String[] args) {
		File files=new File("D:/Directory");
		FilenameFilter text=new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				String lowercase=name.toLowerCase();
				if(lowercase.endsWith(".pdf")) {
					return true;
				}else {
					return false;
				}
				
			}
			
		};
		String arr[]=files.list(text);
		System.out.println("List of text Files: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
