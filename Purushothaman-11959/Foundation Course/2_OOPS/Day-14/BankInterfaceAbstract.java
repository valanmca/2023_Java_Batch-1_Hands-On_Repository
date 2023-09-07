package com.purushoth.day14;

interface BankFDPlan {
	void fixedDeposit();
	void interestRate();
}

abstract class BankFD implements BankFDPlan {
	public void fixedDeposit() {
		System.out.print("We are giving fixed deposit");
	}
	public abstract void interestRate();
}

class HDFCFD extends BankFD {
	public void interestRate() {
		System.out.println(" @ 7.5");
	}
}

class SBIFD extends BankFD {
	public void interestRate() {
		System.out.println(" @ 6.5");
	}
}
public class BankInterfaceAbstract {

	public static void main(String[] args) {
		HDFCFD hdfc=new HDFCFD();
		hdfc.fixedDeposit();
		hdfc.interestRate();
		
		SBIFD sbi=new SBIFD();
		sbi.fixedDeposit();
		sbi.interestRate();

	}

}// Bank Fixed Deposit using Interface and abstract
