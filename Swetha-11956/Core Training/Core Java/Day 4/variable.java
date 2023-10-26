
package JavaOops4;
class A2{ 
	int a=10;
	static void display() {
		System.out.println("A");
	}
}
class B2 extends A2 {
	int a=20;
	static void display() {
		System.out.println("B");
	}
}

public class variable {

	public static void main(String[] args) {

		A2 obj=new B2();
		obj.display();
		System.out.println(obj.a);	}

}
