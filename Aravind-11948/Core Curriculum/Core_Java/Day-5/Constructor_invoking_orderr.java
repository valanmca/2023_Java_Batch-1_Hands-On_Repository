package com.core.day_05;
class A{
	 A()
	 {
		 System.out.println("A");
	 }
	 
	 A(int a)
	 {
		 System.out.println("A1");
	 }
	 
	 void display(){
		 System.out.println("Super class method");
	 }
}

class B extends A{
	 B()
	 {
		 super(5); //invoke constructor with arguments.
		 System.out.println("B");
	 }
	 
	 B(int a)
	 {
		 this();
		 System.out.println("B 1");
	 }
	
}
public class Constructor_invoking_orderr {

	public static void main(String[] args) {
		B obj=new B(6);// always jvm invoke default keyword or we invoke it by manually.
		
		

	}

}
