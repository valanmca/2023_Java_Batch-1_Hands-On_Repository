package com.swetha.day14;

//Abstract,interface,inheritance

interface BankFDPLan{
	
       void fixedDeposit();
       void interestRate();
}
abstract class BankFD implements BankFDPLan{
	public void fixedDeposit() {       //common for both hdfc and sbi bank
		System.out.println("We are providing fixed deposit");
	}
	public abstract  void interestRate();
}
class HDFCFD extends BankFD{
	public void interestRate() {
		System.out.println("@ 7.5 rate");
	}
}
class SBIFD extends BankFD{
	public void interestRate() {
		System.out.println("@ 6.5 rate");
	}
}
public class Example5 {

	public static void main(String[] args) {
		HDFCFD hdfc=new HDFCFD();
		hdfc.fixedDeposit();
		hdfc.interestRate();
		
		SBIFD sbi =new SBIFD();
		sbi.fixedDeposit();
		sbi.interestRate();
		

	}

}
