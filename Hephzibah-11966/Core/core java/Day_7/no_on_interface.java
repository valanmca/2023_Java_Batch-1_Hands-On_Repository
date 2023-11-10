package Day_7;

interface one{
	void addition(int a, int b);
}
interface two{
	void subtraction(int a, int b);
}
class Calculator implements one,two{
	public void addition(int a, int b) {
		System.out.println("Addition:"+(a+b));
	}
	public void subtraction(int a, int b) {
		System.out.println("Subtraction:"+(a-b));
	}
}
public class no_on_interface {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addition(10, 20);
		calc.subtraction(10, 20);
		

	}

}
