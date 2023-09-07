package oops14;

abstract class Myabstractclass {
	abstract void mymethod1(); // higher than package

	abstract void mymethod2();

	void mymethod3() {
		System.out.println("My concreate method");
	}
}

class Normalclass extends Myabstractclass {
	void mymethod1() {    //default and low package
		System.out.println("My abstract method -1");
	}

	void mymethod2() {
		System.out.println("My abstract method -2");
	}

}

public abstract class _1abstract { // main class can be a abstract

	public static void main(String[] args) {

		Myabstractclass obj = new Normalclass();
		obj.mymethod1();
		obj.mymethod2();
		obj.mymethod3();

	}

}
//private property and constructor not inherit
//constructor cannot override

// constructor may be call of this() or super().... these two must be first line.... so both of them cannot be called at same time
/*class A{
	void dispaly() {
	int a=10;}
}
class B extends A{
	void display() {
	int a=20;}
}
public class _1abstract {

	public static void main(String[] args) {
		B obj=new B();
		obj.dispaly();
		
	}
	}*/
	
 