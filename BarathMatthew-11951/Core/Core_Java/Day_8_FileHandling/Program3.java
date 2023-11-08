package Day_8_FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
//serialization
// store object in external device for future use.
// transient

class Employee implements Serializable{
	int id;
	transient String name;
	float salary;
	int time ;
	Employee(int id,String name,float salary){
		this.id =id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Time : "+ time);
	}
}

public class Program3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		serialization

		Employee emp1 = new Employee(123,"Matthew",20000.0f);
//		create a file using FileOutputStream(It will create a file ) because object is a binary data.  
		
		FileOutputStream fout = new FileOutputStream("D://ObjectFile.txt");
		
//		Converting normal txt file to object writable one using 'ObjectOutputStream'
		
		ObjectOutputStream objout = new ObjectOutputStream(fout); 
		objout.writeObject(emp1);
		objout.close();
		fout.close();
		
		System.out.println("Object saved");
		
//		De-serialization
		
		FileInputStream Fin= new FileInputStream("D://ObjectFile.txt");
		
		ObjectInputStream ObjIn = new ObjectInputStream(Fin);
		
		Employee emp2 = (Employee) ObjIn.readObject();//Type casting
		
		Fin.close();
		ObjIn.close();
		emp2.display();
	}

}
