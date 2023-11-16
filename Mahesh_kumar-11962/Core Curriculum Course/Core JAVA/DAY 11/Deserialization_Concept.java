package com.mahesh.core_java_day_11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Emp implements Serializable {
	 int Eid;
	String Ename;

	Emp(int id, String name) {
		this.Eid = id;
		this.Ename = name;
	}

	void dis() {
		System.out.println(Eid);
		System.out.println(Ename);
	}
}

public class Deserialization_Concept {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// De-Serialization

		FileInputStream fin = new FileInputStream("D:/OUTPUT.txt");
		ObjectInputStream obj_in = new ObjectInputStream(fin);

		Emp e2 = (Emp) obj_in.readObject();
		obj_in.close();
		fin.close();
		e2.dis();

	}

}
