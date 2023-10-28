//Write a Java program to get specific files with extensions from a specified folder.

package com.shiva.core.day10;

import java.io.File;
import java.io.FilenameFilter;

public class Assign_03 {

	public static void main(String[] args) {

		File Obj = new File("F:/");
		FilenameFilter Filter = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				String lowercaseName = name.toLowerCase();

				if (lowercaseName.endsWith(".txt")) {
					return true;
				} else {
					return false;
				}

			}
		};

		String filelist[] = Obj.list(Filter);

		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}

	}

}
