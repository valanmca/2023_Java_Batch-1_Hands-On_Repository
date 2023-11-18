package Core_Topic_Domnic_Day_6;

class A3{
	int a=10;
	static void display() {
		System.out.println("A");
	}
}
class B3 extends A3{
	int a=20;
	static void display() {
		System.out.println("B");

	}
}

public class overriding_2 {

	public static void main(String[] args) {
      A3 obj=new B3();
      obj.display();
		System.out.println(obj.a);

      
	}

}
