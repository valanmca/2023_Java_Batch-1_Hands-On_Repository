package Core_Topic_Domnic_Day_6;

class A2{
	void display() {
		System.out.println("A");
	}
}
class B2 extends A2{
	void display() {
		super.display();
		System.out.println("B");
	}
}

public class Overriding_1 {

	public static void main(String[] args) {
    A2 obj=new B2();
    obj.display();
	}

}
