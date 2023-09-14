package com.jeban.OOPsday7;//INTERFACE AND ABSTRACT 

interface BankFDPlan {
	void FixedDeposite();

	void IntrestRate();

}

abstract class BankFD implements BankFDPlan {
	public void FixedDeposite() {
		System.out.println("We are providing Fixed Deposite");
	}

	public abstract void IntrestRate();
}

class HDFC extends BankFD {
	public void IntrestRate() {
		System.out.println("@ 6.8 rate");
	}
}

class SBI extends BankFD {
	public void IntrestRate() {
		System.out.println("@ 7.9 rate");
	}

}

public class interface6 {

	public static void main(String[] args) {
		HDFC obj = new HDFC();
		obj.FixedDeposite();
		obj.IntrestRate();

		SBI obj1 = new SBI();
		obj1.IntrestRate();
		obj1.FixedDeposite();
		
		
//		
//		BankFDPlan summa = new SBI();
//		summa.FixedDeposite();

	}

}
