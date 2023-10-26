package JavaOops5;

interface one{
	void addition(int a,int b);
}
interface two{
	void Subtraction(int a, int b);
}
class Calculator implements one,two{
	public void addition(int a,int b) {
		System.out.println("Addition :"+ (a+b));
	}
	public void Subtraction(int a,int b) {
		System.out.println("Subtarction : " + (a-b));
	}
}
public class MultipleInterface {

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addition(5, 3);
		calc.Subtraction(5, 3);
	
	}

}
