package com.matthew.day11;

class MyClass2{
	public MyClass2(String name){
		this(5);
		System.out.println("Name: "+name);
	}
	
	public MyClass2(int n) {
		this(4,5);
		int temp =1;
		for (int i=2;i<n+1;i++) {
			temp*=i;
		}
		System.out.println("Fact : "+temp);
	}
	
	public MyClass2(int a, int b) {
		System.out.println("Sum : "+(a+b));
	}
}
public class ConstOver2 {

	public static void main(String[] args) {
		MyClass2 name = new MyClass2("Matthew");
//		MyClass fact = new MyClass(5);
//		MyClass sum = new MyClass(23,12);

	}

}

