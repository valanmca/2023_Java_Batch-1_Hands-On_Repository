package oops12;
class Addition{
	void add(int a, int b) {
		System.out.println("addition of integers" +(a+b));
	}
	void add(float a, float b) {
		System.out.println("addition of integers" +(a+b));
	}
	void add (double a, double b) {
		System.out.println("addition of integers" +(a+b));
	}
}
public class revision3 {

	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add(10, 20);
		obj.add(10.0f, 20.0f);
		obj.add(10.001, 20.001);
				

	}

}
