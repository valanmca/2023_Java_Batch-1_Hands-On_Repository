//Java - 17 compact constructor using interface calss
interface Printable {
	void print();
}
record Employee(String name, int id) implements Printable {
	public void print() {
		System.out.println("Name:" + " " + name + " " + "," + " " + "EmpID" + " " + id);
	}
}
public class Java_17_Example_4 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		Employee person1 = new Employee("PravinKumar", 11946);
		person1.print();
		Employee person2 = new Employee("Raja", 11947);
		person2.print();
		Employee person3 = new Employee("Sahayam", 11948);
		person3.print();
	}
	
}

