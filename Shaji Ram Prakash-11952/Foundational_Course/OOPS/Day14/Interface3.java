package com.shaji.Day14;

interface BankFDPlan {
	void fixedDeposit();

	void interestRate();
}

abstract class BankFD implements BankFDPlan {
	public void fixedDeposit() {
		System.out.print("We are providing Fixed Deposit ");
	}

	public abstract void interestRate();
}

class HDFCFD extends BankFD {
	public void interestRate() {
		System.out.println("@7.5 rate");
	}
}

class SBIFD extends BankFD {
	public void interestRate() {
		System.out.println("@6.5 rate");
	}
}

public class Interface3 {

	public static void main(String[] args) {
		HDFCFD hdfc = new HDFCFD();
		hdfc.fixedDeposit();
		hdfc.interestRate();
		
		System.out.println("\n");

		SBIFD sbi = new SBIFD();
		sbi.fixedDeposit();
		sbi.interestRate();

	}
}
