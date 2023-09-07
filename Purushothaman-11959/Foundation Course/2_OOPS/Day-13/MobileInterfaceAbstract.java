package com.purushoth.day13;

interface MobilePlan{
	void headPhoneJack();
	void brandName();
	void processor();
	void charger();
}

abstract class Mobile implements MobilePlan {
	public void charger() {
		System.out.println("Every mobile should have charger.");
	}
	public abstract void headPhoneJack();
	public abstract void brandName();
	public abstract void processor();
	
}

class Vivo extends Mobile {
	public void headPhoneJack() {
		System.out.println("It will provide the headphonejack.");
	}
	public void brandName() {
		System.out.println("VIVO");
	}
	public void processor() {
		System.out.println("Snapdragon");
	}
}
public class MobileInterfaceAbstract {

	public static void main(String[] args) {
	   MobilePlan obj=new Vivo();
	   obj.charger();
	   obj.brandName();
	   obj.headPhoneJack();
	   obj.processor();

	}

}//Interface,Abstract for mobile.
