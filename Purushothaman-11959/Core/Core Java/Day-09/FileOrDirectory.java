package com.purushoth.day_09;

import java.io.File;

public class FileOrDirectory {

	public static void main(String[] args) {
		File file=new File("D:/Directory/2.txt");
        if(file.isFile()) {
        	System.out.println("It is a file");
        }else {
        	System.out.println("It is not a file");
        }
        if(file.isDirectory()) {
        	System.out.println("It is directory");
        }else {
        	System.out.println("It is not directory");
        }
	}

}
