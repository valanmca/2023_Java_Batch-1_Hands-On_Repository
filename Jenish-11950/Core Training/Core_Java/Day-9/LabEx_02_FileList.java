package com.jenish.day09;

import java.io.File;

public class LabEx_02_FileList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("D:\\JAVA Practice\\Variables");
		String[] fileList = f1.list();
		for(int i=0; i<fileList.length; i++) {
			System.out.println(fileList[i]);
		}
	}

}
