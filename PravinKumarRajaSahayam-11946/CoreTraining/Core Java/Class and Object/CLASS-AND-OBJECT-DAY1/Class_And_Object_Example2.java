//Method OverLoading using different parameter
public class Class_And_Object_Example2 {
	Class_And_Object_Example2() {
		// this(20, 30);
		this(10);
		System.out.println("A");
	}

	Class_And_Object_Example2(int a) {
		System.out.println("B");
	}

	Class_And_Object_Example2(int b, int c) {
		System.out.println("C");
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Class_And_Object_Example2 obj = new Class_And_Object_Example2();
	}

}