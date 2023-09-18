//Abstractions Instance Method
package com.pravinkumar.day15;

//Interfaces
interface MyInterface {
	// By default it will comes with the abstract , and , public ,
	void addition(int a, int b);

	void substraction(int a, int b);
}

class Calculator implements MyInterface {
	// By default the access specifiers is (deflaut)we only declares the public
	public void addition(int a, int b) {
		System.out.println("The addition is : " + (a + b));
	}

	public void substraction(int a, int b) {
		System.out.println("The substraction is : " + (a - b));
	}
}

//Even the main class is also a abstract(Any class is a abstract)
public abstract class Abstraction_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling the MyInterfaces with the references and the subclass object Values 
		MyInterface obj = new Calculator();
		obj.addition(10, 60);
		obj.substraction(19, 80);
	}

}
