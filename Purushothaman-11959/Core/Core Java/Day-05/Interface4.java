package com.purushoth.day_05;

interface Eleven{
	int a=10; 
}

interface Twelve{
	int b=20;
}

interface Thirteen extends Eleven,Twelve{
	void sum();
}

class Calculator2 implements Thirteen {
	public void sum() {
		System.out.println(a+b);
	}
}
public class Interface4 {

	public static void main(String[] args) {
       Calculator2 calc=new Calculator2();
       calc.sum();
	}

}
