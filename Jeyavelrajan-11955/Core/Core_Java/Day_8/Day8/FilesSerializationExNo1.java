package com.jeyavel.core.Day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//we must use the implements Serialiazable it acts on like a switch to turn the serialization
//it like the security
class Employee implements Serializable{
	transient int id;
	String name;
	float salary;
	
	Employee(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("Employee Id :"+id);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee salary :"+salary);
	}
}

public class FilesSerializationExNo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Serialization
		Employee emp1 = new Employee(101,"jeyavel",2000.0f);
		FileOutputStream fout = new FileOutputStream("D:\\MyFile.txt");
		//this isused to pass the (fout-object) to the file 
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(emp1);
		objout.close();
		fout.close();
        System.out.println("it is serialized and the object is Saved");
        
        
        //De - serialization
        FileInputStream fin = new FileInputStream("D:\\MyFile.txt");
       // We convert the normal file into object redable file 
        ObjectInputStream objin = new ObjectInputStream(fin);
        Employee emp2 = (Employee) objin.readObject();
        objin.close();
        fin.close();
        System.out.println("De-serialized");
        
        emp2.display();
	}

}
