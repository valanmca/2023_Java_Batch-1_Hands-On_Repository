package Day_7;

interface one1{
	int a=10;
}
interface two1 extends one1{
	int b=20;
}
interface three extends two1{
	void sum();
}
class Calculator1 implements three{
	public void sum() {
		System.out.println(a+b);  
	}
}
public class multiple_Inheritance {

	public static void main(String[] args) {
		Calculator1 calc=new Calculator1();
		calc.sum();

	}

}
