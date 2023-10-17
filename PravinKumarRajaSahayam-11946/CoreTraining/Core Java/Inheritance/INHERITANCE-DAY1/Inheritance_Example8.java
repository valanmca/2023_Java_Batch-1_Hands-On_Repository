//Method OverRiding using the object with the reference also calls the super class method
class A9 {
void display() 
{
	System.out.println("A");
}
}
class B9 extends A9 {
	void display() 
	{
		super.display();
		System.out.println("B");
	}
}
public class Inheritance_Example8 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
A9 objs = new B9();
objs.display();
	}

}