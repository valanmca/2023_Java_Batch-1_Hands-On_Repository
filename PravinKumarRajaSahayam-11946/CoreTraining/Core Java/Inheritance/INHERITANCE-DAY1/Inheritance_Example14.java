//Method OverLoading
public class Inheritance_Example14 {
	void concat(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}

	void concat(String a, String b, String c) {
		System.out.println(a + " " + b + " " + c);
	}

	void concat(float a, float b, float c) {
		System.out.println(a + " " + b + " " + c);
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Inheritance_Example14 obj1 = new Inheritance_Example14();
		obj1.concat("PravinKumar", "RajaSahayam", "Surya");
		obj1.concat(1, 2, 3);
		obj1.concat(1.20f, 3.40f, 5.60f);
	}

}
