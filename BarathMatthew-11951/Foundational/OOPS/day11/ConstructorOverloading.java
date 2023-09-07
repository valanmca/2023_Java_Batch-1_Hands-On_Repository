//constructor overloading

package com.matthew.day11;

class MyClass{
	MyClass(String name){
		System.out.println("Name: "+name);
	}
	
	MyClass(int n) {
		int temp =1;
		for (int i=2;i<n+1;i++) {
			temp*=i;
		}
		System.out.println("Fact : "+temp);
	}
	
	MyClass(int a, int b) {
		System.out.println("Sum : "+(a+b));
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		MyClass name = new MyClass("Matthew");
		MyClass fact = new MyClass(5);
		MyClass sum = new MyClass(23,12);

	}

}
