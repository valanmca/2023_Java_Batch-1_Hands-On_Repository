package com.mahesh.core_java_day_11;

import java.io.File;
import java.io.FilenameFilter;

public class File_Extension {

	public static void main(String[] args) {

		

		File file = new File("D:/DOC/");

		String[] list = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".jpg")) {
					return true;
				} else {
					return false;
				}
			}
		});

		for (String f : list) {
			System.out.println(f);
		}
	}

}
