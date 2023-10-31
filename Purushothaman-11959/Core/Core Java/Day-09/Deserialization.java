package com.purushoth.day_09;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream("D:/EmpObject.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp2=(Employee) objin.readObject();
		objin.close();
		fin.close();
		
		emp2.display();


	}

}//To get data of employee using deserialization.
