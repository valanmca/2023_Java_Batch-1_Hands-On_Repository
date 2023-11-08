package Inheritance;

class A3{
	int a =10;
	static void display() {
		System.out.println("A");
	}
}

class B3 extends A3{
	int a =20;
	static void display() {
		System.out.println("B");
	}
}

public class practice_4 {

	public static void main(String[] args) {
		
		A3 obj = new B3();
		// it will display 'A' because the static can't be overrided
		obj.display();

		System.out.println(obj.a);
	}

}
