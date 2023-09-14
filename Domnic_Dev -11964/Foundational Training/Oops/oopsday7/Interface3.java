package com.domnic.oopsday7;

interface BankFDPlan {
	void fixedDeposit();

	void interestRate();
}

abstract class BankFD implements BankFDPlan {
	public void fixedDeposit() {
		System.out.println("We are Providing fixed deposit ");
	}

	public abstract void interestRate();
}

class HDFCFD extends BankFD {
	public void interestRate() {
		System.out.println("FD at 7.5%");
	}
}

class SBIFD extends BankFD {
	public void interestRate() {
		System.out.println("FD at 6.5%");
	}
}

public class Interface3 {

	public static void main(String[] args) {
		HDFCFD obj1 = new HDFCFD();
		obj1.fixedDeposit();
		obj1.interestRate();

		SBIFD obj2 = new SBIFD();
		obj2.fixedDeposit();
		obj2.interestRate();
	}

}
