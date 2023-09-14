
package com.jenish.day13;

abstract class Vehile02 {
	Vehile02(int a) {
		System.out.println("Constructor from Abstract class");
		//System.out.println(5);
	}
	public void engine() {
		System.out.println("All Vehicle have one engine");
	}
	public abstract void wheel();
	
	public abstract void brandName();
}
class Biker01 extends Vehile02{
	 Biker01() {
		super(5);
	}
	 
		public void wheel() {
			System.out.println("Bike has two wheels");
			
		}
		public void brandName() {
			System.out.println("TVS");
			
		}
	
}
public class AbstractClass_interface_Constructor_Ex7 {

	public static void main(String[] args) {
		Vehile02 obj1 = new Biker01();
		obj1.wheel();
		obj1.engine();
		obj1.brandName();
		

	}

}
