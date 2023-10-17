//Method OverRiding using the static 
class A40 {
static void display() 
{
	System.out.println("A");
}
}
class B40 extends A40 {
	static void display() 
	{
		System.out.println("B");
	}
}
public class Inheritance_Example10 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
A40 objs = new B40();
objs.display();
	}

}
