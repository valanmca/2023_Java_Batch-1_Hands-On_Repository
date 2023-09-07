package com.jeyavel.OOPS.day11;
//Method OverLoading   same name with different parameters (or)different data types(or)one class same Method with Different Parameters 
//Method OverLoading   is a compile time polymorphism because variable take the memory from in stack so compailer identifies in compile time itself
//or/static binding/Early binding
//Overloading is adding additional functionalities in existing object
class myClass{
	
	
	//same method Name (diff Parameters )
	void myMethod(String Name) {
		System.out.println("Method OverLoading Example");
		System.out.println("Welcome->"+Name);
	}
	
	//same method Name (diff Parameters )
	void myMethod(int n){
		int fact =1;
		for(int i=1;i<n;i++) 
			fact=fact*i;
		System.out.println("Fact->"+n);
	}
	
	//same method Name (diff Parameters )
	void myMethod(int a,int b) {
		
		int sum= a+b;
		System.out.println("Sum of the values->"+sum);
	}
	
}

public class PolymorphismExNo1 {

	public static void main(String[] args) {
		//in object it use memory from heep mempry so it get created in runtime
		myClass my=new myClass();
		my.myMethod("jeyavel");
		my.myMethod(3);
		
		my.myMethod(5, 7);

	}

}
