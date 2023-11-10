package Day_6;

class A3{
	String msg=myMethod();
	
	String myMethod() {
		return "A";
	}
}
class B3 extends A3{
	String myMethod() {
		return "B";
	}
}

public class obj_overide {

	public static void main(String[] args) {
		
		A3 obj=new B3();
		System.out.println(obj.msg);
		

	}

}
