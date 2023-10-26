package com.gayathri.day6;
interface One2 {
	int a=10;	//public static final
}
interface Two2 {
	int a=20;
}
interface Three2 extends One2, Two2{ //Multiple inheritance
	void sum();
}
class Calculate2 implements Three2{
	public void sum() {
		System.out.println("Sum : "+(One2.a + Two2.a));
	}

}
public class ExInterface4 {

	public static void main(String[] args) {
		Calculate2 refer = new Calculate2();
		System.out.println("Multiple INheritance clear ambiguity ");
		refer.sum();
		
	}

}
