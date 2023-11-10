package Day_6;
//override is based on object , so static method cannot override
//non override is based on reference.... static is non override

class A1{
	void display() {
		System.out.println("A");
	}
}
class B1 extends A1{
	void display() {
		super.display();
		System.out.println("B");
	}
}

public class method_inheritance {

	public static void main(String[] args) {
		A1 obj = new B1();
		obj.display();
		

	}

}
