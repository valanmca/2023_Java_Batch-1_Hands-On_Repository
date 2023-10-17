//Inheritance using the multiple constructors with the different arguments
class A2 {
	A2() 
	{
		System.out.println("A");
	}
	A2(int a) 
	{
		System.out.println("A 3");
	}
}
class B2 extends A2 {
	B2() 
	{
		System.out.println("B");
	}
}
public class Inheritance_Example3 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
B2 objs = new B2();
	}

}