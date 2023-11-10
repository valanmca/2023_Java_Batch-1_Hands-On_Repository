package Day_6;
//default constructor is not always optional.It is optional when there is no constructor in super class.
//stop the inheritance using final keyword
//without using final keyword, we can stop the constructor by using private constructor
//In object class we have only one constructor that is default constructor
class A {
	A() {
		System.out.println("A");
	}

	A(int a) {
		super();
		System.out.println("A 1");
	}
}

class B extends A {
	B() {
		super(5);
		System.out.println("B");
	}
	B(int a) {
//		super(5);
		this();
		System.out.println("B 1");
	}
}

public class inheritance {

	public static void main(String[] args) {
		B obj = new B(5);

	}
}
