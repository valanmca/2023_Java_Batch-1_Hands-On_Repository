package com.matthew.day11;

class SuperClass{
	int a;
	
	SuperClass(int a){
		this.a = a;
	}
	
	void display() {
		System.out.println("value of A :"+a);
	}
	
}

class subClass extends SuperClass{
	subClass(){
		super(10);
		super.display();
		System.out.println("Value of a :"+a);
	}
}

public class SuperMain {

	public static void main(String[] args) {
		
		subClass sub = new subClass();

	}

}
