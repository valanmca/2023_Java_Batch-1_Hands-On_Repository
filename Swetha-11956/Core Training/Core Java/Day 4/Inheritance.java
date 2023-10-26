package JavaOops4;

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
		super();  //By default JVM will call A() super class ,even without this super keyword.By giving super(5) will call super(int a).
		System.out.println("B");
	}
	B(int a){
		//default it goes to super class constructor.
		System.out.println("B 1");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		B obj=new B(5);

	}

}
