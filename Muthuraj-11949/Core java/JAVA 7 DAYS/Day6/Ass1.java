package Day6;

public class Ass1{
	abstract class Ass1{
		abstract void area();
		abstract void myMethod();
		
		void myMethod2(){//concrete method
		
		System.out.println("This is my method");
		}
	}
	class Rectangle1 extends Ass1{
		void area() {
			System.out.println("Area:L*b");
		}
		void myMethod() {}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ass1 Rectangle=new Rectangle1  (); //[Dynamic method Dispatch]  method 
		Rectangle.area();
		Rectangle.myMethod2();
	}
	private void area() {
		// TODO Auto-generated method stub
		
	}
	private void myMethod2() {
		// TODO Auto-generated method stub
		
	}
}
