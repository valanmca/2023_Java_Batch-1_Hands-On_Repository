/***** Creating interface for BankFDPlan... ******/
package com.sara.day14;

interface BankFDPlan {
	void fixedDeposite();

	void interestRate();
}

abstract class BankFD implements BankFDPlan {
	public void fixedDeposite() {
		System.out.print("We Providing Fixed Deposiste ");
	}

}

class HDFCFD extends BankFD {
	public void interestRate() {
		System.out.println("@ 7.5 Rate ... ");
	}
}

class SBIFD extends BankFD {
	public void interestRate() {
		System.out.println("@ 6.5 Rate ...");
	}
}

public class Interfaces_Ex05 {

	public static void main(String[] args) {

		HDFCFD hdfc = new HDFCFD();
		hdfc.fixedDeposite();
		hdfc.interestRate();

		System.out.println(" ");

		SBIFD sbi = new SBIFD();
		sbi.fixedDeposite();
		sbi.interestRate();

	}

}
