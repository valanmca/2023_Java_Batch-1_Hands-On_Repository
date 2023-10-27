//Files for the hide the particular property of the object
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employees implements Serializable {
	transient int Id;
	String Name;
	float Salary;

	Employees(int Id, String Name, float Salary) {
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
	}

	void display() {
		System.out.println("Employee Id is : " + Id);
		System.out.println("Employee Name is : " + Name);
		System.out.println("Employee Salary is : " + Salary);
	}
}

public class Files_Example6 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
// TODO Auto-generated method stub
//Serialization
		Employees obj = new Employees(101, "PravinKumar RajaSahayam", 123.45f);
		FileOutputStream fws = new FileOutputStream("D:/Object.txt"); // Create a new files
		ObjectOutputStream objout = new ObjectOutputStream(fws); // The files text files convert into the object
																	// writable one files
		objout.writeObject(obj);
		objout.close();
		fws.close();
		System.out.println("The Object is Saved");

		// De-Serialiation
		FileInputStream fwa = new FileInputStream("D:/Object.txt");
		ObjectInputStream objouts = new ObjectInputStream(fwa);
		Employees objs = (Employees) objouts.readObject();
		objouts.close();
		fwa.close();
		objs.display();
	}

}
