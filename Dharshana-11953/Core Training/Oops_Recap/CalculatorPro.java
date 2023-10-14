package com.dharshu.OopsRecap;

class Calculator{
	static int n1=5,n2=2;
	
	
	Calculator(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
		}	
		void add()
		 {
				System.out.println("Addition:"+(n1+n2));
				}
		void sub()
		 {
				System.out.println("Subtraction:"+(n1-n2));
				}
		static void mul()
		 {
				System.out.println("Multiplication:"+(n1*n2));
				}
		static void div()
		 {
				System.out.println("Division:"+(n1/n2));
				}
		}

public class CalculatorPro {

	public static void main(String[] args) {
		//Static method calling
		Calculator.mul();
		Calculator.div();
		
		//instance method calling
		Calculator cal=new Calculator(2,4);
		cal.add();
		cal.sub();

	}

}
