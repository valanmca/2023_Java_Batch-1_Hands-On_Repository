//run time polymor key memory

//Overriding method..
package com.muthu.day11;
class Animal {
	public void eat() {
		System.out.println ("Animals");}
		public void speak() {
			System.out.println("All animals will make sound");
			
		}
		
	}
	class dog extends Animal{
		public void eat() {
			System.out.println("dog eat chicken");
		}
		public void speak() {
			System.out.println("Dog will park");
			}
		}
		
		class cat extends Animal{
			public void eat() {
				System.out.println("cat eat fish");
	}
			public void speak() {
				System.out.println("Meow");
			}
}

public class overriedingconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog dog=new dog();
		dog.eat();
		dog.speak();
		cat cat=new cat();
		cat.eat();
		cat.speak();

	}

}
	
