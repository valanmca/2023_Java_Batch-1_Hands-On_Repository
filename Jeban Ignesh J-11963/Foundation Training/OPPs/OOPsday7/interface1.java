package com.jeban.OOPsday7;//interface 

interface Myinterface{
	void addition(int a,int b);
	void subtraction(int a,int b);
	
	
}

class Calculator implements Myinterface{
	public void addition(int a,int b) {
		System.out.println("Addition:"+(a+b));
	}
	public void subtraction(int a,int b) {
		System.out.println("Subtraction:"+(a-b));
	}
}

public class interface1 {

	public static void main(String[] args) {
		Myinterface obj=new Calculator();
		obj.addition(12, 30);
		obj.subtraction(90, 45);
		
		

	}

}
