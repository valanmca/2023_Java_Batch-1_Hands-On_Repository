package com.jeyavel.coreDay5;

class shapes{
	float calculateArea() {
		float shape = 0.0f;
		return shape;
	}
}
class circle extends shapes{
	
		float calculateArea() {
			float radius = 3.6f;
			return (float) (radius*radius*Math.PI);
		}
		void display() {
			System.out.println("circle radius"+calculateArea());
		}
	
 }

class rectangle extends shapes{
         
	float calculateArea() {
		float length =15f;
		float breadth=20f;
		return (float)(length*breadth);
	}
	void display() {
		System.out.println("rectangle Area"+calculateArea());
	}
	
}
class triangle extends shapes{
    float calculateArea() {
    	float breadth = 12f;
    	float height = 20f;
    	return (float) (2/(breadth*height));
    }
	void display() {
		System.out.println("triangle Area"+calculateArea());
	}

}

public class OverrideAssNo1 {

	public static void main(String[] args) {
		
		circle obj = new circle();
		obj.display();
		rectangle obj1 = new rectangle();
		obj1.display();
		triangle obj2=new triangle();
		obj2.display();

	}

}
