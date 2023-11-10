package Day_6;
//only method can override, variable cannot br overide

class A_{
	int a=10;
	static void display() {
		System.out.println("A");
	}
}
class B_ extends A_{
	int a=20;
	static void display() {
		System.out.println("B");
	}
}
public class static_overide {

	public static void main(String[] args) {
		A_ obj=new B_();
		obj.display();
		System.out.println(obj.a);

	}

}
