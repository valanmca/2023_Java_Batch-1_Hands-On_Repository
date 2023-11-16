package com.mahesh.core_java_day_11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {
	transient int Eid;
	// we can't convert into serializable
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

public class Serializing_Concept {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Serialization

		Emp e = new Emp(33, "mahesh");
		FileOutputStream f_out = new FileOutputStream("D:/OUTPUT.txt");
		ObjectOutputStream obj_out = new ObjectOutputStream(f_out); // if you want to convert the object into stream ,
																	// you want to use ObjectOutputStream.
		obj_out.writeObject(e);
		obj_out.close();
		f_out.close();
		System.out.println("Object Saved");

	}

}
