package com.purushoth.day_09;

import java.io.File;

public class ListDirectory {

	public static void main(String[] args) {
		File Files=new File("D:/Directory");
		String arr[]=Files.list();
		System.out.println("List of Files: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}// To list directory in the folder or directory.
