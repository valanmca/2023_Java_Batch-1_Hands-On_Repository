package com.shiva.core.day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("F:/ObjectFile.txt");
		ObjectInputStream Objin = new ObjectInputStream(fin);

		Employee emp2 = (Employee) Objin.readObject();

		Objin.close();
		fin.close();

		emp2.display();	
	}

}
