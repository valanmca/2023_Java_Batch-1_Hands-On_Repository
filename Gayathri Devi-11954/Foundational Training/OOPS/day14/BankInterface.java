package com.gayathri.day14;

interface BankFDPlan{
	void fixedDeposit();
	void interestRate();//it may various 
}
abstract class BankFD implements BankFDPlan{
	public void fixedDeposit()
	{
		System.out.println("We are providing fixed deposit");
	}
	public abstract void interestRate();//not mandatory
}
class HDFCFD extends BankFD
{
	public void interestRate()
	{
		System.out.println(" @7.5 rate");
	}
}
class SBIFD extends BankFD{
	public void interestRate()
	{
		System.out.println(" @ 6.7 rate");
	}
}
public class BankInterface {

	public static void main(String[] args) {
		
		HDFCFD hdfc = new HDFCFD();
		hdfc.fixedDeposit();
		hdfc.interestRate();
		
		SBIFD sbi = new SBIFD();
		sbi.fixedDeposit();
		sbi.interestRate();
	}

}
