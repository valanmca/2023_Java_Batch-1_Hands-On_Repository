package oops14;
interface one{
	int a=10;
}
interface two{
	int a=20;
}
interface three extends one,two{
	void addition();
	
}
class Calculator3 implements three{
	public void addition() {
		System.out.println("addition :" +(one.a+two.a));
	}
}
public class _5MultipleInheritanceInterface {

	public static void main(String[] args) {
		Calculator3 obj=new Calculator3();
		obj.addition();

	}

}
