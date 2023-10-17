//Inheritance using the multiple constructors with the different arguments super keywords values
class A3 {
	A3() 
	{
		System.out.println("A");
	}
	A3(int a) 
	{
		System.out.println("A 3");
	}
}
class B3 extends A3 {
	B3() 
	{
		super(1);
		System.out.println("B");
	}
	B3(int a) 
	{
		System.out.println("B 1");
	}
}
public class Inheritance_Example4 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
B3 objs = new B3(1);
	}

}