package Day_10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int id;
	String name;
	float salary;
	
	Employee(int id, String name, float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
	}
}

public class serializationn {

	public static void main(String[] args) throws IOException {
		Employee emp=new Employee(101,"Hephzi",20000.0f);
		FileOutputStream fout=new FileOutputStream("D:/object.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		objout.writeObject(emp);
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		

	}

}
