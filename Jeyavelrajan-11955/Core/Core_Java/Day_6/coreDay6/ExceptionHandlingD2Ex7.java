package com.jeyavel.coreDay6;
import java.util.Scanner;

public class ExceptionHandlingD2Ex7 {

	public static void main(String[] args) throws OutOfBalanceException {
	    Scanner sc = new Scanner(System.in);
		System.out.println(" welcome to our Bank");
		double balance = 1000;
		System.out.println("Enter your widthdraw Amount");
		double widthdraw =sc.nextDouble();
		try {
		if(balance<widthdraw) {
			throw new OutOfBalanceException();//custom exeption
		}
		else {
			System.out.println("your current balance is"+(balance-widthdraw));
		}
		}catch(OutOfBalanceException e) {
			System.out.println("OutOfBalance enter the correct balance ");
		}
		finally {
			if(balance>widthdraw){
			System.out.println("thankyou for using out bank ");
			}else {
				System.out.println("enter correct amoutnt");
			}
		}



	}

}
