package Day6;

class shapes1{
	void getArea() {
	     System.out.println("The Area calculate");
	}
	void getPerimeter() {
		System.out.println("The Perimeter Calculate");
	}	
}
class Circle extends shapes1{
	void getArea() {
		  
		System.out.println("");
		
	}
	void getPerimeter() {
		System.out.println("");	
	}
}
class triangle extends shapes1{
	void getArea() {
		System.out.println("");
	}
	void getPerimeter() {
		System.out.println("");
	}
}
class Rectangle extends shapes1{
	void getArea() {
	System.out.println("");
}
	void getPerimeter() {
		System.out.println("");
		}
	}

public class shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shapes1 shapes1=new shapes1();
		
		 Circle  Circle=new  Circle();
		 triangle  triangle=new  triangle();
		 Rectangle  Rectangle=new  Rectangle();
		 
		 
		 
		

	}

}
