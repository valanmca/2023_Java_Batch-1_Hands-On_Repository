package Inheritance;

//default constructor is not always optional

class A{
	A(){
		System.out.println("A");
	}
	A(int a){
		System.out.println("A 1");
	}
}

class B extends A{
	B(){
		super(3);
		System.out.println("B");
	}
	
	B(int a){
//		super(2);
		this();
		System.out.println("B 1");
	}
}


public class practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(3);
	}

}
