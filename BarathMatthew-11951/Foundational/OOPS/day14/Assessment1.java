package com.matthew.day14;

interface BankFdPlan{
	void fixedDeposit();
	void intrestRate();
}

abstract class BankFd implements BankFdPlan{
	public void fixedDeposit() {
		System.out.print("We are providing Fixed deposit");
	}
}

class HDFC extends BankFd{
	public void intrestRate() {
		System.out.println("@ 7.5 rate");
	}

}

class SBI extends BankFd{
	public void intrestRate() {
		System.out.println("@ 6.5 rate");
	}
}
public class Assessment1 {

	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.fixedDeposit();
		hdfc.intrestRate();
		
		SBI sbi = new SBI();
		sbi.fixedDeposit();
		sbi.intrestRate();

	}

}
