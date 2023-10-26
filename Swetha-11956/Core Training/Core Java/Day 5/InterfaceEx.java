package JavaOops5;

interface one1{
	int a=10;
}
interface two2 extends one1{
	int b=20;
}
interface three2 extends one1, two2{
	void sum(); 		
}
class Calculator2 implements three2{
	public void sum() {
		System.out.println(a+b);
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		Calculator2 calc=new Calculator2();
		calc.sum();

		
	}

}
