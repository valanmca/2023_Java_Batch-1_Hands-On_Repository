//Method OverRiding using the static with variable
class A10 {
	int A = 10;
static void display() 
{
	System.out.println("A");
}
}
class B10 extends A10 {
		int A = 20;
	static void display() 
	{
		System.out.println("B");
	}
}
public class Inheritance_Example11 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
A10 objs = new B10();
objs.display();
System.out.println(objs.A);
	}

}
