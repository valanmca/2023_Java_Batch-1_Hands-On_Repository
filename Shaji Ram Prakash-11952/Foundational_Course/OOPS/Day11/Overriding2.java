package com.shaji.Day11;

class superClass{
	int a;
	
	superClass(int a){
		this.a =a;
	}
	void display() {
		System.out.println("Value od A :"+a);
	}
}
class subClass extends superClass{
	subClass(){
		super(10);
		super.display();
		System.out.println("Value of a : "+super.a);
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		subClass obj = new subClass();

	}

}
