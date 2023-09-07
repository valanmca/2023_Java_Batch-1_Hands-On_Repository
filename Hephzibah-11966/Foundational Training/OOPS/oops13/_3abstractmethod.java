package oops13;    //Over riding is besed in object..... non overriding is based on reference
abstract class Shape1{ 
	abstract void area1(); //abstract class is a collection of abstract class and concrete method
	abstract void myMethod1();	                   
}
class Rectangle1 extends Shape1{
	void area1() {
		
		System.out.println("l*b");
	}
	void myMethod1() {
		
		
	}
}
class Circle extends Rectangle1{
	void area1() {
		
		System.out.println("3.14*r*r");
	}
	void myMethod1() {
		
	}
}

public class _3abstractmethod {

	public static void main(String[] args) {
		Shape1 obj=new Rectangle1();    
		obj.area1();             //Inviked by rectangle object because of overriding
		obj.myMethod1();         //Invoked by reference of shape1
		

	}

}
