package oops13;
 abstract class Vehicle{
	void engine() {
		System.out.println("All vehicle have one engine");
	}
	abstract void wheel();
	abstract void brandname();
	
	
 }
 class Bike extends Vehicle{
	void wheel() {
		System.out.println("two wheels");
	}
	void brandname(){
		System.out.println("KIA");
	}
	 
 }

public class _4abstractclass {

	public static void main(String[] args) {
		Vehicle obj=new Bike();
		obj.wheel();
		obj.brandname();
		

	}

}
