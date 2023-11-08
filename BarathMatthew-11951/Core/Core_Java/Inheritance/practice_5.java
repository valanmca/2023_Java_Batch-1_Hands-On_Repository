package Inheritance;

class A4{
	String msg = myMethod();
	String myMethod() {
		return "A";	
	}
}

class B4 extends A4{
	String myMethod() {
		return "B";	
	}
}


public class practice_5 {

	public static void main(String[] args) {
		
		A4 obj = new B4();
		System.out.println(obj.msg);
		
	}
}
