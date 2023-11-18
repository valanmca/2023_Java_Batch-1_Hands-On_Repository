package Core_Topic_Domnic_Day_6;

class A1{
	A1(){
		System.out.println("A1");
	}
	A1(int a){
		System.out.println("A2");
	}
}
class B1 extends A1{
	B1(){
		super(5);
		System.out.println("B1");
	}
	B1(int a){
		this();
		System.out.println("B2");
	}
}

public class inheritance_2 {

	public static void main(String[] args) {
     B1 obj=new B1(5);
	}

}
