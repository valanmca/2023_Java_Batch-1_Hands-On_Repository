package Inheritance;

class A2{
	void display() {
		System.out.println("A");
	}
}

class B2 extends A2{
	void display() {
		super.display();
		System.out.println("B");
	}
}

public class practice_3 {

	public static void main(String[] args) {
		B2 obj =new B2();
		obj.display();
		System.out.println(" Using DMD");
		A2 obj1 =new B2();
		obj.display();
	}
}
