package Day_4;

abstract class shapes
{
 abstract void area();
 abstract void perimeter();
 
}

class Rectangle extends shapes {
 int length=5;
 int breadth=2;
 void area()
 {
 System.out.println("Area of Rectangle:" +(length * breadth));
 }
 void perimeter()
 {
 System.out.println("Perimeter of Rectangle:"+ (2*(length+breadth)));
 }
}

class Circle extends shapes
{
 double pi=3.14;
 int r=2;
 void area()
 {
 System.out.println("Area of circle:"+(pi*r));
 }
 void perimeter()
 {
 System.out.println("Perimeter of circle:"+(2*pi*r));
 }
}

class Triangle extends shapes
{
 int a=10;
 int b=2;
 int c=5;
 void area()
 {
 System.out.println("Area of Triangle:"+(a*b*c));
 }
 void perimeter()
 {
 System.out.println("Perimeter of Triangle:"+(1/2*b*c));
 }
 
}
public class shapes_2 {

 public static void main(String[] args) {
 Rectangle r1=new Rectangle();
 r1.area();
 r1.perimeter();
 Circle r2=new Circle();
 r2.area();
 r2.perimeter();
 Triangle r3=new Triangle();
 r3.area();
 r3.perimeter();

 }

}