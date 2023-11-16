package com.mahesh.core_java_day_11;

import java.io.File;

public class List_Fol_File {

	public static void main(String[] args) {
		
		
		File f = new File("D:/");
		String[] list =f.list();
		for(int index =0;index<list.length;index++) {
			System.out.println(list[index]);
			
		}

	}

}
