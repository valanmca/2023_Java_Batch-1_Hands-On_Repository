package com.purushoth.day_09;

import java.io.File;

public class ReadWritePermission {

	public static void main(String[] args) {
		File file=new File("D:/Directory/1.txt");
		if(file.canRead()) {
			System.out.println("We can read");
		}else {
			System.out.println("We can't read");
		}
		if(file.canWrite()) {
			System.out.println("We can write");
		}else {
			System.out.println("We can't write");
		}

	}

}
