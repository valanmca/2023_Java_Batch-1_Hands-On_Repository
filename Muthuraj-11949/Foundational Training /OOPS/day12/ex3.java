//
package com.muthu.day12;
class Animal{
    void eat(){
		System.out.println("All animal eat");
	}
    }
	class Dog extends Animal{
	 void eat() {   // can use default,protected public
			System.out.println("Dog will eat the chicken");
		}	
	}
public class ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj=new Dog();
		obj.eat();

	}
}
