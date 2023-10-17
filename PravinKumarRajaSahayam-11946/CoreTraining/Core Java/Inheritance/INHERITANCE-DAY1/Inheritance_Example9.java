//Method OverRiding using the object with the reference 
class A30 {
void display() 
{
	System.out.println("A");
}
}
class B30 extends A30 {
	void display() 
	{
		System.out.println("B");
	}
}
public class Inheritance_Example9 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
A30 objs = new B30();
objs.display();
	}

}
