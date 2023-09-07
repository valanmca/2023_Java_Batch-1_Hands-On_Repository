package com.gayathri.day11;
class SuperClass{
	int a;
	
	SuperClass(int a){
		this.a=a;
	}
	
	void display() {
		System.out.println("Value of A : "+a);
	}
}
class SubClass extends SuperClass{
	SubClass()
	{
		super(10);
		super.display();
		System.out.println("Value of a : "+a);
	}
}
public class SuperKeyWord {

	public static void main(String[] args) {
	SubClass obj = new SubClass();
	

	}

}
