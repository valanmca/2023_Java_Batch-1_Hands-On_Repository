//Instance vs Static
public class Class_And_Object_Example1 {
	static int a = 10;
	int s = 40;

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Class_And_Object_Example1 obj1 = new Class_And_Object_Example1();
		Class_And_Object_Example1 obj2 = new Class_And_Object_Example1();
		Class_And_Object_Example1 obj3 = new Class_And_Object_Example1();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
		System.out.println(obj1.s);
		System.out.println(obj2.s);
		System.out.println(obj3.s);
		obj1.a = 50;
		obj1.s = 60;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		System.out.println(obj3.a);
		System.out.println(obj1.s);
		System.out.println(obj2.s);
		System.out.println(obj3.s);
	}

}