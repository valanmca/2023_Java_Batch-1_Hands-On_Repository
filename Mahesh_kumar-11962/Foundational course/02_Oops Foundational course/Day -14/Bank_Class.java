package com.mahesh.Oops_day14;

interface Bank_Plan
{
	void FixedDeposit();
	void InterestRate();
}

abstract class BankFD implements Bank_Plan
{
	public void FixedDeposit()
	{
		System.out.print("We providing a fixed deposit");
	}
	abstract public void InterestRate();
	//it optional bcz abastarct class get the copy from interface.
}

class HDFC extends BankFD
{
	public void InterestRate() {
		System.out.println("@ 8.5 rate");
		
	}
}

class SBI extends BankFD
{
	public void InterestRate() {
		System.out.println("@ 6.5 rate");
		
	}
}

public class Bank_Class {

	public static void main(String[] args) {
		
		HDFC hdfc_bank = new HDFC();
		hdfc_bank.FixedDeposit();
		hdfc_bank.InterestRate();
		
		SBI sbi = new SBI();
		sbi.FixedDeposit();
		sbi.InterestRate();

	}

}
