//Interface using simple calculator
interface One {
	void addition(int a, int b);
}

interface Two {
	void substraction(int a, int b);
}

interface Three {
	void division(int a, int b);
}

class Calculator implements One, Two, Three {
	public void addition(int a, int b) {
		System.out.println("Addition of the" + " " + a + " " + "and" + " " + b + " " + ":" + " " + (a + b));
	}

	public void substraction(int a, int b) {
		System.out.println("Substraction of the" + " " + a + " " + "and" + " " + b + " " + ":" + " " + (a - b));
	}

	public void division(int a, int b) {
		System.out.println("Divisiom of the" + " " + a + " " + "and" + " " + b + " " + ":" + " " + (a / b));
	}
}

public class Abstract_Class_Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		calculator.addition(10, 40);
		calculator.substraction(20, 30);
		calculator.division(50, 98);

	}

}