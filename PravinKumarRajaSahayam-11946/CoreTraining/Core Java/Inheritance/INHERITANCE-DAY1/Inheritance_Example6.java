//Inheritance using the multiple constructors with the different arguments super keywords values this keywords
class A4 {
	A4() 
	{
		System.out.println("A");
	}
	A4(int a) 
	{
		System.out.println("A 3");
	}
}
class B4 extends A4 {
	B4() 
	{
		super(1);
		System.out.println("B");
	}
	B4(int a) 
	{
		this();
		System.out.println("B 1");
	}
}
public class Inheritance_Example6 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
B4 objs = new B4(1);
	}

}