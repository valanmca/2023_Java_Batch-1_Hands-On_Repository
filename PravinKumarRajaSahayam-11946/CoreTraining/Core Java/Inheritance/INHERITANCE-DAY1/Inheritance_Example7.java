//Method OverRiding using the object
class A8 {
void dispaly() 
{
	System.out.println("A");
}
}
class B8 extends A8 {
	void display() 
	{
		System.out.println("B");
	}
}
public class Inheritance_Example7 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
B8 objs = new B8();
objs.display();
	}

}