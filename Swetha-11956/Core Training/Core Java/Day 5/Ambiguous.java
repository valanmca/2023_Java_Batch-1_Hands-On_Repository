package JavaOops5;
interface one3{
	int a=10;
}
interface two3 extends one1{
	int a=20;
}
interface three3 extends one3, two3{
	void sum(); 		
}
class Calculator3 implements three3{
	public void sum() {
		System.out.println("The sum is : "+(one3.a + two3.a));
	}
}
public class Ambiguous {

	public static void main(String[] args) {

		Calculator3 calc=new Calculator3();
		calc.sum();
	}

}
