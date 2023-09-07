//Method overloading -a class consist of many method with same method name with different type of parameters  size

// the memory will get allocated in compile time (compile time polymorphism)

//the compiler understand which method we are calling by the arguments we pass

package com.matthew.day11;

class Myclass5{
	void myMethod(String name) {
		System.out.println("Welcome "+ name);
	}
	
	void myMethod(int n) {
		int fact = 1;
		for(int i=2;i<=n;i++){
			fact*=i;
		}
		System.out.println("Fact : "+ fact);
	}
	
	void myMethod(int a, int b) {
		int sum = a+b;
		System.out.println("Sum : "+sum);
	}
}
public class MainClass {

	public static void main(String[] args) {
		
		Myclass5 obj = new Myclass5();
		//calling method consist of string parameters
		obj.myMethod("Matthew");
		
		// calling method consist of one integer as parameter
		obj.myMethod(5);
		
		//calling method consist of two integer parameters
		
		obj.myMethod(11,89);
		
	}

}
