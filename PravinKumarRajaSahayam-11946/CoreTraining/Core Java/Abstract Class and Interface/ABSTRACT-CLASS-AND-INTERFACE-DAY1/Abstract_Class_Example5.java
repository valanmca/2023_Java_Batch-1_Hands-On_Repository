//Interface using simple calculator also extends
interface Ones {
	void addition(int a, int b);
}

interface Twos extends Ones{
	void substraction(int a, int b);
}

interface Threes extends Twos {
	void division(int a, int b);
}

class Calculators implements Threes {
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

public class Abstract_Class_Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculators calculator = new Calculators();
		calculator.addition(10, 40);
		calculator.substraction(20, 30);
		calculator.division(50, 98);

	}

}