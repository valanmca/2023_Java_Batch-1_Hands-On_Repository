package Core_Topic_Domnic_Day_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient int id;   //transient = it makes the variable can't serialize
	String name;
	float salary;
	
	Employee(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	void display() {
		System.out.println("Employee id : "+id);
		System.out.println("Employee name : "+name);
		System.out.println("Employee salary : "+salary);

		
	}
}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Serialization
     Employee emp1=new Employee(101,"Domnic",230.0f);
     FileOutputStream fout=new FileOutputStream("D:/ObjectFile.txt");
     ObjectOutputStream objout=new ObjectOutputStream(fout); //converting normal txt file to object writable file
     objout.writeObject(emp1);
     objout.close();
     fout.close();
     
     System.out.println("Object Saved");
	
      //DeSerialization
     FileInputStream fin=new FileInputStream("D:/ObjectFile.txt");
     ObjectInputStream objin = new ObjectInputStream(fin);
     Employee emp2=(Employee) objin.readObject();
     objin.close();
     fin.close();
     
     emp2.display();
     
     
	}

}
