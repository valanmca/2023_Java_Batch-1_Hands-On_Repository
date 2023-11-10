package com.madhan.coreday09;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.io.Serializable;


public class DeSerializationEx1 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fin=new FileInputStream("D:/ObjectFile.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		Employee emp2=(Employee) objin.readObject();
		objin.close();
		fin.close();
		
		emp2.display();
	}

}
