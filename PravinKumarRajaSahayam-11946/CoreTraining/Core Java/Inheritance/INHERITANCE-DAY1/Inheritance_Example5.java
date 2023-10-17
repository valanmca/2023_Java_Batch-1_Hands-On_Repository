//Inheritance using the multiple constructors with the different arguments super keywords
class A5 {
	A5() 
	{
		System.out.println("A");
	}
	A5(int a) 
	{
		System.out.println("A 3");
	}
}
class B5 extends A5 {
	B5() 
	{
		super(1);
		System.out.println("B");
	}
}
public class Inheritance_Example5 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
B5 objs = new B5();
	}

}