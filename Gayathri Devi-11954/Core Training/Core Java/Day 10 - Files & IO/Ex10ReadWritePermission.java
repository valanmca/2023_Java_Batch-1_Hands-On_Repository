package com.gayathri.day10Files;
/*4. Write a Java program to check if a file or directory has read and write permissions.
 */
import java.io.File;
public class Ex10ReadWritePermission {

	public static void main(String[] args) {
		  File file = new File("D:/Core Java/Exercise1.txt");
	        if (file.canWrite())
	        {
	        System.out.println(file.getAbsolutePath() + " can write.\n");
	        }
	        else
	        {
	        System.out.println(file.getAbsolutePath() + " cannot write.\n");
	        }
	        if (file.canRead())
	        {
	        System.out.println(file.getAbsolutePath() + " can read.\n");
	        }
	        else
	        {
	        System.out.println(file.getAbsolutePath() + " cannot read.\n");
	        }
	}

}

