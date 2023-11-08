package com.matthew.test;

abstract class d_Animal{
	abstract void sound();
}

class lion extends d_Animal{
	 void sound() {
		 System.out.println("Lion Rore");
	 }
}
	 
class tiger extends d_Animal{
	void sound() {
		 System.out.println("tiger growl");
	 }
}

public class coreAnimalDMD {

	public static void main(String[] args) {
		
		d_Animal Lion = new lion();
		Lion.sound();
		
		d_Animal Tiger = new tiger();
		Tiger.sound();

		lion l_Lion = new lion();
		l_Lion.sound();
		
		tiger t_Tiger = new tiger();
		t_Tiger.sound();
	}

}
