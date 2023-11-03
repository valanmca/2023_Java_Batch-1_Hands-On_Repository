package com.gayathri.day10Files;



import java.io.IOException;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


//to store the object file permenently

public class Ex5Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {


		// Deseralization
		FileInputStream fis = new FileInputStream("D:/Core Java/ObjectFile.txt"); //opening file for reading purpose
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee) ois.readObject();
		ois.close();
		fis.close();
		emp2.display();
	}
}