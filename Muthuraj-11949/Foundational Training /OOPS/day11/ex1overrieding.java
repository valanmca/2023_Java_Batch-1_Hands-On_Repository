//using of overriending method

//


package com.muthu.day11;
class SuperClass{
	int a;
	SuperClass(int a){
		this.a=a;
	}
	void display() {
		System.out.println("value of A:"+a);
	}
}
class SubClass extends SuperClass{
	SubClass(){
		super(10);
		super.display();
		System.out.println("value of B:"+a);
		
	}
	
}

public class ex1overrieding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj=new SubClass();

	}

}
