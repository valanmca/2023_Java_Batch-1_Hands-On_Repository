//Interface using simple calculator initialize values without abiguze
interface One4 {
	int a = 20; //public static final
}

interface Two4 extends One4{
	int a = 30;
}

interface Three4 extends One4,Two4 { //Multiple Inheritance
	void sum();
}

class Calculator3 implements Three4 {
	public void sum() 
	{
		System.out.println(One4.a + Two4.a);
	}
}

public class Abstract_Class_Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator3 calculator = new Calculator3();
		calculator.sum();

	}

}