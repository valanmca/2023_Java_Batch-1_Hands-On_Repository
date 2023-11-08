package ExceptionHandling;

import java.util.Scanner;

public class Practice1 {
	static double balance =20000.00;
	static void withdraw(double with,double bal) {
		System.out.println("Amount withdrawed :"+with);
		balance = bal-with;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the amount to withdraw : ");

		double num = sc.nextDouble();

		try {
			if(num > balance) {
				throw new InvalidAmountEcxeption(num-balance);
			}
			else {
				withdraw(num,balance);
			}
		}

//		We can use Throwable instead of Exception
		catch(InvalidAmountEcxeption e) {
			System.err.println(e);
			
		}
		
		finally {
			System.out.println("Available amount : "+balance);
		}
	}

}
