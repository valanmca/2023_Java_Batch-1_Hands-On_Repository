package com.jenish.day09;

import java.io.File;
import java.io.FilenameFilter;

public class LabEx_03_Pathname_exist_or_not {

	public static void main(String[] args) {
		File f1 = new File("D:\\JAVA Practice\\Variables");
		String[] list = f1.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".txt")) {
					return true;
				}
					else {
						return false;
					}
					}
		});
					for (String f : list) {
						System.out.println(f);
					}
		}

}
