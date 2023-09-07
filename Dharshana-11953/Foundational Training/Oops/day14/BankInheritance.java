package com.dharshu.day14;

interface BankFDPlan{
	void fixedDeposit();
	void interestRate();
}

abstract class BankFD implements BankFDPlan {
	public void fixedDeposit() {
		System.out.print("\nWe are providing the fixed deposit");
	}
	public abstract void interestRate();//optional
}

class HDFCFD extends BankFD{
	public  void interestRate() {
		System.out.print("@ 7.5 rate");
	}
}

class SBIFD extends BankFD{
	public  void interestRate() {
		System.out.print("@ 6.5 rate");
	}
}
public class BankInheritance {

	public static void main(String[] args) {
		HDFCFD hdfc =new HDFCFD();
		hdfc.fixedDeposit();
		hdfc.interestRate();
		
		SBIFD sbi =new SBIFD();
		sbi.fixedDeposit();
		sbi.interestRate();
	}

}
