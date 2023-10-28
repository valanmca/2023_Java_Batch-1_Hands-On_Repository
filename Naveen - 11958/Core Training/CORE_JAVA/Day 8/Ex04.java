package com.naveen.day8;
//Serialization and De-serialization
import java.io.FileInputStream;
// Serialization and De-serialization
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Employee implements Serializable {

	// Variables
	transient int eid;
	String ename;
	float esalary;

	// Constructor
	Employee(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;

	}

	// Method
	void display() {
		System.out.println("Employee id :" + eid);
		System.out.println("Employee name :" + ename);
		System.out.println("Employee salary :" + esalary);

	}

}
public class Ex04 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Serialization
		Employee emp1 = new Employee(101, "Valan", 2000.0f);
		
		FileOutputStream fout = new FileOutputStream("D:/TestFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout); // used to convert the txt file into obj writable file.
		
		objout.writeObject(emp1);
		
		objout.close();
		fout.close();
		
		System.out.println("Object Saved");
		
		//De-Serialization
		FileInputStream fin = new FileInputStream("D:/TestFile.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp2 = (Employee) objin.readObject();
		objin.close();
		fin.close();
		
		emp2.display();
		
		}
}
