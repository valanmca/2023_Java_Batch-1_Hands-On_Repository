//Bank FD using interface, abstract, normal class

package com.jeyandhan.day14;

interface BankFDPlan { // interface
	void fixedDeposit(); // public, abstract

	void intrestRate();
}

abstract class BankFD implements BankFDPlan { // abstract class

	public void fixedDeposit() {
		System.out.print("\nWe are Providing Fixed Deposit");
	}

	abstract public void intrestRate();

}

class HDFCFD extends BankFD { // concrete class
	public void intrestRate() {
		System.out.println(" @ 7.5%");
	}
}

class SBIFD extends BankFD { // concrete class
	public void intrestRate() {
		System.out.println(" @ 8.5%");
	}
}

public class BankInfo {

	public static void main(String[] args) {
		
		System.out.println("\tHDFC Bank");
		HDFCFD obj = new HDFCFD();  // object creation
		
		obj.fixedDeposit(); //method calling
		obj.intrestRate();

		System.out.println("\n\t SBI Bank");  
		SBIFD obj1 = new SBIFD();// object creation
		
		obj1.fixedDeposit(); //method calling
		obj1.intrestRate();
	}

}
