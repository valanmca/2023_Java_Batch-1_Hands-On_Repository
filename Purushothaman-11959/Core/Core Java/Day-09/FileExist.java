package com.purushoth.day_09;

import java.io.File;

public class FileExist {

	public static void main(String[] args) {
		File file=new File("D:/Directory/2.txt");
		if(file.exists()) {
			System.out.println("The given file is exist");
		}else {
			System.out.println("The given file is not exist");
		}

	}

}
