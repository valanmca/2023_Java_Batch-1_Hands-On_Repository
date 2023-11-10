package oops_1;

public class Calculate {
	static int num1, num2; 
	
	
	Calculate(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	void add() {
		System.out.println("Addition of two numbers:"+(num1+num2));
	}
	void sub() {
		System.out.println("Subtraction of two numbers:"+(num1-num2));
	}
	static void mult() {
		System.out.println("Multiplication of two numbers:"+(num1*num2));
	}
	
	static void div() {
		System.out.println("Division of two numbers:"+(num1/num2));
	}
	
	

	public static void main(String[] args) {
		Calculate obj=new Calculate(20,10);
		obj.add();
		obj.sub();
		
		Calculate.mult();
		Calculate.div();

	}

}
