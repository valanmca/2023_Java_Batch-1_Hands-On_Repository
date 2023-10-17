//Inheritance using the super keywords
class A1 {
	A1() 
	{
		System.out.println("A");
	}
}
class B1 extends A1 {
	B1() 
	{
		super();
		System.out.println("B");
	}
}
public class Inheritance_Example2 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
B1 objs = new B1();
	}

}