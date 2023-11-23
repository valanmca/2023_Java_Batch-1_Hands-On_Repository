package Day4;

abstract class shapes{
	
	public abstract void getArea();
	public abstract void getPerimeter();
	
}
class Circle extends shapes{
	int R;
	Circle(int R){
		this.R=R;
	}
	 public void getArea() {
		System.out.println("Area of circle:"+(3.14*R*R));
	}
	 public void getPerimeter() {
		System.out.println("Perimeter of circle:"+(2*3.14*R));
		
	}	
class Rectangle extends shapes{
		int length=5;
		int breath=2;
		
	public void getArea(){
		System.out.println("Area Of rectangle:"+(length*breath));
		
	}
	public void getPerimeter(){
		System.out.println("Perimeter of Rectangle:"+(length+breath*2));
	}
	}

	  abstract class Triangle extends shapes {
		float Length1, Length2, Base;
		Triangle (float Length1, float Length2, float Base) {
			this.Length1 = Length1;
			this.Length2 = Length2;
			this.Base = Base;
		}
		public void getarea() {
			System.out.println(" Area of Triangle : " +(0.5*Length1*Length2*Base));
		}
		public void getperimeter() {
			System.out.println(" Perimeter of Triangle : " +(Length1+Length2+Base));
		}
		
	}
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle cir = new Circle(5);
		cir.getArea();
		cir.getPerimeter();
		
		Rectangle rec=new Rectangle();
		rec.getArea();
		rec.getPerimeter();
		
		Triangle tri = new Triangle(6.0f, 5.0f, 40.f);
		tri.getarea();
		tri.getperimeter();	
	}
}


