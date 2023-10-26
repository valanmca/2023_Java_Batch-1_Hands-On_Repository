package com.gayathri.day5;

class AAA{
	int a = 10;
	static void display() {
		System.out.println("A");
	}
}
class BBB extends AAA{
	int a = 20;
	static void display() {
		System.out.println("B");
	}
}
public class SuperKeywordEx3 {

	public static void main(String[] args) {
		AAA obj = new BBB();
		obj.display();//method based on memory allocating name.
		System.out.println(obj.a);//object based on reference name
		
		

	}

}
