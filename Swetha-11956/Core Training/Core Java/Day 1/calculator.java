//Static and Instance methods
package oopsDay1_Day2;

public class calculator {
	static int num1,num2;
	
	
	calculator(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	//Instance method
	 void add() {
		 System.out.println("Addition is : "+(num1+num2));
	}
	 
	//Instance method
	 void sub() {
		 System.out.println("Subraction is : "+(num1-num2));
	}
	 //Static method
	 static void mul() {
		 System.out.println("Multiplication is " +(num1*num2));
	 }
	 //Static method
	 static void div() {
		 System.out.println("Division is " +(num1/num2));
	 }

	
	

	public static void main(String[] args) {
		//Calling Instance method
		calculator cal=new calculator(10,5);
		cal.add();
		cal.sub();
		
		//Calling Static method
		calculator.mul();
        calculator.div();

	}

}
