package Day7;

interface Three{
	int a=10;  //public static final
}
interface Four extends Three{
	int b=20;
}
interface Five extends Three,Four {   //Multiple Inheritance
	void sum();
}
class Calculator1 implements Five{
	public void sum() {
		System.out.println(Three.a +Four.b);
	}
}
public class ex4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 Calc=new Calculator1();
		Calc.sum();

	}

}
