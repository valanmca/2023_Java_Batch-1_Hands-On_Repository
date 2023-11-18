package com.jeyandhan.day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
FileInputStream fin = new FileInputStream("D:/ObjectFile.txt");
		
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		Employee emp2 = (Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println("Object Saved");
		emp2.disp();
		
	}
}
