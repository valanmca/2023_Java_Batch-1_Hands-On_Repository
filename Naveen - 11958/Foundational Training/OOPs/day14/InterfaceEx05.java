package com.naveen.day14;

// Implement BankFD plan using Interface, Abstract, Normal class
interface BankFDPlan {
	void fixedDeposit();

	void intrestRate();
}

abstract class BankFD implements BankFDPlan {
	public void fixedDeposit() {
		System.out.print("We are providing fixed Deposit");
	}

	// public abstract void intrestRate(); Abstract class have a copy of this
	// declaration.
}

class HDFCFD extends BankFD {
	public void intrestRate() {
		System.out.println(" @ 7.5 rate");
	}
}

class SBIFD extends BankFD {
	public void intrestRate() {
		System.out.println(" @ 6.5 rate");
	}
}

public class InterfaceEx05 {

	public static void main(String[] args) {

		HDFCFD hdfc = new HDFCFD();
		hdfc.fixedDeposit();
		hdfc.intrestRate();

		SBIFD sbi = new SBIFD();
		sbi.fixedDeposit();
		sbi.intrestRate();
	}

}
