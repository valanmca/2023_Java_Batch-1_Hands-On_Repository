/*package oops13;
interface Vehicleplan{  //by default interface class are abstract class 
	void engine(); 
	
    void wheel();
    
	void brandname();
	
	
 }
 abstract class Vehicle1 implements Vehicleplan{
	 void engine() {
		 System.out.println("two wheels");
	 }
	abstract void wheel();
	abstract void brandname();
	}

public class _5interface {

	public static void main(String[] args) {
		Vehicle obj=new Bike();
		obj.wheel();
		obj.brandname();
		
		Vehicleplan obj1;

	}

}*/


package oops13;
interface Vehicleplan{  //by default interface class are abstract class 
	public void engine(); 
	
    public void wheel();
    
	public void brandname();
	
	
 }
 abstract class Vehicle1 implements Vehicleplan{   //Interface method all are default public abstract
	 public void engine() {
		 System.out.println("All Vehicles have one engine");
	 }
	public abstract void wheel();
	public abstract void brandname();
	}
 class Bike1 extends Vehicle1{   //Interface method all are default public abstract
	 public void wheel() {
		 System.out.println("two wheels");
	 }
	public void brandname() {
		System.out.println("HONDA");
	}
	}

public class _5interface {

	public static void main(String[] args) {
		Vehicle1 obj=new Bike1 ();
		obj.wheel();
		obj.brandname();
		
		Vehicleplan obj1;

	}

}
