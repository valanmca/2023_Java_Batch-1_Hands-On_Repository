package com.jenish.day14;

interface BankFDPlan {
	void fixedDeposit();
	void interestRate();
	
}
abstract class BankFD implements BankFDPlan {
	public void fixedDeposit() {
		System.out.print("We are Providing Fixed Deposit");
	}
}
class HDFCFD extends BankFD {
	public void interestRate() {
		System.out.println(" @ 7.5 rate - HDFC ");
	}
}
class SBI extends BankFD {
	public void interestRate() {
		System.out.println(" @ 6.5 rate - SBI ");
	}
}

public class Interface_UsingInheritance_Bank_Ex5 {

	public static void main(String[] args) {
		HDFCFD hdfc = new HDFCFD();
		hdfc.fixedDeposit();
		hdfc.interestRate();
		
		SBI sbi = new SBI();
		sbi.fixedDeposit();
		sbi.interestRate();

	}

}
