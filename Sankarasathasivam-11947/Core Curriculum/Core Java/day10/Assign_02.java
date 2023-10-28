//Write a Java program to get a list of all file/directory names in the given directory.

package com.shiva.core.day10;

import java.io.File;

public class Assign_02 {

	public static void main(String[] args) {

		File Obj = new File("F:/");
		String[] filelist = Obj.list();
		
		System.out.println("List Of Files :");
		
		for (int i = 0; i < filelist.length; i++) {
			System.out.println(filelist[i]);
		}

	}
}
