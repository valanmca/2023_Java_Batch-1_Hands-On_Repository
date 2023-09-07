//Using Abstraction Interfaces
package com.pravinkumar.day15;

//Interface calling the abstract class that calling the sub class and then that calling the sub class
interface BankFDPlan {
	void fixedDeposit();

	void interestRate();
}

//Using public in the abstract class
abstract class BankFD implements BankFDPlan {
	public void fixedDeposit() {
		// System.out.print("We are providing the Fixed Deposits");
		System.out.println("We are providing the Fixed Deposit");
	}

//We can not initiaze the values(Because the interest rate is different from multiple banks
	abstract public void interestRate();
}

class HDFCFD extends BankFD {
	public void interestRate() {
		System.out.println("@ 7.5");
	}
}

class SBIFD extends BankFD {
	public void interestRate() {
		System.out.println("@ 6.5");
	}
}

public class Abstraction_Exs_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Calling the Method using the object(sub class)
		HDFCFD obj = new HDFCFD();
		obj.fixedDeposit();
		obj.interestRate();

		SBIFD obj1 = new SBIFD();
		obj1.fixedDeposit();
		obj1.interestRate();
	}

}
