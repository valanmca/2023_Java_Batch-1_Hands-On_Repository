package Inheritance;

class A1{
//	We can't make constructor as static or final.
	A1(int a){
//		System.out.println("A 1");
		super(); // refers to the default or parent class Object
	}
}

class B1 extends A1{
	B1(){
		super(3);
	}
}


public class practice_2 {

	public static void main(String[] args) {
		B1 obj = new B1();
	}

}
